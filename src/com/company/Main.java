package com.company;

public class Main {

    public static void main(String[] args) {

        //CREO DIGITAL MANAGER
        DigitalManager digitalManager = new DigitalManager();


        //Creo ProfesorTitular
        digitalManager.altaProfesorTitular("Elsa","Pato",301,"Bugs");
        digitalManager.altaProfesorTitular("Aquiles","Bailo",342,"Interfaz");
        //Creo ProfesorAdjunto
        digitalManager.altaProfesorAdjunto("Elsa","Bandija",300,10);
        digitalManager.altaProfesorAdjunto("Elba","Surita",355,15);

        //Creo Curso 1
        digitalManager.altaCurso("Full Stack",20001,3);

        //Creo Curso 2
        digitalManager.altaCurso("Android",20002,2);

        //Asigno Profesores
        digitalManager.asignarProfesores(20001,301,300);
        digitalManager.asignarProfesores(20003,342,355);

        //Dado de alta 3 alumnos
        digitalManager.altaAlumno("Bob","Sponja",100);
        digitalManager.altaAlumno("Patricio","Estrella",101);
        digitalManager.altaAlumno("Don","Cangrejo",102);



        //Inscripcion 2 alumnos FullStack
        digitalManager.inscribirAlumno(100,20001);
        digitalManager.inscribirAlumno(101,20001);


        //Incripcion 3 alumnos Android

        digitalManager.inscribirAlumno(100,20002);
        digitalManager.inscribirAlumno(101,20002);
        digitalManager.inscribirAlumno(102,20002);


        //DAR DE BAJA A UN PROFESOR
        digitalManager.bajaProfesor(301);


        //DAR DE BAJA A UN CURSO
        digitalManager.bajaCurso(20001);




    }
}
