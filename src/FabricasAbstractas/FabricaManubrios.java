/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.ManMontaña;
import ProductosAbstractos.ManRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaManubrios {
    public ManMontaña crearManubriosMontaña();
    public ManRuta crearManubriosRuta();
}
