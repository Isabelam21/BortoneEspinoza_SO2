/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bortoneespinoza_so2;

import static bortoneespinoza_so2.Interfaz.cola1_street;
import static bortoneespinoza_so2.Interfaz.cola1_zelda;
import static bortoneespinoza_so2.Interfaz.cola2_street;
import static bortoneespinoza_so2.Interfaz.cola2_zelda;
import static bortoneespinoza_so2.Interfaz.cola3_street;
import static bortoneespinoza_so2.Interfaz.cola3_zelda;
import static bortoneespinoza_so2.Interfaz.cola4_street;
import static bortoneespinoza_so2.Interfaz.cola4_zelda;

/**
 *
 * @author Giubo
 */
public class Queue<T> {

    public Node<T> pFirst;
    public Node<T> pLast;
    public static String name;
    public static int size;
    public static int priority;

    public Queue(String nombre, int priority) {
        this.pFirst = null;
        this.pLast = null;
        this.name = nombre;
        this.size = 0;
        this.priority = priority;
    }

    // Getters and setters
    public Node<T> getpFirst() {
        return pFirst;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getPriority() {
        return priority;
    }

    public Node<T> getpLast() {
        return pLast;
    }

    public void setpFirst(Node<T> pFirst) {
        this.pFirst = pFirst;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setpLast(Node<T> pLast) {
        this.pLast = pLast;
    }

    // Funciones
    public Node<T> last() {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> pAux;
            pAux = getpFirst();
            while (pAux.pnext != null) {
                pAux = next(pAux);
            }
            return pAux;
        }
    }

    public boolean isEmpty() {
        return pFirst == null;

    }

    public Node next(Node<T> pValor) {
        if (pValor != null) {
            pValor = pValor.pnext;
            return pValor;
        } else {
            return null;
        }
    }

    public void enqueue(T data_personaje, Node<T> pValor) {
        Node<T> pNew = new Node<T>(data_personaje);
        if (isEmpty()) {
            pFirst = pNew;

        } else {
            pNew.pnext = pValor.pnext;
            pValor.pnext = pNew;
            System.out.println(this.priority);
        }
        size++;
    }

    public T dequeue() {
        if (!isEmpty()) {
            Node<T> removedNode = pFirst;
            pFirst = pFirst.pnext;
            if (pFirst == null) {
                // Si se eliminó el último nodo, actualiza pLast a null
                pLast = null;
            }
            size--;

            return removedNode.getData(); // Devuelve el valor del nodo eliminado
        } else {
            System.out.println("cola vacia dequeue");
            return null; // O puedes lanzar una excepción o manejar de otra manera cuando la cola está vacía
        }
    }
    // Si se eliminó el último nodo, actualiza pLast a null

    public T peak() {
        if (!isEmpty()) {
            Node<Personaje> removedNode = (Node<Personaje>) pFirst;
            return (T) removedNode.getData();
        } else {
            System.out.println("Cola vacía para peak");
            return null; // O podrías lanzar una excepción aquí según tus necesidades.
        }
    }

    public void enqueue_last(T data_personaje) {
        Node<T> pNew = new Node<T>(data_personaje);
        if (isEmpty()) {
            // Si la cola está vacía, el nuevo nodo es tanto el primero como el último
            pFirst = pNew;
            pLast = pNew;
        } else {
            // Agrega el nuevo nodo al final de la cola y actualiza pLast
            pLast.pnext = pNew;
            pLast = pNew;
        }

        size++;
    }

    public String recorrer() {
        Node<Personaje> pAux;
        String resultado = "";
        if (isEmpty()) {
            resultado = " está vacía";
            System.out.println(resultado);

        } else {
            pAux = (Node<Personaje>) pFirst;
            while (pAux != null) {
                System.out.println(pAux.getData().getId() + " " + pAux.getData().getNombre());
                pAux = next((Node<T>) pAux);

            }
        }
        return resultado;
    }

    public String recorrer_imprimir() {
        Node<Personaje> pAux = (Node<Personaje>) pFirst;
        StringBuilder resultado = new StringBuilder();

        if (isEmpty()) {
            // No necesitas imprimir aquí, solo devuelve el resultado vacío
            return resultado.toString();
        } else {
            while (pAux != null) {
                resultado.append(pAux.getData().getId()).append(" ").append(pAux.getData().getNombre()).append(", ");
                pAux = pAux.pnext;
            }
        }

        return resultado.toString();
    }

    public String mostrar_cola_zelda() {
        Node<Personaje> pAux;
        String resultado = "";

        if (isEmpty()) {
            resultado = " está vacía";
            System.out.println(resultado);
        } else {
            pAux = (Node<Personaje>) pFirst;

            // Limpiar etiquetas de colas antes de mostrar las nuevas
            while (pAux != null) {
                // Añadir el elemento a la cola correspondiente
                int prioridad = pAux.getData().getNivelPrioridad();
                String info = pAux.getData().getId() + " " + pAux.getData().getNombre() + ",";

                switch (prioridad) {
                    case 1:
                        Interfaz.cola1_zelda.setText(cola1_zelda.getText() + info + " ");
                        break;
                    case 2:
                        Interfaz.cola2_zelda.setText(cola2_zelda.getText() + info + " ");
                        break;
                    case 3:

                        Interfaz.cola3_zelda.setText(cola3_zelda.getText() + info + " ");
                        break;
                    case 4:
                        Interfaz.cola4_zelda.setText(cola4_zelda.getText() + info + " ");
                        break;
                }

                pAux = next((Node<T>) pAux);
            }
        }

        return resultado;
    }

    public String mostrar_cola_street() {
        Node<Personaje> pAux;
        String resultado = "";

        if (isEmpty()) {
            resultado = " está vacía";
            System.out.println(resultado);
        } else {
            pAux = (Node<Personaje>) pFirst;

            // Limpiar etiquetas de colas antes de mostrar las nuevas
            while (pAux != null) {
                // Añadir el elemento a la cola correspondiente
                int prioridad = pAux.getData().getNivelPrioridad();
                String info = pAux.getData().getId() + " " + pAux.getData().getNombre() + ",";

                switch (prioridad) {
                    case 1:
                        Interfaz.cola1_street.setText(cola1_street.getText() + info + " ");
                        break;
                    case 2:
                        Interfaz.cola2_street.setText(cola2_street.getText() + info + " ");
                        break;
                    case 3:

                        Interfaz.cola3_street.setText(cola3_street.getText() + info + " ");
                        break;
                    case 4:
                        Interfaz.cola4_street.setText(cola4_street.getText() + info + " ");
                        break;
                }

                pAux = next((Node<T>) pAux);
            }
        }

        return resultado;
    }

}
