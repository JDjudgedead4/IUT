package TD2;

public class ex2 {

	public static void main(String[] args) {
		String n; 
		while (true) {
			System.out.println("renseigner votre sexe:");	
		n=Clavier.lireString();
		switch (n) {
		case "homme":
			System.out.println("bonjour monsieur");	
			break;
		case "femme":
			System.out.println("bonjour madame");
		break;
		default:
			System.out.println("erreur");		

			
		}
		}
	}
}
//cas simple d'un switch