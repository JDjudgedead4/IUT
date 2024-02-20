package FILE;

public class Noeud {
	
	protected Object valeur; 
	protected Noeud suivant; 
	


	public Noeud(Object val, Noeud suivant){
		this.valeur=val;
		this.suivant=suivant;
	}

}