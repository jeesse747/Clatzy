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
public class PlanCliente extends Producto{
 
    private Cliente cliente;
    private Plan plan;

    public PlanCliente(String nombre, LocalDate fechaInicio, int valor, Plan plan, Cliente cliente) {
        super(nombre, fechaInicio,valor);
        this.cliente = cliente;
        this.plan = plan;
        
        this.cliente.addPlan(this);
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
    
    
    
    
    
}
