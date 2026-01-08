/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;

import java.util.concurrent.Semaphore;

/**
 *
 * @author gonza
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaphore semaforo = new Semaphore(4);
        
        for (int i = 1; i <= 9; i++){
            Cliente c = new Cliente(semaforo, "Cliente" + i);
            c.start();
        }
    }
    
}
