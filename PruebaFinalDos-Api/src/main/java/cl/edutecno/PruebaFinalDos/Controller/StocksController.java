package cl.edutecno.PruebaFinalDos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.edutecno.PruebaFinalDos.Model.StocksModel;
import cl.edutecno.PruebaFinalDos.Service.ProductsServiceImpl;
import cl.edutecno.PruebaFinalDos.Service.StocksServiceImpl;

@RestController
@RequestMapping ("/api/v1/stocks")



public class StocksController {


	@Autowired
	StocksServiceImpl stocksServiceImpl;
	
	
	@GetMapping 
	@ResponseStatus(HttpStatus.OK)
	public List<StocksModel> findAll() {
		return stocksServiceImpl.findAll();
	}

	@GetMapping ("/productid={productId}")
	@ResponseStatus(HttpStatus.OK)
	public List<StocksModel> findByProductId(@PathVariable Integer productId) {
		return stocksServiceImpl.findByProductId(productId);
	}
}

