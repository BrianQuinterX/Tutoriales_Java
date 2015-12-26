import java.util.Scanner;

public class matrices {

	public static void main(String[] arg){
		
		int[][] matriz = new int[5][3];
		Scanner in = new Scanner(System.in);
		
		for (int i=0; i<matriz.length; i++){
			for (int j=0; j<matriz[0].length; j++){
				System.out.print("Ingrese el valor de ("+i+","+j+") = ");
				matriz[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Mostrando matriz completa:");
		
		for (int i=0; i<matriz.length; i++){
			System.out.print("( ");
			for (int j=0; j<matriz[0].length; j++){
				System.out.print(matriz[i][j]);
				if (j != matriz[i].length -1) System.out.print(" | ");				
			}
			System.out.println(" )");
		}
		
		in.close();
		
	}
	
}
