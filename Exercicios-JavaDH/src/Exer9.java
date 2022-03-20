import java.util.Scanner;

public class Exer9 {
// Faça  um  programa  para  ler  o  nome,  departamento  e  o  salário  de  um  funcionário. 
//Calcular e informar um abono de 10% (dez por cento) sobre o salário e, ainda, o novo 
//salário acrescido do abono
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
		System.out.println(" você obteve 10% de aborno salarial, o valor do seu salário total é: " + totalvalor);
		 
		 

	}

}
