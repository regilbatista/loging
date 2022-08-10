/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;
import conexion.mysqlconexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.Cuser;
/**
 *
 * @author regil
 */
public class Guardar implements registro{
    PreparedStatement ps = null;
    mysqlconexion db = mysqlconexion.getinstance();
    
    
    @Override
    public boolean Sentencia(Cuser usr){
    Connection con = db.getconexion();

    String sql="Insert into user (user_name,password,Nombre,Apellido,Email,Telefono) values(?,?,?,?,?,?)";
    try{
        
    ps = con.prepareStatement(sql);
    ps.setString(1,usr.getUserName());
    ps.setString(2,usr.getPassword());
    ps.setString(3,usr.getNombre());
    ps.setString(4,usr.getApellido());
    ps.setString(5,usr.getEmail());
    ps.setString(6,usr.getTelefono());
    ps.execute();
    return true;
    } catch(SQLException ex){
     Logger.getLogger(Guardar.class.getName()).log(Level.SEVERE, null, ex);
     return false;

}
}
    
    
}


