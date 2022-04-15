public class TestaContaExcecao {
    public static void main(String[] args)  {
        try {
            Conta conta = new ContaCorrente(-1, -2);
        } catch (IllegalArgumentException e) {
            System.out.println(" Ex: "+ e.getMessage());
            System.out.println("Agencia ou numero invalido");
            //TODO: handle exception
        }
    }
}
