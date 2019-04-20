/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderCicla;

import BuilderAbstract.BicicletaBuilder;

/**
 *
 * @author Alejandro
 */
public class BicicletaDirector {
    private BicicletaBuilder builder;
    
    public BicicletaDirector(BicicletaBuilder builder){
        this.builder=builder;
    }
    
    public void ConstruirBicicleta() throws Exception{
        builder.DefinirBicicleta();
        builder.montarCambios();
        builder.montarCuadro();
        builder.montarFrenos();
        builder.montarLlantas();
        builder.montarManubrio();
        builder.montarPedales();
        builder.montarPiñones();
        builder.montarSillin();
        builder.montarTenedor();
    }
    
    public Bicicleta getBicicleta(){
        return builder.getBici();
    }
}