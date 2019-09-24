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
public class Lobo extends Canino{
    private double peso;
    
    // Construtores GETTERS e SETTERS

    public Lobo() {
    }

    public Lobo(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String makeNoise(){
        return "Lobo Uiva";
    }    
    
        @Override
    public void movimentar(){
        System.out.println("Anda");
    }
}
