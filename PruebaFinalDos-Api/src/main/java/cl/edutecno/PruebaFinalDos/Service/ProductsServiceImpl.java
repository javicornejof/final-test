package cl.edutecno.PruebaFinalDos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.edutecno.PruebaFinalDos.Model.ProductsModel;
import cl.edutecno.PruebaFinalDos.Repository.ProductsRepository;

@Service


public class ProductsServiceImpl implements ProductsService {

	@Autowired
	ProductsRepository productsRepository;
	

	@Override
	public List<ProductsModel> findAll() {
		return productsRepository.findAll();
	}

	@Override
	public List<ProductsModel> findByCategoryId(Integer categoryId) {
		return productsRepository.findByCategoryId(categoryId);
	}

	@Override
	public List<ProductsModel> findByBrandId(Integer brandId) {
		return productsRepository.findByBrandId(brandId);
	}

}
