

//	ArrayList<Integer> stockDisponible = new ArrayList<Integer>();
//	
//	Random random = new Random();
//	
//	int max = 50;
//	int min = 0;
//	
//	for (int i=0; i < 5; i++) {
//		stockDisponible.add(random.nextInt(max - min + 1) + min);
//
//	}
//	return stockDisponible;

	package cl.edutecno.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service {

public List<Integer> cargaDatos() {
		
		ArrayList<Integer> montos = new ArrayList<Integer>();
		
		Random random = new Random();
		
		int max = 50;
		int min = 0;
		
		for (int i=0; i < 5; i++)
			montos.add(random.nextInt(max - min + 1) + min);

		return montos;
	}
}

