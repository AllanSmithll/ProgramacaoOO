// 17/02/2023: sobre estrutura de decisão

public class Imc {
	public static void main(String[] args) {
		double peso = 48;
		double altura = 1.53;
		double imc = peso / Math.pow(altura, 2);
		if (imc < 18.5 )
			System.out.println("Abaixo do normal");
		else 
			if (imc < 25)
				System.out.println("Normal");
			else
				if (imc < 30)
					System.out.println("Acima do peso");
				else
					if (imc < 35)
						System.out.println("Obesidade 1");
					else
						if (imc < 40)
							System.out.println("Obesidade 2");
						else
							System.out.println("Morbidade");
		
}}
