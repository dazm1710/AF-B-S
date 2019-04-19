/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasAbstractas;

import ProductosAbstractos.TenMontaña;
import ProductosAbstractos.TenRuta;


/**
 *
 * @author Alejandro
 */
public interface FabricaTenedor {
    public TenMontaña crearTenedorMontaña();
    public TenRuta crearTenedorRuta();
}
