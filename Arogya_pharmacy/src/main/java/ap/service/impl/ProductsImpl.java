package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ap.entities.ProductsEO;
import ap.services.Products;


@Service
public class ProductsImpl implements Products{


	@Override
	public void addProductsDetails(ProductsEO proEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProductDetails(ProductsEO proEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ProductsEO> findByProductId(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductDetails(String productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductsEO> getAllProductsDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
}