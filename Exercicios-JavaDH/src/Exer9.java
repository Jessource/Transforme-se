import java.util.Scanner;

public class Exer9 {
// Fa�a  um  programa  para  ler  o  nome,  departamento  e  o  sal�rio  de  um  funcion�rio. 
//Calcular e informar um abono de 10% (dez por cento) sobre o sal�rio e, ainda, o novo 
//sal�rio acrescido do abono
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Informe seu nome: ");
		 String  nome = entrada.nextLine();
		 System.out.println("Informe seu departamento: ");
		 String  departamento = entrada.nextLine();
		 System.out.println("Informe seu salario: ");
		 double salario = Double.parseDouble(entrada.nextLine());
		 
		 double salariocomaborno= (salario*10/100) ;
		double totalvalor = salario+salariocomaborno; 
		System.out.println(" voc� obteve 10% de aborno salarial, o valor do seu sal�rio total �: " + totalvalor);
		 
		 

	}

}
