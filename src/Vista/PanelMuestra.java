/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class PanelMuestra extends JPanel{
    private final JButton btnMontana, btnRuta, btnStart;
    private final JLabel titulo1,subtitulo1,subtitulo2;
    private final Dimension d;
    private final String rutaImagen, montanaImagen;
    private final Icon icono,icono2;
    public PanelMuestra(){
        d=Toolkit.getDefaultToolkit().getScreenSize();
        setLayout(null);
        
        rutaImagen="./src/imagenes/rutaSin.png";
        ImageIcon imagen = new ImageIcon(rutaImagen);
        icono = new ImageIcon(imagen.getImage().getScaledInstance(d.width/4,d.height/2, Image.SCALE_DEFAULT));
        
        montanaImagen="./src/imagenes/MontanaSin.png";
        ImageIcon imagen2 = new ImageIcon(montanaImagen);
        icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(d.width/3,d.height/2, Image.SCALE_DEFAULT));
        
        btnMontana= new JButton(icono2);
        btnMontana.setActionCommand("montana");
        btnMontana.setBounds(5*d.width/9, 200, d.width/3,d.height/2);
        btnMontana.setContentAreaFilled(false);
        btnMontana.setBorder(null);
        
        btnRuta= new JButton(icono);
        btnRuta.setActionCommand("ruta");
        btnRuta.setBounds(d.width/8, 200, d.width/4,d.height/2);
        btnRuta.setContentAreaFilled(false);
        btnRuta.setBorder(null);
        
        btnStart= new JButton("Comienza Aqui!");
        btnStart.setActionCommand("start");
        btnStart.setBounds(3*d.width/8, 7*d.height/9,400,80);
        btnStart.setContentAreaFilled(false);
        btnStart.setBorder(null);
        btnStart.setFont(new java.awt.Font("Russo One", Font.BOLD, 40));
        btnStart.setForeground(Color.BLACK);
        
        System.out.println("W: "+d.width+" H: "+d.height);
        
        titulo1= new JLabel();
        titulo1.setText("¡¡¡Arma Tu Cicla!!!");
        titulo1.setFont(new java.awt.Font("Montserrat Subrayada", Font.BOLD, 40));//Personalizar letra
        titulo1.setBounds(3*d.width/8,20, 450, 35);// posicion y tamaño
        titulo1.setForeground(Color.WHITE);
        
        subtitulo1= new JLabel();        
        subtitulo1.setText("Modelo Cicla de Ruta");
        subtitulo1.setFont(new java.awt.Font("Shrikhand", Font.BOLD, 30));//Personalizar letra
        subtitulo1.setBounds(d.width/8, 130, 450, 40);//Tamaño y posicion
        subtitulo1.setForeground(Color.BLACK);//Color de letra
        
        subtitulo2= new JLabel();
        subtitulo2.setText("Modelo Cicla de Montaña");
        subtitulo2.setFont(new java.awt.Font("Shrikhand", Font.BOLD, 30));//Personalizar letra
        subtitulo2.setBounds(5*d.width/9, 130, 450, 40);//Tamaño y posicion
        subtitulo2.setForeground(Color.BLACK);//Color de letra
        
        //setBounds(0, 0, 300,300);
        this.setSize(d);
        this.add(btnStart);
        this.add(btnMontana);
        this.add(btnRuta);
        this.add(titulo1);
        this.add(subtitulo2);
        this.add(subtitulo1);
        this.setVisible(true);
    }
    
    public void setActionListener(ActionListener actionListener){
        btnMontana.addActionListener(actionListener);
        btnRuta.addActionListener(actionListener);
        btnStart.addActionListener(actionListener);
    }
    
}
