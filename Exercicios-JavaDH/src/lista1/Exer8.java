package lista1;

import java.util.Scanner;
//Fa�a um programa para ler o nome e as tr�s notas de um aluno. Calcular a m�dia e 
//escrever o nome e a m�dia. Vari�veis utilizadas: NOME, N1, N2, N3, MEDIA.
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
		 System.out.println("sua m�dia �: " + media);



	}

}
