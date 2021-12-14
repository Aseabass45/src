package unit1;

import java.util.ArrayList;

class movieProgram {
	static ArrayList<Movie> movieList = new ArrayList<Movie>();

	public static void main(String[] args) {

		Movie m =new Movie("The Avengers", 2015,5);
		m.year = 2000;
		movieList.add(m);
		
		m = new Movie ("Jurassic Park", 1997,4);
		movieList.add(m);
		movieList.add(new Movie("Gone with the wind", 1937,3));
		printList();
		
		


	}
	static void printList() {
		for (int i = 0; i < movieList.size(); i++) {
			Movie movie = movieList.get(i);
			System.out.println(movie.title + "\t" + movie.year + " stars=" + movie.rating);
		}
	}
}
