package primeraclase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculadora {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		do {
			
			System.out.println("Elige una operacion que desees");
			System.out.println("1- Suma");
			System.out.println("2- Resta");
			System.out.println("3- Multipliicacion");
			System.out.println("4- Division");
			System.out.println("5- Potencia");
			System.out.println("6- Factorial ");
			a=Integer.parseInt(br.readLine());
			
			
			switch(a){
			case 1:
				System.out.println("Ingerese el primer numero: ");
				int suma1=Integer.parseInt(br.readLine());
				System.out.println("Ingerese el segundo numero: ");
				int suma2 = Integer.parseInt(br.readLine());
				System.out.println("El resultado es: ");
				System.out.println(suma1+suma2);
				break;
			case 2:
				System.out.println("Ingresa el primer numero");
				int resta1 = Integer.parseInt(br.readLine());
				System.out.println("Ingresa el segundo numero");
				int resta2 = Integer.parseInt(br.readLine());		
				System.out.print("El resultado es : ");
				System.out.println(resta1 -resta2);	
				break;
				
			case 3:
				System.out.println("Ingresa el primer numero");
				int mult1 = Integer.parseInt(br.readLine());
				System.out.println("Ingresa el segundo numero");
				int mult2 = Integer.parseInt(br.readLine());		
				System.out.print("El resultado es : ");
				System.out.println(mult1*mult2);	
				break;
				
			case 4:
				System.out.println("Ingresa el primer numero");
				float arriba = Integer.parseInt(br.readLine());
				System.out.println("Ingresa el segundo numero");
				float abajo = Integer.parseInt(br.readLine());
				
				if(abajo==0)
					System.out.println("No se puede dividir entre 0");
				else {
					System.out.print("El resultado es : ");
					double resultado = arriba/abajo;
					System.out.println(resultado);	
				}					
				break;
				
			case 5:
				System.out.println("Ingresa el numero base");
				int base = Integer.parseInt(br.readLine());
				System.out.println("Ingresa la potencia que deseas");
				int potencia = Integer.parseInt(br.readLine());
				int auxiliar = base;
				for(int i=1; i<potencia; i++) {
					base = base*auxiliar;
				}
				System.out.print("El resultado es : ");
				System.out.println(base);
				break;
				
			default:
				System.out.println("Esa opcion no esta disponible");
				System.out.println("   ");
				break;
				
			case 6:
				 int factorial;
				 int num;
				 System.out.print("Introduce un número: ");
				 num=Integer.parseInt(br.readLine());
				 factorial=1;
				 for (int i=num;i>0;i--)
				 
				 factorial=factorial*i;

				 
				 System.out.println("El factorial de " + num + " es: " + factorial);
					
				
				
			        break;
			        

		}}
		
		while(a !=5);

	}

}
