package franco.tp.turno;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class IncorrectTypeOfDate extends JDialog{
    public IncorrectTypeOfDate(){
        setPreferredSize(null);
        setSize(150,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JLabel label = new JLabel("<html>" + "ha ingresado mal la fecha(tipo de dato incorrecto), ingrese nuevamente la fecha" +  "</html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // Añadir el mensaje al contenido
        add(label);

        // Mostrar el diálogo
        setVisible(true);
    }
}
