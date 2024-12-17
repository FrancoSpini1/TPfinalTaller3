package franco.tp.usuarioNuevo;
import franco.tp.usuario.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Character.isDigit;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioNuevo extends javax.swing.JFrame {
    public UsuarioNuevo() {
        initComponents();
        setTitle("new User");
        setLocationRelativeTo(null);
        setSize(500,400);
    }

    private void validarDNI(String dni) throws WrongDataTypeException {
        if (dni.length() != 8 || !dni.matches("\\d+")) {
            throw new WrongDataTypeException("El DNI debe contener exactamente 8 dígitos numéricos.");
        }
    }
    
        private void validarTelefono(String telefono) throws WrongDataTypeException {
        if (!telefono.matches("\\d+")) {
            throw new WrongDataTypeException("El telefono debe contener dígitos numéricos.");
        }
    }

    private void validateTelefono(String telefono) throws WrongDataTypeException {
        if (telefono.length() != 10 || !telefono.matches("\\d+")) {
            throw new WrongDataTypeException("El teléfono debe contener exactamente 10 dígitos numéricos.");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordL = new javax.swing.JLabel();
        userNameL = new javax.swing.JLabel();
        createUserL = new javax.swing.JLabel();
        backGroundImage = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel8.setText("designed by: franco spini :D");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 340, 170, 16);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 270, 72, 23);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(350, 220, 120, 22);

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextField2);
        jFormattedTextField2.setBounds(350, 140, 120, 22);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextField1);
        jFormattedTextField1.setBounds(350, 180, 120, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(130, 220, 120, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 180, 120, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 140, 120, 22);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel7.setText("e-mail :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(280, 220, 60, 16);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("telephone :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 180, 70, 16);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel5.setText("DNI :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 140, 30, 16);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel4.setText("name and surname :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 220, 120, 16);

        passwordL.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        passwordL.setText("password :");
        getContentPane().add(passwordL);
        passwordL.setBounds(30, 180, 80, 16);

        userNameL.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        userNameL.setText("User Name :");
        getContentPane().add(userNameL);
        userNameL.setBounds(30, 140, 80, 16);

        createUserL.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        createUserL.setText("CREATE USER");
        getContentPane().add(createUserL);
        createUserL.setBounds(140, 30, 213, 48);

        backGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBackground/cu1.png"))); // NOI18N
        getContentPane().add(backGroundImage);
        backGroundImage.setBounds(0, 0, 501, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usuario = jTextField1.getText();
        String contraseña = jTextField2.getText();
        String nombre_completo = jTextField3.getText();
        String email = jTextField4.getText();
        String dniS = jFormattedTextField2.getText();
        String telefonoS=jFormattedTextField1.getText();
        //tuve muchos problemas para intentar validar el ingreso de numero telefonico,
        //pude hacer que solo se ingresen numeros , una lastima
        try{
            validarDNI(dniS);   //valida longitud y tipo de dato(numeros)
            validateTelefono(telefonoS);//valida que solo se ingresen numeros 
            int dni = Integer.parseInt(dniS);
            Long telefono=Long.parseLong(telefonoS);
            
            boolean validoUsuario= validarUsrAndPwd(usuario,contraseña);
            if(validoUsuario){
                UserAndPasswordAlreadyExistException upaee=new UserAndPasswordAlreadyExistException();
                throw upaee;
            }else{
                Usuario u = new Usuario();
                u.CrearUsuario(usuario,contraseña,nombre_completo,email,dni,telefono);
            }

        }catch(WrongDataTypeException e){
            new WrongDataType("los datos fueron mal ingresados"+"("+e.getMessage()+")");
            e.printStackTrace();
        } catch (UserAndPasswordAlreadyExistException ex) {
            new UserAndPasswordAlreadyExist("usuario o contraseña ya existentes");
            Logger.getLogger(UsuarioNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundImage;
    private javax.swing.JLabel createUserL;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel passwordL;
    private javax.swing.JLabel userNameL;
    // End of variables declaration//GEN-END:variables

    private boolean validarUsrAndPwd(String usuario, String contraseña) {
        Map<String, String> tmp = new HashMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader("usuarios.txt"))){
    	String linea;
            while((linea = br.readLine()) != null) {
                    String[]partes = linea.split(",");
                    if(partes.length == 2) {
                        tmp.put(partes[0].trim(), partes[1].trim());//cargue en tmp lo de usuarios.txt
                    }
            }
           /*
            ahora quisiera comparar todo lo de tmp con ucv, y que al encontrarlos retorne true
            */ 
           
            for (Entry<String,String> a : tmp.entrySet()) {
               if(a.getKey().equals(usuario) || a.getValue().equals(contraseña)){
                   return true; //usuario o contraseña ya existen
               } 
            }
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
        return false;//son usuario o contraseña nuevos
    }
}
