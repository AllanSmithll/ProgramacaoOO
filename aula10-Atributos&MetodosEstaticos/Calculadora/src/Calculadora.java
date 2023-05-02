import java.util.ArrayList;

public class Calculadora {
		public static ArrayList<String> historico = new ArrayList<>();
		private Calculadora() {}
		
		public static double somar(double num1, double num2) {
			double resultado = num1+num2;
			historico.add(num1 + "+" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static double subtrair(double num1, double num2) {
			double resultado =  num1-num2;
			historico.add(num1 + "-" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static double multiplicar(double num1, double num2) {
			double resultado =  num1*num2;
			historico.add(num1 + "*" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static double dividir(double num1, double num2) {
			double resultado =  num1/num2;
			historico.add(num1 + "/" + num2 + "=" + resultado);
			return resultado;
		}
		
		public static String historico() {
			return historico.toString();
		}
}
