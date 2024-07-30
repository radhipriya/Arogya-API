package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.ProductsEO;
import ap.services.Products;

import java.util.logging.Logger;

@RestController
@RequestMapping("/Products")
@CrossOrigin("http://localhost:3000")
public class ProductsController {
	@Autowired
	private Products ProductsService;
	
    private static final Logger LOGGER = Logger.getLogger(ProductsController.class.getName());
	
	
	@RequestMapping(value="/getAllProductsDetails", method=RequestMethod.GET)
	public List<ProductsEO> getAllProductsDetails()
	{
	    List<ProductsEO> products = ProductsService.getAllProductsDetails();
	    if (products.size() > 0) {
	    	return products;
	    } else {
	    	LOGGER.severe("The products list is null.");
	    	return null;	    	
	    }
	}
	
	@RequestMapping(value="/add-products", method=RequestMethod.POST)
	public void addProductsDetails(@RequestBody ProductsEO proEORef)
	{
		ProductsService.addProductsDetails(proEORef);
	}
	
	@RequestMapping(value="/update-products", method=RequestMethod.PUT)
	public void updateProductDetails(@RequestBody ProductsEO proEORef)
	{
	
		ProductsService.updateProductDetails(proEORef);
	}
	
	@RequestMapping(value="/findById-products/{productId}", method=RequestMethod.GET)
	public Optional<ProductsEO> findByProductId(@PathVariable String productId)
	{
		Optional<ProductsEO> product = ProductsService.findByProductId(productId);
		return product;
	}
	
	@RequestMapping(value="/delete-products/{productId}", method=RequestMethod.DELETE)
	public void deleteProductDetails(@PathVariable String productId)
	{
		ProductsService.deleteProductDetails(productId);
	}


}
