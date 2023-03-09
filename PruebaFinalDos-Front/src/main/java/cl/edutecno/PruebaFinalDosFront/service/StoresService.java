package cl.edutecno.PruebaFinalDosFront.service;

import java.util.List;

import cl.edutecno.PruebaFinalDosFront.dto.StoresDTO;


public interface StoresService {

	//Mostrar todo de tiendas
	public List<StoresDTO> findAll();
	
	//Buscar por tienda
	public StoresDTO findByStoreId(Integer storeId);
	
}
