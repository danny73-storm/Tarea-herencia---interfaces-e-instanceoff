
package autos;

/**
 *
 * @author Danny
 */



public abstract class Automovil extends Vehiculo {
    
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
    public String toString()    {
        return super.toString()+ "tipo de motor: "+ motor 
                +"\nCantidad de gasolina: " + cantGalo 
                +"\nCantidad de pasajeros: " + cantPasa
                +"\nVelocidad maxima: " + veloMax
                +"\nAceleracion " + aceleraBase ;
    }
    
    public static String[] generarAutosAleatorios(int cantidad) {
	String[] Autos = new String[cantidad];
        
        String[] tipo = {"Camioneta","Carga","Carrera"};
	String[] marca = {"Audi","Subaru","Lexus","Porsche","BMW","Mazda","Buick","Toyota","Kia","Chevrolet","Nissan"};
        String[] modelo ={"Corolla"," F-Series","Golf","Escort"," Model T","Passat","Impala"};
        String[] matricula ={"001-BBB","999-ZZZ ","071-PAM","863-APR","913-PSO","932-PDM","028-PAI","023-OAD","013-ADN","983-POS"};
                                
        for (int i = 0; i < cantidad; i++) {
            
	    Autos[i] = " Tipo de vehiculo: "+ tipo[(int) (Math.floor(Math.random() * ((tipo.length - 1) - 0 + 1) + 0))] + ""
	    +"\nMarca: "+marca[(int) (Math.floor(Math.random() * ((marca.length - 1) - 0 + 1) + 0))] + ""
            +"\nModelo: "+modelo[(int) (Math.floor(Math.random() * ((modelo.length - 1) - 0 + 1) + 0))] + ""
            +"\nMatricula: "+matricula[(int) (Math.floor(Math.random() * ((matricula.length - 1) - 0 + 1) + 0))];            	
        }    
	return Autos;
    }
    
    
    
    
}
