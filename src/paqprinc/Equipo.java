package paqprinc;


import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Equipo {
    @Id @GeneratedValue int idEquipo;
    String nombre;
    @ManyToMany(mappedBy="Equipos")
    private List<Torneo> Torneos;

    public Equipo(String Nombre) {
        this.nombre = Nombre;
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public List<Torneo> getTorneos() {
        return Torneos;
    }

    public void setTorneos(List<Torneo> Torneos) {
        this.Torneos = Torneos;
    }

    
}
