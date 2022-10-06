package TD2;
public class ex5 {
	public static void main(String[] args) {
		double n, m=0, o=0; 
		while (true) {
			System.out.println("renseigner un nombre:");	
		n=Clavier.lireDouble();
		for (int i = 1; i<=21; i++) {
		System.out.println(n+"*"+m+"="+o);
		o=m*n;
		m=m+1;
		}
	}
}
}
//affichage de la table d'un nombre sur les 20 première valeur en fonction d'un nombre saisi