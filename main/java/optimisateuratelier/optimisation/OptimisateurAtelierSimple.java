/*
 * Copyright (C) 2022 IUT Laval - Le Mans Université.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package optimisateuratelier.optimisation;
import java.util.List;
 
import optimisateuratelier.atelier.AtelierSimple;
import optimisateuratelier.atelier.Chaine;
 
/**
 *
 * @author Rémi Venant
 */
public class OptimisateurAtelierSimple implements OptimisateurAtelier<AtelierSimple> {
@Override
public ResultatOptimisation optimiserAtelier(AtelierSimple atelier) {
Chaine chaine1 = atelier.getChaine(1);
Chaine chaine0 = atelier.getChaine(0);
int meilleurTemps = 0;
int MeilleutTempsCH0 = chaine0.getTempsEntree() + chaine0.getPoste(0).getTempsTraitement();
int MeilleutTempsCH1 = chaine1.getTempsEntree() + chaine1.getPoste(0).getTempsTraitement();
 
int[] chaine0Parcours = new int[atelier.getLongueurChaines()];
int[] chaine1Parcours = new int[atelier.getLongueurChaines()];
Integer[] parcoursFinal = new Integer[atelier.getLongueurChaines()];
 
for (int idx = 1; idx < atelier.getLongueurChaines(); idx++) {
int MeilleurTempsTemp = 0;
int TempsCh0VersCh0 = MeilleutTempsCH0 + chaine0.getPoste(idx).getTempsTraitement();
int TempsCh1VersCh0 = MeilleutTempsCH1 + atelier.getTempsChangement(1, 0, idx - 1)
+ chaine0.getPoste(idx).getTempsTraitement();

if (TempsCh1VersCh0 > TempsCh0VersCh0) {
	MeilleurTempsTemp = TempsCh0VersCh0;
chaine0Parcours[idx] = 0;
}
else {
MeilleurTempsTemp = TempsCh1VersCh0;
chaine0Parcours[idx] = 1;
}
 
int currentTimeCh1ToCh1 = MeilleutTempsCH1 + chaine1.getPoste(idx).getTempsTraitement();
int currentTimeCh0ToCh1 = MeilleutTempsCH0 + atelier.getTempsChangement(0, 1, idx - 1)
+ chaine1.getPoste(idx).getTempsTraitement();

if (currentTimeCh0ToCh1 > currentTimeCh1ToCh1) {
MeilleutTempsCH1 = currentTimeCh1ToCh1;
chaine1Parcours[idx] = 1;
}
// sinon :
else {
	MeilleutTempsCH1 = currentTimeCh0ToCh1;
chaine1Parcours[idx] = 0;
}
MeilleutTempsCH0 = MeilleurTempsTemp;
}
 
// Calcul du temps final
MeilleutTempsCH0 += chaine0.getTempsSortie();
MeilleutTempsCH1 += chaine1.getTempsSortie();
// Si le temps en arrivant au dernier poste de la chaine 0 est meilleur que le
// temps en arrivant sur le poste de la chaine 1
// alors :
if (MeilleutTempsCH0 < MeilleutTempsCH1) {
bestTimeGbl = bestTimeCh0;
parcoursFinal[atelier.getLongueurChaines() - 1] = 0;
}
// sinon :
else {
bestTimeGbl = bestTimeCh1;
parcoursFinal[atelier.getLongueurChaines() - 1] = 1;
}
 
// Pour créer un parcours final
for (int idx = atelier.getLongueurChaines() - 1; idx > 0; idx--) {
if (parcoursFinal[idx] == 0) {
parcoursFinal[idx - 1] = chaine0Parcours[idx];
}
if (parcoursFinal[idx] == 1) {
parcoursFinal[idx - 1] = chaine1Parcours[idx];
}
}
 
return new ResultatOptimisation(List.of(parcoursFinal), bestTimeGbl);
}
 
}