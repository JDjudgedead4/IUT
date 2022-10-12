package TD5;

import java.io.*;

public class ex2 {
	public static void main(String[] args) throws IOException {
		String nomfich ="toto.txt";
			BufferedReader entree = new BufferedReader(new FileReader(nomfich));
			while (entree.ready()) {
				System.out.println(entree.readLine());
			}
			entree.close();
	}

}
// lit l'intégramot du fichier texte toto.txt si dans mm répertoire