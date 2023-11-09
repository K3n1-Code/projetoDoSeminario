/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetodoseminario;

/**
 *
 * @author ketsu
 */
public class StateOne implements State {
    Context parent;
    
    public StateOne(Context parent){
        this.parent=parent;
    }
    @Override
    public void doAction(){
        parent.num=parent.num*3 -1;
        System.out.println("Estado um!");
        System.out.println("-Num: "+ parent.num);
    }
}
