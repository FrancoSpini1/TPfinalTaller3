package franco.tp.login;


import franco.tp.usuario.Usuario;
import franco.tp.usuarioNuevo.UsuarioNuevo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map.Entry;
import franco.tp.turno.Turno;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setTitle("StairWay To Heaven");
        setLocationRelativeTo(null);
        setSize(410,330);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label2createAccount = new javax.swing.JLabel();
        CreateAccountB = new javax.swing.JToggleButton();
        ENTER = new javax.swing.JToggleButton();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        UserLabel = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        LogInLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        label2createAccount.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        label2createAccount.setText("you dont have an account?");
        getContentPane().add(label2createAccount);
        label2createAccount.setBounds(70, 260, 141, 16);

        CreateAccountB.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        CreateAccountB.setText("create one");
        CreateAccountB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccountBActionPerformed(evt);
            }
        });
        getContentPane().add(CreateAccountB);
        CreateAccountB.setBounds(220, 260, 87, 23);

        ENTER.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        ENTER.setText("ENTER");
        ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERActionPerformed(evt);
            }
        });
        getContentPane().add(ENTER);
        ENTER.setBounds(150, 220, 66, 23);

        PasswordLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        PasswordLabel.setText("password :");
        getContentPane().add(PasswordLabel);
        PasswordLabel.setBounds(110, 180, 58, 16);

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField);
        PasswordField.setBounds(190, 180, 110, 22);

        UserLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        UserLabel.setText("user :");
        getContentPane().add(UserLabel);
        UserLabel.setBounds(140, 120, 30, 16);
        getContentPane().add(userTextField);
        userTextField.setBounds(190, 120, 110, 22);

        LogInLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        LogInLabel.setText("LOG IN");
        getContentPane().add(LogInLabel);
        LogInLabel.setBounds(140, 30, 120, 48);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBackground/3.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 313);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed

    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERActionPerformed
        String user = userTextField.getText();
        String pwd = PasswordField.getText();

        Usuario us = new Usuario();
        us.cargarUsuarios();
        us.getUsuario();
        boolean verify=false;
        try(BufferedReader br = new BufferedReader(new FileReader ("usuarios.txt"))) {
            for(Entry<String,String> u: us.getUsuario().entrySet()){
                if(user.equals(u.getKey()) && pwd.equals(u.getValue())){
                    System.out.println("inicio de sesion exitoso");
                    verify=true;
                    Turno t = new Turno();
                    t.pasoNombre(u.getKey());
                    t.setVisible(true);
                }
            }
            if(!verify){
                throw new NotFoundUserException();
            }
        }catch(NotFoundUserException e){
            new NotifyErrorLogin();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        /*nota de mejora, quisiera poder agregar cuando sale el popup de datos incorrectos
        la exception o el nombre , asi se sabe de donde es el error. noo pude hacerlo*/
    }//GEN-LAST:event_ENTERActionPerformed

    private void CreateAccountBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccountBActionPerformed
        UsuarioNuevo u = new UsuarioNuevo();
        u.setVisible(true);
    }//GEN-LAST:event_CreateAccountBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CreateAccountB;
    private javax.swing.JToggleButton ENTER;
    private javax.swing.JLabel LogInLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label2createAccount;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
