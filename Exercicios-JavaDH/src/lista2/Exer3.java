package lista2;

public class Exer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int numeros [ ] = {1, 2, 3, -1, -2};
		for( int i = 0; i<numeros.length;i++) {
			
			if(numeros[i]<0) {
				cont++;
			}
			
		}
    System.out.println( " A quantidade de números negativos é: "+ cont);
	}

}
