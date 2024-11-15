
package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia persis = new ControladoraPersistencia();
     
    
    public void crearUsuario(String nombreUsuario, String contrasenia, String rol){
        
        Usuario usu = new Usuario();
        usu.setNombreUsuario(nombreUsuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        persis.crearUsuario(usu);
    }

    public List<Usuario> getUsuarios() {
        
        return persis.getUsuarios();
        
    }

    public void borrarUsuario(int id) {
        
        persis.borrarUsuario(id);
    }

    public Usuario traerUsuario(int id) {
        return persis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        
        persis.editarUsuario(usu);
    }

    public boolean comprobarIngreso(String usuario, String contrasenia) {
        boolean ingreso = false;
        
        List<Usuario> listaUsuario = new ArrayList<Usuario>();
        listaUsuario = persis.getUsuarios();
        for(Usuario usu : listaUsuario){
            if(usu.getNombreUsuario().equals(usuario)){
                if (usu.getContrasenia().equals(contrasenia)){
                    ingreso = true;
                }
            }
        }
         return ingreso;
    }
       

    
}
