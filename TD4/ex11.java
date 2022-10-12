package TD4;

import TD3.Clavier;

public class ex11 {

	public static void main(String[] args) {
		perm() ;
	}
		public static void perm() {
		int a,b,c,tmp;
		System.out.println("saisir 3 nombres");
		a = Clavier.lireInt();
		b = Clavier.lireInt();
		c = Clavier.lireInt();
			if (a > b) {
				tmp = a;
				a = b;
				b = tmp;
			}
			if (a > c) {
				tmp = a;
				a = c;
				c = tmp;
			}
			if (b > c) {
				tmp = b;
				b = c;
				c = tmp;
			}
			System.out.println(c + ">" + b + ">" + a);
		}
		
	}
//classe 3 nombres dans l'ordre croissant



