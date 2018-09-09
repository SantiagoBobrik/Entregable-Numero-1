package com.company;

public class Alumno {

    //Atributos
    private String nombre;
    private String apellido;
    private  Integer codAlumno;

    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getCodAlumno() {
        return codAlumno;
    }


    //Constructor


    public Alumno(String nombre, String apellido, Integer codAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codAlumno = codAlumno;
    }


    @Override
    public String toString() {
        return "Alumno: " +  nombre + " " + apellido +" " + "Codigo: " +  codAlumno;
    }
}
