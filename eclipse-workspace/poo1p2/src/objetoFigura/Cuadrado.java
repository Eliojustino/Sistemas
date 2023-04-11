package objetoFigura;

public class Cuadrado {
	// Atributos
	private double lado;
	
	// Métodos de acceso a la variable lado
	// set y get
	
	public double getArea() {
		return Math.pow(lado, 2);
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getPerimetro() {
		return 4*lado;
	}
}
