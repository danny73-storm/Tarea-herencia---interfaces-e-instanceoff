
package autos;



public abstract class Vehiculo {
    
 
    
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    @Override
    public String toString() {
        return "Modelo: "+ modelo +"\nMarca: " + marca + "\nMatricula: " + matricula;
    }
}

