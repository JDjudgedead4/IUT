package simulateur;

/**
 * 
 * @author i2202003 Alexandre GRASTEAU
 *
 */
public class FabriqueDeComptage extends FabriqueDeCanardsAbstraite {

	@Override
	public Cancaneur creerColvert() {
		// TODO Auto-generated method stub
		return new CompteurDeCouacs(new Colvert());
	}

	@Override
	public Cancaneur creerMandarin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cancaneur creerCanardEnPlastique() {
		// TODO Auto-generated method stub
		return new CompteurDeCouacs(new CanardEnPlastique());
	}

	@Override
	public Cancaneur creerAppelant() {
		// TODO Auto-generated method stub
		return new CompteurDeCouacs(new Appelant());
	}

}
