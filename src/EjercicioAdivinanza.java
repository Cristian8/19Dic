


import java.util.Scanner;

public class EjercicioAdivinanza {
	
	public static final int INTENTOS = 6;
	
	public static int pedirNumero() {
		int numero_introducido = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		numero_introducido = scanner.nextInt();
		return numero_introducido;
	}
	
	public void mostrarResultado(int contador, int numero_aleatorio){
		if(contador==0){
			System.out.println("Has ganado el numero "+numero_aleatorio);
		}else if(contador >= INTENTOS){
			System.out.println("GAME OVER PAQUETE!!!! el numero era "+numero_aleatorio+" fallos "+contador);
		}else if(contador<INTENTOS){
			System.out.println("Has ganado pero has tenido "+contador+" fallos");
		}
		//System.out.println("El numero ha adivinar es "+ numero_aleatorio);
	}
	
	public static void main(String[] args) {
		int numero_introducido = 0;
		int numero_aleatorio = (int) (100 * Math.random() + 1);
		int contador = 0;
		
		EjercicioAdivinanza ejercicio = null;    
			
			ejercicio = new EjercicioAdivinanza();
		
		do {
			System.out.println("Adivina el numero");
			numero_introducido = pedirNumero();
			contador++;
			if (numero_introducido == numero_aleatorio) {
				System.out.println("Enhorabuena has acertado");
				
			} else if (numero_introducido < numero_aleatorio) {
				System.out.println("El numero ha avidinar es mayor");
				
			} else if (numero_introducido > numero_aleatorio) {
				System.out.println("El numero ha adivinar es menor");
				
			}
		} while ((numero_introducido != numero_aleatorio) && (contador<INTENTOS));
		
		
		ejercicio.mostrarResultado(contador, numero_aleatorio);
	}
		
}