package TD1;

public class ex12 {

	public static void main(String[] args) {
		int r;
		double v;
		while (true) {
		r=Clavier.lireInt();
		v= Math.PI*r*r*r*4/3;
		System.out.println("levolume de la sphère est de :" +v);

		}
	}

}
//calcul du volume du sphère