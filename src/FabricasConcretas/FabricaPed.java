/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.PedalesMontaña;
import Concretos.PedalesRuta;
import FabricasAbstractas.FabricaPedales;
import ProductosAbstractos.PedMontaña;
import ProductosAbstractos.PedRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaPed implements FabricaPedales {
    private static FabricaPed inst;
    private FabricaPed(){
        
    }
    
    public static FabricaPed getInstancia(){
        if(inst==null){
           inst= new FabricaPed();
        }
       return inst;
    }
    @Override
    public PedMontaña crearPedalesMontaña() {
        return new PedalesMontaña();
    }

    @Override
    public PedRuta crearPedalesRuta() {
        return new PedalesRuta();
    }
    
}
