package SpringBootApp.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBootApp.bean.Rating;

@Repository
public interface RatingDao extends JpaRepository<Rating, Integer>
{
	public List<Rating> findByUserId(int uid);
}
