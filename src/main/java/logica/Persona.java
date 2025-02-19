 package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//Le indicamos que va a tener que crear una tabla por cada clase hija que tenga
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Persona implements Serializable {
    @Id
    //Hace que el id sea secuencial uno con otro
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setDni(String dni) {
        this.dni = dni;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDni() {
        return dni;
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

    public String getDireccion() {
        return direccion;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public Persona(int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
    }

    

    public Persona() {
    }
    
}
