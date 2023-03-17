/**************************************
z * Autor: Cruz Ortega Elio Justino    *
 * Fecha Creación: 17/03/23           *
 * Fecha Actualización:	17/03/23	  *
 * Descripción: recorrido de un       *
 *              arreglo				  *
 *              unidimencional		  *
 **************************************/

package arreglos;

public class Arreglo {
	
	private static char []arregloPal = {'A', 'N', 'I', 'T', 'A', 'L', 'A', 'V', 'A', 'L', 'A', 'T', 'I', 'N', 'A'};
	private static boolean esPalindromo = true;
	
	public static void main(String[] args) {
		for (int i = 0, j = 14; i < 7 ; i++, j--) {
			if(arregloPal[i] != arregloPal[j]) {
				esPalindromo = false;
				break;
			}
		}
		if(esPalindromo) {
			System.out.println("Es palindromo.");	
		} else {
			System.out.println("No es palindromo");
		}
	}
}
