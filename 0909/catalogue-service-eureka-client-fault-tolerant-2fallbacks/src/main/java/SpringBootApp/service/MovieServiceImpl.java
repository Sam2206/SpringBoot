package SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import SpringBootApp.bean.Movie;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@Service
public class MovieServiceImpl implements MovieService
{
	@Autowired 
	RestTemplate restTemplate;
	
	@CircuitBreaker(name="movie", fallbackMethod="getMovieDetailsFallBack")
	public Movie getMovieDetails(int movieId)
	{
		return restTemplate.getForObject("http://localhost:9004/movies/"+movieId, Movie.class);
	}
	
	public Movie getMovieDetailsFallBack(int movieId, Exception e)
	{
		return new Movie(movieId, "Dare to Dream");
	}
}


//	public Share getShareDetailsFallBack(int shareId,Exception e) {
//		return new Share(shareId, "Dummy Share", 0);
//	}
//
//}