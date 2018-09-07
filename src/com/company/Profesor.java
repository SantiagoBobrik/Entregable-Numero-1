package com.company;

public  abstract class Profesor {

    //Atributos
    private String nombre;
    private String apellido;
    private Integer antiguedad  = 0;
    private  Integer codProfesor;

    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public Integer getCodProfesor() {
        return codProfesor;
    }


    //Constructor

    public Profesor(String nombre, String apellido, Integer antiguedad, Integer codProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
        this.codProfesor = codProfesor;
    }


    //
}
