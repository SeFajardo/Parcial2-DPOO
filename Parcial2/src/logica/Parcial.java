package logica;

public class Parcial {
	private int b;
	private int e;
	
	public Parcial() {
		super();
	}
	public int potencia(int b, int e) throws IllegalArgumentException, ArithmeticException {
		int resultado = 0;
		if (e<0) {
			throw new IllegalArgumentException("Exponente no puede ser negativo para un entero.");
		}try {
		    resultado = (int) Math.pow(b, e);
		}catch (ArithmeticException excedido) {
		    throw new ArithmeticException("El resultado excede los límites de un int.");
		}
		 return resultado;
}

	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
