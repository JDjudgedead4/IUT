package TD4;

import TD2.Clavier;

public class ex1 {
	public static void main(String[] args) {
		int n ;
		while (true) {
		System.out.println("saisir valeur");
		n = Clavier.lireInt();
		if (n % 2 ==0) {
			System.out.println("le nombre est pair");
		}
		else {
			System.out.println("le nombre est impair");
		}

}
}
}//recherche nombre paire et impair et utilisation du reste "%"