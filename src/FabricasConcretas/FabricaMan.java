/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.ManubrioMontaña;
import Concretos.ManubrioRuta;
import FabricasAbstractas.FabricaManubrios;
import ProductosAbstractos.ManMontaña;
import ProductosAbstractos.ManRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaMan implements FabricaManubrios {

    @Override
    public ManMontaña crearManubriosMontaña() {
        return new ManubrioMontaña();
    }

    @Override
    public ManRuta crearManubriosRuta() {
        return new ManubrioRuta();
    }
    
}
