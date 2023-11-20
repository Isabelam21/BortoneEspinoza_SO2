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

    public String nombre;
    public int id;
    public int nivelPrioridad;
    public int habilidades;
    public int puntosVida;
    public int fuerza;
    public int agilidad;
    public int game; // 1 para Zelda y 2 para Street Fighter
    public int contador;
    public boolean hadoken;
    public boolean trifuerza;
    public int puntaje;
    public static final String[] ZELDA_NAMES = {"Link", "Lana", "Princess Zelda", "Midna", "Danuria"};
    public static final String[] STREET_FIGHTER_NAMES = {"Ryu", "Sagat", "Zangief", "Cammy", "Fei Long"};

    public Personaje(int id, int game, String name) {
        this.id = id;
        asignarNivelPrioridad();
        asignarElementos();
        asignarHabilidadEspecial();
        this.contador = 0;
        this.hadoken = false;
        this.trifuerza = false;
        this.game = game;
        this.nombre = name;

    }

    public static Personaje crear_personaje_zelda(int id) {
        String name = ZELDA_NAMES[new Random().nextInt(ZELDA_NAMES.length)];
        return new Personaje(id, 1, name);
    }

    public static Personaje crear_personaje_street(int id) {
        String name = STREET_FIGHTER_NAMES[new Random().nextInt(ZELDA_NAMES.length)];
        return new Personaje(id, 2, name);
    }

    public int asignarNivelPrioridad() {
        // Lógica basada en las probabilidades de calidad de cada elemento
        double probHabilidades = Math.random();
        double probPuntosVida = Math.random();
        double probFuerza = Math.random();
        double probAgilidad = Math.random();

        if (probHabilidades <= 0.6) {
            this.nivelPrioridad = 1; // Prioridad alta

        } else if (probHabilidades <= 0.7 && probPuntosVida <= 0.7) {
            this.nivelPrioridad = 2; // Prioridad media

        } else {
            this.nivelPrioridad = 3; // Prioridad baja

        }
        return this.nivelPrioridad;
    }

    public void asignarElementos() {

        double probHabilidades = Math.random();
        double probPuntosVida = Math.random();
        double probFuerza = Math.random();
        double probAgilidad = Math.random();
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

    public void asignarHabilidadEspecial() {
        Random random = new Random();
        double probabilidadHabilidadEspecial = random.nextDouble();

        // Habilidades especiales inspiradas en Zelda
        if (game == 1 && probabilidadHabilidadEspecial >= 0.3) { // Personaje de Zelda
            System.out.println("¡Habilidad Especial - Trifuerza de la Sabiduría!");
            trifuerza = true;
        } // Habilidades especiales inspiradas en Street Fighter
        else if (game == 2 && probabilidadHabilidadEspecial <= 0.2) { // Personaje de Street Fighter
            System.out.println("¡Habilidad Especial - Hadoken!");
            hadoken = true;
        }
    }

    // Setters and getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
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
