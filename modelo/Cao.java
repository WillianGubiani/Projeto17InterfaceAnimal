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
public class Cao extends Canino implements IDomestico{
    private double tamanho;

    public Cao() {
    }

    public Cao(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    
    @Override
    public String makeNoise(){
        return "Cão Late";
    }
    
    @Override
    public void movimentar(){
        System.out.println("Anda");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar 3x ao dia.");
        super.comida = "Ração Pedegree";
    }
}
