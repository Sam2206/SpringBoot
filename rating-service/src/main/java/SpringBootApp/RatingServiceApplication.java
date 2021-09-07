package SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import SpringBootApp.bean.Rating;
import SpringBootApp.persistence.RatingDao;

@SpringBootApplication(scanBasePackages="SpringBootApp")
@EnableJpaRepositories(basePackages="SpringBootApp.persistence")
@EntityScan(basePackages="SpringBootApp.bean")
public class RatingServiceApplication implements CommandLineRunner
{

	@Autowired
	private RatingDao ratingDao;
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		ratingDao.save(new Rating(1,1,1,1.5f));
//		ratingDao.save(new Rating(2,2,2,2f));
//		ratingDao.save(new Rating(3,1,3,2.5f));
//		ratingDao.save(new Rating(4,1,4,3.5f));
//		ratingDao.save(new Rating(5,2,5,4.5f));
//		ratingDao.save(new Rating(6,3,3,1.5f));
		
	}

}
