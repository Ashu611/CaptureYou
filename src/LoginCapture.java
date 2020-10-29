import java.io.File;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


public class LoginCapture extends javax.swing.JFrame {

    Webcam webcam;
    
    public LoginCapture() {
        initComponents();
        
        webcam=Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Passwrd = new javax.swing.JPasswordField();
        Declare = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setExtendedState(1);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Attention! Security features are enbled.");

        Passwrd.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Passwrd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Passwrd.setText("jPasswordField1");

        Declare.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Declare.setForeground(new java.awt.Color(255, 0, 0));
        Declare.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(Passwrd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Declare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Passwrd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Declare, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String password1 = Passwrd.getText();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password1.getBytes());
            byte[] z = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte z1 : z) {
                sb.append(Integer.toHexString(z1 & 0xff));
            }
            String pass = sb.toString();
            
            String names[] = {"abc", "bcd", "cde", "def", "efg", "fgh", "ghi", "ijk", "klm", "mno", "lmn", "nop", "opq", "pqr", "qrs", "rst", "stu", "tuv", "uvw", "vwx", "wxy", "xyz", "yza", "zab"};
            String uniq[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            String ext[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "10"};
            String a = (names[new Random().nextInt(names.length)] + uniq[new Random().nextInt(uniq.length)] + ext[new Random().nextInt(ext.length)] + ext[new Random().nextInt(ext.length)] + uniq[new Random().nextInt(uniq.length)]);
            String b = (names[new Random().nextInt(names.length)] + uniq[new Random().nextInt(uniq.length)] + ext[new Random().nextInt(ext.length)] + ext[new Random().nextInt(ext.length)] + uniq[new Random().nextInt(uniq.length)]);
            String c = (names[new Random().nextInt(names.length)] + uniq[new Random().nextInt(uniq.length)] + ext[new Random().nextInt(ext.length)] + ext[new Random().nextInt(ext.length)] + uniq[new Random().nextInt(uniq.length)]);
            String addressa = a + ".jpg";
            String addressb = b + ".jpg";
            String addressc = c + ".jpg";
            
            if (pass.contains("d4e373e8cba214f85cddae5f9331d74")) {
                webcam.open();
                try {
                    ImageIO.write(webcam.getImage(), "JPG", new File(a + ".jpg"));
                } catch (IOException ex) {
                    Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
                }
                webcam.close();
                
                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Captureyou", "root", "");
                    Statement stmt = con.createStatement();
                    String query = "INSERT INTO LoginData VALUES(now(),'yes',DEFAULT,'" + addressa + "');";
                    stmt.executeUpdate(query);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                System.exit(0);
            } else if (password1.isEmpty()) {
                Declare.setText("Password cannot be empty");
                webcam.open();
                try {
                    ImageIO.write(webcam.getImage(), "JPG", new File(b + ".jpg"));
                } catch (IOException ex) {
                    Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Captureyou", "root", "");
                    Statement stmt = con.createStatement();
                    String query = "INSERT INTO LoginData VALUES(now(),'no',DEFAULT,'" + addressb + "');";
                    stmt.executeUpdate(query);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                webcam.close();
                Passwrd.setText(null);
            } else {
                Declare.setText("Invalid Password");
                webcam.open();
                try {
                    ImageIO.write(webcam.getImage(), "JPG", new File(c + ".jpg"));
                } catch (IOException ex) {
                    Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Captureyou", "root", "");
                    Statement stmt = con.createStatement();
                    String query = "INSERT INTO LoginData VALUES(now(),'no',DEFAULT,'" + addressc + "');";
                    stmt.executeUpdate(query);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                webcam.close();
                Passwrd.setText(null);
                
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginCapture.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new LoginCapture().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Declare;
    private javax.swing.JPasswordField Passwrd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
