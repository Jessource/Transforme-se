package lista3;

public class Exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double aumento = 1.5, salario = 1000, ano = 1995;
		do {
			salario += ((salario*aumento)/100);
			aumento  *= 2;
			ano++;
		} while(ano<=1998);
		
		System.out.println(salario);

	}

}
