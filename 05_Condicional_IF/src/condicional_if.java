import java.util.Scanner;

public class condicional_if {
	
	public static void main(String[] arg){
		
		int entero;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce un entero");
		
		entero = in.nextInt();
		
		if (entero % 2 == 0){
			System.out.println("Es divisible por 2");
		}else{
			System.out.println("No es divisible por 2");
		}
		
		in.close();
			
	}
	
}
