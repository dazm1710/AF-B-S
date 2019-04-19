/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import FabricasAbstractas.FabricaPiñones;
import ProductosAbstractos.PiñMontaña;
import ProductosAbstractos.PiñRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaPiñ implements FabricaPiñones {

    @Override
    public PiñMontaña crearPiñonesMontaña() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PiñRuta crearPiñonesRuta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
