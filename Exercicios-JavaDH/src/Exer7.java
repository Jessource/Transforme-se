import java.util.Scanner;

public class Exer7 {
// Faça um programa que leia dois números inteiros e escreva a soma entre eles.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número: ");
	    int n1 = Integer.parseInt(entrada.nextLine());
	    System.out.println("Informe outro número: ");
	    int n2 = Integer.parseInt(entrada.nextLine());
	    int soma = (n1+n2);
	    System.out.println(" a soma entre os números digitados é: " + soma);

	}

}
