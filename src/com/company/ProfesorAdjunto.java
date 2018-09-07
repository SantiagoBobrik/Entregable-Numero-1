package com.company;

public class ProfesorAdjunto extends Profesor {


    //Atributos
    private Integer horasConsulta;

    //Getter


    public Integer getHorasConsulta() {
        return horasConsulta;
    }

    //Constructor


    public ProfesorAdjunto(String nombre, String apellido, Integer antiguedad, Integer codProfesor, Integer horasConsulta) {
        super(nombre, apellido,antiguedad,codProfesor);
        this.horasConsulta = horasConsulta;


    }
}
