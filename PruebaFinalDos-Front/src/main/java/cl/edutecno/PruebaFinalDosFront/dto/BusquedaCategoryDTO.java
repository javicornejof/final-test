package cl.edutecno.PruebaFinalDosFront.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor


public class BusquedaCategoryDTO {

	private Integer storeId;  
	private Integer categoryId;  
	private Integer brandId; 	
	
	public BusquedaCategoryDTO (Integer storeId) {
		super();
		this.storeId = storeId;
	}
	
	
}
