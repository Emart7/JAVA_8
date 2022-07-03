package practice;

import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Class7_Streams {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso ("Matematica", 15));
        cursos.add(new Curso ("Fisica", 20));
        cursos.add(new Curso ("Quimica", 8));
        cursos.add(new Curso ("Historia", 25));
        cursos.add(new Curso ("Geografia", 12));
        cursos.add(new Curso ("Informatica", 10));

        //Reference
        cursos.sort(Comparator.comparing(Curso::getHora));

        cursos.stream().filter(x -> x.getHora() > 8).forEach(s -> System.out.println(s.getNombre()));

    }
}