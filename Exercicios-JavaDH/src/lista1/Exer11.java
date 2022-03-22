package lista1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Exer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar cal = GregorianCalendar.getInstance();
	        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
	        int mesAtual = cal.get(Calendar.MONTH) + 1;
	        int anoAtual = cal.get(Calendar.YEAR);

	        //recebendo a data de nascimento usuario
	        Scanner entrada = new Scanner(System.in);
	        
	     
	        System.out.println("Informe seu nome: ");
	        String nome = entrada.nextLine();
	        System.out.println("Dia em que você nasceu: ");
	        int diaNasc = entrada.nextInt();
	        System.out.println("Mes em que você nasceu: ");
	        int mesNasc = entrada.nextInt();    
	        System.out.println("Ano em que você nasceu: ");
	        int anoNasc = entrada.nextInt();
	      
	            int Nasc = anoNasc*365;
	                Nasc = Nasc+(mesNasc*31);
	                Nasc = Nasc+diaNasc;
	            int Atual = anoAtual*365;
	                Atual = Atual+(mesAtual*31);
	                Atual = Atual+diaAtual;
	            
	                System.out.println("Você "+ nome + " tem "+(Atual-Nasc)+" dias ou "+((Atual-Nasc)/31)+" meses ou "+((Atual-Nasc)/365)+" anos.");
	           
	        

	}

}
