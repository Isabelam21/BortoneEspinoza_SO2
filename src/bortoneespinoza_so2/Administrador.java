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
    public static int contId_street;
    public static int contId_zelda;
    public static int contador; // Para contador de rondas

    public static Queue<Personaje> colaStreetFighterNivel1;
    public static Queue<Personaje> colaStreetFighterNivel2;
    public static Queue<Personaje> colaStreetFighterNivel3;
    public static Queue<Personaje> colaStreetFighterNivel4; // cola refuerzo StreetFighter

    public Administrador() {
        // Inicializa las colas
        colaZeldaNivel1 = new Queue<>("ZeldaNivel1", 1);
        colaZeldaNivel2 = new Queue<>("ZeldaNivel2", 2);
        colaZeldaNivel3 = new Queue<>("ZeldaNivel3", 3);
        colaZeldaNivel4 = new Queue<>("ZeldaNivel4", 4);

        colaStreetFighterNivel1 = new Queue<>("StreetFighterNivel1", 1);
        colaStreetFighterNivel2 = new Queue<>("StreetFighterNivel2", 2);
        colaStreetFighterNivel3 = new Queue<>("StreetFighterNivel3", 3);
        colaStreetFighterNivel4 = new Queue<>("StreetFighterNivel4", 4);

        this.contId_street = 0;
        this.contId_street = 100;
        this.rondas = 0;
        this.contador = 0;

    }

    public static void actualizarColas(Personaje zelda, Personaje street) {
        InteligenciaArtificial.estado = "Esperando";
        System.out.println(" ");
        System.out.println("ACTUALIZACION COLAS");
        Random random = new Random();
        double probabilidadrefuerzo = random.nextDouble();

        rondas++;
        contador++;

        if (contador == 2) {
            contador = 0;
            agregarPersonaje();

        } else if (probabilidadrefuerzo <= 0.40) {
            
            System.out.println("Para efectos del refuerzo");
            // Para el personaje de zelda

            desencolar_cola_actual(zelda);
            zelda.setNivelPrioridad(1);
            encolarEnSuPrioridad(zelda);

            //Para el personaje de Street Fighter
            desencolar_cola_actual(street);
            street.setNivelPrioridad(1);
            encolarEnSuPrioridad(street);
            Administrador.print_queues();
            
            

        }
    }

    public static void print_queues() {
        System.out.println(" ");
        System.out.println("--COLAS ZELDA--");
        System.out.println("Queue 1: " + colaZeldaNivel1.recorrer_imprimir());
        System.out.println("Queue 2: " + colaZeldaNivel2.recorrer_imprimir());
        System.out.println("Queue 3: " + colaZeldaNivel3.recorrer_imprimir());
        System.out.println("Queue 4: " + colaZeldaNivel4.recorrer_imprimir());
        System.out.println(" ");
        System.out.println("-- COLAS STREET FIGHTER --");
        System.out.println("Queue 1: " + colaStreetFighterNivel1.recorrer_imprimir());
        System.out.println("Queue 2: " + colaStreetFighterNivel2.recorrer_imprimir());
        System.out.println("Queue 3: " + colaStreetFighterNivel3.recorrer_imprimir());
        System.out.println("Queue 4: " + colaStreetFighterNivel4.recorrer_imprimir());
    }

    public static void recorrer_cola(Queue cola) {
        cola.recorrer();
    }

    public static void encolarEnSuPrioridad(Personaje personaje) {
        if (personaje.game == 1) {
            if (personaje.getNivelPrioridad() == 1) {

                //Encolar en prioridad 1
                colaZeldaNivel1.enqueue_last(personaje);
            } else if (personaje.nivelPrioridad == 2) {
                //Encolar en prioridad 2
                colaZeldaNivel2.enqueue_last(personaje);

            } else {
                //Encolar en prioridad 3 
                colaZeldaNivel3.enqueue_last(personaje);

            }
        } else {
            if (personaje.getNivelPrioridad() == 1) {
                //Encolar en prioridad 1
                colaStreetFighterNivel1.enqueue_last(personaje);

            } else if (personaje.getNivelPrioridad() == 2) {
                //Encolar en prioridad 2
                colaStreetFighterNivel2.enqueue_last(personaje);

            } else {
                //Encolar en prioridad 3
                colaStreetFighterNivel3.enqueue_last(personaje);

            }
        }
    }

    public static Personaje desencolar_cola_actual(Personaje personaje) {
        // Desencolar de la respectiva cola
        Personaje personajeDesencolado = null;

        if (personaje.game == 1) {
            if (personaje.getNivelPrioridad() == 1) {
                // Desencolar de prioridad 1

                personajeDesencolado = colaZeldaNivel1.dequeue();
            } else if (personaje.nivelPrioridad == 2) {
                // Desencolar de prioridad 2

                personajeDesencolado = colaZeldaNivel2.dequeue();
            } else if (personaje.nivelPrioridad == 3) {
                // Desencolar de prioridad 3

                personajeDesencolado = colaZeldaNivel3.dequeue();
            } else {
                // Desencolar de prioridad 4

                personajeDesencolado = colaZeldaNivel4.dequeue();
            }
        } else {
            if (personaje.getNivelPrioridad() == 1) {
                // Desencolar de prioridad 1

                personajeDesencolado = colaStreetFighterNivel1.dequeue();
            } else if (personaje.getNivelPrioridad() == 2) {
                // Desencolar de prioridad 2

                personajeDesencolado = colaStreetFighterNivel2.dequeue();
            } else if (personaje.getNivelPrioridad() == 3) {
                // Desencolar de prioridad 3

                personajeDesencolado = colaStreetFighterNivel3.dequeue();
            } else {
                // Desencolar de prioridad 4

                personajeDesencolado = colaStreetFighterNivel4.dequeue();
            }
        }

        return personajeDesencolado;
    }

    public static Personaje obtenerPersonajeZelda() {
        // Intentar obtener un personaje de prioridad 1
        Personaje personaje = colaZeldaNivel1.peak();

        // Si no hay personajes de prioridad 1, intentar con prioridad 2
        if (personaje == null) {
            personaje = colaZeldaNivel2.peak();
        }

        // Si aún no se ha obtenido un personaje, intentar con prioridad 3
        if (personaje == null) {
            personaje = colaZeldaNivel3.peak();
        }
        return personaje;
    }

    public static Personaje obtenerPersonajeStreet() {
        // Intentar obtener un personaje de prioridad 1
        Personaje personaje = colaStreetFighterNivel1.peak();

        // Si no hay personajes de prioridad 1, intentar con prioridad 2
        if (personaje == null) {
            personaje = colaStreetFighterNivel2.peak();
        }

        // Si aún no se ha obtenido un personaje, intentar con prioridad 3
        if (personaje == null) {
            personaje = colaStreetFighterNivel3.peak();
        }
        return personaje;
    }

    public static void agregarPersonaje() {

        System.out.println("Se agrego un personaje");
        //public void agregarPersonaje(int contador){
        //0.80
        //Random 1 o 2 
        //Como crear personajes con nombres distintos
        Random random = new Random();
        double probabilidadGanador = random.nextDouble();

        if (probabilidadGanador <= 0.8) {
            // Crear un objeto de la clase Random
            Random random1 = new Random();

            // Generar un número aleatorio entre 1 y 2 (ambos inclusive)
            int numeroAleatorio = random1.nextInt(2) + 1;
            //System.out.println("Numero: "+ numeroAleatorio);

            //String personaje = new String("personaje"+id);
            if (numeroAleatorio == 1) {
                Personaje personaje = Personaje.crear_personaje_zelda(contId_zelda);
                contId_zelda++;
                encolarEnSuPrioridad(personaje);
            } else {
                Personaje personaje = Personaje.crear_personaje_street(contId_street);
                contId_street++;
                encolarEnSuPrioridad(personaje);

            }

            //ENCOLAR EL PERSONAJE
            //++1 cada vez que se crea un personaje
        } else {
            System.out.println("No cayó en el 80%");
        }
    }

    public static void encolar_refuerzo(Personaje personaje) {
        //setear nivel de prioridad
        System.out.println("Pa la cola de refuerzo");
        personaje.setNivelPrioridad(4);
        if (personaje.game == 1) {
            //Encolar en prioridad 1
            colaZeldaNivel4.enqueue_last(personaje);

        } else {
            colaStreetFighterNivel4.enqueue_last(personaje);
        }

    }

    public static void lista_ganadores() {
        //Agregar ganador a la lista e imprimir lista
    }

    public static void encolar_cola1(Personaje personaje) {
        //En caso de empate encolar a cada personaje en su empresa nivel 1 
        //setear nivel de prioridad
        personaje.setNivelPrioridad(1);
        encolarEnSuPrioridad(personaje);
    }

}
