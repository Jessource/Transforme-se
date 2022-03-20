package arrays;

public class Exer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = {1,2,2,5,13,4};
		int [] aux = new int [6];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] %2 == 0) {
				aux[i]=1;				
			}else {
				aux[i]= -1;
			}
		}
		for (int i = 0; i < aux.length; i++) {
			System.out.print(aux[i] + " ");
		}

	}

}
