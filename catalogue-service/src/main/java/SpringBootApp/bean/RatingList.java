package SpringBootApp.bean;

import java.util.List;

public class RatingList 
{
	private List<Rating> rList;
	
	public RatingList(){}

	public RatingList(List<Rating> rList) {
		super();
		this.rList = rList;
	}

	public List<Rating> getRatingList() {
		return rList;
	}

	public void setRatingList(List<Rating> rList) {
		this.rList = rList;
	}
	
	
}
