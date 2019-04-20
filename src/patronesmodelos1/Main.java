/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesmodelos1;

import BuilderCicla.Bicicleta;
import BuilderCicla.BicicletaDirector;
import BuilderFabrica.BicicletaUser;
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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        

        //Llamar Builder
        /*
        // Repetimos el proceso con un constructor distinto.
        // Mostramos por pantalla los dos vehiculos:
        System.out.println("Primer Vehiculo:");
        System.out.println(audiA3.cambio);
        */
        BicicletaDirector directorBici = new BicicletaDirector(new BicicletaUser());
        
        directorBici.ConstruirBicicleta();
        
        Bicicleta b= directorBici.getBicicleta();
        
        System.out.println("Primer Vehiculo:");
        System.out.println(b.armado());
        //Bicicleta b = new Bicicleta();
        //System.out.println(b.cambio);
        /*
        Crear parte por parte
        FabricaCuadro fabrica;
        CuadMontaña cuadrosMontaña;
        CuadRuta cuadroRuta;
        fabrica = new FabricaCuad();
        cuadrosMontaña =  fabrica.crearCuadroMontaña();
        cuadroRuta = fabrica.crearCuadroRuta();
        System.out.println(cuadrosMontaña);
        System.out.println(cuadroRuta);
        */
    }
    
}
