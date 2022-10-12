package TD5;

import TD2.Clavier;
import java.io.*;

public class ex1 {

	public static void main(String[] args) throws IOException {
		String nomfich = "toto.txt";
		int a = 0;
		PrintWriter f = new PrintWriter(new FileWriter(nomfich));
		System.out.println("renseigner valeur");
		a = Clavier.lireInt();
		if (a != 0) {

			f.println(a + " à pour carré " + a * a);
		}

		f.close();
	}
	

}
//ecrit un nombre saisi par l'utilisateur et affiche son carrée dans un fichier toto.txt

