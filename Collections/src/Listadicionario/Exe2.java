/* 
2. Criar um dicionário que represente os apelidos que uso para chamar os
meus amigos. Para isso, o dicionário deverá ter como chave String e como
valor uma lista de Strings.

João → Juan, Fissura, Maromba
Miguel → Night Watch, Bruce Wayne, Tampinha
Maria → Wonder Woman, Mary, Marilene
Lucas → Lukinha, Jorge, George
 */



package Listadicionario;

import java.util.HashMap;
import java.util.Map;

public class Exe2 {
    public static void main(String[] args) {
        Map<String, String> nomesParaApelidos = new HashMap<>();
        nomesParaApelidos.put("joao", "Juan, Fissura, Maromba");
        nomesParaApelidos.put("miguel", "Night Watch, Bruce Wayne, Tampinha");
        nomesParaApelidos.put("maria", "Wonder Woman, Mary, Marilene");
        nomesParaApelidos.put("miguel", "Lukinha, Jorge, George");
        
        for (String chave : nomesParaApelidos.keySet()) {
            String valor = nomesParaApelidos.get(chave);
            System.out.println(valor);
            
        }

        
    }
    
}
