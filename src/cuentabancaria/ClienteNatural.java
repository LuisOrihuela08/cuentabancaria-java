/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author Luis Orihuela Orozco
 */
public class ClienteNatural extends Cliente{

    private String nombre;
    
    private String paterno;
    
    private String materno;

    public ClienteNatural(String direccion, String nombre, String paterno, String materno) {
        super(direccion);
        this.materno = materno;
        this.paterno = paterno;
        this.nombre = nombre;
    }

    public ClienteNatural() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }
              
    @Override
    public void LeerDatos() {
        System.out.println("- Nombre: " + nombre);
        System.out.println("- Apellido Paterno: " + paterno);
        System.out.println("- Apellido Materno: " + materno);
        System.out.println("- Dirección: " + getDireccion());
             
    }

    @Override
    public void EscribirDatos() {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos para el cliente natural
        System.out.println("\n");
        System.out.println("Ingrese los datos del Cliente Natural");
        System.out.print("- Dirección:");
        String direccionNatural = scanner.nextLine();
        System.out.print("- Nombre:");
        String nombreNatural = scanner.nextLine();
        System.out.print("- Apellido Paterno:");
        String paternoNatural = scanner.nextLine();
        System.out.print("- Apellido Materno:");
        String maternoNatural = scanner.nextLine();
        
        // Crear instancia de ClienteNatural con los datos proporcionados
        Cliente clienteNatural = new ClienteNatural(direccionNatural, nombreNatural, paternoNatural, maternoNatural);
        
          // Mostrar datos del cliente natural
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("Datos del Cliente Natural:");
        clienteNatural.LeerDatos();
    }      
}
