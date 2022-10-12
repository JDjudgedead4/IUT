package TD4;

import TD6.Clavier;

public class ex12 {

	public static void main(String[] args) {
		int a ;
		a = max();
		System.out.println(a);

	}
	public static int max() {
		System.out.println("renseigner valeur de A");
		int a = Clavier.lireInt();
		System.out.println("renseigner valeur de B");
		int b = Clavier.lireInt();
		if (a>b) {
			return (a);
		}
		else {
			return (b);
		}
	}
}
//calcul du maximum entre deux nombres
