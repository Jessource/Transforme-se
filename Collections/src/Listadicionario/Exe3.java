/* 
3. Definir e inicializar uma nova lista vazia. Adicionar os seguintes elementos à
lista vazia: 1,5,5,6,7,8,8,8.
Imprimir o resultado na tela.
 */

package Listadicionario;

import java.util.ArrayList;
import java.util.List;

public class Exe3 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 5;
        int n3 = 5;
        int n4 = 6;
        int n5 = 7;
        int n6 = 8;
        int n7 = 8;
        int n8 = 8;
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);
        numeros.add(n4);
        numeros.add(n5);
        numeros.add(n6);
        numeros.add(n7);
        numeros.add(n8);
        

        System.out.println(numeros);
        
        numeros.forEach(numero ->{
            System.out.println("Pecorrendo: ");
            System.out.println("numeros: "+ numero);
           
           
           });


        
    }
}
