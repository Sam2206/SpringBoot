package SpringBootApp.bean;

import java.util.List;

public class CatalogueList 
{
	private List<Catalogue> clist;
	
	public CatalogueList(){}

	public CatalogueList(List<Catalogue> clist) {
		super();
		this.clist = clist;
	}

	public List<Catalogue> getClist() {
		return clist;
	}

	public void setClist(List<Catalogue> clist) {
		this.clist = clist;
	}
	
	
}
