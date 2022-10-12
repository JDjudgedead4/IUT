package TD4;

import TD2.Clavier;

public class ex3 {

	public static void main(String[] args) {
		int a,b,c;
		double x1,x2,delta ;
		System.out.println("saisir l'argument a");	
		a = Clavier.lireInt();
		System.out.println("saisir l'argument b");	
		b = Clavier.lireInt();
		System.out.println("saisir l'argument c");	
		c = Clavier.lireInt();
		delta =b*b-4*a*c;
		if(delta == 0) {
			x1=-b/2*a;
			System.out.println("la seul racine qui existe est "+x1);
		}
		else if ( delta < 0 ) {
			System.out.println("aucune racine");
		}
			else if (delta > 0) {
				x1=-b+Math.sqrt(delta)/2*a;
				x2=-b-Math.sqrt(delta)/2*a;
				System.out.println("les racines sont "+ x1 +" "+ x2 );

			}
		}
	}


