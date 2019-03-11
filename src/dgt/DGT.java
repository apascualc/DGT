package dgt;

import java.util.Scanner;

/**
 *
 * @author Alejandro Pascul Clemente
 */
public class DGT {

    public static String pedirNombre(){
        String nombre;
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Dame el nombre de la zona");
        nombre = entrada.nextLine();
        return nombre;
    }
    
    public static void main(String[] args) {
        Zona Z1 = new Zona(pedirNombre());
        Z1.mostrarZona();
        
    }
    
}
