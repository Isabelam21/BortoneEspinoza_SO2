/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bortoneespinoza_so2;
import java.util.Random;
/**
 *
 * @author isabe
 */
public class InteligenciaArtificial {
    //cola ganadores prioridad mas alta ;

    public InteligenciaArtificial() {
       Queue ganadores = new Queue("cola", 1);
    }

    public void procesarBatalla(Personaje zelda, Personaje streetFighter) {
        Random random = new Random();
        double probabilidad = random.nextDouble();

        if (probabilidad <= 0.4) {
            // Ganador del combate
            mostrarResultado(zelda, streetFighter);
            //ganadores.enqueue(); REVISAR
        } else if (probabilidad <= 0.67) {
            // Empate
            System.out.println("Empate en el combate.");
        } else {
            // No puede llevarse a cabo el combate
            System.out.println("No se puede llevar a cabo el combate.");
        }
    }

    private void mostrarResultado(Personaje ganador, Personaje perdedor) {
        System.out.println("Ganador: " + ganador.getId());
        System.out.println("Perdedor: " + perdedor.getId());
    }
}

