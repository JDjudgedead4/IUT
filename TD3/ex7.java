package TD3;

public class ex7 {

	public static void main(String[] args) {
		int b, s = 0;
		System.out.println("saisir nombre de valeur");
		b = Clavier.lireInt();
		int tab[] = new int[b]; // redim tableau
		for (int i = 1; i <= b; i++) {
			tab[i - 1] = Clavier.lireInt();
			s = s + tab[i - 1];
		}
		System.out.println(s);
	}
}
// remplissage tableau par utilisateur