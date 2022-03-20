package arrays;

public class Exer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10, 4, 11, 12, 5, 2,15};
		int posicaoMaiorValor = 0;
		
		for( int i = 0; i<array.length; i++) {
			if(array[i]>array[posicaoMaiorValor]) {
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println("Indice que contém o elemento de maior valor: " + posicaoMaiorValor);

	}

}
