//Gerente eh um funcionario, gerente herda da class funcionario e assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel  {
  private AutenticacaoUtil autenticador;
	
	public Gerente( ) {
		this.autenticador =new AutenticacaoUtil();
	}
	
	public double getBonificacao( ) {
		System.out.println("chamando m�todo de bonifica��o do GERENTE! ");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
}