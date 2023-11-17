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
    
    public void agregarPersonaje(int contador){
        //0.80
        //Random 1 o 2 
        //Como crear personajes con nombres distintos
}
    public static void desencolar_cola_actual(){
        //Desencolame
}
   public static void encolar_refuerzo(){
        ////En caso de no llevarse a cabo encolar a cada personaje en refuerzo enqueue_last
        // Y desencolar de su cola actual IMPORTANTE
} 
   public static void lista_ganadores(){
        //Agregar ganador a la lista e imprimir lista
} 
   public static void eliminar(Personaje perdedor){
        //desencolar al perdedor
        //dequeue en la empresa perdedora en la respectiva cola del personaje
        //If piratoso con el perdedor 
} 
   public static void encolar_cola1(){
        //En caso de empate encolar a cada personaje en su empresa nivel 1 enqueue_last
        // Y desencolar de su cola actual IMPORTANTE
}
   
}
