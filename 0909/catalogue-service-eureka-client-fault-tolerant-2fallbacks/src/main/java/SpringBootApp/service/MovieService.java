package SpringBootApp.service;

import org.springframework.stereotype.Service;



import SpringBootApp.bean.Movie;


public interface MovieService 
{
	public Movie getMovieDetails(int movieId);
}
