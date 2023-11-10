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
public class Personaje {
    private int id;
    private int nivelPrioridad;
    private int habilidades;
    private int puntosVida;
    private int fuerza;
    private int agilidad;

    public Personaje(int id) {
        this.id = id;
        asignarNivelPrioridad();
        asignarElementos();
    }

    private void asignarNivelPrioridad() {
        // Implementa lógica para asignar nivel de prioridad según las reglas dadas.
    }

    private void asignarElementos() {
        Random random = new Random();
        habilidades = (random.nextDouble() <= 0.6) ? 1 : 0;
        puntosVida = (random.nextDouble() <= 0.7) ? 1 : 0;
        fuerza = (random.nextDouble() <= 0.5) ? 1 : 0;
        agilidad = (random.nextDouble() <= 0.4) ? 1 : 0;
    }

    // Agrega getters y setters según sea necesario
}