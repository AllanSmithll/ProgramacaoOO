//IFPB - POO
//Fausto Ayres

public class TesteEmpregado {
	
	public static void main(String[] args) {
		Empregado e1,e2;
		e1= new Empregado(1);			// 1 salario
		e2= new Empregado(3);			// 3 salarios
		
		System.out.println("salarios atuais");
		System.out.println(e1.getSalario());	
		System.out.println(e2.getSalario());	
		
		Empregado.minimo = 1200;  	
		
		System.out.println("salarios alterados");
		System.out.println(e1.getSalario());	
		System.out.println(e2.getSalario());	
	}

}
