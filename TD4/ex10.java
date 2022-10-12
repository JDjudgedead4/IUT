package TD4;

import TD3.Clavier;

public class ex10 {

	public static void main(String[] args) {
		absolu();

	}
	public static int absolu() {
		int a;
		System.out.println("saisir nombres");
		a = Clavier.lireInt();
		if (a < 0) {
			a=-a;
		}		

		System.out.println(a);
		return a;

}
}
