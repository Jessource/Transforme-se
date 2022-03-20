import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Informe o codigo da mercadoria: ");
		 int  codigo = entrada.nextInt();
		 
		 System.out.println("Informe a descriçã da mercadoria");
		 String  descricao = entrada.nextLine();
		 
		 System.out.println("Informe a quantidade de mercadoria: ");
		 int  qtd = entrada.nextInt();
		 
		 System.out.println("Informe o preço da mercadoria: ");
		 double preco = Double.parseDouble(entrada.nextLine());
		 
		 System.out.println("Informe o percentual de lucro ");
		 double percentuaLucro = Double.parseDouble(entrada.nextLine());

	}

}
