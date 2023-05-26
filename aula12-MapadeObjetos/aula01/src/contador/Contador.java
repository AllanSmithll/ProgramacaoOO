package contador;

import java.util.HashMap;

public class Contador {
    HashMap<String, Integer> contadores = new HashMap<>();

    public void contar(String chave) {
        if (contadores.containsKey(chave)) {
            int valorAtual = contadores.get(chave);
            contadores.put(chave, valorAtual+1);
        } else {
            contadores.put(chave, 1);
        }
    }

    public int totalizar(String chave) {
        if (contadores.get(chave) == null) {return 0;}
        int totalOcorrencias = contadores.get(chave);
        return totalOcorrencias;
    }
}
