import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new JPanel();
	
	private JTextArea txtOperando1 = new JTextArea();
	private JScrollPane jspOperando1 = new JScrollPane(txtOperando1);

	private JTextArea txtOperando2 = new JTextArea();
	private JScrollPane jspOperando2 = new JScrollPane(txtOperando2);

	private JTextArea txtResultado = new JTextArea();
	private JScrollPane jspResultado = new JScrollPane(txtResultado);
	
	private JButton btnAtualizar = new JButton("Atualizar");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Principal().setVisible(true);
	}

	// Método construtor da classe
	public Principal() {
		// Configuração da janela
		setTitle("Multiplicação de Matrizes");
		setSize(1024, 768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Configuração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// Caixas de texto
		jspOperando1.setBounds(30, 30, 950, 200);
		objPainel.add(jspOperando1);
		
		jspOperando2.setBounds(30, 250, 950, 200);
		objPainel.add(jspOperando2);
		
		jspResultado.setBounds(30, 470, 950, 200);
		objPainel.add(jspResultado);
		
		btnAtualizar.setBounds(400, 685, 200, 30);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(imprimirMatriz(AreaDeMemoria.getResultado()));
			}
		});
		objPainel.add(btnAtualizar);
		
		new AreaDeMemoria();

		int tamanho = AreaDeMemoria.getOperando1().length;
		
		txtOperando1.setText(imprimirMatriz(AreaDeMemoria.getOperando1()));
		
		txtOperando2.setText(imprimirMatriz(AreaDeMemoria.getOperando2()));
		
		for (int i = 0 ; i < tamanho ; i++) {
			for (int j = 0 ; j < tamanho ; j++) {
				new Multiplicacao(i, j).start();
			}
		}
	}
	
	private static String imprimirMatriz(int[][] matriz) {
		int tamanho = AreaDeMemoria.getOperando1().length;
		String retorno = "";
		
		for (int i = 0 ; i < tamanho ; i++) {
			for (int j = 0 ; j < tamanho ; j++) {
				retorno += (matriz[i][j] + "\t");
			}
			retorno += "\n";
		}
		
		return retorno;
	}
}