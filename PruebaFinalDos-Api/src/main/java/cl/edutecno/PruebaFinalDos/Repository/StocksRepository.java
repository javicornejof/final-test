package cl.edutecno.PruebaFinalDos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edutecno.PruebaFinalDos.Model.ProductsModel;
import cl.edutecno.PruebaFinalDos.Model.StocksModel;

@Repository
									
public interface StocksRepository extends JpaRepository<StocksModel, Integer> {

	
	//Mostrar todo de Stocks
	public List<StocksModel> findAll();
	
	//Buscar por categoría id
	public List<StocksModel> findByProductId(Integer productId);
}
