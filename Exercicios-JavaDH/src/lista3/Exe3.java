package lista3;

import java.util.*;

public class Exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num, i, j, fat;
	    Scanner dado;
	    // Instancia o objeto da classe Scanner para receber as entradas
	    dado = new Scanner(System.in); 
	    
	    System.out.print("Digite a quantidade de numeros que serao lidos:");
	    //Recebe a quantidade de números para serem lidos
	    n = dado.nextInt();
	    
	    for( i=1; i<=n ; i++ ){
	       System.out.println("\n Digite o "+ i +"º número");
	          num = dado.nextInt();
	          fat = 1 ;
	    for( j=1; j<=num ; j++ ){
	        fat = fat * j;
	       System.out.println("O Fatorial de "+ num +" = " + fat);
	   }
	   }     

	}

}
