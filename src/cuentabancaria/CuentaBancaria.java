/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio() {
        ClienteNatural clienteNatural = new ClienteNatural();
        ClienteEmpresa clienteEmpresa = new ClienteEmpresa();
        Agencia agencia = new Agencia();
        Cuenta cuenta = new Cuenta();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            menu();
            System.out.println("\n");
            System.out.print("\033[31mElija una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    clienteNatural.EscribirDatos();
                    break;
                case 2:
                    clienteEmpresa.EscribirDatos();
                    break;
                case 3:
                    agencia.EscribirDatos();
                    break;
                case 4:
                    cuenta.inicioCuenta();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error();
            }

        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("\n");
        System.out.println("_________________________________");
        System.out.println("\033[31m    *** CUENTA BANCARIA *** ");
        System.out.println("---------------------------------");
        System.out.println("\033[34m1. Agregar Cliente Natural");
        System.out.println("\033[34m2. Agregar Cliente Empresa");
        System.out.println("\033[34m3. Agregar Agencia");
        System.out.println("\033[34m4. Cuenta");
        System.out.println("\033[34m5. Salir");
        System.out.println("Elige una opción [1-5]");
        System.out.println("_________________________________");
    }

    public static void error() {
        System.out.println("\n\033[31m¡¡¡¡¡ ERROR, PETICIÓN INCORRECTA !!!!!");
    }

    public static void salir() {
        System.out.println("\n\033[31mGracias por su visita");
    }
}
