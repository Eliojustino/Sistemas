package Promoción;

public class Promocion {
	// Promoción de tipo de datos
	// Tipo Promoción válidas
	// double Ninguna
	// float double
	// long float o double
	// int long, float o double
	// char int, long, float o double
	// short int, long, float o double
	// byte short, int, long, float, double
	// boolean En java los valores booleanos no se consideran como números

	public static void main(String[] args) {
		// Operadores aritmeticos
		System.out.println(Math.sqrt(4));
		int resultado = (7 * (10 - 5) %3) * 4 + 9;
		System.out.println("Resultado: " +resultado);
		
		// Operador incremento-Decremento
		int x = 10;
		System.out.println("Posincremento: " + x++);	//Aquí primero se imprime el valor de x y luego hace el incremento
		System.out.println("Posincremento: " + x);		//Por lo tanto hasta aquí se imprime el valor 11
		
		x = 10;
		System.out.println("Preincremento: " + ++x);	//Aquí primero se incrementa el valor de x y luego se imprime ese mismo valor
		
		x = 10;
		if (++x == 10)
			System.out.println("Hola");
		else
			System.out.println("Adios");
		
		x = 10;
		if (x++ == 10)
			System.out.println("Hola");
		else
			System.out.println("Adios");
		
		x = 10;
		System.out.println("Posdecremento: " + x--);	//Aqupí primero se imprime el valor de x y luego se hace el decremento
		System.out.println("Posdecremento: " + x);		//Por lo tanto hasta aquí se imprime el valor 9
		
		x = 10;
		System.out.println("Preincremento: " + --x);	//Aquí primero se decrementa el valor de x y luego se imprime ese mismo valor
		
		x = 10;
		if (--x == 10)
			System.out.println("Hola");
		else
			System.out.println("Adios");
		
		x = 10;
		if (x-- == 10)
			System.out.println("Hola");
		else
			System.out.println("Adios");
		
		//Desplazamineto
		
		//Desplazamiento a la derecha
		x = 1000;
		System.out.println("Desplazamiento derecha: " + (x >> 1));
		//Desplazamiento a la izquierda
		x = 7;
		System.out.println("Desplazamiento a la izquierda: " + (x << 1));
		
		//Operadores lógicos
		//Or
		x = 10;
		int y = 15;
		System.out.println("Or: " + (x | y));
		//And
		System.out.println("And: " + (x & y));
		//Xor
		System.out.println("Xor: " + (x ^ y));
		
		
		
	} 
}
