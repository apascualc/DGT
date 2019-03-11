package dgt;
/**
 *
 * @author Alejandro Pascual Clemente
 */
public class Multas {
    private String titular;
    private int importe;
    
    Multas(){
        titular = " ";
        importe = 0;
    }
    
    Multas(String titular, int importe){
        this.titular = titular;
        this.importe = importe;
        
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
    public void mostrarMulta() {
        System.out.println("El titular es " + this.titular + " y el impote de la multa es: " + this.importe);
    }
    
    
}
