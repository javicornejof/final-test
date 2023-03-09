package cl.edutecno.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cl.edutecno.Interface.CalculadoraStockSeguridad;

public class CalculadoraCompleja implements CalculadoraStockSeguridad {

	@Override
	public List<Integer> calcula(List<Integer> valores) {
		
		List<Integer> ResultadoCalculadoraCompleja = new ArrayList<Integer>();
		
		for (int i = 0; i < valores.size(); i++) {
			
			int stock;
			
			//si stock es sobre 20
			if (valores.get(i) > 20) {
				stock = (int) (2 + Math.round(valores.get(i)*0.1));
				ResultadoCalculadoraCompleja.add(stock);
				
			//si stock es bajo 20 y sobre 10	
			} else if (valores.get(i)> 10) {
				stock = (int) (2 + Math.round(valores.get(i)*0.05));
				ResultadoCalculadoraCompleja.add(stock);
			//si stock es bajo 20 y bajo 10	
			} else  {
				ResultadoCalculadoraCompleja.add(2);
			
			} 
		}
		
		
		return ResultadoCalculadoraCompleja;
	}

}
