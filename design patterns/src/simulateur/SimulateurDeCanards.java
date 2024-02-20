package simulateur;
/**
 * 
 * @author i2202003 Alexandre GRASTEAU
 *
 */
public class SimulateurDeCanards {
	 public static void main(String[] args) {
	        SimulateurDeCanards simulateur = new SimulateurDeCanards();
	        FabriqueDeCanards fabriqueDeCanards = new FabriqueDeCanards(); 

	        SimulateurDeCanards.simuler(fabriqueDeCanards);
	 }
	 
	 static void simuler(FabriqueDeCanards fabriqueDeCanards) {
	        Cancaneur colvert = fabriqueDeCanards.creerColvert();
	        Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
	        Cancaneur appelant = fabriqueDeCanards.creerAppelant();

	        System.out.println("\nSimulateur de canards");
	        simuler(colvert);
	        simuler(mandarin);
	        simuler(appelant);
	        System.out.println("Nous avons compté " + CompteurDeCouacs.getCouacs() + " couacs");
	    }

	 	public static void simuler(Cancaneur canard) {
		canard.cancaner();
	}

}
