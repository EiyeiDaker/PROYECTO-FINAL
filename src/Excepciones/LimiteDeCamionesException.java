/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Luis
 */
public class LimiteDeCamionesException extends Exception{
    public LimiteDeCamionesException(){
    super("LImite de camiones alcanzado para este garaje"); 
    }
}