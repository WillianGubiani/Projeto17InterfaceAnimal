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
public class Leao extends Felino{
    private String origem;
    
    //Construtres GETTERS e SETTERS

    public Leao() {
    }

    public Leao(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    @Override
    public String makeNoise(){
        return"Leão Ruge";
    }    
    
        @Override
    public void movimentar(){
        System.out.println("Anda");
    }
}
