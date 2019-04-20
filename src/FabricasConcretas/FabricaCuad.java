/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.CuadroMontaña;
import Concretos.CuadroRuta;
import FabricasAbstractas.FabricaCuadro;
import ProductosAbstractos.CuadMontaña;
import ProductosAbstractos.CuadRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaCuad implements FabricaCuadro {

    private static FabricaCuad inst;
    private FabricaCuad(){
        
    }
    
    public static FabricaCuad getInstancia(){
        if(inst==null){
           inst= new FabricaCuad();
        }
       return inst;
    }
    @Override
    public CuadMontaña crearCuadroMontaña() {
        return new CuadroMontaña();
    }

    @Override
    public CuadRuta crearCuadroRuta() {
        return new CuadroRuta();
    }
    
}
