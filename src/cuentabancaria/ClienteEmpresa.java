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
public class ClienteEmpresa extends Cliente{
    
    private String ruc;
    
    private String razSocial;

    public ClienteEmpresa(String direccion, String ruc, String razSocial) {
        super(direccion);
        this.razSocial = razSocial;
        this.ruc = ruc;
    }

    public ClienteEmpresa() {
    }
    
    
  
    public String getRuc() {
        return ruc;
    }

    public String getRazSocial() {
        return razSocial;
    }

       

    @Override
    public void LeerDatos() {
        System.out.println("- RUC: " + ruc);
        System.out.println("- Razón social: " + razSocial);
        System.out.println("- Dirección: " + getDireccion());
    }

    @Override
    public void EscribirDatos() {
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos para el cliente empresa
        System.out.println("\n");
        System.out.println("Ingrese los datos del Cliente Empresa");
        System.out.print("- Dirección:");
        String direccionEmpresa = scanner.nextLine();
        System.out.print("- RUC:");
        String rucEmpresa = scanner.nextLine();
        System.out.print("- Razón Social:");
        String razSocialEmpresa = scanner.nextLine();
        
        // Crear instancia de ClienteEmpresa con los datos proporcionados
        Cliente clienteEmpresa = new ClienteEmpresa(direccionEmpresa, rucEmpresa, razSocialEmpresa);

       
        
        // Mostrar datos del cliente empresa
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("Datos del Cliente Empresa:");
        clienteEmpresa.LeerDatos();
      
    }         
}
