package com.company;

import org.omg.CORBA.DATA_CONVERSION;

import java.util.Date;

public class Inscripcion {
    //Atributos
    private Alumno alumno;
    private Curso curso;
    private Date fechaInscripcion = new Date();


    //GEtter

    public Alumno getAlumno() {
        return alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    //Constructor


    public Inscripcion(Alumno alumno, Curso curso, Date fechaInscripcion) {
        this.alumno = alumno;
        this.curso = curso;
        this.fechaInscripcion = new Date();
    }



}
