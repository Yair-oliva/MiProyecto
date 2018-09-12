package ar.com.edu.unlam.pb2;

public class triangulo {
	
	private Double base;
	private Double altura;
	private Double lado1;
	private Double lado2;
	private Double lado3;
	

	public triangulo(Double base,Double altura) {
		this.base=base;
		this.altura=altura;
	}
	public triangulo(Double lado1,Double lado2,Double lado3) {
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
	}
	
	public Double calcularArea() {
		return ((this.base*this.altura)/2);
		
		
		
	}
	public Double calcularPerimetro() {
		return this.lado1+this.lado2+this.lado3;
		
	}


}
