package unit1;

class Movie {


	String title;
	int year=2020;
	int rating;

	//constructor

	Movie(String t, int year, int rating) {
		title = t;
		this.year = year;
		if(rating > 5 || rating < 0) rating = 1;
		this.rating = rating;



	}
}


