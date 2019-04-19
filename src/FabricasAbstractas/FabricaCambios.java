/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.CambMontaña;
import ProductosAbstractos.CambRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaCambios {
    public CambMontaña crearCambioMontaña();
    public CambRuta crearCambioRuta();
}
