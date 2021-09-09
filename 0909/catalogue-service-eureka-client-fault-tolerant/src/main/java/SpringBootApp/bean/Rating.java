package SpringBootApp.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Rating 
{
	
	private int ratingId;
	private int userId;
	private int movieId;
	private float rating;
	
	public Rating() {}

	public Rating(int ratingId, int userId, int movieId, float rating) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
	}

	public int getRatingId() {
		return ratingId;
	}

	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
