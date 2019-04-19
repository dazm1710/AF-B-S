/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.CuadMontaña;
import ProductosAbstractos.CuadRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaCuadro {
    public CuadMontaña crearCuadroMontaña();
    public CuadRuta crearCuadroRuta();
}
