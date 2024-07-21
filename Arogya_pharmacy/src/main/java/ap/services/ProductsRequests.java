package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.ProductsRequestsEO;

public interface ProductsRequests {
	public List<ProductsRequestsEO> getAllProductsRequests();
	public void addProductRequestsDetails(ProductsRequestsEO proreqEORef);
	public void updateProductRequestsDetails(ProductsRequestsEO proreqEORef);
	public Optional<ProductsRequestsEO> findByRequestNoId(String product_requesId);
	public void deleteProductRequestsDetails(String product_requesId);

}
