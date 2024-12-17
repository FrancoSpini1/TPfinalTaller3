/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package franco.tp.login;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class NotifyErrorLogin extends JDialog{
    public NotifyErrorLogin(){
        setPreferredSize(null);
        setSize(300,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JLabel label = new JLabel("<html>" + "los datos ingresados son incorrectos" +  "</html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Añadir el mensaje al contenido
        add(label);

        // Mostrar el diálogo
        setVisible(true);
    }
}
