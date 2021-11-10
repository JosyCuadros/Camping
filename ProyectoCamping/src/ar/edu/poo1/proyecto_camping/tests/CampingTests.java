package ar.edu.poo1.proyecto_camping.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ar.edu.poo1.proyecto_camping.domain.Camping;

public class CampingTests {
	
	private static Camping camping;
	
	@BeforeAll
	
	public static void setUp() {
		camping = new Camping();
		camping.ocuparParcelaCon(4, 2);
		camping.ocuparParcelaCon(4, 0);
		camping.ocuparParcelaCon(6, 2);
		camping.ocuparParcelaCon(5, 3);
	}
	
	@Test
	public void ocuparParcelaConNoSuperaTotalMaximoTest() {
		camping.ocuparParcelaCon(2, 0);
		assertNotNull(camping);
		assertEquals(5, camping.cantidadParcelas());
	}
	
	@Test
	public void cantTotalPersonasEnCamping() {
		assertEquals(26, camping.cantTotalPersonasEnCamping());
	}
	
	
	@Test
	public void contarParcelasConTest() {
		assertEquals(2,camping.contarParcelasCon(4));
	}
	
	@Test
	public void contarParcelasPorIPersonasTest() {
		assertEquals(2,camping.contarParcelasPorIPersonas(8));
	}
	
	@Test
	public void devolverArregloConCantParcelasTest() {
		int vector[] = camping.devolverArregloConCantParcelas();
		for (int i=0;i< vector.length ;i++) {
			System.out.print(vector[i] + " "); 
		}
		assertNotNull(vector);
		assertEquals(13, vector.length);
	}
	
	

}
