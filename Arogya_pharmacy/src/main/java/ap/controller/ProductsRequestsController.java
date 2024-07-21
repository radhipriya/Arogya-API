package ap.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ap.entities.ProductsRequestsEO;
import ap.services.ProductsRequests;

@RestController
@RequestMapping("/productsrequest")
public class ProductsRequestsController {
	@Autowired
	private ProductsRequests ProductsRequestsService;
	
	
	@RequestMapping(value="/getAllProductsDetails", method=RequestMethod.GET)
	public List<ProductsRequestsEO> getAllProductsRequests()
	{
		return ProductsRequestsService.getAllProductsRequests();
	}
	
	@RequestMapping(value="/add-proreqdetails", method=RequestMethod.POST)
	public void addProductRequestsDetails(@RequestBody ProductsRequestsEO proreqEORef)
	{
		ProductsRequestsService.addProductRequestsDetails(proreqEORef);
	}
	
	@RequestMapping(value="/update-proreqdetails", method=RequestMethod.PUT)
	public void updateProductRequestsDetails(@RequestBody ProductsRequestsEO proreqEORef)
	{
		ProductsRequestsService.updateProductRequestsDetails(proreqEORef);
	}
	
	@RequestMapping(value="/findById-proreqdetails/{customerId}", method=RequestMethod.PUT)
	public Optional<ProductsRequestsEO> findByRequestNoId(@PathVariable String product_requesId)
	{
		Optional<ProductsRequestsEO> proreqdetails = ProductsRequestsService.findByRequestNoId(product_requesId);
		return proreqdetails;
	}
	
	@RequestMapping(value="/delete-proreqdetails/{customerId}", method=RequestMethod.DELETE)
	public void deleteProductRequestsDetails(@PathVariable String product_requesId)
	{
		ProductsRequestsService.deleteProductRequestsDetails(product_requesId);
	}

}