package practice;

import model.Curso;
import model.CursoTipo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Class11_APIs {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now().minusMonths(9).plusDays(7);
        System.out.println(fechaActual);

        LocalDate fechaMundialCatar = LocalDate.of(2022, 12, 2);
        System.out.println(fechaMundialCatar);

        System.out.println(fechaMundialCatar.getYear() - fechaActual.getYear());

        System.out.println(ChronoUnit.DAYS.between(fechaActual, fechaMundialCatar));

        Integer actual = ZonedDateTime.now().getYear();
        System.out.println(actual);

    }
}