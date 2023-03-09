package cl.edutecno.PruebaFinalDosFront.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class StoresDTO {
	
	//atributos de back stores
	
	private Integer storeId; 

	private String storeName; 

	private String phone;

	private String email;

	private String street;

	private String city;

	private String state;

	private String zipCode; 
}
