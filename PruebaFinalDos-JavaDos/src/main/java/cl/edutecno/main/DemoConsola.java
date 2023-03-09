package cl.edutecno.main;

import java.util.List;

import cl.edutecno.model.CalculadoraCompleja;
import cl.edutecno.model.CalculadoraSimple;
import cl.edutecno.service.Service;

public class DemoConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service service = new Service();
		List<Integer> stockRandom = service.cargaDatos();
		
		
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		List<Integer> resultadoCalculadoraSimpleMain = calculadoraSimple.calcula(stockRandom);
		
		
		CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		List<Integer> resultadoCalculadoraComplejaMain = calculadoraCompleja.calcula(stockRandom);
		
		
		System.out.println("-------------------------------------------");	
		System.out.println("Demostración Cálculo de Stock de Seguridad");
		System.out.println("-------------------------------------------");	
		System.out.println(" ");
		System.out.println("Tomando 5 valores de stock aleatorios...");
		System.out.println(stockRandom);
		System.out.println(" ");
		System.out.println("Stocks de Seguridad con Algoritmo Simple: " + resultadoCalculadoraSimpleMain);
		System.out.println("Stocks de Seguridad con Algoritmo Complejo: " + resultadoCalculadoraComplejaMain);
		
	}

}
