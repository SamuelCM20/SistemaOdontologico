
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona implements Serializable{
    
   // private int id_responsable;
    private String tipoResp;

   /* public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }*/

    public void setTipoResp(String tipoResp) {
        this.tipoResp = tipoResp;
    }

    /*public int getId_responsable() {
        return id_responsable;
    }*/

    public String getTipoResp() {
        return tipoResp;
    }

    public Responsable(String tipoResp, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoResp = tipoResp;
    }

    

   

    public Responsable() {
    }
    
}
