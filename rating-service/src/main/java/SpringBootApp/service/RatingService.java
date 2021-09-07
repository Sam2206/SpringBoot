package SpringBootApp.service;

import java.util.List;

import SpringBootApp.bean.Rating;
import SpringBootApp.bean.RatingList;

public interface RatingService 
{
	List<Rating> getRatingsByUserId(int uid);
}
