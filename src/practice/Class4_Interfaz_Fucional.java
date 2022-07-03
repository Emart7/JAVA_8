package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Class4_Interfaz_Fucional {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList<>();

        cursos.add("Matematica");
        cursos.add("Fisica");
        cursos.add("Quimica");
        cursos.add("Historia");
        cursos.add("Geografia");
        cursos.add("Informatica");
        cursos.add("Etica");

        cursos.sort((t1, t2) -> Integer.compare(t2.length(), t1.length()));

        cursos.forEach( (String s) -> { if (s.length() < 18 )
            System.out.println(s);
        });

    }
}