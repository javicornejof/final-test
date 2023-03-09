package cl.edutecno.PruebaFinalDos.Service;

import java.util.List;

import cl.edutecno.PruebaFinalDos.Model.ProductsModel;

public interface ProductsService {

	//Mostrar todo en productos
	public List<ProductsModel> findAll();
	
	//Buscar por categoría
	public List<ProductsModel> findByCategoryId(Integer categoryId);
	
	//Buscar por marca
	public List<ProductsModel> findByBrandId(Integer brandId);

}
