package com.company;

import java.util.ArrayList;
import java.util.List;

public class DigitalManager {

    //Atributos
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private List<Profesor> listaProfesores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Inscripcion> listaInscripcion = new ArrayList<>();



    //METODO DAR DE ALTA CURSO
    public void altaCurso(String nombre, Integer codigoCurso, Integer cupoMaximoDealumnos) {

        Curso curso = new Curso(nombre, codigoCurso, cupoMaximoDealumnos);

        listaCursos.add(curso);
        System.out.println("Curso Cargado");





    }

    //METODO DAR DE BAJA UN CURSO
    public void bajaCurso(Integer codigoCurso){

        for (Integer i = 0; i <listaCursos.size(); i++){

            Curso cursoEnCuestion = listaCursos.get(i);


             if (cursoEnCuestion.getCodCurso() == codigoCurso){

                 listaCursos.remove(i);
                 System.out.println("CURSO DADO DE BAJA");
                 break;
            }


        }

    }

    //METODO DAR DE ALTA PROFESOR ADJUNTO
    public void altaProfesorAdjunto(String nombre, String apellido, Integer codigoProfesor, Integer cantidadDeHoras){

        Profesor profesorAdjunto = new ProfesorAdjunto(nombre,apellido,0,codigoProfesor,cantidadDeHoras);

        listaProfesores.add(profesorAdjunto);
        System.out.println("Profesor Adjunto Cagado");





    }

    //METODO DAR DE ALTA PROFESOR TITULAR
    public void altaProfesorTitular(String nombre, String apellido, Integer codigoProfesor, String especialidad){

        Profesor profesorTitular = new ProfesorTitular(nombre,apellido,0,codigoProfesor,especialidad);

        listaProfesores.add(profesorTitular);
        System.out.println("Profesor Titular Agregado");
    }

    //METODO DAR DE BAJA PROFESOR
    public void bajaProfesor(Integer codigoProfesor){

        for (Integer i = 0;i<listaProfesores.size();i++){

            Profesor profesor = listaProfesores.get(i);

            if (profesor.getCodProfesor() == codigoProfesor){
                listaProfesores.remove(i);
                System.out.println("Profesor Eliminado");
                break;
            }
        }
    }
    //METODO DAR DE ALTA ALUMNO
    public void altaAlumno(String nombre, String apellido, Integer codigoAlumno){

        Alumno alumno = new Alumno(nombre,apellido,codigoAlumno);

        listaAlumnos.add(alumno);
        System.out.println("Alumno Cargado");
    }

    //METODO INSCRIBIR ALUMNO
    public void inscribirAlumno(Integer codigoAlumno, Integer codigoCurso){

        Alumno alumno = null;
        Curso curso = null;

        for (Integer i = 0;i<listaCursos.size();i++){

                curso = listaCursos.get(i);

            if (curso.getCodCurso() == codigoAlumno){

                curso = listaCursos.get(i);

                System.out.println("Curso Encontrado");
                break;

            }

        }


        for (Integer i = 0;i<listaAlumnos.size();i++){

            alumno = listaAlumnos.get(i);

            if (alumno.getCodAlumno() == codigoAlumno){



               if (curso.agregarAlumno(alumno) == true){
                   System.out.println("Alumno Inscripto");
                   break;
               }else{
                   break;
               }





            }
        }



    }

    // METODO ASIGNAR PROFESOR
    public void asignarProfesores(Integer codigoCurso, Integer codigoProfesorTitular, Integer codigoProfesorAdjunto){

        Profesor profesorTitular = null;
        Profesor profesorAdjunto = null;
        Curso curso =  null;


        for (Integer i = 0;i<listaProfesores.size();i++){

            profesorTitular = listaProfesores.get(i);

            if (profesorTitular.getCodProfesor() == codigoProfesorTitular){

                System.out.println("Profesor Titular Encontrado");
                break;
            }

        }
        for (Integer i = 0;i<listaProfesores.size();i++){

            profesorAdjunto = listaProfesores.get(i);

            if (profesorTitular.getCodProfesor() == codigoProfesorAdjunto){

                System.out.println("Profesor Adjunto Encontrado");
                break;
            }

        }

        for (Integer i = 0;i<listaCursos.size();i++){

            curso = listaCursos.get(i);
            if (curso.getCodCurso() == codigoCurso ){
                //Casteo METER TRY CATCH
                curso.setProfesorTitular((ProfesorTitular) profesorTitular);
                curso.setProfesorAdjunto((ProfesorAdjunto) profesorAdjunto);
                System.out.println("Profesores Añadidos");






            }
        }



    }


}
