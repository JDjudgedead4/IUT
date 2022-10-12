package TD4;

import TD6.Clavier;

public class ex13 {

	public static void main(String[] args) {
		int x1,x2,x3,temp;
		System.out.println("renseigner valeur de A");
		int a = Clavier.lireInt();
		System.out.println("renseigner valeur de B");
		int b = Clavier.lireInt();
		System.out.println("renseigner valeur de C");
		int c = Clavier.lireInt();
		temp=max(a,b);
		if (temp<c) {
			x1=a;
			x2=b;
			x3=c;
			System.out.println(x1 + " < " + x2 + " < " + x3);
		}
		else if (temp>c) {
			x1=c;
			x2=a;
			x3=b;

			System.out.println(x1 + " < " + x2 + " < " + x3);
		}
		else if (a<c && c<b) {
			x1=a;
			x2=c;
			x3=b;

			System.out.println(x1 + " < " + x2 + " < " + x3);
		}
		else 
			System.out.println("erreur");

		
		
		
		
		
	}
	public static int max(int a, int b) {
		if (a>=b) {
			return (a);
		}
		else {
			return (b);
		}
	}
}
