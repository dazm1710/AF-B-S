/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.CambiosMontaña;
import Concretos.CambiosRuta;
import FabricasAbstractas.FabricaCambios;
import ProductosAbstractos.CambMontaña;
import ProductosAbstractos.CambRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaCamb implements FabricaCambios {
    private static FabricaCamb inst;
    private FabricaCamb(){
        
    }
    
    public static FabricaCamb getInstancia(){
        if(inst==null){
           inst= new FabricaCamb();
        }
       return inst;
    }
    
    @Override
    public CambMontaña crearCambioMontaña() {
        return new CambiosMontaña();
    }
    
    @Override
    public CambRuta crearCambioRuta() {
        return new CambiosRuta();
    }
    
}
