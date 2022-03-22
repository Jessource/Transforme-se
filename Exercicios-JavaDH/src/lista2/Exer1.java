package lista2;

import java.util.Iterator;
import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saida = "";

		int [ ] valores1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		for(int i = 0; i<valores1.length; i++) {
			saida += valores1[i]+" ";
		}
		System.out.println("a) " + saida);
		
		String  saida2 = "";
		int [ ] valores2 = { 0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
		
		for (int j = 0; j<=10; j++) {
			saida2 += valores2[j]+ " ";
		}
		
		System.out.println("b) " + saida2);
		
		String  saida3 = "";
		int [ ] valores3 = { 1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
		
		for (int k = 0; k<=9; k++) {
			saida3 += valores3[k]+ " ";
		}
		
		System.out.println("c) " + saida3);
		
		
		
	}

}
