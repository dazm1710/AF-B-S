/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderFabrica;

import Abstractos.BicicletaBuilder;
import BuilderCicla.Bicicleta;
import FabricasConcretas.*;

/**
 *
 * @author Alejandro
 */
public class BicicletaUser extends BicicletaBuilder {
    FabricaCuad cua = FabricaCuad.getInstancia();
    FabricaLlan llan = FabricaLlan.getInstancia();
    FabricaMan man = FabricaMan.getInstancia();
    FabricaSil sil = FabricaSil.getInstancia();
    FabricaTen ten = FabricaTen.getInstancia();
    
    @Override
    public void DefinirBicicleta() {
        b = new Bicicleta();
    }
    
    @Override
    public void montarCuadro() {
        b.cuadro=cua.crearCuadroRuta();
        
    }

    @Override
    public void montarLlantas() {
        b.llanta=llan.crearLlantaMontaña();
    }
    

    @Override
    public void montarManubrio() {
        b.manubrio=man.crearManubriosRuta();
    }

    @Override
    public void montarSillin() {
        b.sillin=sil.crearSillinRuta();
    }

    @Override
    public void montarTenedor() {
        b.tenedor=ten.crearTenedorMontaña();
    }

    
}
