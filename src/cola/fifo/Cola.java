/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola.fifo;

import java.util.ArrayList;

/**
 *
 * @author Alex
 * Se basa en primero q entra primero que sale
 *GUIA: https://www.youtube.com/watch?v=jUNcDIJ0S_k
 * Alexuser09
 * 
 */
public class Cola {
    
    private ArrayList<Object> fifo= new ArrayList<>();

    public Cola() {
    }
    
    
    //recive proceso
    public void offer(Object o){
    fifo.add(o);
    }
    //ejecuta proceso
    public Object peek(){
        if ((fifo.isEmpty())) {
            return fifo.get(0);
        }else{
            String msg="Atendiendo";
            return msg;
        }
    }
    // termina el proceso
    public Object poli(){
        
        if (!(fifo.isEmpty())) {
            Object o = fifo.get(0);
            fifo.remove(0);
            return "Finalizando  "+o;
        }else{
            
            return null;
        }
    }
    
}
