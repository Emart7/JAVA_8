package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Class6_Reference {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Matematica");
        cursos.add("Fisica");
        cursos.add("Quimica");
        cursos.add("Historia");
        cursos.add("Geografia");
        cursos.add("Informatica");
        cursos.add("Etica");

//        Function<String, Integer> funcion = x -> x.length();

        //Reference
        cursos.sort(Comparator.comparing(String::length).reversed());

        cursos.forEach(System.out::println);

        cursos.forEach(s -> System.out.println(s.length()));

    }
}