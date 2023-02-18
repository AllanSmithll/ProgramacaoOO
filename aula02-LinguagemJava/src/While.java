// 17/02/2023: sobre estrutura de repetição WHILE
import java.util.Scanner;
import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = JOptionPane.showInputDialog("Digite a senha");
		while(!senha.equalsIgnoreCase("jao")) {
			senha = JOptionPane.showInputDialog("tente novamente");
		}
		
		sc.close();
		System.out.println("Entrando...");
	}

}
