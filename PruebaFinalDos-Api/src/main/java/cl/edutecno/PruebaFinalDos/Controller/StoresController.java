package cl.edutecno.PruebaFinalDos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.edutecno.PruebaFinalDos.Model.StoresModel;
import cl.edutecno.PruebaFinalDos.Service.StoresServiceImpl;

@RestController
@RequestMapping ("/api/v1/stores")
  
public class StoresController {


	@Autowired
	StoresServiceImpl storesServiceImpl;
	
	
	@GetMapping 
	@ResponseStatus(HttpStatus.OK)
	public List<StoresModel> findAll() {
		return storesServiceImpl.findAll();
	}

	@GetMapping ("/storeid={storeId}")
	@ResponseStatus(HttpStatus.OK)
	public List<StoresModel> findByStoreId(@PathVariable Integer storeId) {
		return storesServiceImpl.findByStoreId(storeId);
	}
}

