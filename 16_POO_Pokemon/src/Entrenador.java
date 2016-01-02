import java.util.Scanner;

public class Entrenador {

	private static int cantidad_max_pokemones = 3;
	
	private String nombre;	
	private Pokemon pokemones[] = new Pokemon[cantidad_max_pokemones];
	private String status;
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pokemon[] getPokemones() {
		return pokemones;
	}
	public void setPokemones(Pokemon[] pokemones) {
		this.pokemones = pokemones;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	// Constructor
	public Entrenador(Pokemon[] pokemones){
		status = "novato";
		
		Scanner in = new Scanner(System.in);
		int id_pokemon;
		Pokemon p;
		
		System.out.print("Ingrese su nombre: ");
		nombre = in.nextLine();
		
		System.out.println();
		
		do{
			for (int i = 0; i<pokemones.length; i++){
				System.out.println(pokemones[i].getId()+". "+ pokemones[i].getNombre());
			}		
			System.out.print("Elige un pokemon: ");
			id_pokemon = in.nextInt();
		}while(id_pokemon>=pokemones.length || id_pokemon == 0);
		
		p = new Pokemon(pokemones[id_pokemon-1].getNombre());
		
		
		
		this.agregarPokemon(p, 0);	// porque es el primer pokemon.
		
		in.close();
	}
	
	
	
	public void agregarPokemon(Pokemon p, int index){
		if (this.cantidadDePokemones()>=cantidad_max_pokemones){
			System.out.println("Alcanzo su limites de pokebolas");
		}
		else{
			this.pokemones[index] = p;
			System.out.println("Buenisimo tenes tu propio pokemon\n");
			System.out.println("Estos son las caracteristicas de tu pokemon: ");
			p.mostrarCaracteristicas();		
		}
	}
	
	private int cantidadDePokemones(){
		int count = 0;
		for (int i = 0; i<pokemones.length; i++ ){
			if(pokemones[i] != null){
				count++;
			}
		}
		return count;
	}
	
	public void comenzarAventura(Pokemon[] ps){
		
		
		
		
	}
	
	
	
	
	
}
