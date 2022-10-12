package TD5;

import java.io.*;

import TD1.Clavier;

public class ex4 {
	public static void main(String[] args) throws IOException {
		String nomfich = "adresse.txt";
		String nom, prenom, adr, ville, tel;
		System.out.println("Entrez le nom de la personne");
		nom = Clavier.lireLigne();
		System.out.println("Entrez le prénom de la personne");
		prenom = Clavier.lireLigne();
		System.out.println("Entrez l'adresse de la personne");
		adr = Clavier.lireLigne();
		System.out.println("Entrez la ville de la personne");
		ville = Clavier.lireLigne();
		System.out.println("Entrez le numéro de téléphone de la personne");
		tel = Clavier.lireLigne();
		PrintWriter f = new PrintWriter(new FileWriter(nomfich, true));
		f.println(nom + "," + prenom + "," + adr + "," + ville + "," + tel);
		f.close();
		System.out.println("succesfully written");

	}
}
// remplis un carnet d'adresse en mode ajout
