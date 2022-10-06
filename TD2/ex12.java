package TD2;

public class ex12 {

	public static void main(String[] args) {
		int min, max, n, t=1;
		n=Clavier.lireInt();
		//assignationde la première valeur
		max=n;
		min=n;
		
		while (t<50) {
			t=t+1;
		n=Clavier.lireInt();
		if (n>max) {
			max=n;
		}
		else if (n<min) {
			min=n;
		}
		System.out.println("la valeur minimal est " + min + " la valeur maximal est " + max + " saisir valeur suivante ");
		
		
	}

}
}