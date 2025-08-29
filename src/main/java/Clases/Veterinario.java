
package Clases;

public class Veterinario extends Usuario{
    private int matricula;

    public Veterinario(int matricula, String nombre, String apellido, long DNI, String correo, String telefono, String contraseña, String estado, String rol) {
        super(nombre, apellido, DNI, correo, telefono, contraseña, estado, rol);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
