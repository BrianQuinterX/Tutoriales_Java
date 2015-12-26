import java.util.Scanner;

public class vectores {
	
	public static void main(String[] arg){
		
		int init;
		double promedio;
		int suma, tamanio;
		
		suma = 0;
		tamanio = 10;
		Scanner in = new Scanner(System.in);
		int[] vector = new int[tamanio];
		
		
		for (init=0; init<tamanio; init++){
			System.out.print("Ingrese un numero"+init+": ");
			vector[init] = in.nextInt();
			suma+=vector[init];
		}
		
		System.out.print("el vector es: [");
		
		for (init=0; init<tamanio; init++){
			System.out.print(vector[init]);
			if(init!=tamanio-1) System.out.print(",");
		}
		System.out.println("]");
		
		promedio = (double)suma / tamanio;
			
		System.out.println("El promedio del vector es: "+ promedio);
			
		in.close();
		
	}
	
}
