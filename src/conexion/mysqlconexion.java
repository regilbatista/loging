/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Regil Isaac Batista 2021-2251
 */
public final class mysqlconexion implements Closeable{
    
    private static mysqlconexion instance;
    
    private static final String USER="develop";
    private static final String PASSWORD="admin";
    private static final String URL="jdbc:mysql://localhost:3306/db_login?serverTimezone=UTC";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    
    private Connection connection;
    
    private PreparedStatement preparedstatement;
    
    private mysqlconexion(){}
          
    
    public static mysqlconexion getinstance(){
        if (instance == null){
            instance = new mysqlconexion();
        }
        return instance;
    }
    
    public Connection getconexion(){
    
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(mysqlconexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
        
    public ResultSet executeQuery(final String query) throws SQLException{
       
        this.preparedstatement = connection.prepareStatement(query);
        return this.preparedstatement.executeQuery();
    }
        
    
    @Override
    public void close() throws IOException {
        try {
            if (!connection.isClosed()){
                this.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(mysqlconexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    PreparedStatement preparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
 }

  



