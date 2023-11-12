/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bortoneespinoza_so2;
/**
 *
 * @author Giubo
 */
public class Queue<T> {

    public Node<T> pFirst;
    public Node<T> pLast;
    public String name;
    public int size;
    public int priority;

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
        }
        size++;
    }

    public Node<T> dequeue() {
        if (!isEmpty()) {
            Node<T> removedNode = pFirst;
            pFirst = pFirst.pnext;
            if (pFirst == null) {
                // Si se eliminó el último nodo, actualiza pLast a null
                pLast = null;
            }
            size--;
            return removedNode;
        } else {
            return null;
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
        Node<T> pAux;
        String resultado = "";
        if (isEmpty()) {
            resultado = " está vacía";

        } else {
            pAux = pFirst;
            while (pAux != null) {
                pAux = next(pAux);
            }
        }
        return resultado;
    }

}
