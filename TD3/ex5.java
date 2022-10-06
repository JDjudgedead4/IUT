package TD3;

public class ex5 {

	public static void main(String[] args) {
		int tableau2[] = new int[12],i = 0, n = 0,x=0;//déclaration d'un tableau avec des valeurs aléatoire car l'exercice sous entendent l'acquisition d'un talbeau deja éxistant
		tableau2[2] = 1;
		tableau2[3] = 2;
		tableau2[1] = 3;
		tableau2[4] = 4;
		tableau2[5] = 5;
		tableau2[6] = 6;
		tableau2[7] = 7;
		tableau2[8] = 8;
		tableau2[9] = 9;
		tableau2[10] = 11;
		tableau2[11] = 12;

		System.out.println("saisir nombre de valeur a afficher");
		n = Clavier.lireInt();
		i=tableau2.length;
		if (i < n) {
			while (i>0) {
			i=i-1;
			System.out.println(tableau2[i]);
		}
		}
		else {
			while (n>0) {
			System.out.println(tableau2[i-n]);
			n=n-1;
		}
		}
}
}