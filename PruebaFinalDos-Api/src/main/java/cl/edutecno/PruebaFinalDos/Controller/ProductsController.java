package cl.edutecno.PruebaFinalDos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.edutecno.PruebaFinalDos.Model.ProductsModel;
import cl.edutecno.PruebaFinalDos.Service.ProductsServiceImpl;

@RestController
@RequestMapping ("/api/v1/products")



public class ProductsController {


	@Autowired
	ProductsServiceImpl productsServiceImpl;
	
	
	@GetMapping 
	@ResponseStatus(HttpStatus.OK)
	public List<ProductsModel> findAll() {
		return productsServiceImpl.findAll();
	}

	@GetMapping ("/categoryid={categoryId}")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductsModel> findByCategoryId(@PathVariable Integer categoryId) {
		return productsServiceImpl.findByCategoryId(categoryId);
	}

	@GetMapping ("/brandid={brandId}")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductsModel> findByBrandId(@PathVariable Integer brandId) {
		return productsServiceImpl.findByBrandId(brandId);
	
	}
}

