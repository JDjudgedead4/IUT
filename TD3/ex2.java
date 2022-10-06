package TD3;

public class ex2 {
	public static void main(String[] args) {
		int tableau[] = new int[15];
		int i = 0, n = 0;

		for (i = 0; i < 15; i++) {
			System.out.println("Saisir votre note :");
			n = Clavier.lireInt();
			if (n > 0 && n < 21) {// verifier que la note est entre 0 et 20
				tableau[i] = n;
			}
			else {
				System.out.println("erreur vous devez saisnir une note comprise entre 0 et 20 inclus");
				i = i - 1;
			}
		}
	}
}
//talbeau avec conditions 