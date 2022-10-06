package TD2;

public class ex4 {

	public static void main(String[] args) {
		double prix=0.0, conso;
		while(true) {
		System.out.println("renseigner votre consomation d'eau en mètre cube");
		conso=Clavier.lireDouble();
		if(conso>0) {
		if (conso<50 && conso>0) {
		prix=0.2;
		prix=prix*conso;
		}
		else if (conso<100 && conso>0) {
		prix=0.3;
		prix=prix*conso;
		}

		else if (conso<200 && conso>0) {
		prix=0.5;
		prix=prix*conso;
		}

		else if (conso<500 && conso>0) {
		prix=0.6;
		prix=prix*conso;
		}
		else if (conso>0) {
		prix=1;
		prix=prix*conso;
		}
		System.out.println("votre facture est de"+prix);
		}
		else
			System.out.println("ne renseigner pas de valeur négatives vous ne pouvez pas avoir de consomation négative");
		}
}
}

//adaptation du prix d'une facture en fonction de la consomation de la personne