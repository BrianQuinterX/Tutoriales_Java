//Algoritmo de encriptacion de cesar

import java.util.Scanner;

public class cifrado {

	public static void main(String[] arg){
		
		Scanner in = new Scanner(System.in);
		String frase1, frase2;
		int desplazamiento;
		
		String min = "abcdefghijklmnñopqrstuvwxyz";
		String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		frase2 = "";
		
		
		System.out.print("Ingrese una frase a encriptar: ");		
		frase1 = in.nextLine();
		
		System.out.print("Ingrese la clave de desplazamiento: ");
		try{
			desplazamiento = in.nextInt();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			in.close();
			return;
		}
		
		for (int i=0; i<frase1.length(); i++){
			for(int j=0; j<min.length(); j++){
				if (frase1.charAt(i)==min.charAt(j)){
					if (j + desplazamiento >= min.length()){
						frase2 += min.charAt(j+desplazamiento % min.length());
					}
					else{
						frase2 += min.charAt(j+desplazamiento);
					}
					break;
				}
				
				if (frase1.charAt(i)==may.charAt(j)){
					if (j + desplazamiento >= may.length()){
						frase2 += min.charAt(j+desplazamiento % may.length());
					}
					else{
						frase2 += may.charAt(j+desplazamiento);
					}
					break;
				}
			}
		}
		
		System.out.println("Frase encriptado: "+frase2);
		
		in.close();
	}
	
	
}
