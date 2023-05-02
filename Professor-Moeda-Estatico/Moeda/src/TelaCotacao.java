/*
 * IFPB - SI - POO 
 * Prof. Fausto
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaCotacao {

	private JFrame frame;
	private JComboBox comboBox;
	private JButton button;
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_2;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
//		public static void main(String[] args) {
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						TelaCotacao window = new TelaCotacao();
//						window.frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}

	/**
	 * Create the application.
	 */
	public TelaCotacao() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Cota\u00E7\u00E3o de moedas");
		frame.setBounds(100, 100, 329, 172);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"dolar", "euro"}));
		comboBox.setBounds(11, 30, 144, 22);
		frame.getContentPane().add(comboBox);

		button = new JButton("alterar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField.getText().isEmpty()) {
						label_3.setText("campo1 vazio");
						return;
					}
					label_3.setText("");
					double cotacao = Double.parseDouble(textField.getText());
					if(cotacao <= 0)
						throw new Exception("valor deve ser > 0");
					
					int index = comboBox.getSelectedIndex();
					switch (index) {
					case 0 : 
						Moeda.cotacaoDolar = cotacao; 
						break;
					case 1 : 
						Moeda.cotacaoEuro = cotacao; 
						break;
					}
					String formatado = String.format("%.2f", cotacao);
					formatado=formatado.replace(",", ".");
					label.setText(formatado);
				}
				catch(NumberFormatException ex) {
					label_3.setText("valor invalido");
				}
				catch(Exception ex) {
					label_3.setText(ex.getMessage());
				}
			}
		});
		button.setBounds(165, 74, 103, 23);
		frame.getContentPane().add(button);

		textField = new JTextField();
		textField.setBounds(84, 75, 71, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		label = new JLabel("0.0");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(269, 30, 39, 23);
		frame.getContentPane().add(label);

		label_1 = new JLabel("Selecione a moeda");
		label_1.setBounds(10, 11, 145, 14);
		frame.getContentPane().add(label_1);

		label_3 = new JLabel("");
		label_3.setForeground(Color.BLUE);
		label_3.setBounds(11, 108, 275, 14);
		frame.getContentPane().add(label_3);

		label_2 = new JLabel("novo valor:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(11, 77, 68, 14);
		frame.getContentPane().add(label_2);

		button_1 = new JButton("ver cotacao");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				double cotacao = 0;
				switch (index) {
				case 0 : 
					cotacao = Moeda.cotacaoDolar; 
					break;
				case 1 : 
					cotacao = Moeda.cotacaoEuro; 
					break;
				}
				String formatado = String.format("%.2f", cotacao);
				formatado=formatado.replace(",", ".");
				label.setText(formatado);
				textField.setText("");
			}
		});
		button_1.setBounds(163, 30, 103, 23);
		frame.getContentPane().add(button_1);
	}
}
