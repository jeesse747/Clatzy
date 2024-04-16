/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import core.persona.Instructor;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Curso extends Producto {
    
    private ArrayList <Instructor> instructores;
    private ArrayList <ProductoCliente> productosCliente;

    public Curso(int id, String nombre, LocalDate fechaInicio, float valor, Instructor instructor) {
        super(id, nombre, fechaInicio, valor);
        
    }
    
    
    
}
