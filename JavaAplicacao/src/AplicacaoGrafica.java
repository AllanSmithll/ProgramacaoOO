/**
 * IFPB - TSI/POO
 * Prof. Fausto Ayres
 * 
 * Jogo de advinhacao - aplica��o grafica
 * 
 */

 import java.awt.EventQueue;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 import javax.swing.JButton;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JTextField;
 
 public class AplicacaoGrafica {
     private JFrame frame;
     private JLabel label;
     private JLabel label_1;
     private JLabel label_2;
     private JTextField textField;
     private JButton button;
     private JButton button_1;
 
     private JogoAdvinhacao jogo;
 
 
     /**
      * Launch the application.
      */
     public static void main(String[] args) {
         EventQueue.invokeLater(new Runnable() {
             public void run() {
                 try {
                     AplicacaoGrafica window = new AplicacaoGrafica();
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
     public AplicacaoGrafica() {
         initialize();
     }
 
     /**
      * Initialize the contents of the frame.
      */
     private void initialize() {
         frame = new JFrame();
         frame.setTitle("Jogo de advinhacao");
         frame.setBounds(100, 100, 366, 226);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().setLayout(null);
 
         button = new JButton("Iniciar");
         button.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent arg0) {
                 try {
                     jogo = new JogoAdvinhacao(99);
                     textField.setText("");
                     button_1.setEnabled(true);
                     label.setText("tentativas:0" );
                     label_2.setText("jogo iniciado, vc tem 6 tentativas");
                 }
                 catch(Exception erro) {
                     label_2.setText(erro.getMessage());
                 }
             }
         });
         button.setBounds(10, 11, 89, 23);
         frame.getContentPane().add(button);
 
         label_1 = new JLabel("Digite o numero");
         label_1.setBounds(10, 63, 100, 14);
         frame.getContentPane().add(label_1);
 
         textField = new JTextField();
         textField.setBounds(120, 60, 56, 20);
         frame.getContentPane().add(textField);
         textField.setColumns(10);
 
         button_1 = new JButton("Adivinhar");
         button_1.setEnabled(false);
         button_1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 try {
                     int palpite = Integer.parseInt(textField.getText());
                     if(jogo.adivinhou(palpite))
                         label_2.setText("acertou");
                     else
                         label_2.setText("errou - "+jogo.getDica());
 
                     label.setText("tentativas:" + jogo.getTentativas());
                     
                     if(jogo.terminou()) {
                         label_2.setText("GAME OVER - "+ jogo.resultado());
                         button_1.setEnabled(false);
                     }
                 }
                 catch(NumberFormatException e1) {
                     label_2.setText("formato numerico invalido");
                 }
                 catch(Exception erro) {
                     label_2.setText(erro.getMessage());
                 }
 
             }
         });
         button_1.setBounds(214, 59, 89, 23);
         frame.getContentPane().add(button_1);
 
         label_2 = new JLabel("resultado");
         label_2.setBounds(10, 134, 344, 14);
         frame.getContentPane().add(label_2);
         
         label = new JLabel("tentativas: 0");
         label.setBounds(120, 15, 100, 14);
         frame.getContentPane().add(label);
     }
 }
 