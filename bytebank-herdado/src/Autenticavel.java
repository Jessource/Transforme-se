// transformando isso em uma interface = n�o tem nada concreto
//contrato autenticavel
// quem assina esse contrato, precisa implementar
// os metodos set senha e metodo autentica
public abstract interface Autenticavel  {


	public  abstract void setSenha(int senha) ;


	public abstract boolean autentica(int senha) ;

}
