/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.PiñonesMontaña;
import Concretos.PiñonesRuta;
import FabricasAbstractas.FabricaPiñones;
import ProductosAbstractos.PiñMontaña;
import ProductosAbstractos.PiñRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaPiñ implements FabricaPiñones {
    
    private static FabricaPiñ inst;
    private FabricaPiñ(){
        
    }
    
    public static FabricaPiñ getInstancia(){
        if(inst==null){
           inst= new FabricaPiñ();
        }
       return inst;
    }
    @Override
    public PiñMontaña crearPiñonesMontaña() {
        return new PiñonesMontaña();
    }

    @Override
    public PiñRuta crearPiñonesRuta() {
        return new PiñonesRuta();
    }
    
}
