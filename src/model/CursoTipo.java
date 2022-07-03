package model;

public class CursoTipo {

    private String nombre;
    private int hora;
    private int tipo;

    public CursoTipo(String nombre, int hora, int tipo) {
        this.nombre = nombre;
        this.hora = hora;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
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
