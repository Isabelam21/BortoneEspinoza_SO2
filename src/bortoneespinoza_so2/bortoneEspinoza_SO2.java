/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bortoneespinoza_so2;

/**
 *
 * @author isabe
 */
public class bortoneEspinoza_SO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue cola1 = new Queue("cola", 1);
        Personaje personaje1 = new Personaje(1);
        Personaje personaje2 = new Personaje(2);
        Personaje personaje3 = new Personaje(3);
        Personaje personaje4 = new Personaje(4);
        Personaje personaje5 = new Personaje(5);
        cola1.enqueue_last(personaje1.id);
        cola1.recorrer();
        System.out.println(personaje1.asignarNivelPrioridad());
        System.out.println(personaje2.asignarNivelPrioridad());
        System.out.println(personaje3.asignarNivelPrioridad());
        System.out.println(personaje4.asignarNivelPrioridad());
        System.out.println(personaje5.asignarNivelPrioridad());

    }

}
