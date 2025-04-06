package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Inscripcion {
    public List<Materia> asignaturasPropuestas;
    public Alumno alumno;

    public boolean aprobada() {
        for (Materia materia : asignaturasPropuestas) {
            for (Materia correlativa : materia.getMateriasCorrelativas()) {
                if (!alumno.getMateriasAprobadas().contains(correlativa)) {
                    return false;
                }
            }
        }
        return true;
    }

}
