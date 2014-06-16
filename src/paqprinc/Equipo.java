package paqprinc;


import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Equipo {
    @Id @GeneratedValue int id;
    String nombre;
    @ManyToMany(mappedBy="Equipos")
    Set<Torneo> Torneos;

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

    public Set<Torneo> getTorneos() {
        return Torneos;
    }

    public void setTorneos(Set<Torneo> Torneos) {
        this.Torneos = Torneos;
    }
    
    
    
}
