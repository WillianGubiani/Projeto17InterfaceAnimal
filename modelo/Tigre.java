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
public class Tigre extends Felino{
    private double peso;
    
    //Construtores GETTRES e SETTERS

    public Tigre() {
    }

    public Tigre(double peso) {
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
        return"Tigre Ruge";
    }    
    
        @Override
    public void movimentar(){
        System.out.println("Anda");
    }
}
