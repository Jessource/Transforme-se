import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a largura da parede: ");
	    float largura = entrada.nextFloat();
	    
	    System.out.print("Informe a altura da parede: ");
	    float  altura = entrada.nextFloat();
		
		float area = largura * altura;
		float qtdLitrosTotais = area * 3;
		float qtdLatas = qtdLitrosTotais / 2;
		
		System.out.println(" quantidades de litros: " + qtdLitrosTotais);
		System.out.println("quantidades de latas: " + qtdLatas);

	}

}
