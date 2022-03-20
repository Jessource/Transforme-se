import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu salario base: ");
	    double salariobase = Double.parseDouble(entrada.nextLine());
	    
	    System.out.println( "Informe seu número de dependentes:");
        int qtd = entrada.nextInt();
        
        double salariobruto = salariobase+100*qtd;
        
        System.out.println( "seu salario bruto é: "+ salariobruto);
        
        double descontoInss = salariobase*10/100;
	    double salarioliquido = salariobase- descontoInss;
	    System.out.println(" o seu salario liquido é:"+ salarioliquido);
	}

}
