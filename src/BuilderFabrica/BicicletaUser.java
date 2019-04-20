/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderFabrica;

import Abstractos.Cambios;
import Abstractos.Cuadro;
import BuilderAbstract.BicicletaBuilder;
import BuilderCicla.Bicicleta;
import FabricasAbstractas.*;
import FabricasConcretas.*;
import ProductosAbstractos.*;

/**
 *
 * @author Alejandro
 */
public class BicicletaUser extends BicicletaBuilder {
    FabricaCamb cam = FabricaCamb.getInstancia();
    FabricaCuad cua = FabricaCuad.getInstancia();
    FabricaFre fre = FabricaFre.getInstancia();
    FabricaLlan llan = FabricaLlan.getInstancia();
    FabricaMan man = FabricaMan.getInstancia();
    FabricaPed ped = FabricaPed.getInstancia();
    FabricaPiñ piñ = FabricaPiñ.getInstancia();
    FabricaSil sil = FabricaSil.getInstancia();
    FabricaTen ten = FabricaTen.getInstancia();
    
    @Override
    public void DefinirBicicleta() {
        b = new Bicicleta();
    }
    
    @Override
    public void montarCambios() {
//        FabricaCambios fabrica;
//        CambMontaña cuadrosMontaña;
//        fabrica = new FabricaCamb();
//        cuadrosMontaña =  fabrica.crearCambioMontaña();
//        b.cambio=new Cambios() {
//            @Override
//            public String nombre() {
//                return "Cambios agregados"; //To change body of generated methods, choose Tools | Templates.
//            }
//        };
        b.cambio=cam.crearCambioMontaña();
        
    }

    
    @Override
    public void montarCuadro() {
        b.cuadro=cua.crearCuadroRuta();
        
    }

    @Override
    public void montarFrenos() {
        b.freno=fre.crearFrenoRuta();
//        fre.crearFrenoMontaña();
    }

    @Override
    public void montarLlantas() {
        b.llanta=llan.crearLlantaMontaña();
//        llan.crearLlantaRuta();
    }
    

    @Override
    public void montarManubrio() {
        b.manubrio=man.crearManubriosRuta();
        //man.crearManubriosMontaña();
    }

    @Override
    public void montarPedales() {
        b.pedal=ped.crearPedalesMontaña();
        //ped.crearPedalesRuta();
    }

    @Override
    public void montarPiñones() {
        b.piñones=piñ.crearPiñonesMontaña();
     //   piñ.crearPiñonesMontaña();
    }

    @Override
    public void montarSillin() {
        b.sillin=sil.crearSillinRuta();
        //sil.crearSillinRuta();
    }

    @Override
    public void montarTenedor() {
        b.tenedor=ten.crearTenedorMontaña();
        //ten.crearTenedorMontaña();
    }

    
}
