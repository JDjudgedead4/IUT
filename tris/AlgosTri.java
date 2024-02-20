import java.util.*;

public class AlgosTri {

	static int [] tableau;
	static int [] copieTab;
	static int n=1000;
	static boolean AFFICHAGE=true;
	
	public static void main(String[] args) {
		
		long start,stop;  //sert pour calculer le temps des tris
		
		tableau=new int[n];
		
		Random r=new Random();	
		for(int i=0;i<=n-1;i++)
			tableau[i]=r.nextInt(1000);	//on remplit le tableau aléatoirement

		copieTab=(int[]) tableau.clone(); // on garde une copie pour pouvoir appliquer différentes méthodes de tri sur le même jeu de données
		
		if(AFFICHAGE) afficherTableau();
		System.out.println();
		
		start = System.nanoTime(); 
		triSelection();
		stop = System.nanoTime();
		
		if(AFFICHAGE) afficherTableau();
		
		
		System.out.println("temps de tri par sélection : " + (float) (stop - start)/1000000 +" ms\n");
		
		tableau=(int[]) copieTab.clone(); // on remet le tableau dans l'état initial
		
		start = System.nanoTime(); 
		triFusion(tableau,0,n-1);
		stop = System.nanoTime();
		
		if(AFFICHAGE) afficherTableau();
		
		System.out.println("temps de tri fusion : " + (float) (stop - start)/1000000 +" ms\n");
		
	
		
	}
	
	public static void afficherTableau(){
		
		System.out.print("Tableau :");
		
		for(int i=0;i<=n-1;i++)
			System.out.print(" "+tableau[i]);	
		
		System.out.println(".");

	}
	
	public static void triSelection(){
		
		//+++++++++++++++++++++++++++++++++++++++++++
		// A vous de coder !!!
		//+++++++++++++++++++++++++++++++++++++++++++
			
	}
	
	public static void triFusion(int []tab, int g, int d){
		//+++++++++++++++++++++++++++++++++++++++++++		
		// A vous de coder !!!
		//+++++++++++++++++++++++++++++++++++++++++++
			
	}
	
	


}