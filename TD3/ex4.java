package TD3;

public class ex4 {
	public static void main(String[] args) {
		int tab[] = new int[30];
		int i = 0, n = 0;
		for (i = 0; i < 10; i++) {
			System.out.println("saisir note sur 20");
			n = Clavier.lireInt();
			if (n > 0 && n < 21) {// verifier que la note est entre 0 et 20
				tab[i] = n;
				if (tab[i] <= 18) {
					tab[i] = tab[i] + 2;
				} else {
					tab[i] = 20;
				}
			} else {
				System.out.println("erreur vous devez saisnir une note comprise entre 0 et 20 inclus");
				i = i - 1;
			}
			System.out.println("dernière note modifier: " + tab[i]);
		}
	}
}