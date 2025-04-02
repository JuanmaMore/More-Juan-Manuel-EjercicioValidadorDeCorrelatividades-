package facultad;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter


public class Materia {
    public String nombre;
    public List<Materia> materiasCorrelativas;

    public List<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
