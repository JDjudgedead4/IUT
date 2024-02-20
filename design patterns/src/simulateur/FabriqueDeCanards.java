package simulateur;

/**
 * 
 * @author i2202003 Alexandre GRASTEAU
 *
 */
public class FabriqueDeCanards extends FabriqueDeCanardsAbstraite{
	public Colvert creerColvert() {
		return new Colvert();
	}
	@Override
	public Mandarin creerMandarin() {
		// TODO Auto-generated method stub
		return new Mandarin();
	}

	@Override
	public CanardEnPlastique creerCanardEnPlastique() {
		// TODO Auto-generated method stub
		return new CanardEnPlastique();
	}

	@Override
	public Appelant creerAppelant() {
		// TODO Auto-generated method stub
		return new Appelant();
	}
	//on ne mets pas l'oie car c'est pas un canard.
}
