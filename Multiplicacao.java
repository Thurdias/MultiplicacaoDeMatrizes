public class Multiplicacao extends Thread {
	// Propriedades da classe
	private int i = 0;
	private int j = 0;
	
	// Método construtor da classe
	public Multiplicacao(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	// Método de execução paralela da classe
	public void run() {
		int tamanho = AreaDeMemoria.getOperando1().length;
		int valor = 0;
		
		for (int k = 0 ; k < tamanho ; k++) {
			try {sleep((int) (500 * Math.random()));} catch (Exception erro) {}
			valor += (AreaDeMemoria.getOperando1()[i][k] *
					  AreaDeMemoria.getOperando2()[k][j]);
		}
		
		AreaDeMemoria.setResultado(i, j, valor);
	}
}