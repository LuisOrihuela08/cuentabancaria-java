/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author Usuario
 */
public abstract class Cliente {
    
    private String direccion;

    public Cliente() {
    }
        
    public Cliente(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
        
    public abstract void LeerDatos();
            
    
    public abstract void EscribirDatos();
        
    
    
}
