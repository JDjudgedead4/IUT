package exercices;

import exercices.Clavier;
import pile.*;

public class calculatrice {
	public static void main(String[] args){
		int nbop = 0,count=0;
		String temp;
		int op1 = 0, op2 = 0;
		double somme = 0;
		System.out.println("renseignez le nombre d'opérateur nécessaire");
		nbop = Clavier.lireInt();
		count=nbop;
		PileParTableau pile1 = new PileParTableau(nbop);
		for (int i = 0; i < nbop; i++) {
			System.out.println("renseignez le " + i + "ème opérateur");
			temp = Clavier.lireString();
			if (!temp.equals("+") && !temp.equals("/") && !temp.equals("*") && !temp.equals("-")) {
				pile1.empiler(temp);
			} else if (count>2)
			{
				op1 = Integer.parseInt((String) pile1.depiler());
				op2 = Integer.parseInt((String) pile1.depiler());
				switch (temp) {
				case "+":
					somme = op1 + op2;
					System.out.println("le calcul donne" + somme);
					count=count-2;
					break;
				case "-":
					somme = op2 - op1;
					System.out.println("le calcul donne" + somme);
					count=count-2;
					break;
				case "*":
					somme = op1 * op2;

					System.out.println("le calcul donne" + somme);
					count=count-2;

					break;
				case "/":
					if (op1 != 0) {
						somme = op2 / op1;
						System.out.println("le calcul donne" + somme);
						count=count-2;

					} else
						System.out.println("une division par 0 est impossible");// tirer drapeau prof
					break;
				default:
					System.out.println("erreur opérateur invalide");
				}
			}
			else {
				System.out.println("nombre d'opérateur invalide");

			}
				

		}
		System.out.println("le calcul donne " + somme);

	}
}
