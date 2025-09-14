import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashSet;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder



public class Pais {
    private String nombre;
    private HashSet<Provincia>provincias;


    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new HashSet<>();
    }

}
