package dgt;

import java.util.Scanner;

/**
 * @author Alejandro Pascual Clemente
 */
public class Zona {
    private String nombre;
    Guardia_Civil[] vGC = new Guardia_Civil[3];

    public Zona() {
        int i;
        nombre = " ";
        for(i=0;i<this.vGC.length;i++){
            vGC[i] = new Guardia_Civil(pedirNombre());
        }
    }
    
    Zona(String nombre){
        this.nombre = nombre;
        int i;
        for(i=0;i<this.vGC.length;i++){
            vGC[i] = new Guardia_Civil(pedirNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Guardia_Civil[] getvGC() {
        return vGC;
    }

    public void setvGC(Guardia_Civil[] vGC) {
        this.vGC = vGC;
    }
    
    public String pedirNombre(){
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el nombre del Guardia Civil");
        nombre = entrada.nextLine();
        return nombre;
    }
    
    public void mostrarZona(){
        int i;
        System.out.println("Zona: " + this.nombre);
        for(i=0;i<this.vGC.length;i++){
            vGC[i].mostrarGuardia();
        }
    }
    
}
