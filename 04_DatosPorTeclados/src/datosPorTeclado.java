import java.util.Scanner;

public class datosPorTeclado {
	
	public static void main(String[] arg){
		
		int entero;
		float flotante_simple;
		String cadena;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un entero");
		entero = s.nextInt();
		System.out.println("El valor del entero es: "+ entero);
		
		System.out.println("Ingrese un numero decimal");
		flotante_simple = s.nextFloat();
		System.out.println("El valor del flotante es: "+ flotante_simple);		
		
		System.out.println("Ingrese una cadena");
		cadena = s.next();
		System.out.println("El valor de la cadena es: "+ cadena);
		
		s.close();
				
	}
	
}
