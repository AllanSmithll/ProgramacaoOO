import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exemplo1 {

	private JFrame frame;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exemplo1 window = new Exemplo1();
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
	public Exemplo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Exemplo 1");
		frame.setBounds(100, 100, 690, 371);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("Digite alguma coisa:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label.setBounds(29, 151, 211, 25);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(305, 125, 110, 87);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button.setBounds(448, 100, 199, 76);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("Limpar");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_1.setBounds(449, 211, 198, 76);
		frame.getContentPane().add(button_1);
	}
}
