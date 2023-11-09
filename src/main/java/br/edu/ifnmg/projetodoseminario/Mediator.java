/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.projetodoseminario;

/**
 *
 * @author keni
 */
public class Mediator {
    Class1 class1;
    Class2 class2;
    
    public Mediator(Class1 c1, Class2 c2){
        class1=c1;
        class2=c2;
    }
    
    public void mediate(Object mediated){
        if(mediated.getClass()==Class1.class){
            class1.num=class2.Action2(class1.num);
        }else if(mediated.getClass()==Class2.class){
            class2.num=class1.Action1(class2.num);
        }
    }
}
