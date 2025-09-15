package modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Provincia {
    private String nombre;
    Pais pais;
    private HashSet<Localidad> localidades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.localidades = new HashSet<>();
    }

}
