package cl.edutecno.PruebaFinalDosFront.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.edutecno.PruebaFinalDosFront.dto.ProductsDTO;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Value("${endpoints.stores}")
	private String storesEndpoint;
	
	@Value("${endpoints.products}")
	private String productsEndpoint;
	
	@Value("${endpoints.stocks}")
	private String stocksEndpoint;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<ProductsDTO> findAll() {
		String url = productsEndpoint;
		
		// creando headers
	    HttpHeaders headers = new HttpHeaders();

	    // creando request
	    HttpEntity<?> request = new HttpEntity<Object>(headers);
	  	
	    // haciendo request
	    ResponseEntity<List<ProductsDTO>> response = restTemplate.exchange(url,
	    		HttpMethod.GET,
	    		request , 
	    		new ParameterizedTypeReference<List<ProductsDTO>>() {}); 
	    
		return response.getBody();
	}

	@Override
	public ProductsDTO findByCategoryId(Integer categoryId) {
		String url = productsEndpoint + "/" + categoryId;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<ProductsDTO> response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				ProductsDTO.class);
		return response.getBody();
	}

	@Override
	public ProductsDTO findByBrandId(Integer brandId) {
		String url = productsEndpoint + "/" + brandId;
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<?> request = new HttpEntity<Object>(headers);
		
		ResponseEntity<ProductsDTO> response = restTemplate.exchange(url, 
				HttpMethod.GET,
				request,
				ProductsDTO.class);
		return response.getBody();
	}

}
