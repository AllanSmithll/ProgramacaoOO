/*
 * IFPB - SI - POO 
 * Prof. Fausto
 */

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class TelaPrincipal {

	private JFrame frame;
	private JLabel label ;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu menu_1;
	private JMenu menu_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Exchange ");
		frame.setBounds(100, 100, 329, 213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("");
		label.setBounds(0, 0, 313, 174);
		frame.getContentPane().add(label);
		
		//carregar imagem
		ImageIcon imagem = new ImageIcon(getClass().getResource("/imagem/moeda.png"));
		//redimensionar imagem para caber no label
		imagem = new ImageIcon(imagem.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));//		
		label.setIcon(imagem);

		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menu = new JMenu("Conversao");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaConversao tela = new TelaConversao();
			}
		});
		menuBar.add(menu);
		
		menu_1 = new JMenu("Cotacao");
		menu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCotacao tela = new TelaCotacao();
			}
		});
		menuBar.add(menu_1);
		
		menu_2 = new JMenu("Sair");
		menu_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		menuBar.add(menu_2);

	}
}
