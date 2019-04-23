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
    public Cuadro cuadro;
    public Llantas llanta;
    public Manubrio manubrio;
    public Sillin sillin;
    public Tenedor tenedor;
    
    public Bicicleta(){}
    
    public String armado(){
        String ar;
        //ar="se supone que si la crea";
        ar = cuadro.nombre()+" \n"+llanta.nombre()
                +" \n"+manubrio.nombre()+" \n"+sillin.nombre()+
                " \n"+tenedor.nombre();
        return ar;
    }
}
