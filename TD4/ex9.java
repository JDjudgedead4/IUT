package TD4;

import TD3.Clavier;

public class ex9 {

	public static void main(String[] args) {
		somme();
	}

	public static void somme() {
		int a, b, c, d, e, s;
		System.out.println("saisir 5 nombres");
		a = Clavier.lireInt();
		b = Clavier.lireInt();
		c = Clavier.lireInt();
		d = Clavier.lireInt();
		e = Clavier.lireInt();
		s = a + b + c + d + e;
		System.out.println("leur somme est de    " + s);
	}
}
// procédure qui afffiche la somme des 5 nombre renseigner par l'utilisateur