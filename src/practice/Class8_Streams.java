package practice;

import model.Curso;

import java.util.*;

public class Class8_Streams {

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

//        int suma = cursos.stream().filter(x -> x.getHora() > 8).mapToInt(x -> x.getHora()).sum();
//        int suma = cursos.stream().mapToInt(x -> x.getHora()).sum();
        OptionalInt max = cursos.stream().mapToInt(x -> x.getHora()).max();
        System.out.println(max.getAsInt());

        boolean validaTodos = cursos.stream().allMatch(x -> x.getHora() > 7);
        System.out.println(validaTodos);

        Optional<Curso> optionalCurso = cursos.stream().filter(x -> x.getHora() > 12).findFirst();
        System.out.println(optionalCurso.isPresent());
        System.out.println(optionalCurso.get().getNombre());

        OptionalDouble average = cursos.stream().mapToInt(x->x.getHora()).average();
        System.out.println(average.getAsDouble());


    }
}