package cl.edutecno.PruebaFinalDos.Service;

import java.util.List;

import cl.edutecno.PruebaFinalDos.Model.StoresModel;

public interface StoresService {

		//Mostrar todo de tiendas
		public List<StoresModel> findAll();
		
		//Buscar por tienda
		public List<StoresModel> findByStoreId(Integer storeId);
}
