
public class POO_pelea_entre_objetos {

	public static void main(String[] args) {
		
		Guerrero g1 = new Guerrero("Tomas");
		Guerrero g2 = new Guerrero("Mario");
		int i = 1;
		
		do{
			System.out.println("\nRound "+ i++);
			g1.atacarA(g2);
			g2.atacarA(g1);			
		}while(!g1.estaMuerto() && !g2.estaMuerto());
		
		System.out.println();
		
		if (g1.getSalud()>g2.getSalud()){
			System.out.println("Gano "+ g1.getNombre());
		}
		else if (g1.getSalud() == g2.getSalud()){
			System.out.println("Empates");
		}
		else{
			System.out.println("Gano " + g2.getNombre());
		}
		
	}

}
