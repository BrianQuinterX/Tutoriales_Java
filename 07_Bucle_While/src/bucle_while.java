import java.util.Scanner;

public class bucle_while {
	
	public static void main(String[] arg){
		
		int entero, tope;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		entero = in.nextInt();
		
		System.out.println("Ingrese un tope");
		tope = in.nextInt();
		
		while (entero < tope){
			System.out.println("Se incrementa "+entero+" a "+ (++entero));
		}
		
		in.close();
		
	}
	
	
}
