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
public class Gato extends Felino implements IDomestico{
    private String raca;
    
    //Construtores GETTERS e SETTERS

    public Gato() {
    }

    public Gato(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public String makeNoise(){
       return "Gato Mia";
    }    
    
        @Override
    public void movimentar(){
        System.out.println("Anda");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentar 5x ao dia.");
        super.comida = "Ração Whiska";
    }
    
    
}

