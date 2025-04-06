package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Alumno {
    public String nombre;
    public List<Materia> materiasAprobadas;
}