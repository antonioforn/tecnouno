package paqprinc;


import java.util.Set;
import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
                @JoinColumn(name="Id_Equipo", referencedColumnName="id")
        )
    Set<Equipo> Equipos;

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

    public Set<Equipo> getEquipos() {
        return Equipos;
    }

    public void setEquipos(Set<Equipo> eq) {
        this.Equipos=eq;
    }
        
}
