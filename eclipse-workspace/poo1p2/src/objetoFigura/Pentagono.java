package objetoFigura;

public class Pentagono {
	private double lado;
	private double apotema;
	
	public double getArea() {
		return getPerimetro() * apotema/2;
	}
	
	public double getPerimetro() {
		return 5*lado;
	}
	
	// Métodos de acceso a los atributos de la clase
	// getter y setter
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	
}
