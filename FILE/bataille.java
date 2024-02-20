package FILE;

public class bataille {

	public static void main(String[] args) {
		try {
			FileParChainage file1 = new FileParChainage();
			FileParChainage file2 = new FileParChainage();
			int carte1, score1 = 0;
			int carte2, score2 = 0;
			file1.enfiler(1);
			file1.enfiler(5);
			file1.enfiler(8);
			file1.enfiler(3);
			file1.enfiler(1);
			file2.enfiler(23);
			file2.enfiler(22);
			file2.enfiler(25);
			file2.enfiler(55);
			file2.enfiler(25);
			while (!file1.filevide() && !file2.filevide()) {
				carte1 = (int) file1.defiler();
				carte2 = (int) file2.defiler();
				if (carte1 > carte2) {
					score1++;
					System.out.println(
							"le score du joueur 1 est de " + score1 + " le score du joueur 2 est de " + score2);

				} else if (carte2 > carte1) {
					score2++;
					System.out.println(
							"le score du joueur 1 est de " + score1 + " le score du joueur 2 est de " + score2);
				} else {
					System.out.println("BATAILLE!!");
					System.out
							.println("le score du joueur 1 est de " + score1 + "le score du joueur 2 est de " + score2);
				}
			}
		} catch (exception e) {
			System.out.println("test");
		}

	}

}
