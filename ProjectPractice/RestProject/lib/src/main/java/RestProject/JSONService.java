package RestProject;

import org.apache.commons.math3.stat.descriptive.summary.Product;

@Path("/json/product")
public class JSONService {
	
	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getProductInJSON() {
		Product product = new Product();
		product.("ipad 3");
		product.setQty(999);
	}
	

}
