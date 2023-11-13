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
public class Personaje {

    public int id;
    public int nivelPrioridad;
    public int habilidades;
    public int puntosVida;
    public int fuerza;
    public int agilidad;
    public int game; // 1 para Zelda y 2 para Street Fighter
    public int contador;

    public Personaje(int id) {
        this.id = id;
        asignarNivelPrioridad();
        asignarElementos();
        this.contador = 0;
    }

    public int asignarNivelPrioridad() {
        // Lógica basada en las habilidades adquiridas
        int totalHabilidades = habilidades + puntosVida + fuerza + agilidad;

        if (totalHabilidades >= 3) {
            this.nivelPrioridad = 1; // Prioridad alta
        } else if (totalHabilidades >= 2) {
            this.nivelPrioridad = 2; // Prioridad media
        } else {
            this.nivelPrioridad = 3; // Prioridad baja
        }
        return this.nivelPrioridad;
    }

    public void asignarElementos() {
        Random random = new Random();
        habilidades = (random.nextDouble() <= 0.6) ? 1 : 0;
        puntosVida = (random.nextDouble() <= 0.7) ? 1 : 0;
        fuerza = (random.nextDouble() <= 0.5) ? 1 : 0;
        agilidad = (random.nextDouble() <= 0.4) ? 1 : 0;
    }

    public void aumentarContador() {
        contador++;
        if (contador == 8 && nivelPrioridad != 1) {
            // Reiniciar contador y pasar al siguiente nivel de prioridad
            contador = 0;
            nivelPrioridad--;
        }
    }

    // Setters and getters
    public int getId() {
        return id;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public int getHabilidades() {
        return habilidades;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getGame() {
        return game;
    }

    public int getContador() {
        return contador;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public void setHabilidades(int habilidades) {
        this.habilidades = habilidades;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

}
