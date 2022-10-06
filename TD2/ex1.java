package TD2;

import TD1.Clavier;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		while (true) {
		a=Clavier.lireInt();
		System.out.println(a);		
		if ((a>1 && a<3)||(a>7 && a<8))
			System.out.println("la variable respecte les conditions");		

		}	
	}

}
//test d'une condition sur un intervalle