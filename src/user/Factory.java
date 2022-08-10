/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

/**
 *
 * @author Regil Isaac Batista 2021-2251
 */
public class Factory {
    
    public registro getsentencia(String tipo){
    switch(tipo){
     
        case"Insert" -> {
            return new Guardar();
            }
        case"Actualizar" -> {
            return new Actualizar();
            }
        case"Eliminar" -> {
            return new Eliminar();
            }
        default -> {
            System.out.println("NO se encuentra dicho objeto en la fabrica.");
            return null;
            }
    
    }
  }
}
