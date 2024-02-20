package tris;

import java.util.*;

public class tris {

	static int[] tableau;
	static int[] copieTab;
	static int n = 1000000;
	static boolean AFFICHAGE = false;

	public static void main(String[] args) {

		long start, stop; // sert pour calculer le temps des tris

		tableau = new int[n];

		Random r = new Random();
		for (int i = 0; i <= n - 1; i++)
			tableau[i] = r.nextInt(100000); // on remplit le tableau
											// aléatoirement

		copieTab = (int[]) tableau.clone(); // on garde une copie pour pouvoir
											// appliquer différentes méthodes de
											// tri sur le même jeu de données

		if (AFFICHAGE)
			afficherTableau();
		System.out.println();

		start = System.nanoTime();
		triSelection(tableau, tableau.length);
		stop = System.nanoTime();

		if (AFFICHAGE)
			afficherTableau();

		System.out.println("temps de tri par sélection : " + (float) (stop - start) / 1000000 + " ms\n");

		tableau = (int[]) copieTab.clone(); // on remet le tableau dans l'état
											// initial

		start = System.nanoTime();
		triFusion(tableau, 0, n - 1);
		stop = System.nanoTime();

		if (AFFICHAGE)
			afficherTableau();

		System.out.println("temps de tri fusion : " + (float) (stop - start) / 1000000 + " ms\n");

		start = System.nanoTime();
		Arrays.sort(tableau);
		stop = System.nanoTime();
		System.out.println("temps de tri java : " + (float) (stop - start) / 1000000 + " ms\n");

	}

	public static void afficherTableau() {

		System.out.print("Tableau :");

		for (int i = 0; i <= n - 1; i++)
			System.out.print(" " + tableau[i]);

		System.out.println(".");

	}

	public static void triSelection(int tab[], int n) {
		int temp = 0, indice = 0, indice2 = 0;

		for (int i = 0; i < n; i++) {
			int min = tab[i];
			int min2 = i;

			for (int j = i + 1; j < n; j++) {
				if (tab[j] < min) {
					min = tab[j];
					min2 = j;
				}
			}

			if (i != min2) {
				int tmp = tab[i];
				tab[i] = tab[min2];
				tab[min2] = tmp;
			}
		}

	}

	public static void triFusion(int[] tab, int g, int d) {

		int m;
		if (g < d) {
			m = (g + d) / 2;
			triFusion(tab, g, m);
			triFusion(tab, m + 1, d);

			fusionner(tab, g, m, d);
		}

	}

	public static void fusionner(int[] tab, int g, int m, int d) {

		int tabfinal[] = new int[d - g + 1];
		int pointeurgauche = g;
		int pointeurdroit = m + 1;
		int valg = 0;
		int vald = 0;
		for (int x = 0; x < tabfinal.length; x++) {
			if (pointeurgauche <= m && pointeurdroit <= d) {
				valg = tab[pointeurgauche];
				vald = tab[pointeurdroit];
				if (vald >= valg) {
					tabfinal[x] = valg;
					pointeurgauche++;
				} else {
					tabfinal[x] = vald;
					pointeurdroit++;
				}
			} else if (pointeurdroit > d) {

				valg = tab[pointeurgauche];
				tabfinal[x] = valg;
				pointeurgauche++;

			} else if (pointeurgauche > m) {

				tabfinal[x] = vald;
				vald = tab[pointeurdroit];
				pointeurdroit++;

			}

		}
		for (int z = 0; z < tabfinal.length; z++) {
			tab[z + g] = tabfinal[z];
		}

	}
}
