
package principal;

import static autos.Automovil.generarAutosAleatorios;




/**
 *
 * @author Danny
 */
public class main {

    
    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("  Automoviles disponibles  ");
        System.out.println("***************************");
        imprimir(generarAutosAleatorios(20));
    }
    
    public static void imprimir(String[] autosGenerados) {
	for (int i = 0; i < autosGenerados.length; i++) {
            System.out.println("____________________________");
	    System.out.println(autosGenerados[i]);
	}   
    }
}
