package cl.edutecno.PruebaFinalDosFront.service;

import java.util.List;

import cl.edutecno.PruebaFinalDosFront.dto.StocksDTO;

public interface StocksService {

	//Mostrar todo de Stocks
	public List<StocksDTO> findAll();
	
	//Buscar por categoría id
	public StocksDTO findByProductId(Integer productId);
	
}
