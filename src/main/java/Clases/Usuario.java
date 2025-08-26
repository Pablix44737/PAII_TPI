
package Clases;

public class Usuario{
    String idUsuario;
    /*Capaz podriamos hacer que idUsuario sea int, para programarlo como 
    autoincremental -> static int idUsuario
    Entonces en el constructor de Usuario: idUsuario++*/
    
    String nombre;
    String apellido;
    long dni;
    String correo;
    String telefono;
    String contraseña;
    String estado;
    String rol;

    public Usuario(String nombre, String apellido, long dni, String correo, String telefono, String contraseña, String estado, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.estado = estado;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreYApellido() {
        return nombre + " " + apellido;
    }

    
    
}
