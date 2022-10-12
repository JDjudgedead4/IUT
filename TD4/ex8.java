package TD4;

import TD1.Clavier;

public class ex8 {

	public static void main(String[] args) {
		while (true) {
			voyelle();
		}
	}
		
		public static int voyelle() {
			int a = 0;
		String alpha = "AEIOUYaeiouy", text;
		System.out.println("Entrez une phrase");
		text = Clavier.lireLigne();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			for (int h = 0; h < alpha.length(); h++) {
				if (c == alpha.charAt(h)) {
					a=a+1;

				}

			}
		}
		System.out.println(a);

		return a;
	}
}
//fonction qui donne le nombre de voyelles dans un texte renseigner par l'utilisateur