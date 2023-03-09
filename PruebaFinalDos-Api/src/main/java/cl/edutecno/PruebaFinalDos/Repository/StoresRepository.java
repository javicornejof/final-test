package cl.edutecno.PruebaFinalDos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.edutecno.PruebaFinalDos.Model.ProductsModel;
import cl.edutecno.PruebaFinalDos.Model.StocksModel;
import cl.edutecno.PruebaFinalDos.Model.StoresModel;

@Repository

public interface StoresRepository extends JpaRepository<StoresModel, Integer> {

	//Mostrar todo de tiendas
	public List<StoresModel> findAll();
	
	//Buscar por tienda
	public List<StoresModel> findByStoreId(Integer storeId);
	
}
