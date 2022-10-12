package TD4;

import TD2.Clavier;

public class ex14 {

	public static void main(String[] args) {
		boolean a1,a2;
		int f;
		System.out.println("renseigner valeur de A");
		int a = Clavier.lireInt();
		System.out.println("renseigner valeur de B");
		int b = Clavier.lireInt();
		a1 = sontInvOuOpp(a, b);
		System.out.println(a1);
		a2=existeInvOuOppConsécutif();
		System.out.println(a2);

	}

	public static boolean sontInvOuOpp(int a, int b) {
		boolean x = false;
		if (a * b == 1 || a + b == 0) {
			x = true;
		} else {
			x = false;
		}
		return (x);
	}

	public static boolean existeInvOuOppConsécutif() {
		boolean x1=false;
		
		//partie saisi du tableau
		System.out.println("saisir nombre de valeur");
		int f = Clavier.lireInt();
		int tab[] = new int[f]; 
		for (int i = 1; i <= f; i++) {
			System.out.println("saisir valeur");
			tab[i - 1] = Clavier.lireInt();
		}
		
		//partie test et conditions 
		
		
		for (int j = 1; j <= f - 1; j++) {

			System.out.println(tab[j-1]);
			System.out.println(tab[j]);
			
			if (tab[j-1]==tab[j]-1) {
				
					x1=true;
			}
		}
		return (x1);
	}

}