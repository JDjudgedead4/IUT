package TD4;

import TD1.Clavier;

public class ex7 {

	public static void main(String[] args) {
		String alpha = "ABCDEFGHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz 1", text,text1="";
while(true) {
		System.out.println("Entrez une phrase");
		text = Clavier.lireLigne();
		text1="";
		if (text.replace(" ", "").length() <= 0) {
			System.out.println("veuillez saisir une phrase");

		}
		
		for (int i = 0; i < text.length(); i++) {
			
			char c = text.charAt(i);
			for (int h = 0; h< alpha.length(); h++) {
				if (c == alpha.charAt(h)) {
					text1=text1+alpha.charAt(h+1);
					System.out.println(alpha.charAt(h+1));

				}
			}
			}
		System.out.println("Votre nouvelle phrase est " +text1);
			}
	}
}