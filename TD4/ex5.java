package TD4;

import TD2.Clavier;

public class ex5 {

	public static void main(String[] args) {
		String a;
		int size;
		while (true) {
		System.out.println("saisir un mot");	
		a = Clavier.lireLigne();
		size = a.length();
		System.out.println(size + " caractères");	
	}
	}
}
//récupération da la longueur d'une chaine de caractère