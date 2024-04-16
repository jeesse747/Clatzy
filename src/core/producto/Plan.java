/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.producto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Carlos Ruidiaz M
 */
public class Plan extends Producto{
    
    private float valorMaximoCurso;
    private ArrayList<PlanCliente> planes;

    public Plan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso) {
        super(nombre, fechaInicio, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = new ArrayList<>();
        
        
        
    }
    
    public boolean addPlanCliente(PlanCliente plancliente){
        
        this.planes.add(plancliente);
        return true;
        
    }
    
    
}
