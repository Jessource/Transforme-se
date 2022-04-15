package gerenciadordecursos;

public class TestaCursoComAluno {
    
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
        javaColecoes.adiciona(new Aulas("trabalhando com o java tope", 23));
        javaColecoes.adiciona(new Aulas("Estudando com o java muito tope", 21));
        javaColecoes.adiciona(new Aulas(" com o java tope", 22));

        Aluno a1 = new Aluno("Rodrigo Turini", 123);
        Aluno a2 = new Aluno("Pedro Silveira", 1234);
        Aluno a3 = new Aluno("Mauricio Aniche", 12345);
        Aluno turine = new Aluno("Rodrigo Turini", 1237);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println(javaColecoes);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAluno().forEach(a ->{
            System.out.println(a);

        });
        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estamatriculado(a1));

        System.out.println("esse turine está matriculado");
        System.out.println(javaColecoes.estamatriculado(turine));

        System.out.println("O a1 é equals ao turine?");
        System.out.println(a1.equals(turine));


        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAluno().forEach(a ->{
            System.out.println(a);
            System.out.println(turine);

        });

        
    }
}
