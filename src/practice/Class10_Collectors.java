package practice;

import model.Curso;
import model.CursoTipo;

import java.util.*;
import java.util.stream.Collectors;

public class Class10_Collectors {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso ("Matematica", 15));
        cursos.add(new Curso ("Fisica", 20));
        cursos.add(new Curso ("Quimica", 8));
        cursos.add(new Curso ("Historia", 25));
        cursos.add(new Curso ("Geografia", 12));
        cursos.add(new Curso ("Informatica", 10));

        List<CursoTipo> cursosTipos = new ArrayList<>();

        cursosTipos.add(new CursoTipo ("Matematica", 15, 1));
        cursosTipos.add(new CursoTipo ("Fisica", 20, 2));
        cursosTipos.add(new CursoTipo ("Quimica", 8, 1));
        cursosTipos.add(new CursoTipo ("Historia", 25, 2));
        cursosTipos.add(new CursoTipo ("Geografia", 12, 4));
        cursosTipos.add(new CursoTipo ("Informatica", 10, 2));

        Map<Integer,String> mapaCursos = cursos.stream().filter(x -> x.getHora()>300)
                .collect(Collectors.toMap(Curso::getHora,Curso::getNombre));

//        mapaCursos.forEach((llave, valor) -> System.out.println(valor));

        Map<Integer, List<CursoTipo>> mapaCursosTipos = cursosTipos.parallelStream().filter(x -> x.getTipo() > 8).collect(Collectors.groupingBy(CursoTipo::getTipo));

        mapaCursosTipos.get(1).forEach(System.out::println);
        mapaCursosTipos.get(2).forEach(System.out::println);

    }
}