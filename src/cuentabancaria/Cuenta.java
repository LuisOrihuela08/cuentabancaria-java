/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

import static cuentabancaria.CuentaBancaria.inicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Cuenta {

    private int nroCuenta;
    private String codCompletoCuenta;
    private Object Propietario;
    private int tipoCliente;
    private List<Agencia> agencia;
    private double saldo;

    public Cuenta(int nroCuenta, String codCompletoCuenta, Object Propietario, int tipoCliente, List<Agencia> agencia, double saldo) {
        this.nroCuenta = nroCuenta;
        this.codCompletoCuenta = codCompletoCuenta;
        this.Propietario = Propietario;
        this.tipoCliente = tipoCliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public String getCodCompletoCuenta() {
        return codCompletoCuenta;
    }

    public Object getPropietario() {
        return Propietario;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public List<Agencia> getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void AbrirCuenta() {
        System.out.println("Cuenta abierta correctamente.");
    }

   public void Abonar(double monto) {
    this.saldo += monto;
    System.out.println("Abono exitoso. Nuevo saldo: " + this.saldo);
}

public void Retirar(double monto) {
    if (monto <= this.saldo) {
        this.saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
    } else {
        System.out.println("Saldo insuficiente.");
    }
}

    public void VerSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public void EscribirDatosCuenta() {
        Scanner scanner = new Scanner(System.in);

        //Solicitar datos de la Cuenta
        System.out.println("\n");
        System.out.println("Ingrese los datos de la Cuenta");
        System.out.print("Número de cuenta: ");
        int numCuenta = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Código completo de cuenta: ");
        String codigoCuenta = scanner.nextLine();
        System.out.print("Propietario: ");
        String propietarioCuenta = scanner.nextLine();
        System.out.print("Tipo de cliente (Número): ");
        int tipoCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        // Solicitar datos de la agencia y crear una lista con ellos
        List<Agencia> agencias = new ArrayList<>();
        System.out.println("Ingrese los datos de la agencia (ingrese 'fin' para terminar): ");
        while (true) {
            System.out.print("Agencia: ");
            String nomAgencia = scanner.nextLine();
            if (nomAgencia.equals("fin")) {
                break;
            }
            Agencia agencia = new Agencia(nomAgencia); // Suponiendo que Agencia tiene un constructor que recibe el nombre
            agencias.add(agencia);
        }
        System.out.print("Saldo: ");
        double saldoCuenta = scanner.nextDouble();

        //Crear Instancia de la Cuenta con los datos proporcionados
        Cuenta cuenta = new Cuenta(numCuenta, codigoCuenta, propietarioCuenta, tipoCliente, agencias, saldoCuenta);

        //Mostrar datos de la Agencia
        System.out.println("-------------------------------");
        System.out.println("\n");
        System.out.println("Datos de la Cuenta:");
        cuenta.LeerDatos();
    }

    public void LeerDatos() {
        System.out.println("- Num. Cuenta: " + nroCuenta);
        System.out.println("- Codigo: " + codCompletoCuenta);
        System.out.println("- Propietario: " + Propietario);
        System.out.println("- Tipo de Cliente: " + tipoCliente);
        if (agencia != null && !agencia.isEmpty()) {
        for (int i = 0; i < agencia.size(); i++) {
            Agencia agenciaActual = agencia.get(i);
            System.out.print("- Agencia: " + agenciaActual.getNomAgencia());
            if (i < agencia.size() - 1) {
                System.out.print(", ");
            }
        }
    } else {
        System.out.print("N/A");
    }
    System.out.println();
        System.out.println("- Saldo de Cuenta: " + saldo);

    }

    public void inicioCuenta() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            menuCuenta();
            System.out.println("\n");
            System.out.print("\033[31mElija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    AbrirCuenta();
                    break;
                case 2:
                    Abonar(100.0);
                    break;
                case 3:
                    Retirar(50.0);
                    break;
                case 4:
                    VerSaldo();
                    break;
                case 5:
                    EscribirDatosCuenta();
                    break;
                case 6:
                    inicio();

                    break;
                default:
                    error();
            }

        } while (opcion != 6);
    }

    public static void menuCuenta() {
        System.out.println("\n");
        System.out.println("______________________________");
        System.out.println("\033[31m     *** SUB MENÚ CUENTA *** ");
        System.out.println("------------------------------");
        System.out.println("\033[34m1. Abrir Cuenta");
        System.out.println("\033[34m2. Abonar");
        System.out.println("\033[34m3. Retirar");
        System.out.println("\033[34m4. Ver Saldo");
        System.out.println("\033[34m5. Escribir Datos de la Cuenta");
        System.out.println("\033[34m6. Regresar al Menú Principal");
        System.out.println("Elige una opción [1-6]");
        System.out.println("______________________________");
    }

    public static void error() {
        System.out.println("\n\033[31m¡¡¡¡¡ ERROR, PETICIÓN INCORRECTO !!!!!");
    }

}
