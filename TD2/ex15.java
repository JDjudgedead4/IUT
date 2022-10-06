package TD2;

public class ex15 {
	public static void main(String[] args) {

		double argent, billet = 0, piece2 = 0, piece1 = 0, a = 0;

		System.out.println("renseignez montant :");
		argent = Clavier.lireDouble();
		if (argent < 50 && argent > 0) {
			while (argent >= 5) {
				a += 1;
				billet = argent - 5;
				argent = billet;
				billet = a;
			}
			a = 0;
			while (argent >= 2) {
				a += 1;
				piece2 = argent - 2;
				argent = piece2;
				piece2 = a;
			}
			a = 0;
			while (argent >= 1) {
				a += 1;
				piece1 = argent - 1;
				argent = piece1;
				piece1 = a;
			}
			System.out.println(billet + "billets de 5 euros " + piece2 + " pièces de 2 euros  " + piece1 + " pièces de 1 euro");

		}
		else 
			System.out.println("veuillez renseignez une valeur comprise entre 0 et 50");

	}
}
//programme qui divise une somme d'argent en fonction des coupures disponibles