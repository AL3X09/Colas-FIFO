/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola.fifo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cola fifo = new Cola();
        String  proceso = null;
        for(int i=1; i < 6; i++ ) {
            proceso=JOptionPane.showInputDialog(null, "INGRESE EL PROCESO"+ i);
            fifo.offer(proceso);
        }
        
        for(int j=1; j < 6; j++ ) {
            JOptionPane.showMessageDialog(null, fifo.peek());
            JOptionPane.showMessageDialog(null, fifo.poli());    
        }
        
        //System.out.println(fifo.peek());
        //System.out.println(fifo.poli());
        
    }
    
}
