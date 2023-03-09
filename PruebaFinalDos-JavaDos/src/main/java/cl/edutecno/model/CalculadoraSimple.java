package cl.edutecno.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cl.edutecno.Interface.CalculadoraStockSeguridad;

public class CalculadoraSimple implements CalculadoraStockSeguridad{

	@Override
	public List<Integer> calcula(List<Integer> valores) {
		
		List <Integer> ResultadoCalculadoraSimple = new ArrayList<Integer>();


		for (int i = 0; i < valores.size(); i++) {
			
			ResultadoCalculadoraSimple.add(2);
		}
		
		
		
		
	return ResultadoCalculadoraSimple;
		
		
		
		
		
		//rturn null;
// Agregar métodos
		
	}

}
