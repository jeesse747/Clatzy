/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.producto.Curso;
import java.util.ArrayList;


/**
 *
 * @author Carlos Ruidiaz M
 */
public class Instructor extends Persona {
    
    private ArrayList <Curso> cursos;

    public Instructor(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.cursos = new ArrayList<>();
        
    }

    
    
    
    
}
