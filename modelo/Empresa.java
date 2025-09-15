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

public class Empresa {
    private static int contador = 0;   // para autoincrementar
    private int id;
    private String nombre;
    private String razonSocial;
    private long cuit;
    private String logo;
    private HashSet<Sucursal> sucursales = new HashSet<>();

    public Empresa(String nombre, long cuit) {
        this.id = ++contador;
        this.nombre = nombre;
        this.cuit = cuit;
        this.sucursales = new HashSet<>();
    }
}
