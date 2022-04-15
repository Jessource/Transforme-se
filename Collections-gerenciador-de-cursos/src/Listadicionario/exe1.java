package Listadicionario;

import java.util.HashMap;
import java.util.Map;

public class Exe1 {
    public static void main(String[] args) {
        Map<Integer, String> numerosparaSignificados = new HashMap<>();
        numerosparaSignificados.put(0, "Ovos");
        numerosparaSignificados.put(1, "Agua");
        numerosparaSignificados.put(2, "Escopeta");
        numerosparaSignificados.put(3, "Cavalo");
        numerosparaSignificados.put(4, "Dentista");
        numerosparaSignificados.put(5, "Fogos");

        for (Integer chave : numerosparaSignificados.keySet()) {
            String valor = numerosparaSignificados.get(chave);
            System.out.println(valor);
            
        }

        
    }
    
}
