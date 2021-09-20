/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasjavi;

/**
 *
 * @author DAW202
 */
public class Nodo {
    private int info;
    private Nodo sig; //referencia hacia el siguiente nodo

    public Nodo(int info, Nodo sig) {
        this.info = info;
        this.sig = sig;
    }

    public Nodo() {
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    

}
