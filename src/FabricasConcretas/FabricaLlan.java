/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.LlantasMontaña;
import Concretos.LlantasRuta;
import FabricasAbstractas.FabricaLlantas;
import ProductosAbstractos.LlanMontaña;
import ProductosAbstractos.LlanRuta;


/**
 *
 * @author Alejandro
 */
public class FabricaLlan implements FabricaLlantas {

    @Override
    public LlanMontaña crearLlantaMontaña() {
        return new LlantasMontaña();
    }

    @Override
    public LlanRuta crearLlantaRuta() {
        return new LlantasRuta();
    }
    
}
