/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.SilMontaña;
import ProductosAbstractos.SilRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaSillin {
    public SilMontaña crearSillinMontaña();
    public SilRuta crearSillinRuta();
}
