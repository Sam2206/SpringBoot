package SpringBootApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import SpringBootApp.bean.Catalogue;
import SpringBootApp.bean.CatalogueList;
import SpringBootApp.bean.Movie;
import SpringBootApp.bean.Rating;
import SpringBootApp.bean.RatingList;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CatalogueServiceImpl implements CatalogueService
{

//	@Autowired 
//	RestTemplate restTemplate;
	
	@Autowired 
	private MovieService movieService;
	@Autowired
	private RatingService ratingService;
	
	@Override
//	@CircuitBreaker(name = "catalogueDetails",fallbackMethod = "getCataloguesByUserIdFallBack")
	public CatalogueList getCataloguesByUserId(int uid)
	{
		List<Catalogue> catlist=new ArrayList<>();
		
		RatingList ratingList=ratingService.getRatingList(uid);
		
		for(Rating rating: ratingList.getRatingList())
		{
			Movie movie=movieService.getMovieDetails(rating.getMovieId());
			
			Catalogue cat=new Catalogue(rating.getUserId(), movie.getMovieName(), rating.getRating());
			catlist.add(cat);
		}
		
		
//		List<Catalogue> catlist=new ArrayList<>();
//		
//		RatingList ratingList=restTemplate.getForObject("http://localhost:9002/ratings/"+uid, RatingList.class);
//		
//		for(Rating rating: ratingList.getRatingList())
//		{
//			Movie movie=restTemplate.getForObject("http://localhost:9004/movies/"+rating.getMovieId(), Movie.class);
//			
//			Catalogue cat=new Catalogue(rating.getUserId(), movie.getMovieName(), rating.getRating());
//			catlist.add(cat);
//		}
		
		CatalogueList catalogueList=new CatalogueList(catlist);
		return catalogueList;
	}

	public CatalogueList getCataloguesByUserIdFallBack(Exception e) {
		List<Catalogue> catalogues=new ArrayList<>();
		catalogues.add(new Catalogue(0, "", 0.0f));
		return new CatalogueList(catalogues);
	}
}
