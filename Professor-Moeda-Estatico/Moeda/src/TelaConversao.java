/*
 * IFPB - SI - POO 
 * Prof. Fausto
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversao {

	private JFrame frame;
	private JComboBox comboBox;
	private JButton button;
	private JTextField textField;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextField textField_1;
	private JButton button_1;
	private JLabel label_3;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelaConversao window = new TelaConversao();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public TelaConversao() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Convers\u00E3o de moedas");
		frame.setBounds(100, 100, 398, 208);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"dolar", "euro"}));
		comboBox.setBounds(11, 30, 144, 22);
		frame.getContentPane().add(comboBox);

		button = new JButton("converter para moeda");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField.getText().isEmpty()) {
						label_3.setText("campo1 vazio");
						return;
					}

					label_3.setText("");
					double valorreal = Double.parseDouble(textField.getText());
					double valorconvertido = 0; ;
					String moeda = (String) comboBox.getSelectedItem();
					int index = comboBox.getSelectedIndex();
					switch (index) {
					case 0 : 
						valorconvertido = Moeda.realToDolar(valorreal); 
						break;
					case 1 : 
						valorconvertido = Moeda.realToEuro(valorreal); 
						break;
					}
					String formatado = String.format("%.2f", valorconvertido);
					formatado=formatado.replace(",", ".");
					textField_1.setText(formatado);
					label_2.setText("valor em "+moeda);
				}
				catch(NumberFormatException ex) {
					label_3.setText("valor invalido");
				}
			}
		});
		button.setBounds(179, 72, 182, 23);
		frame.getContentPane().add(button);

		textField = new JTextField();
		textField.setBounds(107, 73, 62, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		label = new JLabel("valor em real");
		label.setBounds(11, 76, 97, 14);
		frame.getContentPane().add(label);

		label_1 = new JLabel("Selecione a moeda");
		label_1.setBounds(10, 11, 145, 14);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("valor na moeda");
		label_2.setBounds(11, 107, 97, 14);
		frame.getContentPane().add(label_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 104, 62, 20);
		frame.getContentPane().add(textField_1);

		button_1 = new JButton("converter para real");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(textField_1.getText().isEmpty()) {
						label_3.setText("campo2 vazio");
						return;
					}

					label_3.setText("");
					double valormoeda = Double.parseDouble(textField_1.getText());
					double valorreal = 0; ;
					String moeda = (String) comboBox.getSelectedItem();
					int index = comboBox.getSelectedIndex();
					switch (index) {
					case 0 : 
						valorreal = Moeda.dolarToReal(valormoeda); 
						break;
					case 1 : 
						valorreal = Moeda.euroToReal(valormoeda); 
						break;
					}
					String formatado = String.format("%.2f", valorreal);
					formatado=formatado.replace(",", ".");
					textField.setText(formatado);
				}
				catch(NumberFormatException ex) {
					label_3.setText("valor invalido");
				}
			}
		});
		button_1.setBounds(179, 103, 182, 23);
		frame.getContentPane().add(button_1);

		label_3 = new JLabel("");
		label_3.setForeground(Color.BLUE);
		label_3.setBounds(11, 144, 350, 14);
		frame.getContentPane().add(label_3);
	}
}
