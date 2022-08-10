/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;


import javax.swing.JOptionPane;

/**
 *
 * @author Regil Isaac Batista 2021-2251
 */
public class registrar extends Cuser{
    
    
    public boolean contigual(String cont1,String cont2){
       boolean h = cont1.equals(cont2);
       System.out.println(cont1+cont2);
        return h ;
   
    
    }
   
 
    @Override
    public void texboxinf(String val1) {
       JOptionPane.showMessageDialog(null,val1);   
    }

    /**
     *
     * @param val1
     */
    @Override
     public void texboxEr(String val1) {
       JOptionPane.showMessageDialog(null,val1,"Error",JOptionPane.ERROR_MESSAGE);   
    }
     
    /**
     *
     * @param val1
     */
    @Override
      public void texboxat(String val1) {
       JOptionPane.showMessageDialog(null,val1,"Atención",JOptionPane.WARNING_MESSAGE);   
    }


}