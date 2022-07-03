package practice;

import model.Comparar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class1_Collections_Sort {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Matematica");
        cursos.add("Fisica");
        cursos.add("Quimica");
        cursos.add("Historia");
        cursos.add("Geografia");
        cursos.add("Informatica");
        cursos.add("Etica");

        Collections.sort(cursos, new Comparar());
//        cursos.sort(new Comparar());

        for (String curso: cursos){
            System.out.println(curso);
        }

    }
}