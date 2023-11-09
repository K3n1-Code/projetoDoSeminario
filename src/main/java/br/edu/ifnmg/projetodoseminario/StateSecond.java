/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetodoseminario;

/**
 *
 * @author ketsu
 */
public class StateSecond implements State{
    Context parent;
    
    public StateSecond(Context parent){
        this.parent=parent;
    }
    
    @Override
    public void doAction(){
        parent.num=(int) (5-parent.num*1.5);
        System.out.println("Estado segundo!");
        System.out.println("-Num: "+ parent.num);
    }
    
}
