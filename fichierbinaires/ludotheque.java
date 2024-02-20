package fichierbinaires;
import java.util.LinkedList;
import java.io.*;
import java.util.*;

public class ludotheque {

	static List<JeuVideo> ListeJeux = new LinkedList<JeuVideo>();

		public static void main(String[] args){
		ListeJeux.add(new JeuVideo("pacman", "reflexion","atari",1982,18));
		ListeJeux.add(new JeuVideo("LOL", "Action","Riot",2009,20));
		ListeJeux.add(new JeuVideo("WOW", "Action","Blizzard",2004,15));
		ListeJeux.add(new JeuVideo("fortnite", "FPS","Epicgames",2011,0));
		ListeJeux.add(new JeuVideo("heartstone", "reflexion","Blizzard",2014,15));
		ListeJeux.add(new JeuVideo("fallguys", "action","Epicgames",2020,12));
		ListeJeux.add(new JeuVideo("fallout", "action","bethesda",2008,12));
		ListeJeux.add(new JeuVideo("fallout sheltter", "reflexion","bethesda",2014,12));


		

		Collections.sort(ListeJeux,JeuVideo.compareNote);
			System.out.println();
			Iterator<JeuVideo> it = ListeJeux.iterator();
			while (it.hasNext())
			System.out.println(it.next());
			
			try {
			FileOutputStream fos;
				fos = new FileOutputStream("maliste.dat");
			
			
			ObjectOutputStream oos;
			
				oos = new ObjectOutputStream(fos);
				oos.writeObject(ludotheque.ListeJeux);
			
			
			
			oos.close();
			fos.close();
			}catch (FileNotFoundException e){
					e.printStackTrace();
			}
			catch (IOException e) {
					e.printStackTrace();
			}
		}
	}

