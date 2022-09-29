package TD1;

public class ex13 {

	public static void main(String[] args) {
		//inversion de valeur et affichage répétitif sans boucle 
		while (true) {
		int a,b,c,d,e,temp;
		a=Clavier.lireInt();
		b=Clavier.lireInt();
		c=Clavier.lireInt();
		d=Clavier.lireInt();
		e=Clavier.lireInt();
		temp=Clavier.lireInt();
		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		temp=a;
		a=b;

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		b=temp;

		b=c;

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		c=temp;
		c=a+b;

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		temp=e;

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		e=c;
		c=temp;

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		System.out.println(d);

		System.out.println(e);
		
		}
	}

}
