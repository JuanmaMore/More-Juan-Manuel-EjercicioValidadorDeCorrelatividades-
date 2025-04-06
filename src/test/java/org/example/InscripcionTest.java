package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionAprobadaTest {

    @Test
    @DisplayName("Test de aprobar inscripción con correlativas aprobadas, deberia aprobar")
    public void testInscripcionAprobadaConCorrelativasOK() {
        //materias
        Materia am1 = new Materia();
        am1.setNombre("AM1");
        am1.setMateriasCorrelativas(Collections.emptyList());

        Materia am2 = new Materia();
        am2.setNombre("AM2");
        am2.setMateriasCorrelativas(Arrays.asList(am1));

        //alumno con am1 ok
        Alumno alumno = new Alumno();
        alumno.setNombre("PEPITA");
        alumno.setMateriasAprobadas(Arrays.asList(am1));

        // a AM2
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setAsignaturasPropuestas(Arrays.asList(am2));

        assertTrue(inscripcion.aprobada());
    }
}

class InscripcionNoAprobadaTest {
    @Test
    @DisplayName("Test de aprobar inscripción sin correlativas aprobadas no deberia aprobar")
    public void testInscripcionAprobadaSinCorrelativas() {
        //materias
        Materia am1 = new Materia();
        am1.setNombre("AM1");
        am1.setMateriasCorrelativas(Collections.emptyList());

        Materia am2 = new Materia();
        am2.setNombre("AM2");
        am2.setMateriasCorrelativas(Arrays.asList(am1));

        //alumno con am1 ok
        Alumno alumno = new Alumno();
        alumno.setNombre("PEPITA");
        alumno.setMateriasAprobadas(Collections.emptyList());


        // a AM2
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setAsignaturasPropuestas(Arrays.asList(am2));

        assertFalse(inscripcion.aprobada());
    }
}