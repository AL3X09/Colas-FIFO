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
 * 
 */
public class Cola {
    
    private ArrayList<Object> fifo= new ArrayList<>();

    public Cola() {
    }
    
    
    
    public void offer(){
    fifo.add(0);
    }
    
    public Object peek(){
        if (!(fifo.isEmpty())) {
            return fifo.get(0);
        }else{
            return null;
        }
    }
    
    public Object poli(){
        
        if (!(fifo.isEmpty())) {
            Object o = fifo.get(0);
            fifo.remove(0);
            return o;
        }else{
            return null;
        }
    }
    
    
}
