/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.VentanaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class ControladorVistas {
    VentanaInicial vista;
    
    public ControladorVistas(VentanaInicial vista){
        this.vista=vista;
        
//        String musica= new String("./src/musica/clasicaElectronica.mp3");
//         mus=new MP3(musica);
                 
        vista.addWindowListener(new ControladorWindowListener());
        vista.setActionListener(new ControladorActionListener());
        
    }
    
    class ControladorWindowListener extends WindowAdapter{
        
        @Override
        public void windowClosing(WindowEvent e){
            System.out.println("Controlador: Cerrando programa");
            System.exit(0);
        }
    }
    
    class ControladorActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            String command=ae.getActionCommand();
            
            if("montana".equals(command)){
                JOptionPane.showMessageDialog(vista, "Así se ve una Bicicleta de Ruta");
            }
            if("ruta".equals(command)){
                JOptionPane.showMessageDialog(vista, "Así se ve una Bicicleta de Montaña");
            }
            if("start".equals(command)){
                System.out.println("Inicia");
            }
         
            //juego.paintAll(juego.getGraphics());//Actualizar el panel
        }
        
    }
}
