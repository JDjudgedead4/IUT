package TD4;

import TD2.Clavier;

public class ex6 {

	public static void main(String[] args) {
		String text, text1;
		int size1, size2, size;
		System.out.println("saisir une phrase dont les mots son spéarer par un et un seul espace");
		text = Clavier.lireLigne();
		size1 = text.length();
		text1 = text.replace(" ","");
		size2 = text1.length();
		size = size1 - size2 + 1;
		System.out.println("il y a " + size + " mtos dans la pharses");

	}

}
