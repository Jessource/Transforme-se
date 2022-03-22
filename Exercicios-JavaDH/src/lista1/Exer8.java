package lista1;

import java.util.Scanner;
//Faça um programa para ler o nome e as três notas de um aluno. Calcular a média e 
//escrever o nome e a média. Variáveis utilizadas: NOME, N1, N2, N3, MEDIA.
public class Exer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Informe seu nome: ");
		 String  nome = entrada.nextLine();
		 System.out.println("Informe sua primeira nota: ");
		 double n1 = Double.parseDouble(entrada.nextLine());
		 System.out.println("Informe sua segunda nota: ");
		 double n2 = Double.parseDouble(entrada.nextLine());
		 System.out.println("Informe sua terceira nota: ");
		 double n3 = Double.parseDouble(entrada.nextLine());
		 
		 double media = (n1+n2+n3)/3;
		 System.out.print(nome +" ");
		 System.out.println("sua média é: " + media);



	}

}
