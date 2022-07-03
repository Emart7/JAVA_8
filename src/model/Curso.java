package model;

public class Curso {

    private String nombre;
    private int hora;

    public Curso(String nombre, int hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHora() {
        return hora;
    }


    @Override
    public String toString() {
        return nombre + ":" +  hora;
    }
}
