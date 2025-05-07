package logica;

public class Parcial {
	private int b;
	private int e;
	
	public Parcial() {
		super();
	}
	public static int potencia(int b, int e) throws ArithmeticException {
	    if (e < 0) {
	        throw new ArithmeticException("El exponente no puede ser negativo");
	    }
	    double resultado = Math.pow(b, e);
	    if (resultado > Integer.MAX_VALUE) {
	        throw new ArithmeticException("La potencia excede el límite de entero");
	    }
	    return (int)resultado;
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
