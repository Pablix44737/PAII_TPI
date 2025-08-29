
package Clases;

public class Usuario{
    private String idUsuario;
    /*Capaz podriamos hacer que idUsuario sea int, para programarlo como 
    autoincremental -> static int idUsuario
    Entonces en el constructor de Usuario: idUsuario++*/
    
    private String nombre;
    private String apellido;
    private long DNI;
    private String correo;
    private String telefono;
    private String contraseña;
    private String estado;
    private String rol;
 
    public Usuario(String nombre, String apellido, long DNI, String correo, String telefono, String contraseña, String estado, String rol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
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
    
    public String getInfoBasica(){
        return "Usuario: " + getNombreYApellido() + " - DNI: " + DNI + " - Rol: " + rol;
    }
    
}


