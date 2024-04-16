/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.producto.PlanCliente;
import core.producto.ProductoCliente;
import java.util.ArrayList;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Cliente extends Persona {
    
    private ArrayList<PlanCliente> planes;
    private ArrayList<ProductoCliente> productos;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        
        
    }
    
}
