package SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootApp.bean.Movie;
import SpringBootApp.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService
{
	@Autowired
	private MovieDao movieDao;

	@Override
	public Movie getMovidById(int id) {
		
		return movieDao.getById(id);
	}

}
