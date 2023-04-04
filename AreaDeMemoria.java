public class AreaDeMemoria {
	// Constantes da classe
	private static final int TAMANHO = 300;
	
	// Propriedades da classe
	private static int[][] operando1 = new int[TAMANHO][TAMANHO];
	private static int[][] operando2 = new int[TAMANHO][TAMANHO];
	
	private static int[][] resultado = new int[TAMANHO][TAMANHO];
	
	// Método construtor da classe
	public AreaDeMemoria() {
		for (int i = 0 ; i < operando1.length ; i++) {
			for (int j = 0 ; j < operando1[i].length ; j++) {
 				operando1[i][j] = ((int) (operando1.length * Math.random()));
				operando2[i][j] = ((int) (operando1.length * Math.random()));
			}
		}
	}
	
	// Métodos get/set da classe
	public static int[][] getOperando1() {
		return operando1;
	}
	
	public static int[][] getOperando2() {
		return operando2;
	}
	
	public static int[][] getResultado() {
		return resultado;
	}
	
	public static void setResultado(int i, int j, int valor) {
		resultado[i][j] = valor;
	}
}