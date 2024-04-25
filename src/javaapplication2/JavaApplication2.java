/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Introduce un numero");
        try{
            num= sc.nextInt();
            System.out.println("tu número es " + num + ". ");
        } catch (InputMismatchException e){
            System.out.println("El número introducido no es válido. ");
        } finally {
            System.out.println("¡Chao, pescao!");
        }
        
    }
}
    

