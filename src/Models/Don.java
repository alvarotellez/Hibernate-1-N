package Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Dons")
public class Don implements Serializable {
    @Id
    @Column(name = "ID")
//   @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ID;
    @Column(name = "Nombre")
   private String nombre;
    @Column(name = "Apellidos")
    private String apellidos;
    @Column(name = "Apodo")
    private String apodo;
    @Column(name = "Procedencia")
    private String procedencia;
    //CONSTRUCTORES
    public Don(){}
    
    public Don(String nombre, String apellidos, String apodo, String procedencia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.apodo = apodo;
        this.procedencia = procedencia;
    }
        public Don(int ID, String nombre, String apellidos, String apodo, String procedencia) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.apodo = apodo;
        this.procedencia = procedencia;
    }
    
    
    //GETTERS Y SETTERS
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    
    
}