package com.company;

public class ProfesorTitular extends Profesor {

    //Atributos
    private String especialidad;

    //GEtter

    public String getEspecialidad() {
        return especialidad;
    }


    //Constructor


    public ProfesorTitular(String nombre, String apellido, Integer antiguedad, Integer codProfesor, String especialidad) {
        super(nombre, apellido, antiguedad, codProfesor);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor Titular: "+ getNombre() + " " + getApellido() + " " + "Codigo: " + getCodProfesor() + " Especialidad: " + getEspecialidad();
    }
}
