package FILE;

import FILE.file;

public class FileParChainage implements file {
	private Noeud tete;
	private Noeud queue;
	private int nbelem;

	public FileParChainage() {
		tete=null;
		queue=null;
		nbelem = 0;
	}

	public int longueur() {
		return (nbelem);
	}

	public boolean filevide() {
		if (nbelem == 0){
			return (true);
		}
		return (false);

	}

	public void enfiler(Object val) {
		Noeud n = new Noeud(val, null);
		if (filevide()){
			tete=n; 
		}
		else{
			queue.suivant=n; 
		}
		queue=n;
		nbelem++;
	}

	public Object defiler()throws exception {
		if (!filevide()) {
			Object val = tete.valeur;
			tete = tete.suivant;
			nbelem = nbelem - 1;
			return (val);
		}
		throw new exception();


	}
	public Object affichertete(){
		return (tete.valeur);
	}


}