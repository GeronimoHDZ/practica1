/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_problema.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Hernandez
 */
public class IA_Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    State initial = new State();
    initial.oveja= State.Position.DERECHA;
    initial.repollos = State.Position.DERECHA;
    initial.lobo = State.Position.DERECHA;
    initial.granjero= State.Position.DERECHA;
    System.out.println("Estado inicial: " + initial);
    
    ArrayList<Transition> next = initial.validTransition();
    
    System.out.println("Transiciones: " + next.size());
    
    for (Transition t: next){
        System.out.println("Action: " + t.action);
        System.out.println("resultado: " + t.doTransition());
    }
    }
    
}
