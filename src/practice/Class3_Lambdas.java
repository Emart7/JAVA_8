package practice;

import model.Comparar;

import java.util.ArrayList;
import java.util.List;

public class Class3_Lambdas {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Matematica");
        cursos.add("Fisica");
        cursos.add("Quimica");
        cursos.add("Historia");
        cursos.add("Geografia");
        cursos.add("Informatica");
        cursos.add("Etica");

        cursos.sort(new Comparar());

        cursos.forEach( (String s) -> System.out.println(s));

    }
}