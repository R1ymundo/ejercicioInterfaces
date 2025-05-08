package org.generation.classes;

import org.generation.interfac.FiguraGeometrica;

public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	
	public Trapecio(String nombre, double lado1, double lado2, double lado3, double lado4, double baseMayor,
			double baseMenor, double altura) {
		super();
		this.nombre = nombre;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.lado4 = lado4;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}

	public double getBaseMayor() {
		return baseMayor;
	}

	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado4="
				+ lado4 + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura=" + altura + "]";
	}
	
	public double calcularArea(){
		return getLado1() + getLado2() + getLado3() + getLado4();
	}
	
	public double calcularPerimetro(){
		return (getAltura() * (getBaseMayor() + getBaseMenor())) / 2;
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
