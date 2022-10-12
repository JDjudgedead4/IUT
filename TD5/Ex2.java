package TD6;

import TD2.Clavier;

public class ex2 {

	public static void main(String[] args) {

		double n, s = 0, star = 0, p = 0;
		System.out.println("renseigner la somme de fraction de rang n");
		n = Clavier.lireDouble();
		System.out.print("*");
		while (n > s) {
			s = s + 1;
			p=0;
			star = star + 2;
			System.out.println("");
			while (p < star) {
				p = p + 1;
				System.out.print("*");
			}
		}
	}
}
//affiche une pyramide non centré de hauteur n renseigner par l'utilisateur