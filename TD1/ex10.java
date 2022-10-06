package TD1;

public class ex10 {

	public static void main(String[] args) {
		float taeg,tot;
		int cost,nb;
		while (true) {
		cost=Clavier.lireInt();
		nb=Clavier.lireInt();
		taeg=Clavier.lireFloat();
		tot=cost*nb*taeg;
		System.out.println(tot);

	}
	}
}
// calcul d'un prix après taxes