package gerenciadordecursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silveira");
        javaColecoes.adiciona(new Aulas("trabalhando com o java tope", 23));
        javaColecoes.adiciona(new Aulas("Estudando com o java muito tope", 21));
        javaColecoes.adiciona(new Aulas(" com o java tope", 22));

        List<Aulas> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aulas> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
        Collections.reverse(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

        
    }
}
