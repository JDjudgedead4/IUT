package sae.dungeon;

import java.util.ArrayList;
import java.util.List;

public class DungeonSoluce {

	private List<Direction> directionsToFollow;
	
	public DungeonSoluce() {
		super();
		directionsToFollow = new ArrayList<>();
	}

	public void addDirection(Direction direction) {
		directionsToFollow.add(direction);
	}

	public List<Direction> getSoluce() {
		return directionsToFollow;
	}

}
