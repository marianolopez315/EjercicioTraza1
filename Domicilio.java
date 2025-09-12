import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;
}
