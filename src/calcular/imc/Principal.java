package calcular.imc;

import java.util.Scanner;

public class Principal {

	/**
	 * Pido un numero por teclado al usuario
	 * 
	 * @return el numero introducido por el usuario
	 */

	/*
	 * public static double pedirNumeroDouble(){
	 * 
	 * double num_leido = 0; Scanner scanner = new Scanner(System.in);//declaro
	 * un objeto scanner num_leido = scanner.nextDouble();//Leo teclado y asigno
	 * valor a num_leido return num_leido; }
	 */

	public static float pedirNumeroFloat(/* ENTRADA */) {

		float num_leido = 0;
		Scanner scanner = new Scanner(System.in);// declaro un objeto scanner
		num_leido = scanner.nextFloat();// Leo teclado y asigno valor a
										// num_leido
		return num_leido;
	}
	
	public static float calcularIMC(float peso, float altura){
		float imc = 0;
			imc = peso / (altura * altura); 
		return imc;
	}
	/**
	 * Informo al usuario de su IMC nominal cualitativo
	 * @ param imc Valor numerico o cuantitativo del IMC
	 */
	public static void mostrarResultadoIMC(float imc){
		if (imc < 16) {
			System.out.println("Desnutrido");
		} else if ((imc >= 16) && (imc < 18.5)) {
				System.out.println("Bajo Peso");
				
			} else if ((imc >= 18.5) && (imc < 25)) {
					System.out.println("Normal");
					
				} else if ((imc >= 25) && (imc < 31)) {
					System.out.println("Sobre Peso");
					
					} else /* if (imc >= 31) */ {
							System.out.println("Obeso");
						}	
	}
	
	public static void main(String[] args) {

		// pedir peso
		// pedir altura
		// calcular imc = peso / altura * altura
		// mostrar
		
		//seccion de declaracion
		float peso = 0;
		float altura = 0;
		float imc = 0;
		//fin de la seccion de declaracion
		
		System.out.println("Introduzca el peso:(Kg)");
		peso = pedirNumeroFloat();

		System.out.println("Introduzca la estatura:(m)");
		altura = pedirNumeroFloat();

		//imc = peso / (altura * altura);
		imc = calcularIMC(peso, altura);
		System.out.println("Su IMC es: ");
		mostrarResultadoIMC(imc);

		// <16 desnutrido
		// 16-18,5 bajo peso
		// 18,5-25 normal
		// 25-31 sobrepeso
		// > 31 obesidad

		/*if (imc < 16) {
		 
			System.out.println("Desnutrido");
		} else if ((imc >= 16) && (imc < 18.5)) {
				System.out.println("Bajo Peso");
				
			} else if ((imc >= 18.5) && (imc < 25)) {
					System.out.println("Normal");
					
				} else if ((imc >= 25) && (imc < 31)) {
					System.out.println("Sobre Peso");
					
					} else /if (imc >= 31)  {
							System.out.println("Obeso");
						}
		
		System.out.println("Su imc es:");
		System.out.println(imc);*/

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * 
		 * System.out.println("Introduzca el peso:(Kg)"); peso =
		 * scanner.nextDouble();
		 * 
		 * double altura = 0;
		 * 
		 * Scanner scanner2 = new Scanner(System.in);
		 * System.out.println("Introduzca la estatura:(m)"); altura =
		 * scanner2.nextDouble();
		 * 
		 * double imc = peso / (altura * altura);
		 * System.out.println("Su IMC es:"); System.out.println(imc);
		 */

	}

}
