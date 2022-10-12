package TD5;

import java.io.*;

import TD1.Clavier;

public class ex5 {
	public static void main(String[] args) throws IOException {
		String to = "toto.txt";
		String ta = "tata.txt";
		String tu = "tutu.txt";
		while (true) {
		PrintWriter f = new PrintWriter(new FileWriter(tu, true));
		BufferedReader entree = new BufferedReader(new FileReader(to));
		while (entree.ready()) {
			System.out.println(entree.readLine());
			f.println(entree.readLine());
		}
		BufferedReader entre = new BufferedReader(new FileReader(ta));
		while (entre.ready()) {
			System.out.println(entre.readLine());
			f.println(entre.readLine());
		}
		f.close();
		entree.close();
		entre.close();
		System.out.println("succesfully written");
	}
}
}
//fusion deux fichiers texte en mode ajout