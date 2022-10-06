package TD3;

public class ex8 {

	public static void main(String[] args) {
		function();
	}
	public static void function() {
		int b;
		System.out.println("saisir nombre de valeur");
		b = Clavier.lireInt();
		int tab[] = new int[b]; // redim tableau
		for (int i = 1; i <= b; i++) {
			tab[i - 1] = Clavier.lireInt();
			tab[i - 1] = tab[i - 1] +1;
			System.out.println(tab[i - 1]);

		}

	}

}
// remplissage tableau par utilisateur et incrémentation de 1 a chaque valeur du tableau
