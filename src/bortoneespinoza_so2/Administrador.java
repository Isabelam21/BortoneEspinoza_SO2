/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bortoneespinoza_so2;

import java.util.Random;

public class Administrador {

    // Representa las colas de prioridad para Zelda y Street Fighter
    public static Queue<Personaje> colaZeldaNivel1;
    public static Queue<Personaje> colaZeldaNivel2;
    public static Queue<Personaje> colaZeldaNivel3;
    public static Queue<Personaje> colaZeldaNivel4; // cola refuerzo Zelda
    public static int rondas;
    public static int contId;

    public static Queue<Personaje> colaStreetFighterNivel1;
    public static Queue<Personaje> colaStreetFighterNivel2;
    public static Queue<Personaje> colaStreetFighterNivel3;
    public static Queue<Personaje> colaStreetFighterNivel4; // cola refuerzo StreetFighter

    public Administrador() {
        // Inicializa las colas
        colaZeldaNivel1 = new Queue<>("ZeldaNivel1", 1);
        colaZeldaNivel2 = new Queue<>("ZeldaNivel2", 2);
        colaZeldaNivel3 = new Queue<>("ZeldaNivel3", 3);

        colaStreetFighterNivel1 = new Queue<>("StreetFighterNivel1", 1);
        colaStreetFighterNivel2 = new Queue<>("StreetFighterNivel2", 2);
        colaStreetFighterNivel3 = new Queue<>("StreetFighterNivel3", 3);
        
        this.contId = 21;
        this.rondas = 0;
    }
    
    public void actualizarColas(){
        rondas++;
        //Agregar al terminar logica lo de Por cada vez que se actualicen las colas, 
        //existe un 40% de probabilidades de que el primer personaje en esta cola salga, 
        //y sea colocado en la cola de prioridad 1.
    }
    
    public static void encolarEnSuPrioridad(Personaje personaje){
        if (personaje.game==1){
            if (personaje.getNivelPrioridad() ==1){
                //Encolar en prioridad 1
                colaZeldaNivel1.enqueue_last(personaje);
            }else if(personaje.nivelPrioridad ==2){
                //Encolar en prioridad 2
                colaZeldaNivel2.enqueue_last(personaje);
            }else{
                //Encolar en prioridad 3 
                colaZeldaNivel3.enqueue_last(personaje);
            }
        }else{
            if (personaje.getNivelPrioridad() ==1){
                //Encolar en prioridad 1
                colaStreetFighterNivel1.enqueue_last(personaje);
                
            }else if(personaje.getNivelPrioridad() ==2){
                //Encolar en prioridad 2
                colaStreetFighterNivel2.enqueue_last(personaje);
            }else{
                //Encolar en prioridad 3
                colaStreetFighterNivel3.enqueue_last(personaje);
            }
        }
    }
    
    public static void desencolar_cola_actual(Personaje personaje){
        //dequeue en la respectiva cola
        if (personaje.game==1){
            if (personaje.getNivelPrioridad() ==1){
                //Encolar en prioridad 1
                colaZeldaNivel1.dequeue();
            }else if(personaje.nivelPrioridad ==2){
                //Encolar en prioridad 2
                colaZeldaNivel2.dequeue();
            }else{
                //Encolar en prioridad 3 
                colaZeldaNivel3.dequeue();
            }
        }else{
            if (personaje.getNivelPrioridad() ==1){
                //Encolar en prioridad 1
                colaStreetFighterNivel1.dequeue();
                
            }else if(personaje.getNivelPrioridad() ==2){
                //Encolar en prioridad 2
                colaStreetFighterNivel2.dequeue();
            }else{
                //Encolar en prioridad 3
                colaStreetFighterNivel3.dequeue();
            }
        }
        
}
    
    public void agregarPersonaje(){
    //public void agregarPersonaje(int contador){
        //0.80
        //Random 1 o 2 
        //Como crear personajes con nombres distintos
        Random random = new Random();
        double probabilidadGanador = random.nextDouble();
        
        if (probabilidadGanador <= 0.8){
            // Crear un objeto de la clase Random
            Random random1= new Random();

            // Generar un número aleatorio entre 1 y 2 (ambos inclusive)
            int numeroAleatorio = random1.nextInt(2) + 1;
            //System.out.println("Numero: "+ numeroAleatorio);

            //String personaje = new String("personaje"+id);
            Personaje personaje = new Personaje(contId,numeroAleatorio);
            //ENCOLAR EL PERSONAJE
            encolarEnSuPrioridad(personaje);
            this.contId++; //++1 cada vez que se crea un personaje
            
            
            
            
        }else{
            System.out.println("No cayó en el 80%");
    }
 }
    
   public static void encolar_refuerzo(Personaje personaje){
        //setear nivel de prioridad
        personaje.setNivelPrioridad(4);
        if (personaje.game==1){
            //Encolar en prioridad 1
            colaZeldaNivel4.enqueue_last(personaje);
            
        }else{
            colaStreetFighterNivel4.enqueue_last(personaje);
        }
        
} 
   public static void lista_ganadores(){
        //Agregar ganador a la lista e imprimir lista
} 
   public static void eliminar(Personaje personaje){
        //desencolar al perdedor desencolar_cola_actual()
        desencolar_cola_actual(personaje);
        
} 
   public static void encolar_cola1(Personaje personaje){
        //En caso de empate encolar a cada personaje en su empresa nivel 1 
        //setear nivel de prioridad
        personaje.setNivelPrioridad(1);
        encolarEnSuPrioridad(personaje);
}
   
}
