import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;

    public Domicilio(String calle, Localidad localidad) {
        this.calle = calle;
        this.localidad = localidad;
    }

}
