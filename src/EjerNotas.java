
public class EjerNotas {

	private static int[] array_notas = { 0, 10, 2, 6, 7, 5, 4 };

	public static void main(String[] args) {

		float media = 0;
		float suma = 0;

		/*suma = array_notas[0] + array_notas[1] + array_notas[2] + array_notas[3] + array_notas[4] + array_notas[5]
				+ array_notas[6];
		media = suma / 7;
		System.out.println("La nota media del alumno es: " + media);*/
		
		for (int i = 0; i < array_notas.length; i++) {
			suma+= array_notas[i];
			media = suma / array_notas.length;
		}
		System.out.println("La nota media del alumno es: " + media);
	}

}
