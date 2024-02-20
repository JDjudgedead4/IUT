package simulateur;

public class CompteurDeCouacs implements Cancaneur{
		private Cancaneur cancaneur;
	    private static int nombreDeCouacs;

	    public CompteurDeCouacs(Cancaneur cancaneur) {
	        this.cancaneur = cancaneur;
	    }

	    public void cancaner() {
	        cancaneur.cancaner(); 
	        nombreDeCouacs++;
	    }

	    public static int getCouacs() {
	        return nombreDeCouacs;
	    }
	}


