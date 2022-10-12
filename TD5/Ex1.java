package TD6;

import TD2.Clavier;

public class ex1 {

	public static void main(String[] args) {
		double n,s=0 ;
		System.out.println("renseigner la somme de fraction de rang n");
		n = Clavier.lireDouble();
		for (int i = 1; i <= n; i++) {
			s=s+(double)1/i;
			System.out.println(s);

	}

		System.out.println(s);
	}
}
	