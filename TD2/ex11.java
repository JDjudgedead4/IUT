package TD2;

public class ex11 {

	public static void main(String[] args) {
		int a,b;
	while(true) {
		a=Clavier.lireInt();//modifier en byte quand fonctionnalité implémentanter par prof
		if (a>0 && a< 10) {
			b=a;
			System.out.println(" ");
			switch (b) {
			case 1:
				System.out.println("un");	
				break;
			case 2:
				System.out.println("deux");
			break;
			case 3:
				System.out.println("trois");
			break;
			case 4:
				System.out.println("quatre");
			break;
			case 5:
				System.out.println("cinq");
			break;
			case 6:
				System.out.println("six");
			break;
			case 7:
				System.out.println("sept");
			break;
			case 8:
				System.out.println("huit");
			break;
			case 9:
				System.out.println("neuf");
			break;			
			default:
				System.out.println("erreur sur la valeur de chiffre");		
			}
		}
		else
		System.out.println("la valeur est incorrect");
		

	}
	
	}
}
//utilisation switch avec leceture d'un chiffre compris entre 1 et 9 inclus

