import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
	    int idade = Integer.parseInt(entrada.nextLine());
	    
	    if(idade>=5 && idade<=7) {
	    	System.out.println("categoria infantil A");
	    } else if( idade>=8 && idade<= 10){
	    	System.out.println("categoria infantil B");
	    } else if(idade>=11 && idade<=13) {
	    	System.out.println("categoria juvenil A");
	    } else if(idade>= 14 && idade<=17) {
	    	System.out.println("categoria juvenil B");
	    } else if(idade>= 18) {
	    	System.out.println("categoria sênio");
	    } else {
	    	System.out.println("você não tem idade suficiente para está em um categoria");
	    }

	}

}
