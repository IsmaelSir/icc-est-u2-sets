package utils;
import java.util.Comparator;
import models.Contacto;

public class ContactoComparador implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        int comparacionApellido = c1.getApellido().compareTo(c2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }
        int comparacionNombre = c1.getNombre().compareTo(c2.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }
        return 0;
    }
}
