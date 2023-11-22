///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package bortoneespinoza_so2;
//
///**
// *
// * @author isabe
// */
//public class bortoneEspinoza_SO2 {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//
//        InteligenciaArtificial IA = new InteligenciaArtificial();
//        Administrador admin = new Administrador();
//
//        for (int a = 0; a < 20; a++) {
//            Personaje personaje_zelda = Personaje.crear_personaje_zelda(Administrador.contId_zelda);
//            Administrador.contId_zelda++;
//            Administrador.encolarEnSuPrioridad(personaje_zelda);
//        }
//
//        for (int b = 0; b < 20; b++) {
//            Personaje personaje_street = Personaje.crear_personaje_street(Administrador.contId_street);
//            Administrador.contId_street++;
//            Administrador.encolarEnSuPrioridad(personaje_street);
//
//        }
//
//        for (int rondas = 0; rondas < 100; rondas++) {
//            if (Administrador.fin) {
//                break;
//            }
//            System.out.println("----- RONDA" + rondas + "------");
//            Personaje personaje_zelda = Administrador.obtenerPersonajeZelda();
//            Personaje personaje_street = Administrador.obtenerPersonajeStreet();
//            IA.procesarBatalla(personaje_zelda, personaje_street);
//
//        }
//    }
//
//}
