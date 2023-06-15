package primeraclase;

public class Calculadora_de_java {
	
int a,b;
	


	public Calculadora_de_java(int a, int b) {
	super();
	this.a = a;
	this.b = b;
	

}
	public int suma() {
		
		int resultado;
		resultado = this.a+this.b;
		return resultado;
		
	}
	
	public int resta() {
		int resultado;
		resultado = this.a-this.b;
		return resultado;
	}
	
	public int 	multiplicacion() {
		int resultado;
		resultado = this.a*this.b;
		return resultado;
		
		
		
	}
	
	public int division() {
		int resultado;
		resultado = this.a/this.b;
		return resultado;
		
	}
	
	public int potencia() {
		int resultado;
		
		resultado= this.a;
	
		for(int i=1; i<b; i++) {
			
			resultado= this.a*resultado;
		}
		return resultado;
		
	}
	
	public static void sumaYresta(Calculadora_de_java c) {
		
		System.out.println("la suma es: "+c.suma());
		System.out.println("la resta es: "+c.resta());
		
	}
	






}