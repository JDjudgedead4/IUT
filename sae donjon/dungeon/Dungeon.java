package sae.dungeon;

import java.util.HashSet;
import java.util.Set;

public class Dungeon {
	
	private Set<Room> rooms;
	
	private Room roomA;
	private Room roomB;
	
	public Dungeon() {
		super();
		rooms = new HashSet<>();
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public void setRoomA(Room roomA) {
		this.roomA = roomA;
	}

	public void setRoomB(Room roomB) {
		this.roomB = roomB;
	}

	public Room getRoomA() {
		return roomA;
	}

	public Room getRoomB() {
		return roomB;
	}

	public Set<Room> getRooms() {
		return rooms;
	}

	@Override
	public String toString() {
		return "Dungeon [rooms=" + rooms + ", roomA=" + roomA + ", roomB=" + roomB + "]";
	}

	
}
