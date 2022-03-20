import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
	    double altura = Double.parseDouble(entrada.nextLine());
	    System.out.print("Informe seu sexo: ");
		 String  sexo = entrada.nextLine();
	
		 
		 if(sexo.equals("feminino")) {
			double  pesoIdealFem= (62.1*altura)-44.7;
			System.out.println("o seu peso ideial é: " + pesoIdealFem);
		 }else if(sexo.equals("masculino")){
			 
			double  pesoIdealMasc = (72.7*altura)-58;
			System.out.println("o seu peso ideial é: " + pesoIdealMasc);
		 }
       
	}

}
