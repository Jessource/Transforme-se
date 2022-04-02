
public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente tata = new Gerente( );
		tata.setNome("Tayla");
		tata.setCpf("040.870.792-52");
		tata.setSalario(1200);
		
		System.out.println(tata.getNome());
		System.out.println(tata.getCpf());
		System.out.println(tata.getSalario());
		
		System.out.println(tata.getNome());
		System.out.println(tata.getBonificacao());

	}

}
