package TD2;
public class ex7 {
	public static void main(String[] args) {
		while (true) {
		int a, b;
		a=Clavier.lireInt();
		b=Clavier.lireInt();
		if (a>0 && b<0 || a<0 && b>0) {
			System.out.println("le produit est négatif");
		}
		else {
			System.out.println("le produit est positif");
		}
		}
	}

}