
import java.util.Scanner;
public class Exer1 {
	//Fa�a  um  programa  que,  dado  o  valor  da  conta  de  uma  refei��o  realizada  em  um 
	//restaurante, acrescente os 10% do gar�om e exiba o valor total da conta.

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
	    System.out.print("Informe o valor da sua refei��o: ");
	    double valorsemacrescimo = Double.parseDouble(entrada.nextLine());
	    
	  
		double valordoacrescimo= (valorsemacrescimo*10/100) ;
		double totalvalor = valorsemacrescimo+valordoacrescimo;
		System.out.println("valor da conta de refei��o sem o acrescimo de 10% de taxa de servi�o do gar�on �: "  + valorsemacrescimo);
		System.out.println("valor da conta de refei��o com acrescimo de 10%:  " + totalvalor);
		
		
	    
	}
}