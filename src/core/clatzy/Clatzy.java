/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.clatzy;

import core.persona.Cliente;
import core.persona.Instructor;
import core.producto.Curso;
import core.producto.Plan;
import java.time.LocalDate;
import java.util.ArrayList;



public class Clatzy {
    
    private ArrayList <Cliente> clientes;
    private ArrayList <Instructor> instructores;
    private ArrayList <Curso> cursos;
    private ArrayList <Plan> planes;
    
    public Clatzy() {
        
        this.clientes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this. instructores = new ArrayList<>();
        this.planes = new ArrayList<>();
        
    }
 
    public boolean addInstructor(String nombre, String cedula, String telefono, String email){
        Instructor instructor = new Instructor(nombre, cedula, telefono, email);
        this.instructores.add(instructor);
        return true;
        
    }
    
    public Instructor getInstructor(int index){
        return this.instructores.get(index);
        
    }
    
    public boolean addCurso(int id, String nombre, LocalDate fechaInicio,float valor,Instructor instructor){
        
        Curso curso = new Curso(id ,nombre, fechaInicio, valor, instructor);
        this.cursos.add(curso);
        return true;
        
    }
    
    
    
}
