package ap.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ap.entities.ProductsRequestsEO;
import ap.services.ProductsRequests;

@Service
public class ProductsRequestsImpl implements ProductsRequests{

	@Override
	public List<ProductsRequestsEO> getAllProductsRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProductRequestsDetails(ProductsRequestsEO proreqEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProductRequestsDetails(ProductsRequestsEO proreqEORef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ProductsRequestsEO> findByRequestNoId(String reqnoRef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductRequestsDetails(String reqnoRef) {
		// TODO Auto-generated method stub
		
	}

}