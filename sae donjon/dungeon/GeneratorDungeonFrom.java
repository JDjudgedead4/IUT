package sae.dungeon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratorDungeonFrom {

	private String data;
	private Dungeon dungeon;

	private int x;
	private int y;
	private int cpt;

	private Map<Integer, Room> rooms;
	private List<Coord> roomsToLinkToEast;
	private List<Coord> roomsToLinkToSouth;
	private int spaceInProgress;
	private int eolcpt;

	public GeneratorDungeonFrom(String data) {
		this.data = data;

		dungeon = new Dungeon();
		rooms = new HashMap<>();
		roomsToLinkToEast = new ArrayList<>();
		roomsToLinkToSouth = new ArrayList<>();

		generateDungeon();
	}

	private void generateDungeon() {

		x = 0;
		y = 0;
		cpt = 0;
		spaceInProgress = 0;
		eolcpt= 0;

		for (char c : data.toCharArray()) {
			switch (c) {
			case 'A':
				manageEntry();
				break;
			case 'B':
				manageExit();
				break;
			case ' ':
				manageSpace();
				break;
			case '|':
				manageVertical();
				break;
			case '-':
				manageHorizontal();
				break;
			case '\n':
				manageEoL();
				break;
			case 'o':
				manageRoom();
				break;
			default:
			}
		}

		manageLinks();
	}

	private void manageLinks() {
		for (Coord c : roomsToLinkToEast) {
			Coord otherCoords = new Coord(c.getX()+1, c.getY());
			Room room1 = rooms.get(c.getX() *100 + c.getY());
			Room room2 = rooms.get(otherCoords.getX() *100 + otherCoords.getY());
			room1.addRoomToDirection(room2, Direction.EAST);
		}
		for (Coord c : roomsToLinkToSouth) {
			Coord otherCoords = new Coord(c.getX(), c.getY()+1);
			Room room1 = rooms.get(c.getX() *100 + c.getY());
			Room room2 = rooms.get(otherCoords.getX() *100 + otherCoords.getY());
			room1.addRoomToDirection(room2, Direction.SOUTH);
		}
	}

	private void manageExit() {
		Room exit = manageRoom();
		dungeon.setRoomB(exit);
	}

	private Room manageRoom() {
		spaceInProgress = 0;
		Coord coords = new Coord(x, y);
		Room room = new Room("Room" + cpt, coords);
		rooms.put(x * 100 + y, room);
		cpt++;
		dungeon.addRoom(room);
		return room;
	}

	private void manageEoL() {
		eolcpt++;
		spaceInProgress = 0;
		x = 0;
		if (eolcpt == 2) {
			eolcpt = 0;
			y++;
		}
	}

	private void manageHorizontal() {
		roomsToLinkToEast.add(new Coord(x, y));
		x++;
		spaceInProgress = 0;
	}

	private void manageVertical() {
		roomsToLinkToSouth.add(new Coord(x, y));
		spaceInProgress = 0;
	}

	private void manageSpace() {
		spaceInProgress++;
		if (spaceInProgress == 1) {
			x++;
		} else if (spaceInProgress == 2 ) {
			spaceInProgress = 0;
		}
	}

	private void manageEntry() {
		Room entry = manageRoom();
		dungeon.setRoomA(entry);
	}

	public Dungeon getDungeon() {
		return dungeon;
	}

}
