package cl.edutecno.PruebaFinalDos.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor 
@Table (name = "stores") 

public class StoresModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column (name = "store_id") 
	private Integer storeId; 
	
	@Column (name= "store_name")
	private String storeName; 
	
	@Column (name = "phone")
	private String phone;
	
	@Column (name= "email")
	private String email;
	
	@Column (name= "street")
	private String street;
	
	@Column (name= "city")
	private String city;
	
	@Column (name= "state")
	private String state;
	
	@Column (name= "zip_code")
	private String zipCode; 
	
}
