package sae.dungeon;

public enum Direction {

	WEST, EAST, SOUTH, NORTH;
	
	public Direction oppositeDirection() {
		switch(this) {
		case WEST: return EAST;
		case EAST: return WEST;
		case SOUTH: return NORTH;
		case NORTH: return SOUTH;
		}
		return null;
	}
}
