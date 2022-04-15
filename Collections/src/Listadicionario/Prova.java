package Listadicionario;

import java.util.HashSet;
import java.util.Set;

public class Prova {
    
    private Set<Integer> conjuntoDeInteiros = new HashSet<>();



    public void exibir() {
        for (Integer numero : conjuntoDeInteiros) {
            System.out.println(numero);
            
        }
    }

    

    public void adiciona(Integer numero){
        this.conjuntoDeInteiros.add(numero);
    }

    public int getSomaTotal(){
        int somaTotal = 0;

        for (Integer inteiro : conjuntoDeInteiros) {
            somaTotal += inteiro.intValue();
        }
        return somaTotal;
       
        
    }
    
}


