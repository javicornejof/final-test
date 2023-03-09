package cl.edutecno.PruebaFinalDosFront.service;

import java.util.List;

import cl.edutecno.PruebaFinalDosFront.dto.ProductsDTO;


public interface ProductsService {

		//Mostrar todo en productos
		public List<ProductsDTO> findAll();
		
		//Buscar por categoría
		public ProductsDTO findByCategoryId(Integer categoryId);
		
		//Buscar por marca
		public ProductsDTO findByBrandId(Integer brandId);
	
}
