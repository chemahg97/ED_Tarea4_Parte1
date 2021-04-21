/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Juan Gutiérrez","1300-2665-85-4433221144",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        System.out.println(cuenta1.getNombre());

        Opera(cuenta1, 0, 0);
        
    }

    
    public static void Opera(CCuenta cuenta1, float cantRetirar, float cantIngresar) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
