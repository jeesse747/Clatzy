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
    
    public boolean addPlan(String nombre, LocalDate fechaInicio, float valor, float valorMaximoCurso){
        
        this.planes.add(new Plan(nombre, fechaInicio,valor,valorMaximoCurso));
        return true;
    }
    
    public boolean addCliente( String nombre, String cedula, String telefono, String email ){
        Cliente cliente = new Cliente(nombre, cedula, telefono, email);
        this.clientes.add(cliente);
        return true;
        
    }
    
    public Cliente getCliente(int index){
        return this.clientes.get(index);
    }
    
    public Plan getPlan(int index){
        return this.planes.get(index);
    }
    
    public boolean comprarPlan(Cliente cliente, Plan plan, LocalDate date){
        if(!cliente.hasplanactivo()){
            
        }
        
        return true;
        
    }
    
    public Curso getCurso(int index){
        return this.cursos.get(index);
        
        
    }
    
    
}
