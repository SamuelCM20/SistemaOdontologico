package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {
    
    
//    private int id_paciente;
    private Boolean tieneOS;
    private String tipoSangre;
   @OneToOne
    private Responsable unResponsable;
    @OneToMany(mappedBy="pacien")
    private List<Turno> listaTurnos;

    public Paciente(Boolean tieneOS, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tieneOS = tieneOS;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }

    

    
    public Responsable getUnResponsable() {
        return unResponsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setUnResponsable(Responsable unResponsable) {
        this.unResponsable = unResponsable;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    /*public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public void setTieneOS(Boolean tieneOS) {
        this.tieneOS = tieneOS;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    /*public int getId_paciente() {
        return id_paciente;
    }*/

    public Boolean getTieneOS() {
        return tieneOS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    
    public Paciente() {
    }
    
}
