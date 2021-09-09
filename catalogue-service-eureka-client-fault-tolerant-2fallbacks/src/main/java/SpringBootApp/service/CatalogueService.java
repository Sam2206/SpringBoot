package SpringBootApp.service;

import SpringBootApp.bean.CatalogueList;

public interface CatalogueService 
{
	CatalogueList getCataloguesByUserId(int id);
}
