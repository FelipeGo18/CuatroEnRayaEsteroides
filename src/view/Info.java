/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author lokci
 */
public class Info extends JFrame {
    private ImageIcon iTitulo, iRegresar, iInformacion;
    private JLabel lTitulo, lInformacion;
    private JButton bRegresar;
    
    private Color customColorBlue;

    public Info() {

        //Ventana
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setLayout(null);
        
        //Color fondo
        customColorBlue = new Color(133, 157, 235);
        getContentPane().setBackground(customColorBlue);
        
        //Titulo
        iTitulo = new ImageIcon(Info.class.getResource("/resources/info/infoTitulo.png"));
        lTitulo = new JLabel(iTitulo);
        lTitulo.setBounds(250,10,310,60);
        
        //Informacion
        iInformacion = new ImageIcon(Info.class.getResource("/resources/info/infoInformacion.png"));
        lInformacion = new JLabel(iInformacion);
        lInformacion.setBounds(63,80,675,410);
        
        //Regresar
        iRegresar = new ImageIcon(Info.class.getResource("/resources/info/infoRegresar.png"));
        bRegresar = new JButton(iRegresar);
        bRegresar.setBounds(300,495,200,60);
        
        //Add items
        add(lTitulo);
        add(lInformacion);
        add(bRegresar);
        setVisible(true);
        
    }

    public JButton getbRegresar() {
        return bRegresar;
    }
    
    
    
}
