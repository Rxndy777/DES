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
public class Lista {

    private Nodo primero;

    public Lista(Nodo primero) {
        this.primero = primero;
    }

    public Lista() {
    }



    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public boolean esVacia() {
        return this.primero == null;
    }

    public void añadirElemento(int x) {
        Nodo nuevo = new Nodo(x, null);
        if (this.esVacia()) {
            primero = nuevo;
        } else {
            nuevo.setSig(primero);
            primero = nuevo;
        }
    }

    public void mostrarLista() {
        Nodo aux = primero;
        
        if (this.esVacia()){
            System.out.println("La lista es vacía");
        
        }else{
            while(aux !=null){
                System.out.println(aux.getInfo());
                aux = aux.getSig();
            }
        
        }

    }

    public boolean existe(int x) {
        Nodo aux = primero;
        boolean esta = false;
        while (aux != null) {
            if (aux.getInfo() == x) {
                esta = true;
            }
            aux = aux.getSig();
        }
        return esta;
        
    

    }
    
    public int cuantasVecesAparece(int x){
        Nodo aux = primero;
        int aparicion = 0;
        while (aux != null) {
            if (aux.getInfo() == x) {
                aparicion++;
            }
            aux = aux.getSig();
        }
        return aparicion;
        
    
    }
    
    
    public boolean eliminarElemento(int x){
        boolean borrado = false;
        Nodo aux = primero;
        Nodo anterior = aux;
        while (aux != null){
            if (aux.getInfo() == x){
                borrado = true;
                anterior.setSig(aux.getSig());
            
            
            }else{
                anterior = aux;
            }
            aux = aux.getSig();
        
        
        }
        
        return borrado;
    
    
    }

}
