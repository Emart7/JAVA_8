package practice;

import model.Comparar;
import model.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class Class2_List_Sort {

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

        cursos.forEach(new Consumidor());

    }
}