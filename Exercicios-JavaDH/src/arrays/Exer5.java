package arrays;

public class Exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {-1 ,1 ,0, 2, -1};
		boolean [] aux = new boolean[5] ;
		
		for( int i =0 ; i<a.length; i++) {
			if(a[i]<=0) {
				aux[i] = false;
			}else {
				aux[i] = true;
			}
		}
		
		for (int  i = 0; i<aux.length; i++) {
			System.out.print(aux[i] + " ");
		}
     
	}

}
