/*Bassem El-Sayed
  Mr. Harwood
  September 23, 2021
  
*/ 
package unit1;

import java.util.ArrayList;

class Songs {
	static ArrayList<SongConstructor> songlist = new ArrayList<SongConstructor>();
	
	public static void main(String[]args) {
		
		SongConstructor fs = new SongConstructor("Never gonna give you up","Rick Astley", 1987, 100);
		songlist.add(fs);
		
		fs = new SongConstructor("Il vento d'oro","Yugo Kanno", 2018, 75);
		songlist.add(fs);
		
		fs = new SongConstructor("All star","Smash Mouth", 1999, 45);
		songlist.add(fs);
		
		fs = new SongConstructor("Mask","Dream", 2021, -1000);
		songlist.add(fs);
		
		fs = new SongConstructor("Awaken","Taku Iwasaki", 2013, 67);
		songlist.add(fs);
		
		removeItem(songlist);
	}
	static void removeItem(ArrayList<SongConstructor> fs) {
		System.out.printf(" %-27s  %-13s  %7s  %19s %n", "Title", "artist", "year", "rating ( out of 5)");
		for (SongConstructor s : fs) {
			System.out.printf("| %-25s | %-15s | %d | %-17d |%n", s.title, s.artist, s.year, s.rating);
			
		}

		for (SongConstructor s : fs) {
			if (s.rating == -1000) fs.remove(s);
	}
		for (SongConstructor s : fs) {
			if (s.year == 1999) fs.remove(s);
	}
		printList(songlist);
  }
	static void printList(ArrayList<SongConstructor> fs) {
		System.out.printf(" %-27s  %-13s  %7s  %19s %n", "Title", "artist", "year", "rating ( out of 5)");
		for (SongConstructor s : fs) {
			System.out.printf("| %-25s | %-15s | %d | %-17d |%n", s.title, s.artist, s.year, s.rating);
			
		}
	}
}
