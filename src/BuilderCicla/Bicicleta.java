/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderCicla;

import Abstractos.*;
/**
 *
 * @author Alejandro
 */
public class Bicicleta {
    public Cambios cambio;
    public Cuadro cuadro;
    public Frenos freno;
    public Llantas llanta;
    public Manubrio manubrio;
    public Pedales pedal;
    public Piñones piñones;
    public Sillin sillin;
    public Tenedor tenedor;
    
    public Bicicleta(){}
    
    public String armado(){
        String ar;
        //ar="se supone que si la crea";
        ar = cambio.nombre()+" \n"+cuadro.nombre()+" \n"+freno.nombre()+" \n"+llanta.nombre()
                +" \n"+manubrio.nombre()+" \n"+pedal.nombre()+" \n"+piñones.nombre()
                +" \n"+sillin.nombre()+" \n"+tenedor.nombre();
                
        return ar;
    }
}
