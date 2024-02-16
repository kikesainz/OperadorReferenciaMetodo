package com.kike.main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
//		Para ejecutar métodos estáticos
		String[] arrayString = { "a", "b", "c"};
		
		Arrays.stream(arrayString).forEach(System.out::println); //Usamos el método estático System.out.println(String a)
		

		Integer[] numbers = {1, 2, 3, 4, 5, 6};
		Optional<Integer> maxNumber = Arrays.stream(numbers)
		                       			.reduce(Math::max); //Usamos el método estático Math.max(int a)
		System.out.println("El número máximo es: " + maxNumber);
		
		String[] stringNumbers = {"1", "2", "3", "4", "5"};
					List<Integer> listaNumeros=	Arrays.stream(stringNumbers)
		                                        .map(Integer::parseInt) //Usamos el método estático Integer.parseInt(String s)
		                                        .collect(Collectors.toList());
					
//		Referencias a Métodos de Instancia de un Tipo Particular			
		String[] nombres = {"JAVA", "MOLA", "MUCHO"};
		Arrays.stream(nombres).map(String::toLowerCase).forEach(System.out::println);

		
		Arrays.stream(nombres).map(String::length).forEach(System.out::println); //Imprime la longitud de cada palabra
		
		//array de objetos
		Object[] objetos = {1, "manzana", 3,1416, true};
		
		Arrays.stream(objetos).map(Object::toString).forEach(System.out::println);
	}

}
