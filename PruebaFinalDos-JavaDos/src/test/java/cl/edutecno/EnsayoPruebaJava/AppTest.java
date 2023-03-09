package cl.edutecno.EnsayoPruebaJava;

import org.junit.jupiter.api.Test;

import cl.edutecno.model.CalculadoraCompleja;
import cl.edutecno.model.CalculadoraSimple;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {
	public CalculadoraCompleja analizador1;
	public CalculadoraSimple analizador2;
	
	 @BeforeEach
	 public void setUp() {
	 analizador1 = new CalculadoraCompleja();
	 analizador2 = new CalculadoraSimple();
	 
	 }
	 
	 @Test
	public void AnalizadorTest() {
		 
		 List<Integer> stock1 = null;
		 List<Integer> recuento1= analizador1.calcula(stock1);
		 Assertions.assertEquals(5, recuento1);
		 
	 }
	 
	@Test
	 public void AnalizadorNull(){
		 List<Integer> stock2 = null;
		 List<Integer> recuento2= analizador2.calcula(stock2);
		 Assertions.assertNotNull(stock2);
	 }
	
	
}
