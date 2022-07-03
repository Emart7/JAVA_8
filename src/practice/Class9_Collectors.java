package practice;

import model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Class9_Collectors {

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

        Curso curso = cursos.stream().filter(x -> x.getHora() > 25).findFirst().orElse(new Curso("No hay",50));
        System.out.println(curso);

        List<Curso> listCurso = cursos.stream().filter(x -> x.getHora() > 25).collect(Collectors.toList());
        cursos.forEach(System.out::println);


    }
}