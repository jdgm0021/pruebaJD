/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasgit;

/**
 *
 * @author Josedavid
 */
public class Prueba {
    String nombre;
    int daño;
    int vida;
    
    public Prueba(String n, int d, int v) {
        this.nombre = n;
        this.daño = d;
        this.vida = v;
    }
    
    public void Atacar(Prueba malo){
        System.out.println("caquita");
        malo.vida -= this.daño;
        System.out.println(malo.nombre + " ha recibido " + this.daño + " de daño.");
        if (malo.vida < 0) {
            malo.vida = 0;
        }
        System.out.println("A " + malo.nombre + " le quedan " + malo.vida + " de vida.");
    }
}
