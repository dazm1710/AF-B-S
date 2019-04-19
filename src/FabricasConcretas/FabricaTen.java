/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

import Concretos.TenedorMontaña;
import Concretos.TenedorRuta;
import FabricasAbstractas.FabricaTenedor;
import ProductosAbstractos.TenMontaña;
import ProductosAbstractos.TenRuta;

/**
 *
 * @author Alejandro
 */
public class FabricaTen implements FabricaTenedor{

    @Override
    public TenMontaña crearTenedorMontaña() {
        return new TenedorMontaña();
    }

    @Override
    public TenRuta crearTenedorRuta() {
        return new TenedorRuta();
    }
   
}
