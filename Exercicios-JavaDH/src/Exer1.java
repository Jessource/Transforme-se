
import java.util.Scanner;
public class Exer1 {
	//Faça  um  programa  que,  dado  o  valor  da  conta  de  uma  refeição  realizada  em  um 
	//restaurante, acrescente os 10% do garçom e exiba o valor total da conta.

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
	    System.out.print("Informe o valor da sua refeição: ");
	    double valorsemacrescimo = Double.parseDouble(entrada.nextLine());
	    
	  
		double valordoacrescimo= (valorsemacrescimo*10/100) ;
		double totalvalor = valorsemacrescimo+valordoacrescimo;
		System.out.println("valor da conta de refeição sem o acrescimo de 10% de taxa de serviço do garçon é: "  + valorsemacrescimo);
		System.out.println("valor da conta de refeição com acrescimo de 10%:  " + totalvalor);
		
		
	    
	}
}