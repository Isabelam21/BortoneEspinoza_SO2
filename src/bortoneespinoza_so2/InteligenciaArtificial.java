/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bortoneespinoza_so2;

import java.util.Random;

/**
 *
 * @author isabe & giubo
 */
public class InteligenciaArtificial {

    public Queue ganadores;
    public Personaje personaje_zelda;
    public Personaje personaje_street;
    public boolean finalizado; // Variable booleana para saber si ya se termino el combate

    public InteligenciaArtificial() {
        Queue ganadores = new Queue("cola", 1);
        this.finalizado = false;
    }

    //Procesar batalla
    public void procesarBatalla(Personaje zelda, Personaje streetFighter) {
        try {
            Thread.sleep(100);
            Random random = new Random();
            double probabilidad = random.nextDouble();

            if (probabilidad <= 0.4) {
                // Ganador del combate
                Personaje ganador = determinarGanador(zelda, streetFighter);
                if (ganador != null) {
                    mostrarResultado(ganador, (ganador == zelda) ? streetFighter : zelda);
                    //Administrador.lista_ganadores();
                    //Administrador.eliminar();
                    ganadores.enqueue_last(ganador.getId());

                }

            } else if (probabilidad <= 0.67) {
                //Administrador.desencolar_cola_actual();
                //Administrador.encolar_cola1();

                System.out.println("Empate en el combate.");

            } else {
                // No puede llevarse a cabo el combate
                System.out.println("No se puede llevar a cabo el combate.");
                //Administrador.desencolar_cola_actual();
                //Administrador.encolar_refuerzo();
            }
            this.finalizado = true;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Logica para determinafr el ganador en base al puntaje
    public Personaje determinarGanador(Personaje zelda, Personaje streetFighter) {
        int puntajeZelda = calcularPuntaje(zelda);
        int puntajeStreetFighter = calcularPuntaje(streetFighter);

        // Comparación de puntajes para determinar el ganador
        if (puntajeZelda > puntajeStreetFighter) {
            return zelda;
        } else if (puntajeStreetFighter > puntajeZelda) {
            return streetFighter;
        } else {
            // Los puntajes son iguales, usar Random para decidir el ganador 
            Random random = new Random();
            double probabilidadGanador = random.nextDouble();

            if (probabilidadGanador <= 0.5) {
                return zelda;
            } else {
                return streetFighter;
            }

        }
    }

    public int calcularPuntaje(Personaje personaje) {
        if (personaje.hadoken || personaje.trifuerza) {
            return personaje.getHabilidades() + personaje.getPuntosVida()
                    + personaje.getFuerza() + personaje.getAgilidad() + 10;
        } else {
            return personaje.getHabilidades() + personaje.getPuntosVida()
                    + personaje.getFuerza() + personaje.getAgilidad();
        }
    }

    private void mostrarResultado(Personaje ganador, Personaje perdedor) {
        System.out.println("Ganador: " + ganador.getId());
        System.out.println("Perdedor: " + perdedor.getId());
    }
}
