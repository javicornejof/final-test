package cl.edutecno.PruebaFinalDos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edutecno.PruebaFinalDos.Model.ProductsModel;


@Repository
										
public interface ProductsRepository extends JpaRepository<ProductsModel, Integer> {

	//Mostrar todo en productos
	public List<ProductsModel> findAll();
	
	//Buscar por categoría
	public List<ProductsModel> findByCategoryId(Integer categoryId);
	
	//Buscar por marca
	public List<ProductsModel> findByBrandId(Integer brandId);
	
	

}
