import java.util.Scanner;


public class Cifrado {
	public static final int CLAVE = 9;
	
	public static String pedirPalabra() {
		String p_introducido = null;
		Scanner scanner = null;
			scanner = new Scanner(System.in);
			p_introducido = scanner.nextLine();
		return p_introducido;
	}
	
	public static String codifica (String palabra)//El metodo es static xq el resultado es identico el objeto no varia de uno a otro
	{
		String cadena = null;
		int longi = palabra.length();
		char caracter = 0;
		int caracter_n = 0;
		char caracter_cifrado = 0;
		
			for (int i = 0; i < longi; i++) {
				
				caracter = palabra.charAt(i);
				caracter_n = (int)caracter;
				caracter_cifrado = (char) (caracter_n + CLAVE);
				System.out.print(caracter_cifrado);
				
			}	

	return cadena;
	}
	
	
	public static String decodifica (String palabra)
	{
		String cadena = null;
		int longi = palabra.length();
		char caracter = 0;
		int caracter_n = 0;
		char caracter_cifrado = 0;
		
			for (int i = 0; i < longi; i++) {
				caracter = palabra.charAt(i);
				caracter_cifrado = (char)caracter;
				caracter_n = (int) (caracter_cifrado - CLAVE);
				System.out.print(caracter_cifrado);
			}	

	return cadena;
	}
	
	
	public static void main(String[] args) {
		String palabra = null;
		
		
		System.out.println("Introduce una palabra para codificar:");
		palabra = pedirPalabra();
		System.out.println("La palabra codificada es: ");
		codifica(palabra);
		System.out.println();
		System.out.println("Plabra original:");
		decodifica(palabra);
	}

}
