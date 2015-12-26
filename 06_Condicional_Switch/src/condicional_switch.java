import java.util.Scanner;

public class condicional_switch {

	public static void main(String[] arg){
		
		char letra;
		Scanner in = new Scanner(System.in);
		
		letra = in.next().charAt(0);
		
		switch(letra){
			case 'a':
				System.out.println("El caracter es 'a'");
				break;
			case 'b':
				System.out.println("El caracter es 'b'");
				break;
			default:
				System.out.println("Caracter distinto");
		}
		
		in.close();
	}
	
}
