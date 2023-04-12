/*
 * 11/04/2023 - Sorteio de números
 */
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Sorteio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorteio window = new Sorteio();
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
	public Sorteio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Sorteio");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelSorteado = new JLabel("0");
		labelSorteado.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelSorteado.setBounds(256, 75, 60, 31);
		frame.getContentPane().add(labelSorteado);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(91, 127, 97, 107);
		frame.getContentPane().add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("Sortear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random sorteio = new Random();
				int numeroSorteado = sorteio.nextInt(101);
				String numeroLabel = numeroSorteado+"";
				labelSorteado.setText(numeroLabel);
				textArea.append(numeroLabel+"\n");
			}
		});
		btnNewButton.setBounds(91, 57, 109, 49);
		frame.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 127, 14, 107);
		frame.getContentPane().add(scrollPane);
	}
}
