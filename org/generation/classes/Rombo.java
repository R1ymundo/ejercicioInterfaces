package org.generation.classes;

import org.generation.interfac.FiguraGeometrica;

public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	
	public Rombo(String nombre, double lado, double diagonalMenor, double diagonalMayor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	public double getDiagonalMayor() {
		return diagonalMayor;
	}

	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
	
	public double calcularArea(){
		return (getDiagonalMayor() * getDiagonalMenor()) / 2;
	}
	
	public double calcularPerimetro(){
		return getLado() * 4;
	}

	@Override
	public double calculaArea() {
		return this.calcularArea();
	}

	@Override
	public double calculaPerimetro() {
		return this.calcularPerimetro();
	}
	
	
	
}
