package aula01;

import java.util.HashMap;
import java.util.Map;

public class TesteGastos {

	public static void main(String[] args) {
		// HashMap e gastos/mes
		HashMap<String, Double> gastos = new HashMap<>();
		
		String[] meses = {"jan", "fev", "mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		double[] gastosMes = {1000,1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011};
		
		for( int i=0; i<12; i++ ) {
			String mesKey = meses[i];
			double gastosNoMes = gastosMes[i];
			gastos.put(mesKey, gastosNoMes);
		}
		
		// Gastos do mês de setembro
		System.out.println("Gasto do mês de setembro: "+gastos.get("set"));
		
		// Gasto de fevereiro dobrado em relação a janeiro
		gastos.put("fev",(2*gastos.get("jan")));
		System.out.println("Gasto de fevereiro dobrado em relação a janeiro: "+gastos.get("fev"));
		
		// Soma dos gastos totais dos meses
		double cont = 0.0;
		for( double gastosTotais : gastos.values()) {
			cont += gastosTotais;
		}
		System.out.println("Soma total de todos os meses: "+cont);
		
		// Todos os gastos/mes
		for(Map.Entry<String,Double> par : gastos.entrySet()) {
			System.out.println(par.getKey()+"/"+par.getValue());
		}
	}

}