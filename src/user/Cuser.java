/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.io.Serializable;
/**
 *
 * @author Regil Isaac Batista 2021-2251
 */
 public abstract class Cuser implements Serializable{
    
    private String id; 
    private String userName;
    private String password;
    private String nombre;
    private String apellido;
    private String Email;
    private String telefono;

  
    public Cuser() {
       this.userName = "";
        this.password = "";
        this.nombre = "";
        this.apellido = "";
        this.Email = "";
        this.telefono = "";
    }
  
    public Cuser(String userName, String password,String nombre, String apellido, String Email,String telefono) {
        this.userName = userName;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Email = Email;
        this.telefono = telefono;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public abstract void texboxinf(String val1); 
    public abstract void texboxEr(String val1); 
    public abstract void texboxat(String val1); 

}
