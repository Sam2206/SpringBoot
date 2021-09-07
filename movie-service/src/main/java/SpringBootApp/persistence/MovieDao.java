package SpringBootApp.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBootApp.bean.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer>{

}
