package SpringBootApp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApp.bean.RatingList;
import SpringBootApp.service.RatingService;

@RestController
public class RatingResource
{
	@Autowired
	private RatingService ratingService;
	
	@GetMapping(value="/ratings/{uid}", produces="application/json")
	public RatingList getRatingsByUserid(@PathVariable("uid") int id)
	{
		RatingList ratingList=new RatingList();
		ratingList.setRatingList(ratingService.getRatingsByUserId(id));
		return ratingList;
	}
}
