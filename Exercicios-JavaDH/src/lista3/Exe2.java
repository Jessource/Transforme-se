package lista3;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int i, j;
	  double f, E = 1.0;
	  
	  for(i = 1; i<=n;i++) {
		  f =1;
		  for(j=1; j<=i; j++) {
			  f= f * j;
		  }
		  E = E+1.0/f;
	  }
		System.out.println("E = "+ E);
				

	}

}
