package Tarea1;

import java.util.Scanner;

public class Tarea1 {
	static char letras[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	static int numero[] = {0,1,2,3,4,5,6,7,8,9};
	static final int SUMA = 1;
	static final int PRODUCTO = 2;
	static final int IDENTIFICADOR = 4;
	static final int NUMERO = 6;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char caracter;
		
		System.out.println("ingresá un caracter cualquiera: ");
		caracter = entrada.nextLine().toLowerCase().charAt(0);
		
		int estado = identi(caracter);
		
		switch (estado) {
			case SUMA:
				System.out.println("Token: +");
				break;
			case PRODUCTO:
				System.out.println("Token: *");
				break;
			case IDENTIFICADOR:
				System.out.println("Token: Identificador");
				break;
			case NUMERO:
				System.out.println("Token: Número");
				break;
			default:
				System.out.println("Token: Error");
				break;
		}
	}
	public static int identi(char car){
		for (char var1 : letras) {
			if (car == var1) {
				return estado3();
			}	
		}

		for (int var2 : numero) {
			if (car == var2) {
				return estado6();
			}
		}

		if (car == '+') {
			return estado1();
		}

		if (car == '*') {
			return estado2();
		}
		
		return 0;
	}
	
	private static int estado1() {
		return SUMA;
	}

	private static int estado2() {
		return PRODUCTO;
	}

	private static int estado3() {
		return IDENTIFICADOR;
		
	}

	private static int estado6() {
		return NUMERO;
	}
	
}
