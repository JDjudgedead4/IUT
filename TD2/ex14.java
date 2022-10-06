package TD2;

public class ex14 {

	public static void main(String[] args) {
		float moyenne;
		int i, n, nb, somme = 0, produit=1 ;

		System.out.println("rentrez le nombre de valeur");
		n = Clavier.lireInt();

		for (i = 1; i <= n; i++) {
			System.out.println("renseignez votre nombre");
			nb = Clavier.lireInt();

			somme = somme + nb;
			produit = produit * nb;
		}

		moyenne = somme / n;

		System.out.println("la somme est de: " + somme + " le produit est de: " + produit + " et la moyenne est de : " + moyenne);
	}

}
// effectue la somme le produit et la moyenne d'une suite de nombres


