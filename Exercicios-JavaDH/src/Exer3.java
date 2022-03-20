import java.util.Scanner;
//Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15% 
//de desconto em uma venda à vista e exiba o valor a ser pago.
public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
	    System.out.print("Informe o valor da sua mercadoria: ");
	    double valorsemdesconto = Double.parseDouble(entrada.nextLine());
	    
	  
		double valordescontado = (valorsemdesconto*10/100) ;
		double totalvalor = valorsemdesconto-valordescontado;
		System.out.println("o valor total da sua mercadoria com desconto de 15% é:  " + totalvalor);

	}

}
