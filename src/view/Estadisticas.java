package view;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Haider Andres Murcia
 */
public class Estadisticas extends JFrame {
    private ImageIcon iTitulo, iRegresar;
    private JButton bRegresar;
    private Color customColorBlue, customColorMilitar, customColorGreen;
    private JLabel lTitulo;
    private JList<Jugadores> jugadoresList;

    public Estadisticas() {

        //Crea la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(700, 300, 900, 900);
        setLocationRelativeTo(null);
        setLayout(null);

        //Crea los colores
        customColorMilitar = new Color(95, 107, 79);
        customColorGreen = new Color(168, 237, 78);
        customColorBlue = new Color(133, 157, 235);
        getContentPane().setBackground(customColorBlue);

        // Titulo
        iTitulo = new ImageIcon(Estadisticas.class.getResource("/resources/stats/estTitulo.png"));
        lTitulo = new JLabel(iTitulo);
        lTitulo.setBounds(100, 0, 700, 125);

        // Inicializa la lista de mascotas
        jugadoresList = new JList<>();
        jugadoresList.setBackground(customColorBlue);
        jugadoresList.setVisibleRowCount(5);
        jugadoresList.setForeground(customColorMilitar);
        JScrollPane scrollPane = new JScrollPane(jugadoresList);
        scrollPane.setBounds(20, 125, 850, 600);

        //Boton regresar
        iRegresar = new ImageIcon(Estadisticas.class.getResource("/resources/stats/estRegresar.png"));
        bRegresar = new JButton(iRegresar);
        bRegresar.setBackground(customColorMilitar);
        bRegresar.setForeground(customColorGreen);
        bRegresar.setBounds(350, 750, 200, 100);

        // Botón de regresar
        add(lTitulo);
        add(scrollPane);
        add(bRegresar);
        setVisible(true);
    }

    public JButton getRegresarButton() {
        return bRegresar;
    }
}
