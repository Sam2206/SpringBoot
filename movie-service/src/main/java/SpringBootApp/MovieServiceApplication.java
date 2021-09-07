package SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import SpringBootApp.bean.Movie;
import SpringBootApp.persistence.MovieDao;

@SpringBootApplication(scanBasePackages = "SpringBootApp")
@EnableJpaRepositories(basePackages="SpringBootApp.persistence")
@EntityScan(basePackages="SpringBootApp.bean")
public class MovieServiceApplication implements CommandLineRunner{

	@Autowired
	private MovieDao movieDao;
	public static void main(String[] args) {
		SpringApplication.run(MovieServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		movieDao.save(new Movie(1,"a"));
//		movieDao.save(new Movie(2,"b"));
//		movieDao.save(new Movie(3,"c"));
//		movieDao.save(new Movie(4,"d"));
//		movieDao.save(new Movie(5,"e"));
		
	}

}
