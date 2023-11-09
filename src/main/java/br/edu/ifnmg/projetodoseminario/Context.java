/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetodoseminario;

/**
 *
 * @author ketsu
 */
public class Context {
    private State state;
    public int num=0;
    
    
    
    
    public Context(int num){
        state=new StateOne(this);
        this.num =num;
    }
    
    public State getState(){
        return state;
    }
    
    public void switchState(){
        if(state.getClass()==StateOne.class){
            state=new StateSecond(this);
        }
        else if(state.getClass()==StateSecond.class){
            state=new StateOne(this);
        }
        else state=new StateOne(this);
        
        
    }
}
