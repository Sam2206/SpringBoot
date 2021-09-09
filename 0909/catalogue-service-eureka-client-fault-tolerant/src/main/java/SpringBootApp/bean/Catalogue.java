package SpringBootApp.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Catalogue 
{
	private int userId;
	private String movieName;
	private float rating;
	
	public Catalogue() {}

	public Catalogue(int userId, String movieName, float rating) {
		super();
		this.userId = userId;
		this.movieName = movieName;
		this.rating = rating;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
