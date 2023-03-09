package cl.edutecno.PruebaFinalDosFront.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class ProductsDTO {
	
	//atributos de back products
	
	private Integer productId;
	
	private String productName; 
	
	private Integer brandId;

	private Integer categoryId;

	private Integer modelYear;

	private Double listPrice;
}
