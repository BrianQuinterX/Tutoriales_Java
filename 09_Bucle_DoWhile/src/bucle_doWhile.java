import java.util.Scanner;

public class bucle_doWhile {
	
	public static void main(String[] arg){
		
		int opcion;
		Scanner in = new Scanner(System.in);
		
		do{		
			do{
				System.out.println("Elija una opcion:");
				System.out.println("1 - Llamar a Crusty");
				System.out.println("2 - Llamar a Superman");
				System.out.println("3 - Llamar a los bomberos \n");
				
				System.out.print("Ingrese opcion: ");
				
				opcion = in.nextInt();			
			}while(opcion >3);
			
			switch(opcion){
				case 1:
					System.out.println("Crusty tardara un rato");
					break;
				case 2:
					System.out.println("Superman ya esta aqui");
					break;
				case 3:
					System.out.println("En un minuto vendran");
					break;
				default:
					System.out.println("Numero incorrecto");
			}
			System.out.println();
			
		} while(opcion < 100000);
		in.close();
	}
	
}
