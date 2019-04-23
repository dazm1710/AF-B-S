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
        
        BicicletaDirector directorBici = new BicicletaDirector(new BicicletaUser());
        directorBici.ConstruirBicicleta();
        Bicicleta b= directorBici.getBicicleta();
        System.out.println("Primer Vehiculo:");
        System.out.println(b.armado());
    }
    
}
