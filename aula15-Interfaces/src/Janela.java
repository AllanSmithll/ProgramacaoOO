import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela {

	private JFrame frame;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(
			new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ActionListener ouvinte = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("------");
			}
		};
		
		button = new JButton("ok");
		button.addActionListener( ouvinte );
		
		button.setBounds(50, 44, 89, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("fim");
		button_1.addActionListener( ouvinte	);
		
		button_1.setBounds(181, 44, 89, 23);
		frame.getContentPane().add(button_1);
	}
}


