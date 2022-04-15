
/* 
4. Definir e inicializar um novo conjunto vazio. Adicionar os seguintes elementos
ao conjunto vazio: 1,5,5,6,7,8,8,8.
Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior? 
no set não é possível adiocnar elementos repetidos
*/
package Listadicionario;

import java.util.HashSet;
import java.util.Set;

public class Exe4 {
    public static void main(String[] args) {
        Set <Integer> elementos = new HashSet<>();
        int n1 = 1;
        int n2 = 5;
        int n3 = 5;
        int n4 = 6;
        int n5 = 7;
        int n6 = 8;
        int n7 = 8;
        int n8 = 8;

        elementos.add(n1);
        elementos.add(n2);
        elementos.add(n3);
        elementos.add(n4);
        elementos.add(n5);
        elementos.add(n6);
        elementos.add(n7);
        elementos.add(n8);
        
       

        elementos.forEach(elemento -> {
            System.out.println(elemento);
            
            

           

        });
        
        
        
      

    }

    
}
