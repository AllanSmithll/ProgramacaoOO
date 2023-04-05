import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Placar {

	private JFrame frmPlacar;
	private int pais_1=0;
	private int pais_2=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Placar window = new Placar();
					window.frmPlacar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Placar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlacar = new JFrame();
		frmPlacar.setTitle("PLACAR");
		frmPlacar.setBounds(100, 100, 388, 246);
		frmPlacar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlacar.getContentPane().setLayout(null);

		JLabel label_1 = new JLabel("Brasil");
		label_1.setBounds(52, 40, 74, 49);
		frmPlacar.getContentPane().add(label_1);
		
		label_1.setOpaque(true); //habilita cor de fundo
		label_1.setForeground(Color.RED); //cor da fonte
		label_1.setBackground(Color.RED); //cor do fundo
		label_1.setFont(new Font("Serif", Font.PLAIN, 14));
		label_1.setBorder(new LineBorder(Color.BLACK, 4, true));
		
		ImageIcon icon1 =
				new ImageIcon(Placar.class.getResource("/imagens/brasil.png"));

		//escalando imagem para o tamanho do label
		icon1.setImage(icon1.getImage().getScaledInstance(

				label_1.getWidth(),
				label_1.getHeight(),
				Image.SCALE_DEFAULT

				));

		label_1.setIcon(icon1);

		JLabel label_2 = new JLabel("Argentina");
		label_2.setBounds(52, 100, 74, 42);
		frmPlacar.getContentPane().add(label_2);
		
		label_2.setOpaque(true); //habilita cor de fundo
		label_2.setForeground(Color.RED); //cor da fonte
		label_2.setBackground(Color.RED); //cor do fundo
		label_2.setFont(new Font("Serif", Font.PLAIN, 14));
		label_2.setBorder(new LineBorder(Color.BLACK, 4, true));
		
		ImageIcon icon2 =
				new ImageIcon(Placar.class.getResource("/imagens/argentina.png"));

		//escalando imagem para o tamanho do label
		icon2.setImage(icon2.getImage().getScaledInstance(

				label_2.getWidth(),
				label_2.getHeight(),
				Image.SCALE_DEFAULT

				));

		label_2.setIcon(icon2);

		JButton buttonGol1 = new JButton("Gool");
		buttonGol1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pais_1++;
				if(pais_1 == 5) {
					pais_1=0;
				}
			}
		});
		
		buttonGol1.setBounds(207, 53, 89, 23);
		frmPlacar.getContentPane().add(buttonGol1);

		buttonGol1.setEnabled(true); //habilita o botão
		buttonGol1.setToolTipText("dica"); //dica pro usuario
		buttonGol1.setMnemonic(KeyEvent.VK_F5); //tecla de atalho
		buttonGol1.setMnemonic('a'); //tecla de atalho alt + a
		//chamar o actionPerformed() de um button
		buttonGol1.doClick();
		
		JButton buttonGol2 = new JButton("Gool");
		buttonGol2.setBounds(207, 110, 89, 23);
		buttonGol1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pais_2++;
				if(pais_2 == 5) {
					pais_2=0;
				}
			}
		});
		
		frmPlacar.getContentPane().add(buttonGol2);
		
		buttonGol2.setEnabled(true); //habilita o botão
		buttonGol2.setToolTipText("dica"); //dica pro usuario
		buttonGol2.setMnemonic(KeyEvent.VK_F5); //tecla de atalho
		buttonGol2.setMnemonic('a'); //tecla de atalho alt + a
		//chamar o actionPerformed() de um button
		buttonGol2.doClick();

		JButton buttonReiniciar = new JButton("Reiniciar");
		buttonReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		buttonReiniciar.setBounds(130, 161, 89, 23);
		frmPlacar.getContentPane().add(buttonReiniciar);
		
		buttonReiniciar.setEnabled(true); //habilita o botão
		buttonReiniciar.setToolTipText("dica"); //dica pro usuario
		buttonReiniciar.setMnemonic(KeyEvent.VK_F5); //tecla de atalho
		buttonReiniciar.setMnemonic('a'); //tecla de atalho alt + a
		
		JLabel labelNum1 = new JLabel("0");
		labelNum1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelNum1.setBounds(326, 57, 46, 14);
		labelNum1.getRootPane().add(labelNum1);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(326, 114, 46, 14);
		frmPlacar.getContentPane().add(lblNewLabel_1);
		//chamar o actionPerformed() de um button
		buttonReiniciar.doClick();
	}
}
