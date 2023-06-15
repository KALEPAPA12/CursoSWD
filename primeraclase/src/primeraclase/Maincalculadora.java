package primeraclase;

public class Maincalculadora {

	public static void main(String[] args) {
		int entero =5;
		 Calculadora_de_java cc = new  Calculadora_de_java(10,5);
		 
		 int Rsuma=cc.suma();
		 System.out.println("El resultado de la suma es: "+Rsuma);

		 int Rresta = cc.resta();
		 System.out.println("El resultado de la resta es: "+Rresta);
		 
		 int Rm = cc.multiplicacion();
		 System.out.println("El resultado de la Multiplicacion es: "+Rm);
		 
		 int Rd = cc.division();
		 System.out.println("El resultado de la division es: "+Rd);
		 
		 int Rp = cc.potencia();
		 System.out.println("El resultado de la potencia es: "+Rp);
	}

}
