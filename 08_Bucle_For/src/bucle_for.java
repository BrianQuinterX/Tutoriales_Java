import java.util.Scanner;

public class bucle_for {
	
	public static void main(String[] arg){
		
		int inicial, tope;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese un valor final");
		tope = in.nextInt();
		
		for (inicial=0; inicial<=tope ; inicial++){
			System.out.println("valor = "+inicial);
		}
		
		in.close();
		
	}
	
}
