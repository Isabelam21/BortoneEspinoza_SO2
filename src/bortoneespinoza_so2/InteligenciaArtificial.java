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
    public static String estado;
    public static int tiempo;

    public InteligenciaArtificial() {

        this.finalizado = false;
        this.estado = "Esperando";
    }

    //Procesar batalla
    public void procesarBatalla(Personaje zelda, Personaje streetFighter) {
        try {
            if (zelda == null || streetFighter == null) {
                System.out.println("GAME OVER");
                return;
            }
            Administrador.print_queues();
            System.out.println(" ");
            System.out.println("Personaje zelda: " + zelda.getId() + " " + zelda.getNombre());
            System.out.println("Personaje Street Fighter: " + streetFighter.getId() + " " + streetFighter.getNombre());
            this.estado = "Peleando";
            Thread.sleep(1000 * tiempo);
            Random random = new Random();
            double probabilidad = random.nextDouble();

            if (probabilidad <= 0.4) {
                // Ganador del combate
                Personaje ganador = determinarGanador(zelda, streetFighter);
                if (ganador != null) {
                    mostrarResultado(ganador, (ganador == zelda) ? streetFighter : zelda);
                }
                Administrador.desencolar_cola_actual(ganador);

            } else if (probabilidad <= 0.67) {
                System.out.println(" ");
                System.out.println("Empate en el combate.");
                Administrador.desencolar_cola_actual(zelda);
                Administrador.desencolar_cola_actual(streetFighter);
                Administrador.encolar_cola1(zelda);
                Administrador.encolar_cola1(streetFighter);

            } else {
                // No puede llevarse a cabo el combate
                System.out.println(" ");
                System.out.println("No se puede llevar a cabo el combate.");
                Administrador.desencolar_cola_actual(zelda);
                Administrador.desencolar_cola_actual(streetFighter);
                Administrador.encolar_refuerzo(zelda);
                Administrador.encolar_refuerzo(streetFighter);
            }
            this.finalizado = true;
            Administrador.actualizarColas(zelda, streetFighter);

            System.out.println();
            this.estado = "Final del combate";

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

            Administrador.desencolar_cola_actual(streetFighter);
            return zelda;
        } else if (puntajeStreetFighter > puntajeZelda) {

            Administrador.desencolar_cola_actual(zelda);
            return streetFighter;
        } else {
            // Los puntajes son iguales, usar Random para decidir el ganador 
            Random random = new Random();
            double probabilidadGanador = random.nextDouble();

            if (probabilidadGanador <= 0.5) {
                Administrador.desencolar_cola_actual(streetFighter);

                return zelda;
            } else {
                Administrador.desencolar_cola_actual(zelda);

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
        System.out.println(" ");
        System.out.println("RESULTADOS:");
        System.out.println(" ");
        System.out.println("Ganador: " + ganador.getId() + " " + ganador.getNombre());
        System.out.println("Perdedor: " + perdedor.getId() + " " + perdedor.getNombre());
    }
}
