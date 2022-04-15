package gerenciadordecursos;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
        javaColecoes.adiciona(new Aulas("trabalhando com o java tope", 23));
        javaColecoes.adiciona(new Aulas("Estudando com o java muito tope", 21));
        javaColecoes.adiciona(new Aulas(" com o java tope", 22));

        System.out.println(javaColecoes.getAulas());

        
}
}
