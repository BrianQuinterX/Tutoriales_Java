import java.util.Random;

public class Pokemon {
	
	// Atributos de clase
	private static int cantidad = 0;
	private static int baseAtaque = 3;
	private static int baseVida = 25;
	private static int baseExp = 50;
	private static int baseMana = 50;
	private static int baseSubidaVida = 4;
	private static int baseSubidaAtaque = 2;
	private static int suerteSubidaVida = 3;
	private static int suerteSubidaAtaque = 2;
	
	// Atributos del objeto
	private final int id;
	private String nombre;
	private int vida;
	private int ataque;
	private int nivel;
	private int experincia;
	private int velocidad;
	private int mana;
	
	
	// Getters and Setters
	public int getId(){
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getExperincia() {
		return experincia;
	}
	public void setExperincia(int experincia) {
		this.experincia = experincia;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int value){
		this.velocidad = value;
	}
	public int getMana(){
		return mana;
	}
	
	// Constructor
	public Pokemon(String name){
		int randAtaque = new Random().nextInt(2)+baseAtaque;
		int randVida = new Random().nextInt(3)+baseVida;
		id = ++cantidad;
		nombre = name;
		vida = randVida;
		ataque = randAtaque;
		nivel = 1;
		experincia = 0;
		velocidad = 5;
		mana = 50;
	}
	
	
	public void recibirAtaque(int ataque){
		if (vida>ataque){
			vida -= ataque;
		}
		else{
			vida = 0;
		}
	}
	
	public void atacarA(Pokemon p){
		
		p.recibirAtaque(ataque);
		System.out.println(nombre + " hizo " + ataque + " p. de Daño");
	}
	
	
	public boolean esVelozQue(Pokemon p){
		return velocidad >= p.getVelocidad();
	}
	
	public boolean murio(){
		return vida == 0;
	}
	
	public void ganoA(Pokemon p){
		if (p.murio()){
			this.adquirirRecompenza(p);
		}
		
	}
	
	public final void mostrarCaracteristicas(){
		System.out.println(" * Id: " + id);
		System.out.println(" * Nombre: " + nombre);
		System.out.println(" * Salud: " + vida);
		System.out.println(" * Ataque: " + ataque);
		System.out.println(" * Velocidad: " + velocidad);
		System.out.println(" * Mana: " + mana);
	}
	
	private void adquirirRecompenza(Pokemon p){
		experincia += p.getNivel() + 15;
		if (experincia >= nivel * baseExp){
			experincia = experincia - (nivel*baseExp);
			mana += (int) (baseMana * 0.1);
			ataque += new Random().nextInt(suerteSubidaAtaque) + baseSubidaAtaque;
			vida += new Random().nextInt(suerteSubidaVida) + baseSubidaVida;			
		}
	}
}
