package TD5;

import java.io.*;
import java.util.StringTokenizer;

public class ex3 {

	public static void main(String[] args) throws IOException {
		String nomfich = "toto.txt";
		int n = 0;
		BufferedReader entree = new BufferedReader(new FileReader(nomfich));
		while (entree.ready()) {

			StringTokenizer tok = new StringTokenizer(entree.readLine(), "/");
			n = tok.countTokens();
			for (int b = 0; b < n; b++) {
				System.out.print(tok.nextToken()+ " ");

			}
			System.out.println();

			
		}
		entree.close();

	}
}
// replacement de slash par des espaces dans un texte délimité par des slash.
