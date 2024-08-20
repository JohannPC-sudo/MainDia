/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maindia;

/**
 *
 * @author Johann Lopez
 */
public class dia {
    
        private String nombre;

    public dia(String nombre) {
        this.nombre = nombre.toLowerCase();
    }

    public String getNombre() {
        return nombre;
    }

    public String diaSiguiente() {
        switch (nombre) {
            case "lunes":
                return "martes";
            case "martes":
                return "miercoles";
            case "miercoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return "Día inválido";
        }
    }    
}
