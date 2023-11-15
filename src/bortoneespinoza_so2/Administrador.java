/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bortoneespinoza_so2;

import java.util.Random;

public class Administrador {

    // Representa las colas de prioridad para Zelda y Street Fighter
    public Queue<Personaje> colaZeldaNivel1;
    public Queue<Personaje> colaZeldaNivel2;
    public Queue<Personaje> colaZeldaNivel3;
    public Queue<Personaje> colaZeldaNivel4; // cola refuerzo Zelda
    public int rondas;

    public Queue<Personaje> colaStreetFighterNivel1;
    public Queue<Personaje> colaStreetFighterNivel2;
    public Queue<Personaje> colaStreetFighterNivel3;
    public Queue<Personaje> colaStreetFighterNivel4; // cola refuerzo StreetFighter

    public Administrador() {
        // Inicializa las colas
        colaZeldaNivel1 = new Queue<>("ZeldaNivel1", 1);
        colaZeldaNivel2 = new Queue<>("ZeldaNivel2", 2);
        colaZeldaNivel3 = new Queue<>("ZeldaNivel3", 3);

        colaStreetFighterNivel1 = new Queue<>("StreetFighterNivel1", 1);
        colaStreetFighterNivel2 = new Queue<>("StreetFighterNivel2", 2);
        colaStreetFighterNivel3 = new Queue<>("StreetFighterNivel3", 3);
        
        this.rondas = 0;
    }
    
    public void actualizarColas(){
        rondas++;
        //Agregar al terminar logica lo de Por cada vez que se actualicen las colas, 
        //existe un 40% de probabilidades de que el primer personaje en esta cola salga, 
        //y sea colocado en la cola de prioridad 1.
    }
    
    public void agregarPersonaje(){
        
}
}
