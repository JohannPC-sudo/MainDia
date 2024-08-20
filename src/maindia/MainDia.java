/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maindia;

import java.util.Scanner;
/**
 *
 * @Johann Lopez
 */
public class MainDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un dia:");
        String nombreDia = scanner.nextLine();

        dia dia = new dia(nombreDia);
        String diaSiguiente = dia.diaSiguiente();

        System.out.println("El dia siguiente es: " + diaSiguiente);
    }

   }
    

