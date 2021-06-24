
package autos;

/**
 *
 * @author Danny
 */
public abstract class Automovil extends Vehiculo{
    
    private String motor;
    private int cantGalo;
    private int cantPasa;
    private double veloMax;
    private double aceleraBase;
    
    public Automovil (String motor, int cantGalo,int cantPasa,double veloMax,double aceleraBase,String matricula, String marca, String modelo){
        
        super(modelo,marca,matricula);
        this.motor = motor;
        this.cantGalo = cantGalo;
        this.cantPasa = cantPasa;
        this.veloMax = veloMax;
        this.aceleraBase = aceleraBase;      
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String cantGas) {
        this.motor = cantGas;
    }

    public int getCantGalo() {
        return cantGalo;
    }

    public void setCantGalo(int cantGalo) {
        this.cantGalo = cantGalo;
    }

    public int getCantPasa() {
        return cantPasa;
    }

    public void setCantPasa(int cantPasa) {
        this.cantPasa = cantPasa;
    }

    public double getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(double veloMax) {
        this.veloMax = veloMax;
    }

    public double getAceleraBase() {
        return aceleraBase;
    }

    public void setAceleraBase(double aceleraBase) {
        this.aceleraBase = aceleraBase;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "tipo de motor: "+ motor 
                +"\nCantidad de gasolina: " + cantGalo 
                +"\nCantidad de pasajeros: " + cantPasa
                +"\nVelocidad maxima: " + veloMax
                +"\nAceleracion " + aceleraBase ;
    }
    
}
