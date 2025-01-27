package models;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Contacto{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)//referencia de memoria
        return true;
        if (obj == null)// obj es null
        return false;
        if(getClass() != obj.getClass())
        return false;
        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre)
        && apellido.equals(other.apellido);
    }
    @Override
    public int hashCode() {
        //Por simplicidad, combinamos los hash de nombre y apellido
        return nombre.hashCode() + apellido.hashCode();
    }
}
