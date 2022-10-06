package TD2;

public class ex13 {

	public static void main(String[] args) {
		int age, sexe=3;
		while (true) {
			String n;
			System.out.println("renseignez votre age");
			age = Clavier.lireInt();
			System.out.println("renseigner votre sexe par \"homme\" ou \"femme\"");
			n = Clavier.lireString();
			switch (n) {
			case "homme":
				sexe = 0;
				break;
			case "femme":
				sexe = 1;
				break;
			default:
				System.out.println("erreur vous avez mal renseignez votre sexe");
				break;
			}
			if (age < 8 && age >= 6 && sexe == 0) {
				System.out.println("vous êtes un poussin");
			} else if (age < 8 && age >= 6 && sexe == 1) {
				System.out.println("vous êtes un poussine");
			} else if (age < 10 && age >= 6) {
				System.out.println("vous êtes un pupille");
			} else if (age < 12 && age >= 6) {
				System.out.println("vous êtes un minime");
			} else if (age < 100 && age >= 6 && sexe == 0) {
				System.out.println("vous êtes un cadet");
			} else if (age < 100 && age >= 6 && sexe == 1) {
				System.out.println("vous êtes un cadette");
			} else if (age >= 100) {
				System.out.println("vous êtes trop agé pour faire du sport reposez vous");
			} else if (age < 6) {
				System.out.println("vous êtes trop jeune pour faire du sport retournez manger de la soupe");

			}
		}
	}
}