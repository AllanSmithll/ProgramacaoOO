import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class Janela3 {

	private JFrame frmJanela;

	/**
	 * Launch the application.
	 */
	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela3 window = new Janela3();
					window.frmJanela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the application.
	 */
	public Janela3() {
		initialize();
		frmJanela.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJanela = new JFrame();
		frmJanela.setTitle("Janela 3");
		frmJanela.setBounds(100, 100, 450, 300);
		frmJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmJanela.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Fechar");
		btnNewButton.setBounds(141, 123, 134, 47);
		frmJanela.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				frmJanela.dispose();
			}
		}
		);
		
		JMenuBar menuBar = new JMenuBar();
		frmJanela.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Exibir");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmJanela = new JMenuItem("Janela 1");
		mntmJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela1 tela1 = new Janela1();
			}
		});
		mnNewMenu.add(mntmJanela);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Janela 2");
		mntmJanela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela2 tela2 = new Janela2();
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
