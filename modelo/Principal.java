/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cao objCao = new Cao();
        objCao.alimentar();
        System.out.println("Alimento: " + objCao.getComida());
        Gato objGato = new Gato();
        objGato.alimentar();
        System.out.println("Alimento: "  + objGato.getComida());         
    }
}
