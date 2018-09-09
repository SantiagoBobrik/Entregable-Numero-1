package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Atributos
    private String nombre;
    private Integer codCurso;
    private Integer cupoMaximo;
    private ProfesorTitular profesorTitular;
    private ProfesorAdjunto profesorAdjunto;
    private List<Alumno> listaAlumnos = new ArrayList<>();


    //Getter

    public String getNombre() {
        return nombre;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public Integer getCupoMaximo() {
        return cupoMaximo;
    }

    public ProfesorTitular getProfesorTitular() {
        return profesorTitular;
    }

    public ProfesorAdjunto getProfesorAdjunto() {
        return profesorAdjunto;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    //Setter

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }


    //Constructor


    public Curso(String nombre, Integer codCurso, Integer cupoMaximo){
     // ProfesorTitular profesorTitular, ProfesorAdjunto profesorAdjunto, List<Alumno> listaAlumnos) {
        this.nombre = nombre;
        this.codCurso = codCurso;
        this.cupoMaximo = cupoMaximo;
       // this.profesorTitular = profesorTitular;
       // this.profesorAdjunto = profesorAdjunto;
       // this.listaAlumnos = listaAlumnos;
    }


    //METODO AGREGAR Alumno
    public boolean agregarAlumno(Alumno unAlumno) {

        if (listaAlumnos.size() < cupoMaximo) {
            listaAlumnos.add(unAlumno);


            return true;

        } else {
            System.out.println("Sin cupo");
            return false;
        }
    }

    //METODO QUITAR ALUMNO
    public void eliminarAlumno(Alumno unAlumno) {

        for (Integer i = 0; i < listaAlumnos.size(); i++) {

            if (unAlumno == listaAlumnos.get(i)) {
                listaAlumnos.remove(i);
                System.out.println("Alumno Eliminado");
            }
        }
    }

    @Override
    public String toString() {
        return "Curso: " + nombre + " " +"Codigo: " + codCurso +" " +"Cupo Maximo: " +  cupoMaximo;
    }
}
