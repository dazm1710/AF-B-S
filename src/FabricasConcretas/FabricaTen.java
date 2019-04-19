/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasConcretas;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TenRuta crearTenedorRuta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
