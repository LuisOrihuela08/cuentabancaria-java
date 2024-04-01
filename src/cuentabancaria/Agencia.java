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
public class Agencia {

    private String nomAgencia;

    private String direccion;

    private int categoria;

    private int aforo;

    private String gerente;

    public Agencia(String nomAgencia, String direccion, int categoria, int aforo, String gerente) {
        this.nomAgencia = nomAgencia;
        this.direccion = direccion;
        this.categoria = categoria;
        this.aforo = aforo;
        this.gerente = gerente;
    }

    

    public Agencia() {

    }

    public String getNomAgencia() {
        return nomAgencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getAforo() {
        return aforo;
    }

    public String getGerente() {
        return gerente;
    }

    public void LeerDatos() {
        System.out.println("- Nombre: " + nomAgencia);
        System.out.println("- Dirección: " + direccion);
        System.out.println("- Categoria: " + categoria);
        System.out.println("- Aforo: " + aforo);
        System.out.println("- Gerente: " + gerente);

    }

    public void EscribirDatos() {
        Scanner scanner = new Scanner(System.in);

        //Solicitar datos de la Agencia
        System.out.println("\n");
        System.out.println("Ingrese los datos de la Agencia");
        System.out.print("- Nombre: ");
        String nombreAgencia = scanner.nextLine();
        System.out.print("- Dirección: ");
        String direccionAgencia = scanner.nextLine();
        System.out.print("- Categoria (Número): ");
        int categoriaAgencia = scanner.nextInt();
        System.out.print("- Aforo (Número): ");
        int aforoAgencia = scanner.nextInt();
        scanner.nextLine(); // C3onsumir el salto de línea pendiente
        System.out.print("- Gerente: ");
        String gerenteAgencia = scanner.nextLine();

        //Crear Instancia de Agencia con los datos proporcionados
        Agencia agencia = new Agencia(nombreAgencia,direccionAgencia,categoriaAgencia,aforoAgencia,gerenteAgencia);

        //Mostrar datos de la Agencia
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("Datos de la Agencia:");
        agencia.LeerDatos();

    }
}
