/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesmodelos1;

import ProductosAbstractos.*;
import FabricasAbstractas.*;
import FabricasConcretas.*;

/**
 *
 * @author Alejandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Llamar Builder
        FabricaCuadro fabrica;
        CuadMontaña cuadrosMontaña;
        CuadRuta cuadroRuta;
        fabrica = new FabricaCuad();
        cuadrosMontaña =  fabrica.crearCuadroMontaña();
        cuadroRuta = fabrica.crearCuadroRuta();
        System.out.println(cuadrosMontaña);
        System.out.println(cuadroRuta);
    }
    
}
