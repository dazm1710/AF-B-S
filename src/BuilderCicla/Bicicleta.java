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
    
    public String armado(){
        String ar;
        ar = cambio.nombre()+" "+cuadro.nombre()+" "+freno.nombre()+" "+llanta.nombre()
                +" "+manubrio.nombre()+" "+pedal.nombre()+" "+piñones.nombre()
                +" "+sillin.nombre()+" "+tenedor.nombre();
        return ar;
    }
}
