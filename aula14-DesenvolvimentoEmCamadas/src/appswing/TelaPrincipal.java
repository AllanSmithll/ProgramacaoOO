package appswing;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * POO
 * Prof. Fausto Maranhão Ayres
 **********************************/


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TelaPrincipal {
	private JFrame frame;
	private JMenu mnPrateleira;
	private JMenu mnProduto;
	private JLabel label;
	private JMenu menu;
	private JMenu menu_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();

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
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Sistema Almoxarifado");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText("Inicializando...");
		label.setBounds(0, 0, 450, 249);
		ImageIcon imagem = new ImageIcon(getClass().getResource("/arquivos/imagem.jpg"));
		imagem = new ImageIcon(imagem.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));//		label.setIcon(fotos);
		label.setIcon(imagem);
		frame.getContentPane().add(label);
		frame.setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		mnPrateleira = new JMenu("Prateleira");
		mnPrateleira.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaPrateleiras tela = new TelaPrateleiras();
			}
		});
		menuBar.add(mnPrateleira);

		mnProduto = new JMenu("Produto");
		mnProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaProdutos tela = new TelaProdutos();
			}
		});
		menuBar.add(mnProduto);
		
		menu = new JMenu("Sobre");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(frame, "IFPB - TSI \nPOO \nProf. Fausto Ayres", "Sobre o autor", 1 );
			}
		});
		menuBar.add(menu);
		
		menu_1 = new JMenu("Sair");
		menu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		menuBar.add(menu_1);
	}
}
