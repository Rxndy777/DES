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
public class ListasJavi {
    
   
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
        lista.añadirElemento(1);
        lista.añadirElemento(1);
        lista.añadirElemento(3);
        lista.añadirElemento(4);
        lista.añadirElemento(5);
        lista.añadirElemento(1);
        lista.añadirElemento(8);
        
        
        Lista lista2 = new Lista();
//        
//        lista.mostrarLista();
//       lista2.mostrarLista();
//       
//        System.out.println("El elemento aparece:" + lista.cuantasVecesAparece(1) + " veces");
//        System.out.println("El elemento aparece:" + lista.cuantasVecesAparece(7) + " veces");
//        System.out.println("El elemento aparece:" + lista.cuantasVecesAparece(3) + " veces");
//       
//        System.out.println("existe el número"
//                + "? " +  lista.existe(4));
//        System.out.println("existe el número"
//                + "? " +  lista.existe(9));
//        
//        
//        System.out.println("se  ha borrado el numero"
//                + "? " +  lista.eliminarElemento(4));
//        
//        lista.mostrarLista();
//        System.out.println("se  ha borrado el numero"
//                + "? " +  lista.eliminarElemento(1));
//        
//        lista.mostrarLista();
//        
//        System.out.println("se  ha borrado el numero"
//                + "? " +  lista.eliminarElemento(9));
//        
//        lista.mostrarLista();
//        
//        System.out.println("se  ha borrado el numero"
//                + "? " +  lista2.eliminarElemento(9));
//        
//        lista2.mostrarLista();
        
        
        Lista lista3 = new Lista();
        lista3.añadirElemento(4);
        lista3.añadirElemento(8);
        lista3.añadirElemento(8);
        lista3.añadirElemento(5);
        lista3.añadirElemento(6);
        
        lista3.mostrarLista();
        
        System.out.println("Se ha borrado el elemento: " +
                lista3.eliminarElemento(8));
        
        
        lista3.mostrarLista();
    }
    

    
}
