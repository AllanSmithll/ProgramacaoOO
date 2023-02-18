/*
	17/02/2023: sintaxe de Java
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sintaxe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome1 = JOptionPane.showInputDialog("Qual é o seu nome?");
		String nome2 = JOptionPane.showInputDialog("Qual é o seu nome do seu amigo?");
		
		JOptionPane.showMessageDialog(null, nome1 +" e amigo de "+ nome2);
		teclado.close();
	}
	
}
