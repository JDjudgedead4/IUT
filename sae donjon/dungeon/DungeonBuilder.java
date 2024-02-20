package sae.dungeon;

import sae.util.Util;

public class DungeonBuilder {

	
	public DungeonBuilder() {
		super();
	}

	public Dungeon createFirstDungeon() {
		Dungeon res = new Dungeon();
		
		Room room1 = new Room("1", new Coord(0,0));
		Room room2 = new Room("2", new Coord(1,0));
		Room room3 = new Room("3", new Coord(0,-1));
		Room room4 = new Room("4", new Coord(2,0));
		Room room5 = new Room("5", new Coord(0,1));
		Room room6 = new Room("6", new Coord(-1,-1));
		Room room7 = new Room("7", new Coord(-1,0));
		Room room8 = new Room("8", new Coord(1,1));
		Room room9 = new Room("9", new Coord(2,-1));
		
		room7.addRoomToDirection(room1, Direction.EAST);
		room7.addRoomToDirection(room6, Direction.SOUTH);
		room6.addRoomToDirection(room3, Direction.EAST);
		room1.addRoomToDirection(room3, Direction.SOUTH);
		room5.addRoomToDirection(room1, Direction.SOUTH);
		room8.addRoomToDirection(room2, Direction.SOUTH);
		room4.addRoomToDirection(room9, Direction.SOUTH);
		room5.addRoomToDirection(room8, Direction.EAST);
		room1.addRoomToDirection(room2, Direction.EAST);
		room2.addRoomToDirection(room4, Direction.EAST);
		
		res.addRoom(room1);
		res.addRoom(room2);
		res.addRoom(room3);
		res.addRoom(room4);
		res.addRoom(room5);
		res.addRoom(room6);
		res.addRoom(room7);
		res.addRoom(room8);
		res.addRoom(room9);
		
		res.setRoomA(room7);
		res.setRoomB(room9);
		
		return res;
	}

	public Dungeon createSecondDungeon() {
		Dungeon res = new Dungeon();
		
		Room[] rooms = new Room[21];
		
		rooms[0] = new Room("1", new Coord(-2,2));
		rooms[1] = new Room("2", new Coord(-1,2));
		rooms[2] = new Room("3", new Coord(0,2));
		rooms[3] = new Room("4", new Coord(1,2));
		rooms[4] = new Room("5", new Coord(2,2));
		rooms[5] = new Room("6", new Coord(3,2));
		rooms[6] = new Room("7", new Coord(-2,1));
		rooms[7] = new Room("8", new Coord(-1,1));
		rooms[8] = new Room("9", new Coord(1,1));
		rooms[9] = new Room("10", new Coord(2,1));
		rooms[10] = new Room("11", new Coord(3,1));
		rooms[11] = new Room("12", new Coord(-2,0));
		rooms[12] = new Room("13", new Coord(-1,0));
		rooms[13] = new Room("14", new Coord(0,0));
		rooms[14] = new Room("15", new Coord(1,0));
		rooms[15] = new Room("16", new Coord(2,0));
		rooms[16] = new Room("17", new Coord(3,0));
		rooms[17] = new Room("18", new Coord(-1,-1));
		rooms[18] = new Room("19", new Coord(0,-1));
		rooms[19] = new Room("20", new Coord(1,-1));
		rooms[20] = new Room("21", new Coord(2,-1));

		rooms[0].addRoomToDirection(rooms[1], Direction.EAST);
		rooms[1].addRoomToDirection(rooms[2], Direction.EAST);
		rooms[2].addRoomToDirection(rooms[3], Direction.EAST);
		rooms[3].addRoomToDirection(rooms[4], Direction.EAST);
		rooms[4].addRoomToDirection(rooms[5], Direction.EAST);
		
		rooms[6].addRoomToDirection(rooms[7], Direction.EAST);
		rooms[8].addRoomToDirection(rooms[9], Direction.EAST);
		
		rooms[11].addRoomToDirection(rooms[12], Direction.EAST);
		rooms[12].addRoomToDirection(rooms[13], Direction.EAST);
		rooms[13].addRoomToDirection(rooms[14], Direction.EAST);
		rooms[15].addRoomToDirection(rooms[16], Direction.EAST);
		
		rooms[17].addRoomToDirection(rooms[18], Direction.EAST);
		rooms[19].addRoomToDirection(rooms[20], Direction.EAST);
		
		rooms[0].addRoomToDirection(rooms[6], Direction.SOUTH);
		rooms[6].addRoomToDirection(rooms[11], Direction.SOUTH);
		
		rooms[12].addRoomToDirection(rooms[17], Direction.SOUTH);
		
		rooms[3].addRoomToDirection(rooms[8], Direction.SOUTH);
		rooms[8].addRoomToDirection(rooms[14], Direction.SOUTH);
		rooms[14].addRoomToDirection(rooms[19], Direction.SOUTH);
		
		rooms[5].addRoomToDirection(rooms[10], Direction.SOUTH);
		rooms[10].addRoomToDirection(rooms[16], Direction.SOUTH);
		
		for (Room r: rooms) {
			res.addRoom(r);
		}
		
		res.setRoomA(rooms[13]);
		res.setRoomB(rooms[15]);
		
		return res;
	}


	public Dungeon createThirdDungeon() {	
		String data = Util.usingBufferedReader("Donjon.txt");
		return (new GeneratorDungeonFrom(data)).getDungeon();
	}
	
	public Dungeon createFourthDungeon() {	
		String data = Util.usingBufferedReader("Donjon2.txt");
		return (new GeneratorDungeonFrom(data)).getDungeon();
	}
	
	public Dungeon createFifthDungeon() {	
		String data = Util.usingBufferedReader("Donjon3.txt");
		return (new GeneratorDungeonFrom(data)).getDungeon();
	}
	
	public Dungeon createSixthDungeon() {	
		String data = Util.usingBufferedReader("Donjon4.txt");
		return (new GeneratorDungeonFrom(data)).getDungeon();
	}

}
