package objetoFigura;

public class Principal {
	public static void main(String[] args) {
		// Crear un cuadrado
		Cuadrado cuadrado1 = new Cuadrado();
		// Asignar un lado a través del método serLado
		cuadrado1.setLado(5);
		System.out.println("Área: " + cuadrado1.getArea());
		System.out.println("Perímetro: " + cuadrado1.getPerimetro());
		
		// Crear un cuadrado
		Cuadrado cuadrado2 = new Cuadrado();
		// Asignar un lado a través del método setLado
		cuadrado2.setLado(10);
		System.out.println("Área: " + cuadrado2.getArea());
		System.out.println("Perímetro: " + cuadrado2.getPerimetro());
	}
}
