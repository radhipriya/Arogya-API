package ap.services;

import java.util.List;
import java.util.Optional;

import ap.entities.ProductsEO;

public interface Products {
	public List<ProductsEO> getAllProductsDetails();
	public void addProductsDetails(ProductsEO proEORef);
	public void updateProductDetails(ProductsEO proEORef);
	public Optional<ProductsEO> findByProductId(String productId);
	public void deleteProductDetails(String productId);

}
