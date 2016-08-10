//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 2
//Submit Date: May 2

public class Franchise {
	private Store stores[];
	
	public Franchise(int num) {
			stores = new Store[num];//assign array
	}

	public Store getStores(int i) {
		return stores[i];//this is the getter of the store sum
	}

	public void setStores(Store stores, int i) {
		this.stores[i] = stores;//this is the setter of the store
	}
	
	public int numberofstores()
	{
		return stores.length;//collecting the length of this stores
	}
}
