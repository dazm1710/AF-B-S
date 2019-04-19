/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.LlanMontaña;
import ProductosAbstractos.LlanRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaLlantas {
    public LlanMontaña crearLlantaMontaña();
    public LlanRuta crearLlantaRuta();
}