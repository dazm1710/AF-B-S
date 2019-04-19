/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.PiñMontaña;
import ProductosAbstractos.PiñRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaPiñones {
    public PiñMontaña crearPiñonesMontaña();
    public PiñRuta crearPiñonesRuta();
}
