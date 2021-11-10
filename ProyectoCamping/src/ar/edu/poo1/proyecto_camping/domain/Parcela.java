package ar.edu.poo1.proyecto_camping.domain;

public class Parcela {
	
	private int mayores;
	private int menores;
	
	public Parcela(int mayores, int menores) {
		this.setMayores(mayores); 
		this.setMenores(menores);
	}

	public int getMayores() {
		return mayores;
	}

	public void setMayores(int mayores) {
		this.mayores = mayores;
	}

	public int getMenores() {
		return menores;
	}

	public void setMenores(int menores) {
		this.menores = menores;
	}
	
	public int cantPersonasEnParcela() {
		return this.getMayores() + this.getMenores();
	}
	

}
