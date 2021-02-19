package examen1_joselagos;

import java.util.ArrayList;

/**
 *
 * @author Tony
 */
public class LoginClass {
    private String nombre, pasword;
    private ArrayList usuarios = new ArrayList();
    private ArrayList admin = new ArrayList();
    
    public LoginClass() {
    }
    
    public LoginClass(ArrayList usuarios, ArrayList admin){
        this.usuarios = usuarios;
        this.admin = admin;
    }
    
    public LoginClass(String nombre, String pasword) {
        this.nombre = nombre;
        this.pasword = pasword;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public ArrayList getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList getAdmin() {
        return admin;
    }

    public void setAdmin(ArrayList admin) {
        this.admin = admin;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
