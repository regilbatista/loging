/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import conexion.mysqlconexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author regil
 */
public class seleccionar {
    PreparedStatement ps = null;
    ResultSet rs = null;
    mysqlconexion db = mysqlconexion.getinstance();
    
    public ResultSet seleccionar (){
    Connection con = db.getconexion();

    String sql="SELECT id_user, Nombre ,Apellido ,Email ,Telefono, user_name  FROM user";
    try{
        
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
 
    
    } catch(SQLException ex){
     Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
     

}  
       return rs;
}   
    
    public ResultSet seleccionar2 (String id){
    Connection con = db.getconexion();

    String sql="SELECT id_user, Nombre ,Apellido ,Email ,Telefono, user_name, password  FROM user WHERE id_user = ?";
    try{
        
    ps = con.prepareStatement(sql);
    ps.setString(1,id);
    rs = ps.executeQuery();
 
    
    } catch(SQLException ex){
     Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
     

}  
       return rs;
}  
      
    public boolean seleccionar3 (Cuser usr){
    Connection con = db.getconexion();

    String sql="SELECT id_user, user_name, password  FROM user WHERE user_name = ?";
    try{
        
    ps = con.prepareStatement(sql);
    ps.setString(1,usr.getUserName());
    rs = ps.executeQuery();
    
    if(rs.next()){
       
        if (usr.getPassword().equals(rs.getString(3))){
        
            usr.setId(rs.getString(1));
            usr.setUserName(rs.getString(2));
            return true;
        } else
        {return false;}
        
        
      
    }
    return false;
    
    } catch(SQLException ex){
     Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
     

     return false;
}  
}   
    
}

