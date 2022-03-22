package lista1;

import java.util.Scanner;

public class Exer6 {
	// Faça um Programa que leia as seguintes informações de um funcionário: matricula, 
	 //nome, idade, sexo, endereço, bairro e estado civil.  Escreva o nome do funcionário.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá funcionário informe seus dados abaixo para validar sua entrada:");
            Scanner entrada = new Scanner(System.in);
            	
	    System.out.println("Informe sua matricula: ");
	    int matricula = Integer.parseInt(entrada.nextLine());
	    System.out.println("Informe seu nome: ");
	    String  nome = entrada.nextLine();
	    System.out.println("Informe sua idade: ");
	    int idade = Integer.parseInt(entrada.nextLine());
	    System.out.println("Informe seu sexo: ");
	    String sexo = entrada.nextLine();
	    
	    System.out.println("Informe seu endereço: ");
	    String endereco = entrada.nextLine();
	    System.out.println("Informe seu bairro: ");
	    String bairro = entrada.nextLine();
	    System.out.println("Informe seu estado civil: ");
	    String estadocivil = entrada.nextLine();
	    
	    System.out.println("seja bem vindo funcionário: " + nome);
	}

}
