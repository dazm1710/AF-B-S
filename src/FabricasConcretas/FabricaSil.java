/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import ProductosConcretos.SillinMontaña;
import ProductosConcretos.SillinRuta;
import FabricasAbstractas.FabricaSillin;
import ProductosAbstractos.SilMontaña;
import ProductosAbstractos.SilRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaSil implements FabricaSillin {

    private static FabricaSil inst;
    private FabricaSil(){
        
    }
    
    public static FabricaSil getInstancia(){
        if(inst==null){
           inst= new FabricaSil();
        }
       return inst;
    }
    @Override
    public SilMontaña crearSillinMontaña() {
        return new SillinMontaña();
    }

    @Override
    public SilRuta crearSillinRuta() {
        return new SillinRuta();
    }
    
}
