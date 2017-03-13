/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_problema.pkg1;

/**
 *
 * @author Hernandez
 */
public class Transition {
    
    public enum Action {MOVER_OVEJA, MOVER_REPOLLOS, MOVER_LOBO,MOVER_GRANJERO
    }
    public State initial;
    public Action action;
    public State doTransition(){
  
    State result =new State();
   if(action == Action.MOVER_GRANJERO){
       result.oveja = initial.oveja;
       result.repollos = initial.repollos;
       result.lobo= initial.lobo;
       if( initial.granjero == State.Position.DERECHA)
           result.granjero = State.Position.IZQUIERDA;
       else 
           result.granjero= State.Position.DERECHA; 
   
   }
    
     if(action == Action.MOVER_OVEJA){
          if( initial.oveja == State.Position.DERECHA)
           result.oveja = State.Position.IZQUIERDA;
       else 
           result.oveja=State.Position.DERECHA; 
          result.repollos = initial.repollos;
          result.lobo= initial.lobo;
        if( initial.granjero == State.Position.DERECHA)
           result.granjero = State.Position.IZQUIERDA;
       else 
           result.granjero=State.Position.DERECHA; 
   }
     
    return result;
     }

 public Transition(State initial, Action action){
   this.initial =initial;
   this.action=action;
   
   }
}   

