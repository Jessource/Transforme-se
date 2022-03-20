import java.util.Scanner;

public class Exer4 {
//Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba o troco a ser devolvido. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Informe o valor da sua mercadoria: ");
	    double valordamercadoria = Double.parseDouble(entrada.nextLine());
	    System.out.println(" Informe a quantia a ser paga: ");
	    double valoraserpago = Double.parseDouble(entrada.nextLine());
	    double troco = valoraserpago-valordamercadoria;

		
		System.out.printf("Você irá receber de troco:  %.2f  " , troco );

	}

}
