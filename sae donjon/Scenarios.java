package sae;

import sae.dungeon.Dungeon;
import sae.dungeon.DungeonBuilder;
import sae.dungeon.DungeonSoluce;
import sae.dungeon.Room;
import sae.graph.GraphSoluce;
import sae.graph.Node;
import sae.solver.Solver;
import sae.solver.SolverWithAstar;
import sae.solver.SolverWithBFS;
import sae.transform.Dungeon2Graph;

public class Scenarios {

	private static final int NB_ATTEMPTS = 10000;
	private static int cptDungeon = 1;

	public static void main(String[] args) {

		DungeonBuilder builder = new DungeonBuilder();

		solveDungeon(builder.createFirstDungeon());
		solveDungeon(builder.createSecondDungeon());
		solveDungeon(builder.createThirdDungeon());
		solveDungeon(builder.createFourthDungeon());
		solveDungeon(builder.createFifthDungeon());
		solveDungeon(builder.createSixthDungeon());

	}

	private static void solveDungeon(Dungeon dungeon) {

		System.out.println("***************************");
		System.out.println("   Résolution du donjon " + cptDungeon++);
		System.out.println("---------------------------");

		Room roomA = dungeon.getRoomA();
		Room roomB = dungeon.getRoomB();

		Dungeon2Graph mapping = new Dungeon2Graph(dungeon);

		Node nodeA = mapping.mappedNode(roomA);
		Node nodeB = mapping.mappedNode(roomB);

		// System.out.println(graph); // verifiez votre code de transfo ici !

		System.out.println("Résolution avec BFS");

		long startingTime = System.currentTimeMillis();
		Solver solverBFS = new SolverWithBFS(nodeA, nodeB);
		
		for (int i = 0; i < NB_ATTEMPTS; i++) {
			solverBFS.resolve();
		}
		long endingTime = System.currentTimeMillis();
		long duration = endingTime - startingTime;
		
		GraphSoluce soluceGraphBFS = solverBFS.getSoluce();
		// System.out.println(soluceGraphBFS.getSoluce()); // verifiez votre solution ici !

		DungeonSoluce soluceDonjonBFS = mapping.transform(soluceGraphBFS);
		
		System.out.println("Solution   => " + soluceDonjonBFS.getSoluce());
		System.out.println("Temps (ms) => " + duration);
		System.out.println("Steps      => " + solverBFS.getSteps());

		System.out.println("---------------------------");

		System.out.println("Résolution avec A*");

		startingTime = System.currentTimeMillis();
		Solver solverAstar = new SolverWithAstar(nodeA, nodeB);
		
		for (int i = 0; i < NB_ATTEMPTS; i++) {
			solverAstar.resolve();
		}
		endingTime = System.currentTimeMillis();
		duration = endingTime - startingTime;
		
		GraphSoluce soluceGraphAstar = solverAstar.getSoluce();
		// System.out.println(soluceGraphBFS.getSoluce()); // verifiez votre solution ici !
		
		DungeonSoluce soluceDonjonAstar = mapping.transform(soluceGraphAstar);
		
		System.out.println("Solution   => " + soluceDonjonAstar.getSoluce());
		System.out.println("Temps (ms) => " + duration);
		System.out.println("Steps      => " + solverAstar.getSteps());

		System.out.println("---------------------------");
	}

}
