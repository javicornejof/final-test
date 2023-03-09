package cl.edutecno.PruebaFinalDosFront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import cl.edutecno.PruebaFinalDosFront.dto.BusquedaCategoryDTO;
import cl.edutecno.PruebaFinalDosFront.dto.BusquedaStoreDTO;
import cl.edutecno.PruebaFinalDosFront.dto.ProductsDTO;
import cl.edutecno.PruebaFinalDosFront.dto.StocksDTO;
import cl.edutecno.PruebaFinalDosFront.dto.StoresDTO;
import cl.edutecno.PruebaFinalDosFront.service.ProductsService;
import cl.edutecno.PruebaFinalDosFront.service.StocksService;
import cl.edutecno.PruebaFinalDosFront.service.StoresService;

@Controller
public class HomeController {

	
	@Autowired
	ProductsService productsService;
	
	@Autowired
	StocksService stocksService;
	
	@Autowired
	StoresService storesService;
	
	@GetMapping ("/home")
	public ModelAndView home() {
		
ModelAndView modelAndView = new ModelAndView("home");
		
		//Mostrar todas las tiendas
		List<StoresDTO> stores = storesService.findAll();
		List<ProductsDTO> brand = productsService.findAll();
		List<ProductsDTO>  products = productsService.findAll();
		
		for (StoresDTO storesDTO : stores) {
			System.out.println(storesDTO.getStoreName());
		}
		
		
		modelAndView.addObject("stores", stores);
		modelAndView.addObject("products", products);
		modelAndView.addObject("brand", brand);
		
		return modelAndView;
		
		
		
	}
	
	@GetMapping("/listarstores")
	public ModelAndView buscarStore(Model model, @PathVariable BusquedaStoreDTO  busquedaStores) {
		
		ModelAndView modelAndView = new ModelAndView("listar");
		
		//Buscar por tienedas
		Integer storeId = busquedaStores.getStoreId();
		
		StoresDTO storesid = storesService.findByStoreId(storeId);
		
		modelAndView.addObject("storesid",storesid);
		
		return modelAndView;
	
	
}
	
	@GetMapping("/listar")
	public ModelAndView buscarCategory(Model model, @PathVariable BusquedaCategoryDTO busquedaCategory) {
		
		ModelAndView modelAndView = new ModelAndView("listar");
		
		//Buscar por categoría
		Integer categoryId = busquedaCategory.getCategoryId();
		
		ProductsDTO categories = productsService.findByCategoryId(categoryId);
		
		modelAndView.addObject("category",categories);
		
		return modelAndView;
	
	
}
	
	
}