package pile; 

public interface Pile {
		//
		// Sélecteurs
		// Savoir si une pile est vide
		public boolean PileVide();
		// Savoir si une pile est pleine
		public boolean PilePlein();
		// Obtenir la longueur d’une pile
		public int longueur();
		// Déterminer la valeur du sommet d’une pile
		public Object sommet();
		//
		// Empiler une valeur au sommet d’une pile
		public void empiler(Object element);
		// Dépiler la valeur au sommet d’une pile
		public Object depiler();
		

}
