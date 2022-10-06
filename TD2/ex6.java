package TD2;

public class ex6 {

	public static void main(String[] args) {

		double prix=0.0, conso;
		while(true) {
		System.out.println("renseigner votre nombre de copies");
		conso=Clavier.lireDouble();
		if(conso>0) {
		if (conso<10 && conso>0) {
		prix=0.1;
		prix=prix*conso;
		}
		else if (conso>=10 && conso<20 && conso>0) {
		prix=0.09;
		prix=prix*conso;
		}
		else if (conso>=20 && conso>0) {
		prix=0.08;
		prix=prix*conso;
		}
		System.out.println("votre facture est de"+prix);
		}
		else
			System.out.println("ne renseigner pas de valeur négatives");
		}
}
}
// adaotation prix en fonction du nombre de copies
//problème d'arrondis sur certaines valeur 