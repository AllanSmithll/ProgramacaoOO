import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela1 {

	private JFrame frmJanela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela1 window = new Janela1();
					window.frmJanela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJanela = new JFrame();
		frmJanela.setTitle("Janela 1");
		frmJanela.setBounds(100, 100, 450, 300);
		frmJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJanela.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Janela 2");
		btnNewButton.setBounds(132, 101, 135, 34);
		frmJanela.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela2 tela2 = new Janela2();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Janela 3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela3 tela3 = new Janela3();
			}
		});
		btnNewButton_1.setBounds(132, 164, 135, 34);
		frmJanela.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Entrar nas janelas:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel.setBounds(26, 32, 165, 21);
		frmJanela.getContentPane().add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		frmJanela.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Exibir");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmJanela = new JMenuItem("Janela 2");
		mntmJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela2 tela2 = new Janela2();
			}
		});
		mnNewMenu.add(mntmJanela);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Janela 3");
		mntmJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela3 tela3 = new Janela3();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Sair");
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frmJanela.dispose();
			}
		});
		menuBar.add(mnNewMenu_1);
	}
}
