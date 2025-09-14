import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Localidad {
    private String nombre;
    private Provincia provincia;
    private HashSet<Domicilio> domicilios;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.domicilios = new HashSet<>();
    }

}
