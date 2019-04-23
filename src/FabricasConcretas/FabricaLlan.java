/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import ProductosConcretos.LlantasMontaña;
import ProductosConcretos.LlantasRuta;
import FabricasAbstractas.FabricaLlantas;
import ProductosAbstractos.LlanMontaña;
import ProductosAbstractos.LlanRuta;


/**
 *
 * @author Alejandro
 */
public class FabricaLlan implements FabricaLlantas {
    private static FabricaLlan inst;
    private FabricaLlan(){
        
    }
    
    public static FabricaLlan getInstancia(){
        if(inst==null){
           inst= new FabricaLlan();
        }
       return inst;
    }
    @Override
    public LlanMontaña crearLlantaMontaña() {
        return new LlantasMontaña();
    }

    @Override
    public LlanRuta crearLlantaRuta() {
        return new LlantasRuta();
    }
    
}
