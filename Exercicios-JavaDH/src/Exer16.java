import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso da bagagem: ");
	    double pesobagagem = Double.parseDouble(entrada.nextLine());
	    
	    if(pesobagagem<=20) {
	    	System.out.println(" você não irá pagar valor de excesso");
	    } else if(pesobagagem>20 && pesobagagem<=40) {
	    	System.out.println(" você irá pagar o valor de 5.000,00 de excesso de bagagem");
	    	
	    } else {
	    	System.out.println(" você irá pagar o valor de 10.000,00 de excesso de bagagem");
	    }
	    

	}

}
