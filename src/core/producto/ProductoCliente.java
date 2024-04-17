/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import core.persona.Cliente;
import java.time.LocalDate;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class ProductoCliente extends Producto {
    
    private boolean estadoAprovado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso;

    public ProductoCliente(int id, String nombre, LocalDate fechaInicio, float valor) {
        super(id, nombre, fechaInicio, valor);
        
        
    }
    
    
    
}
