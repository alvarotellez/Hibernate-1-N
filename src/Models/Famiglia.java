package Models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atellez
 */
@Entity
@Table(name = "Famiglias")
public class Famiglia implements Serializable{
    @Id

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "CiudadPrincipal")
    private String ciudadPrincipal;
    @Column(name = "Miembros")
    private int miembros;
    //IMPORTANTE PARA QUE GUARDE EN CASCADA LOS DATOS DE LOS DONS 
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "ID_Don")
    private Don don; 


    public Famiglia(){}
    
    public Famiglia(String nombre, String ciudadPrincipal, int miembros) {
        this.nombre = nombre;
        this.ciudadPrincipal = ciudadPrincipal;
        this.miembros = miembros;
    }
        public Famiglia(int ID, String nombre, String ciudadPrincipal, int miembros) {
        this.ID = ID;
        this.nombre = nombre;
        this.ciudadPrincipal = ciudadPrincipal;
        this.miembros = miembros;
    }
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadPrincipal() {
        return ciudadPrincipal;
    }

    public void setCiudadPrincipal(String ciudadPrincipal) {
        this.ciudadPrincipal = ciudadPrincipal;
    }

    public int getMiembros() {
        return miembros;
    }

    public void setMiembros(int miembros) {
        this.miembros = miembros;
    }

    public Don getDon() {
        return this.don;
    }

    public void setDon(Don don) {
        this.don = don;
        
    }    
}

    