package logica;

public class ParcialExceptions {
	private int ex;
	public final static int POTENCIA_NEG = 1;
	public final static int MAYOR_A_INT = 2;

	
	public ParcialExceptions(int ex) {
		this.ex = ex;
	}
	
	public String getMessage() {
		if(this.ex == POTENCIA_NEG) {
			return "La potencia debe ser mayor o igual a 0";
		}else if (this.ex == MAYOR_A_INT) {
			return "El resultado debe ser menor a 2147483647 ";
		}
		return null;
	}
}

