/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.FrenosMontaña;
import Concretos.FrenosRuta;
import FabricasAbstractas.FabricaFrenos;
import ProductosAbstractos.FreMontaña;
import ProductosAbstractos.FreRuta;



/**
 *
 * @author Alejandro
 */
public class FabricaFre implements FabricaFrenos {
    private static FabricaFre inst;
    private FabricaFre(){
        
    }
    
    public static FabricaFre getInstancia(){
        if(inst==null){
           inst= new FabricaFre();
        }
       return inst;
    }
    
    @Override
    public FreMontaña crearFrenoMontaña() {
        return new FrenosMontaña();
    }

    @Override
    public FreRuta crearFrenoRuta() {
        return new FrenosRuta();
    }
    
}
