package SEPT_20;

public class Movie {
	private String title,genre; private int releaseYear;


	public Movie(String title, String genre, int releaseYear) {
		super();
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", releaseYear=" + releaseYear + "]";
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
	
}
