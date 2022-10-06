package TD3;

public class ex6 {

	public static void main(String[] args) {

		int b, po = 0, ne = 0;
		System.out.println("saisir nombre de valeur");
		b = Clavier.lireInt();
		int tab[] = new int[b]; // redim tableau
		for (int i = 1; i <= b; i++) {
			tab[i-1] = Clavier.lireInt();
			if (tab[i-1] < 0) {
				ne = ne + 1;
			} else {
				po = po + 1;
			}
		}
		System.out.println(ne + " valeurs négatives et " + po + " valeures positive");

	}

}
//remplissage tableau par utilisateur plus affichage 