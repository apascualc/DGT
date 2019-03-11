package dgt;

import java.util.Scanner;

/**
 *
 * @author Alejandro Pascual Clemente
 */
public class Guardia_Civil {
    private String nombre;
    Multas[] vMultas = new Multas[4];

    public Guardia_Civil() {
        int i;
        nombre = " ";
        for(i = 0; i<this.vMultas.length; i++ ){
            vMultas[i] = new Multas();
        }
    }
    
    Guardia_Civil(String nombre){
        int i;
        this.nombre = nombre;
        for(i = 0; i<this.vMultas.length; i++ ){
            vMultas[i] = new Multas(pedirNombre(), pedirImporte());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Multas[] getvMultas() {
        return vMultas;
    }

    public void setvMultas(Multas[] vMultas) {
        this.vMultas = vMultas;
    }
    
    public int pedirImporte() {
        Scanner entrada = new Scanner(System.in);
        int importe;
        System.out.println("Dame el Importe de la multa");
        importe = entrada.nextInt();
        return importe;
    }
    
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String titular;
        System.out.println("Dame el Nombre del Titular");
        titular = entrada.nextLine();
        return titular;
    }
    public void mostrarGuardia(){
        System.out.println("Guardia Civil: " + this.nombre);
        for(int i = 0;i < this.vMultas.length; i++){
            System.out.println("Multa " + (i+1));
            vMultas[i].mostrarMulta();
        }
    }
    
    
}
