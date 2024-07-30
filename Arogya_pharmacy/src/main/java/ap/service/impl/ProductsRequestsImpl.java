package ap.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap.entities.CustomersEO;
import ap.entities.ProductsRequestsEO;
import ap.repository.ProductsRequestsRepository;
import ap.services.ProductsRequests;

@Service
public class ProductsRequestsImpl implements ProductsRequests{
	
	@Autowired
	ProductsRequestsRepository productsrequestrepositoryref;

	@Override
	public List<ProductsRequestsEO> getAllProductsRequests() {
		List<ProductsRequestsEO> returnedProductRequestList = new ArrayList();
		returnedProductRequestList =(List<ProductsRequestsEO>) productsrequestrepositoryref.findAll();
		return returnedProductRequestList;
	}
	
	@Override
	public List<ProductsRequestsEO> getProductsRequestsBySupplier(String supplierId) {
		List<ProductsRequestsEO> returnedProductRequestList = new ArrayList();
		returnedProductRequestList =(List<ProductsRequestsEO>) productsrequestrepositoryref.findAllProductsRequestsToSupplier(supplierId);
		return returnedProductRequestList;
	}

	@Override
	public void addProductRequestsDetails(ProductsRequestsEO proreqEORef) {
		// TODO Auto-generated method stub
		productsrequestrepositoryref.save(proreqEORef);
	}

	@Override
	public void updateProductRequestsDetails(ProductsRequestsEO proreqEORef) {
		// TODO Auto-generated method stub
		productsrequestrepositoryref.save(proreqEORef);
	}

	@Override
	public Optional<ProductsRequestsEO> findByRequestNoId(String reqnoRef) {
		// TODO Auto-generated method stub
		Optional<ProductsRequestsEO> productrequestdetails = productsrequestrepositoryref.findById(reqnoRef);
		return productrequestdetails;
	}

	@Override
	public void deleteProductRequestsDetails(String reqnoRef) {
		// TODO Auto-generated method stub
		productsrequestrepositoryref.deleteById(reqnoRef);
	}

}
