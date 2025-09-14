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
    private String nombre;
    private String razonSocial;
    private int cuit;
    private String logo;
    private HashSet<Sucursal> sucursales;

    public Empresa(String nombre, String razonSocial) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.sucursales = new HashSet<>();
    }


}
