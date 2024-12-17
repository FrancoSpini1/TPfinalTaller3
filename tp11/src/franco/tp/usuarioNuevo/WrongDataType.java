/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package franco.tp.usuarioNuevo;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author admin
 */
public class WrongDataType extends JDialog{
    public WrongDataType(String Emsj){
        setPreferredSize(null);
        setSize(150,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JLabel label = new JLabel("<html>" + Emsj+  "</html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Añadir el mensaje al contenido
        add(label);

        // Mostrar el diálogo
        setVisible(true);
    }
}
