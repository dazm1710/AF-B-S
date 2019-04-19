/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.FreMontaña;
import ProductosAbstractos.FreRuta;

/**
 *
 * @author Alejandro
 */
public interface FabricaFrenos {
    public FreMontaña crearFrenoMontaña();
    public FreRuta crearFrenoRuta();
}
