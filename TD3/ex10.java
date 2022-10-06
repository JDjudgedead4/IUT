package TD3;

import TD2.Clavier;

public class ex10 {

	public static void main(String[] args) {
		int n = 0, a = 0, b, somme = 0, moyenne = 0;
		System.out.println("saisir nombre de valeur");
		b = Clavier.lireInt();
		int tab[] = new int[b]; // redim tableau
		for (int i = 1; i <= b; i++) {
			System.out.println("saisir valeur");
			tab[i - 1] = Clavier.lireInt();
			somme = somme + tab[i - 1];
			System.out.println("la somme est de: " + somme);
		}
		moyenne = somme / b;
		for (int j = 0; j < b; j++) {
			if (tab[j] > moyenne) {
				n = n + 1;
			}
		}
		System.out.println("la somme est de: " + somme + " et la moyenne est de : " + moyenne + " et il y a " + n + " notes au dessus de la moyenne de classe");
	}
}
//programme qui clacul la moyenne d'un tableau et affiche le nombre de valeur audessus de la moyenne 