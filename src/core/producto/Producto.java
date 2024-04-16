/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import java.time.LocalDate;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Producto {
    
    protected int id;
    protected String nombre;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected boolean estadoActivo;
    protected float valor;

    public Producto(int id, String nombre, LocalDate fechaInicio, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.valor = valor;
        this.fechaFin = null;
        this.estadoActivo = false;
    }

    public Producto(String nombre, LocalDate fechaInicio, float valor) {
        
        this.id = 0;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = null;
        this.valor = valor;
        this.estadoActivo = false;
        
    }
    
    
    
    
    
    
}
