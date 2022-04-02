
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente( );
		g1.setCpf("0940239449024");
		g1.setNome("ana");
		g1.setSalario(5000.0);
		
		
		System.out.println(g1.getCpf());
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		
		g1.setSenha(222);
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
