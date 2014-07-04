package paqprinc;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


/**
 *
 * @author AntonioForneron
 */
@Entity
public class Torneo {
    @Id
    @Column (name="nomTorneo")
    String nomTorneo;
        @ManyToMany
        @JoinTable(name="Torneo_Equipo", 
        joinColumns= 
                @JoinColumn(name="NombreTorneo", referencedColumnName="nomTorneo"),
        inverseJoinColumns=
                @JoinColumn(name="Id_Equipo", referencedColumnName="idEquipo")
        )
    private List<Equipo> Equipos= new ArrayList<Equipo>();

    public Torneo(String nomTorneo) {
        this.nomTorneo = nomTorneo;
    }

    public Torneo() {
    }

    public String getNomTorneo() {
        return nomTorneo;
    }

    public void setNomTorneo(String nomTorneo) {
        this.nomTorneo = nomTorneo;
    }

    public List<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(List<Equipo> Equipos) {
        this.Equipos = Equipos;
    }


        
}
