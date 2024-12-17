package franco.tp.usuarioNuevo;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UserAndPasswordAlreadyExist extends JDialog{
        public UserAndPasswordAlreadyExist(String Emsj){
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
