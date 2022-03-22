package lista1;

public class Exer5 {
	//Escreva um programa que, dados três números, informe o maior e o menor.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1= 10;
		int valor2 =5;
		int valor3= 2;
		
		if(valor1>valor2 && valor1>valor3 ) {
			System.out.println(" numero maior: " +valor1);
		} else if( valor2>valor1 && valor2>valor3) {
			System.out.println(" numero maior: " +valor2);
			
		}else {
			System.out.println(" numero maior: " +valor3);
		}
		
		if(valor1<valor2 && valor1<valor3 ) {
			System.out.println(" numero menor: " +valor1);
		} else if( valor2<valor1 && valor2<valor3) {
			System.out.println(" numero menor: " +valor2);
			
		}else {
			System.out.println(" numero menor: " +valor3);
		}


	}

}
