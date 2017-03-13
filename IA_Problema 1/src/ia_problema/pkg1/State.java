/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia_problema.pkg1;
import java.util.ArrayList;
import ia_problema.pkg1.Transition.Action;


/**
 *
 * @author Hernandez
 */
public class State {
    public enum Position {DERECHA, IZQUIERDA}
    //estados
    public Position oveja;
    public Position repollos;
    public Position lobo;
    public Position granjero;
    
    public boolean isValid(){
    //condiciones en que sea lvalido el estado
        //todas las combinaicon de estados invalidos
        if((oveja == Position.DERECHA) &&
          (repollos == Position.DERECHA) &&
          (granjero == Position.IZQUIERDA))
                return false;
        if((oveja == Position.DERECHA) &&
            (lobo == Position.DERECHA) &&
             (granjero == Position.IZQUIERDA))
            return false;
                    // terminar estados invalidos
        return true;       
    
    }
    //poner los estados validos o donde todo termina
    public boolean isFinal(){
        if((oveja == Position.IZQUIERDA) && 
           (repollos == Position.IZQUIERDA)&&
            (lobo == Position.IZQUIERDA)&&
             (granjero == Position.IZQUIERDA)
                ) 
            return true;
        return false;
                    
     }
    public ArrayList<Transition> validTransition(){

ArrayList<Transition> result= 
        new ArrayList<Transition>();
//mover al grangero siempre es posible
result.add (new Transition(this,Action.MOVER_GRANJERO));
//mover a la loveja solo es posible
if (oveja ==granjero){
    result.add(new Transition(this,Action.MOVER_OVEJA));
}
    //mover alos demas objetos queda en la comodidad de hogas, osea tarea
return result; 

    }
    public static void main(String[]args){
     State test= new State();
     test.granjero= Position.DERECHA;
     System.out.print(test);
     }
    @Override
   public String toString(){
       return "posicion de oveja: "+ oveja + ","+
               "posicion de repollos: " + repollos + ","+
              "posicion de lobo:" + lobo + ","+
             "posicion de granjero: " + granjero;
               
   }

}