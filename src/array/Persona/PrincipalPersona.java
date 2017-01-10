package array.Persona;
import java.util.Scanner;



public class PrincipalPersona {
	public static final int OPC_MENU = 5;
	public static final int NUM_PERSONAS = 3;

	public static String pedirNombre() {
		String n_introducido = null;
		Scanner scanner = null;
			scanner = new Scanner(System.in);
			n_introducido = scanner.nextLine();
		return n_introducido;
	}
	public static int pedirEdad(){
		int e_introducida = 0;
		Scanner scanner = null;	
			scanner = new Scanner(System.in);
			e_introducida = scanner.nextInt();
		return e_introducida;
	}
	
	public static int pedirNumero(){
		int n_introducido = 0;
		Scanner scanner = null;
			scanner = new Scanner(System.in);
			n_introducido = scanner.nextInt();
		return n_introducido;
	}
	
	
	
	public static void main(String[] args) {
		int n_introducido = 0;
		String nombre = null;
		int edad = 0;
		
		Persona persona1 = new Persona();
		
		do{
			System.out.println("1- Insertar Persona");
			System.out.println("2- Listar Personas");
			System.out.println("3- Buscar Persona por Nombre");
			System.out.println("4- Borar persona");
			System.out.println("5- Salir");
			n_introducido = pedirNumero();
			
			switch(n_introducido){
			case 1:
				System.out.println("Introducir Nombre: ");
				nombre = pedirNombre();
				System.out.println("Introduce Edad: ");
				edad = pedirEdad();
				persona1.insertarPersona(nombre, edad);
				break;
			case 2:
				persona1.mostrarPersona();
				break;
			case 3:
				System.out.println("Buscar persona por Nombre ");
				break;
			case 4:
				System.out.println(("Persona Borrada"));
				break;
			
			default:
				System.out.println("Programa Cerrado");
			}
			System.out.println();
		}while( n_introducido < OPC_MENU);
		
		if(n_introducido > OPC_MENU){
			System.out.println("introduzca un numero correcto");
		}
	}

}