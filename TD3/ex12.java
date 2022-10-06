package TD3;

import TD2.Clavier;

public class ex12 {

	public static void main(String[] args) {
		int b, c, min1, min2, size1, size2,pos1=0,pos2=0;
		System.out.println("saisir nombre de valeur du tableau1");
		b = Clavier.lireInt();
		int tab1[] = new int[b]; // redim tableau
		System.out.println("saisir nombre de valeur du tableau2");
		c = Clavier.lireInt();
		int tab2[] = new int[b]; // redim tableau
		size1 = tab1.length;

		for (int i = 1; i <= size1; i++) {
			min1=tab1[0];
			if (tab1[i - 1] < min1) {
				min1 = tab1[i - 1];
			}
			pos1= i-1;
		}
			size2 = tab2.length;
			for (int j = 1; j <= size2; j++) {
				min2=tab2[0];
				if (tab2[j - 1] < min2) {
					min2 = tab2[j - 1];
				}
				pos2= j-1;
			}
			System.out.println(pos1 + pos2);
		}
	}
