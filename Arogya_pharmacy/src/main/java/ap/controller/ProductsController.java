package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.ProductsEO;
import ap.services.Products;


@RestController
@RequestMapping("/Products")
public class ProductsController {
	@Autowired
	private Products ProductsService;
	
	
	@RequestMapping(value="/getAllProductsDetails", method=RequestMethod.GET)
	public List<ProductsEO> getAllProductsDetails()
	{
		return ProductsService.getAllProductsDetails();
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
	
	@RequestMapping(value="/findById-products/{productId}", method=RequestMethod.PUT)
	public Optional<ProductsEO> findByProductId(@PathVariable String productId)
	{
		Optional<ProductsEO> pharmacy = ProductsService.findByProductId(productId);
		return pharmacy;
	}
	
	@RequestMapping(value="/delete-products/{productId}", method=RequestMethod.DELETE)
	public void deleteProductDetails(@PathVariable String productId)
	{
		ProductsService.deleteProductDetails(productId);
	}


}