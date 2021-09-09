package SpringBootApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import SpringBootApp.bean.Rating;
import SpringBootApp.bean.RatingList;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@Service
public class RatingServiceImpl implements RatingService
{
	@Autowired 
	RestTemplate restTemplate;

	@Override
	@CircuitBreaker(name="rating",fallbackMethod="getRatingListFallBack")
	public RatingList getRatingList(int uid) {
		RatingList ratingList=restTemplate.getForObject("http://localhost:9002/ratings/"+uid, RatingList.class);
		return ratingList;
	}
	
	public RatingList getRatingListFallBack(int uid, Exception e)
	{
		List<Rating> rlist=new ArrayList<>();
		rlist.add(new Rating(0,uid,0,0f));
		return new RatingList(rlist);
	}
//	public CustomerList getCustomerListFallBack(String custId,Exception e) {
//		List<Customer> customers=new ArrayList<>();
//		customers.add(new Customer(101, custId, 1, "Dummy Type", 0));
//		return new CustomerList(customers);
//	}

}
