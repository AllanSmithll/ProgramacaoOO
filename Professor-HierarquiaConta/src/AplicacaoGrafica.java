import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AplicacaoGrafica {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label;
	private JLabel label_1;
	private JButton button1;
	private JLabel label_3;
	private JButton button3;
	private JButton button4;
	private JButton button2;
	private JLabel label_4;

	private Conta conta;			//guarda o objeto que esta sendo manipulado
	
	private JLabel label_2;
	private JTextField textField_3;
	private JCheckBox checkBox;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacaoGrafica window = new AplicacaoGrafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplicacaoGrafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Caixa Eletronico");
		frame.setBounds(100, 100, 413, 239);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("id");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(26, 30, 46, 14);
		frame.getContentPane().add(label);

		label_1 = new JLabel("cpf");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(26, 55, 46, 14);
		frame.getContentPane().add(label_1);

		textField = new JTextField();
		textField.setBounds(91, 27, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(91, 52, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		button1 = new JButton("criar conta");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()) {
					label_4.setText("campo vazio ");
					return;
				}
				int num = Integer.parseInt(textField.getText());
				String cpf = textField_1.getText();
				if(checkBox.isSelected()) {
					int limite = Integer.parseInt(textField_3.getText());
					conta = new ContaEspecial(num, cpf, limite);
					label_4.setText("conta especial criada ");
				}
				else {
					conta = new Conta(num, cpf);
					label_4.setText("conta simples criada ");
				}
			}
		});
		button1.setBounds(212, 26, 99, 23);
		frame.getContentPane().add(button1);

		button2 = new JButton("exibir");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(conta==null)
					label_4.setText("conta inexistente");
				else
					label_4.setText(conta.toString());
			}
		});
		button2.setBounds(212, 51, 89, 23);
		frame.getContentPane().add(button2);

		button3 = new JButton("creditar");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(conta==null) {
					label_4.setText("conta inexistente");
					return;
				}
				if(textField_2.getText().isEmpty()) {
					label_4.setText("valor inexistente");
					return;
				}

				double valor = Double.parseDouble(textField_2.getText());
				conta.creditar(valor); 
				label_4.setText("credito efetuado");
			}
		});
		button3.setBounds(188, 137, 89, 23);
		frame.getContentPane().add(button3);

		button4 = new JButton("debitar");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(conta==null) {
					label_4.setText("conta inexistente");
					return;
				}
				if(textField_2.getText().isEmpty()) {
					label_4.setText("valor inexistente");
					return;
				}

				try {
					double valor = Double.parseDouble(textField_2.getText());
					conta.debitar(valor); 
					label_4.setText("debito efetuado");
				}
				catch(Exception excecao) {
					label_4.setText(excecao.getMessage());
				}
			}
		});
		button4.setBounds(287, 137, 89, 23);
		frame.getContentPane().add(button4);

		label_3 = new JLabel("valor");
		label_3.setBounds(26, 141, 46, 14);
		frame.getContentPane().add(label_3);

		textField_2 = new JTextField();
		textField_2.setBounds(91, 138, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		label_4 = new JLabel("Mensagem ao usuario");
		label_4.setBounds(32, 175, 344, 14);
		frame.getContentPane().add(label_4);

		label_2 = new JLabel("limite");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(26, 83, 46, 14);
		frame.getContentPane().add(label_2);

		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(91, 80, 86, 20);
		frame.getContentPane().add(textField_3);

		checkBox = new JCheckBox("conta especial");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected())
					textField_3.setEditable(true);
				else
					textField_3.setEditable(false);
			}
		});
		checkBox.setBounds(212, 81, 144, 23);
		frame.getContentPane().add(checkBox);
	}
}
