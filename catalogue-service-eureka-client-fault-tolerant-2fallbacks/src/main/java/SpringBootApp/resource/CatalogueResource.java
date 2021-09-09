package SpringBootApp.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import SpringBootApp.bean.CatalogueList;
import SpringBootApp.service.CatalogueService;

@RestController
public class CatalogueResource 
{
	@Autowired
	private CatalogueService catalogueService;
	
	@GetMapping(value="/catalogues/{uid}",produces="application/json")
	public CatalogueList getMovieDetailsByUserId(@PathVariable("uid") int id)
	{
		return catalogueService.getCataloguesByUserId(id);
	}
}
