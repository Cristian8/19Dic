package array.Persona;

public class Persona {
	
	private int edad;
	private String nombre;
	
	//Constructor por defecto
	public Persona(){
		
	}
	
	Persona[] personas = new Persona[5];
	private int num_personas = 0;
	
	public void insertarPersona(String nombre, int edad){
		if(num_personas < 5){
			personas[num_personas] = new Persona(nombre, edad);
			num_personas++;
		}else if(num_personas >= 5){
			System.out.println("la lista esta llena, no se pueden introducir mas personas");
			System.out.println();
		}
		
	}
	
	public void mostrarPersona(){
		for(int i = 0; i < num_personas; i++){
			System.out.println("Persona numero: "+(i+1)+" Nombre: "+this.personas[i].nombre+ " Edad: "+this.personas[i].edad);
		}
	}
	
	//constructor usando parametros
	public Persona(String nombre, int edad){
		
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
	// set and get
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
