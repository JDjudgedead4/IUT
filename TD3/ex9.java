package TD3;

import TD2.Clavier;

public class ex9 {

	public static void main(String[] args) {
		int b, a, max = 0, min = 0;
		System.out.println("saisir nombre de valeur");
		b = Clavier.lireInt();
		int tab[] = new int[b]; // redim tableau
		for (int i = 1; i <= b; i++) {
			System.out.println("saisir valeur");
			tab[i - 1] = Clavier.lireInt();
		}
		a = tab.length;
		max = a;
		min = a;
		for (int i = 1; i <= a; i++) {

			if (tab[i - 1] > max) {
				max = tab[i - 1];
			} else if (tab[i - 1] < min) {
				min = tab[i - 1];
			}
			System.out.println("la valeur minimal est " + min + " la valeur maximal est " + max + " saisir valeur suivante ");
	}
	}
}
// remplissage d'un tableau puis recherche de valeur max et min dans une boucle en dehors du remplissage attention opti