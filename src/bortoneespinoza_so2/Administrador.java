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
    }
    
    public void inicializarPersonajes(){
        
    }
//    public void realizarBatallas() {
//        // Realiza las batallas según la descripción del proyecto
//        // ...
//
//        // Después de las batallas, actualiza las colas
//        actualizarColas();
//
//        // Indica a la Inteligencia Artificial que puede empezar a trabajar nuevamente
//        // (en este punto, puedes realizar otras acciones necesarias)
//        // ...
//    }

//    private void actualizarColas() {
//        Random random = new Random();
//
//        // Cada dos ciclos de revisión, agrega un nuevo personaje de cada juego a la cola correspondiente
//        if (random.nextDouble() <= 0.8) {
//            colaZeldaNivel1.enqueue_last(crearNuevoPersonaje(1));
//            colaStreetFighterNivel1.enqueue_last(crearNuevoPersonaje(2));
//        }
//
//        if (random.nextDouble() <= 0.8) {
//            colaZeldaNivel2.enqueue_last(crearNuevoPersonaje(1));
//            colaStreetFighterNivel2.enqueue_last(crearNuevoPersonaje(2));
//        }
//
//        if (random.nextDouble() <= 0.8) {
//            colaZeldaNivel3.enqueue_last(crearNuevoPersonaje(1));
//            colaStreetFighterNivel3.enqueue_last(crearNuevoPersonaje(2));
//        }
//    }
//
//    private Personaje crearNuevoPersonaje(int game) {
//        // Crea un nuevo personaje con un ID único
//        Personaje nuevoPersonaje = new Personaje(generarIdUnico());
//        nuevoPersonaje.setGame(game);
//        return nuevoPersonaje;
//    }
//
////    private int generarIdUnico() {
////        // Implementa la lógica para generar un ID único
////        // Puede ser un contador, un UUID, o cualquier método que asegure la unicidad
////        // Por simplicidad, se puede implementar un contador en esta versión
////    }
//}
//
//
}
