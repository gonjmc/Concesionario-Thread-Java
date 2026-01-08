/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

import java.util.concurrent.Semaphore;


/**
 *
 * @author gonza
 */
public class Cliente extends Thread {
    private Semaphore sem;
    private String nombre_cliente;
    
    public Cliente (Semaphore sem, String nombre_cliente){
        this.sem = sem;
        this.nombre_cliente = nombre_cliente;
        
    }

    @Override
    public void run() {
        
        try {
            System.out.println("Cliente "+nombre_cliente+ " está esperando a subirse a un coche");
            sem.acquire();
            int numero_vehiculo = (int) (Math.random()* 4)+1; //Para saber que vehículo le va a tocar
            System.out.println(nombre_cliente + "... probando vehículo... " + numero_vehiculo);
            Thread.sleep((long) Math.random() * 3000); //Simulación de tiempo
            System.out.println(nombre_cliente + "... terminó de probar el vehículo... " + numero_vehiculo);
            sem.release();
        } catch (InterruptedException ex) {
            
        }
    }
    
}
