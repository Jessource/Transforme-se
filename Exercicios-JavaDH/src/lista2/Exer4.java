package lista2;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int  a [] = {1, 1, 1, 2, 3, 4, 5};
		int cont = 0;
		
		for (int i = 0; i<a.length; i++) {
			if (a[i] == x) {
				cont++;
				
			}
		
			
			System.out.print("  " +a[i]);
		}
		System.out.println();
		System.out.println(" A quantidade que " + x + " aparece no array acima é: " + cont);

	}

}
