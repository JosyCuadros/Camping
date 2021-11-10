package ar.edu.poo1.proyecto_camping.domain;

import java.util.ArrayList;
import java.util.List;

public class Camping {
	
	private List <Parcela> camping;

	public Camping() {
		this.camping = new ArrayList<Parcela>();
	} 
	
	
	public int cantidadParcelas(){
		return camping.size();
	}
	
	public void ocuparParcelaCon(int mayores, int menores) {
		if ((mayores + menores) <= 12) {
			Parcela otraParcela = new Parcela (mayores, menores);
			this.camping.add(otraParcela);
			
		}else 
			throw new Error("Supera la cantidad de acampantes por parcela");	
		
	}
	
	public int cantTotalPersonasEnCamping(){
		int acumCantCamping = 0;
		for(Parcela parcela : camping) {
			acumCantCamping += parcela.cantPersonasEnParcela();
		}
		return acumCantCamping; 
	}
	
	public int contarParcelasCon(int mayores) {
		int cantParcelasOcupadasPorMayor = 0;
		for(Parcela parcela : camping) {
			if (mayores == parcela.getMayores()) 
				cantParcelasOcupadasPorMayor ++;	
		}
		return cantParcelasOcupadasPorMayor; 	
	}
	
	
	public int contarParcelasPorIPersonas(int cantPersonas) {
		int cantParcela = 0;
		for (Parcela parcela : camping) {
			if (cantPersonas == parcela.cantPersonasEnParcela())
			   cantParcela ++;
		}
		return cantParcela;
	}
	
	
	public int[] devolverArregloConCantParcelas(){
		int arreglo[]=new int [13];
		for (int i=0;i<arreglo.length;i++) {
			arreglo[i] = this.contarParcelasPorIPersonas(i);
		}
		return arreglo;
	}
	

}
