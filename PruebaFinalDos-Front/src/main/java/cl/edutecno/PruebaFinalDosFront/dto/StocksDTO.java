package cl.edutecno.PruebaFinalDosFront.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class StocksDTO {
	
	//atributos de back stocks
	
	private Integer storeId;
	
	private Integer productId;

	private Integer quantity;
}
