package gerenciadordecursos;

public class TestaBuscaAlunosNoCursos{
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
        javaColecoes.adiciona(new Aulas("trabalhando com o java tope", 23));
        javaColecoes.adiciona(new Aulas("Estudando com o java muito tope", 21));
        javaColecoes.adiciona(new Aulas(" com o java tope", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 123);
        Aluno a2 = new Aluno("Pedro Silveira", 1234);
        Aluno a3 = new Aluno("Mauricio Aniche", 12345);
        // Aluno turine = new Aluno("Rodrigo Turini", 123);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

       System.out.println("Quem é o aluno com matricula 123?");
       Aluno aluno = javaColecoes.buscaaMatriculado(123);
       System.out.println("aluno: " + aluno);
    }

}