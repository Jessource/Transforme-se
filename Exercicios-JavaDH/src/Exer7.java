import java.util.Scanner;

public class Exer7 {
// Fa�a um programa que leia dois n�meros inteiros e escreva a soma entre eles.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um n�mero: ");
	    int n1 = Integer.parseInt(entrada.nextLine());
	    System.out.println("Informe outro n�mero: ");
	    int n2 = Integer.parseInt(entrada.nextLine());
	    int soma = (n1+n2);
	    System.out.println(" a soma entre os n�meros digitados �: " + soma);

	}

}
