package pile;

import tris.Clavier;
import FILE.*;

public class inversion_mot {
	public static void main(String[] args) {
		Pile p = new PileParTableau(100);
		Pile p1 = new PileParTableau(100);
		FileParChainage file1 = new FileParChainage();
		Pile p_inverse = new PileParTableau(100);
		String mot = Clavier.lireString();
		char temp;
		int decaler = 5;
		String mot2 = "";
		char tmp;
		String mot_inverse = "";
		for (int i = 0; i < mot.length(); i++) {// ajoute dans une pile le mot ou la phrase
			p.empiler(mot.charAt(i));
		}
		for (int j = 0; j < mot.length(); j++) {// dépile et affiche a l'envers le mot
			temp = (char) p.depiler();
			mot_inverse = mot_inverse + temp;
			file1.enfiler(temp);
			p_inverse.empiler(temp);
		}

		System.out.println(mot_inverse);
		int val = 0;
		try {
			for (int k = 0; k < mot.length(); k++) {
				tmp = (char) file1.defiler();
				val = (int) tmp;

				val = val + decaler;
				if (97 < val && val < 123 || 65 < val && val < 90) {// convertie la valeur ascii en fesant attention
																	// s'il saggit dune majuscule et en verifiant
																	// retournant a la lettre a lorsque l'on atteint z
					mot2 = mot2 + (char) val;
				} else if (val > 122) {// intervalle minuscule supérrieur à z
					val = val - 26;
					mot2 = mot2 + (char) val;
				} else if (val > 91) {// intervalle maj supérieur à z
					val = val - 26;
					mot2 = mot2 + (char) val;
				} else {
					mot2 = mot2 + (char) (val - decaler);
				}
			}
		} catch (exception e) {
			e.printStackTrace();
			System.out.println("erreur");
		}

		System.out.println(mot2);
		String mot3="";
		// fin de la partie encodage affichage du mot codé final
		for (int u = 0; u < mot2.length(); u++) {
			val = (int) mot2.charAt(u);
			decaler = -5;
			val = val + decaler;
			if (97 < val && val < 123 || 64 < val && val < 90) {// convertie la valeur ascii en fesant attention
																// s'il s'agit d'une majuscule et en verifiant
																// retournant à la lettre a lorsque l'on atteint z
				mot3 = mot3 + (char) val;
			} else if (val <98) {// intervalle minuscule supérrieur à z
				val = val + 26;
				mot3 = mot3 + (char) val;
			} else if (val < 65) {// intervalle maj supérieur à z
				val = val + 26;
				mot3 = mot3 + (char) val;
			} else {
				mot3 = mot3 + (char) (val - decaler);
			}
			
	}
		System.out.println(mot3);
		String mot4="";
		for (int j1 = 0; j1 < mot3.length(); j1++) {// empile a l'envers le mot
			p1.empiler(mot3.charAt(j1));
		}
		for (int j2 = 0; j2< mot3.length(); j2++) {// dépile et affiche à l'endroit le mot
			temp = (char) p1.depiler();
			mot4 = mot4 + temp;
		}

		System.out.println(mot4);

	}
}
