/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Alejandro
 */
public class VentanaInicial extends JFrame {
    public static final Color BACKGROUND = new Color(210,210,240);
    private PanelMuestra datos;
    private Dimension d;
    public VentanaInicial(){
        super("Arma Tu Propia Bicicletas");
        d=Toolkit.getDefaultToolkit().getScreenSize();
        datos = new PanelMuestra();
        datos.setOpaque(false);
        
        try{//para cambiar el fondo del jframe con una imagen
            setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("./src/imagenes/fondo.jpg")))));
        } catch (IOException e) {            e.printStackTrace();        }
        add(datos);
        
        this.setMinimumSize(d);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void setActionListener(ActionListener al){
        datos.setActionListener(al);
    }

    public PanelMuestra getDatos() {
        return datos;
    }

    public void setDatos(PanelMuestra datos) {
        this.datos = datos;
    }
}
