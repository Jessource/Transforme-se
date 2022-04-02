
public class TestesContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(123, 1234);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
