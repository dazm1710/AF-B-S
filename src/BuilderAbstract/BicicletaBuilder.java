/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderAbstract;

import BuilderCicla.Bicicleta;

/**
 *
 * @author Alejandro
 */
public abstract class BicicletaBuilder {
    protected Bicicleta b;
    public Bicicleta getBici(){
        return b;
    }
    
    public abstract void montarCambios();
    public abstract void montarCuadro();
    public abstract void montarFrenos();
    public abstract void montarLlantas();
    public abstract void montarManubrio();
    public abstract void montarPedales();
    public abstract void montarPiñones();
    public abstract void montarSillin();
    public abstract void montarTenedor();
}
