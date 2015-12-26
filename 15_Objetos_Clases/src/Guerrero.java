import java.util.Random;

public class Guerrero {
	
	private int fuerza;
	private String nombre;
	private int salud;
	private int defensa;
	
	public Guerrero(String unNombre){
		this.setNombre(unNombre);
		this.setSalud(100);
		this.setDefensa(2);
		this.setFuerza(10);
	}
	
	
	// Getters and Setters
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String value){
		this.nombre = value;
	}
	
	public int getDefensa(){
		return this.defensa;
	}
	public void setDefensa(int value){
		this.defensa = value;
	}
	
	public int getSalud(){
		return this.salud;
	}
	public void setSalud(int value){
		this.salud = value;
	}
	
	public int getFuerza(){
		return this.fuerza;
	}
	public void setFuerza(int value){
		this.fuerza = value;
	}
	
	// acciones sobre los guerreros
	public void recibirAtaque(int ataque){
		int danio = ataque - this.getDefensa();
		System.out.print(" dio "+ danio + "danio");
		if (danio > this.getSalud()){
			this.setSalud(0);
			System.out.print("murio "+this.getNombre());
		}
		else{
			this.setSalud(this.getSalud() - danio);
			System.out.println(", "+ this.getNombre() + " le queda "+ this.getSalud());
		}		
	}
	
	void atacarA(Guerrero otro){
		System.out.print(this.getNombre());
		otro.recibirAtaque(this.ataque());
	}
	
	int ataque(){
		int max = this.fuerza;
		int min = this.fuerza / 2;
		return new Random().nextInt(max-min+1) + min; // random de 5 a 10
	}
	
	boolean estaMuerto(){
		if (this.getSalud() == 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
}
