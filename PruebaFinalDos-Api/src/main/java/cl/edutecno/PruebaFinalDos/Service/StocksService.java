package cl.edutecno.PruebaFinalDos.Service;

import java.util.List;

import cl.edutecno.PruebaFinalDos.Model.StocksModel;

public interface StocksService {

	//Mostrar todo de Stocks
	public List<StocksModel> findAll();
	
	//Buscar por categoría id
	public List<StocksModel> findByProductId(Integer productId);
}
