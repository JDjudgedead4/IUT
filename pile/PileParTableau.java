package pile;

public class PileParTableau implements Pile {
	private int sommet = -1, TAILLEMAX;
	private Object[] tabPile;
	
	
	public PileParTableau(int nbop) {
		TAILLEMAX=nbop;
		tabPile = new Object[TAILLEMAX];	
		}
	public boolean PileVide() {
		boolean Vide = false;
		if (sommet == -1) {
			Vide = true;
		}
		return (Vide);
	}

	public boolean PilePlein() {
		boolean Vide = false;
		if (sommet == TAILLEMAX) {
			Vide = true;
		}
		return (Vide);
	}

	public int longueur() {
		return (sommet + 1);
	}

	public Object sommet() {
		if (PileVide() == false) {
			return (tabPile[sommet]);
		} else {
			System.out.println("the pile is empty");
			return (null);
		}
	}
	
	
	public void empiler(Object elem){
		if (PilePlein() == false) {
			tabPile[++sommet]=elem;

		}
		else {
			System.out.println("unable to add next object pile full");

		}
	}
	

	public Object depiler() {
		if(PileVide()==false){
			sommet=sommet-1;
			return (tabPile[sommet+1]);
		}
		else{
			System.out.println("pile already empty");
			return(null);
		}
	}

	
}
