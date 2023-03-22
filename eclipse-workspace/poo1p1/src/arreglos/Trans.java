package arreglos;
public class Trans {
	public static void main(String[] args) {
		int arregloInt[][] = new int [4][4];
		int arregloInt2[][] = new int [4][4];
	
		//llenado aleatorio e imprsión de la matriz normal
		System.out.println("Matríz.");
		for (int i = 0 ; i < arregloInt.length ; i++) {
			for (int j = 0 ; j < arregloInt[i].length ; j++) {
				arregloInt[i][j] = (int) (Math.random()*9+1);
				System.out.print(arregloInt[i][j] + ", ");	
			}
			System.out.println(" ");
		}
		
		System.out.println(" ");
		
		System.out.println("Matríz transpuesta.");
		//llenado de la matriz transpuesta
		for (int i = 0 ; i < arregloInt2.length ; i++) {
			for (int j = 0 ; j < arregloInt2[i].length ; j++) {
				arregloInt2[i][j] = arregloInt[j][i];
				System.out.print(arregloInt2[i][j] + ", ");
			}
			System.out.println(" ");
		}
	}
}
