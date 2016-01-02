import java.util.Scanner;

public class main_pokemon {

	public static void main(String[] args) {
		
		Pokemon[] pokemones = generarPokemones();
		
		Entrenador yo = new Entrenador(pokemones);
		
		
		
		
		
		
		
	}
	
	
	private static Pokemon[] generarPokemones(){
		Pokemon picachu = new Pokemon("picachu");
		Pokemon bolbasor = new Pokemon("bolbasor");
		Pokemon charmander = new Pokemon("charmander");
		Pokemon smoke = new Pokemon("smoke");
		Pokemon pilloto = new Pokemon("pilloto");
		Pokemon electro = new Pokemon("electro");
		
		Pokemon[] pokemones = {picachu, bolbasor, charmander, smoke, pilloto, electro};
		return pokemones;		
	}
	
}
