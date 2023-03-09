package cl.edutecno.PruebaFinalDosFront.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusquedaStoreDTO {

	private Integer storeId;  
	private Integer categoryId;  
	private Integer brandId; 	
	
	
	public BusquedaStoreDTO (Integer storeId) {
		super();
		this.storeId = storeId;
	}

	
}
