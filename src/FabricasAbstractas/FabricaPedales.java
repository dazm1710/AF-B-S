/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.PedMontaña;
import ProductosAbstractos.PedRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaPedales {
    public PedMontaña crearPedalesMontaña();
    public PedRuta crearPedalesRuta();
}
