package utils;
import java.util.Comparator;
import models.Contacto;

public class ContactoComparador implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        //Comparamos los apellidos
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }
        //Si los apellidos son iguales, compara el nombre
        int comparacionNombre =  c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if(comparacionNombre != 0){
            return comparacionNombre;
        }
        //Si los apellidos y nombre son iguales, compara por el telefono
        return c1.getTelefono().compareTo(c2.getTelefono());
    }
}
