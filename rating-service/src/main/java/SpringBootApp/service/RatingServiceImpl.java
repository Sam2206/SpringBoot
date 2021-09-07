package SpringBootApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootApp.bean.Rating;
import SpringBootApp.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService
{
	@Autowired
	private RatingDao ratingDao;

	@Override
	public List<Rating> getRatingsByUserId(int uid) {
		return ratingDao.findByUserId(uid);
	}

}
