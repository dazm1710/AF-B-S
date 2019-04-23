/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import ProductosConcretos.ManubrioMontaña;
import ProductosConcretos.ManubrioRuta;
import FabricasAbstractas.FabricaManubrios;
import ProductosAbstractos.ManMontaña;
import ProductosAbstractos.ManRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaMan implements FabricaManubrios {
    
    private static FabricaMan inst;
    private FabricaMan(){
        
    }
    
    public static FabricaMan getInstancia(){
        if(inst==null){
           inst= new FabricaMan();
        }
       return inst;
    }
    @Override
    public ManMontaña crearManubriosMontaña() {
        return new ManubrioMontaña();
    }

    @Override
    public ManRuta crearManubriosRuta() {
        return new ManubrioRuta();
    }
    
}
