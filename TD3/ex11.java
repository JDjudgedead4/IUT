package TD3;

import TD2.Clavier;

public class ex11 {

	public static void main(String[] args) {
		int b,n=0;
		System.out.println("saisir nombre de valeur");
		b = Clavier.lireInt();
		int tab[] = new int[b]; // redim tableau
		for (int i = 1; i <= b; i++) {
			System.out.println("saisir valeur");
			tab[i - 1] = Clavier.lireInt();
	

	}
		while (n<b-1) {
			
		if (tab[n]==tab[n+1]-1) {
			n=n+1;
			System.out.println("tableau consécutif");
		}
		else {
			System.out.println("tableau non consécutif");

		}
}
}
}