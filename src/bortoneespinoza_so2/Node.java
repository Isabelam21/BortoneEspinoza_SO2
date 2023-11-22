/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bortoneespinoza_so2;

/**
 *
 * @author Giulianna Bortone
 * @param <T>
 */
public class Node<T> {

    public T data;
    public Node<T> pnext;

    public Node(T data) {
        this.data = data; // Data del personaje
        this.pnext = null; // Apuntador al siguiente nodo
    }

    //Getters and setters
    public T getData() {
        return data;
    }

    public Node<T> getPnext() {
        return pnext;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPnext(Node<T> pnext) {
        this.pnext = pnext;
    }

}
