/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ifnmg.projetodoseminario;

/**
 *
 * @author keni
 */
public class ProjetoDoSeminario {

    public static void main(String[] args) {
        Context con = new Context(5);
        
        con.getState().doAction();
        con.setState();
        con.getState().doAction();
        
        
    }
}
