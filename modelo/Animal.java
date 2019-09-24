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

//CLASSE É ABSTRATA QUANDO QUEREMOS IMPEDIR QUE 
//UM OBJETO SEJA INSTANCIADO DESSA CLASSE
//PARA ISSO USAREI A PALAVRA RESERVADA abstract NA
//DECLARAÇÃO DA CLASSE
public abstract class Animal {
    
    protected String comida;
    protected String habitat;
    
    //Construtores GETTERS e SETTERS

    public Animal() {
    }

    public Animal(String comida, String habitat) {
        this.comida = comida;
        this.habitat = habitat;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    //metodo makeNoise() passou a ser um metodo
    //abtrato e portanto nao tenho mais a implementação
    //(corpo) do metodo
    //todo metodo abstrato abrigatoriamente deve ser
    //implementado nas classe filho (CONCRETAS);
    public abstract String makeNoise();
    
    public abstract void movimentar();
}
