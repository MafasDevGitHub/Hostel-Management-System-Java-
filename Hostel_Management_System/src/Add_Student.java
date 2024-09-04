
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

//import javanet.sf.jasperreports.engine.design.JasperDesign;



public class Add_Student extends javax.swing.JFrame {

    public void clear()
    {
        text_name.setText("");
        text_mob_no.setText("");
        text_email.setText("");
        text_father_name.setText("");
        text_mother_name.setText("");
        text_collage.setText("");
        text_address.setText("");
        text_nic.setText("");
        combo_room.removeAllItems();
        room_number();
    }
    
    public void room_number()
    {
        Connect();
        int i=0;
        try
        {
            Statement st=con.createStatement();
            //ResultSet rs=st.executeQuery("select * from room where Activate='Yes' and Room_Status='Not Booked'");
            ResultSet rs=st.executeQuery("select * from room where Activate='Yes' and Room_Status='Not Booked'");
            
            while(rs.next())
            {
                i=1;
                combo_room.addItem(rs.getString(1));
            }
            if(i==0)
            {
                btn_save.setVisible(false);
                JOptionPane.showMessageDialog(null,"All Rooms Are Booked!!!");
                setVisible(false);
            }
            //clear();
        }
        catch(Exception e)
        {
            
        }
    }
    
   
    public Add_Student() {
        initComponents();
        setLocationRelativeTo(null);
        //Connect();
        //room_number();
        clear();
    }
    
    Connection con;
    public void Connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel","root","1234");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Error in Connection");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_name = new javax.swing.JLabel();
        lbl_mobno = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_father = new javax.swing.JLabel();
        lbl_mother = new javax.swing.JLabel();
        lbl_collage = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        lbl_nic = new javax.swing.JLabel();
        lbl_roomNo = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        text_mob_no = new javax.swing.JTextField();
        text_email = new javax.swing.JTextField();
        text_father_name = new javax.swing.JTextField();
        text_mother_name = new javax.swing.JTextField();
        text_collage = new javax.swing.JTextField();
        text_address = new javax.swing.JTextField();
        text_nic = new javax.swing.JTextField();
        combo_room = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_name.setBackground(new java.awt.Color(204, 255, 204));
        lbl_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(0, 0, 0));
        lbl_name.setText("Mobile Number");
        getContentPane().add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 58, -1, -1));

        lbl_mobno.setBackground(new java.awt.Color(204, 255, 204));
        lbl_mobno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_mobno.setForeground(new java.awt.Color(0, 0, 0));
        lbl_mobno.setText("Name");
        getContentPane().add(lbl_mobno, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 101, -1, -1));

        lbl_email.setBackground(new java.awt.Color(204, 255, 204));
        lbl_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(0, 0, 0));
        lbl_email.setText("Email");
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 144, -1, -1));

        lbl_father.setBackground(new java.awt.Color(204, 255, 204));
        lbl_father.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_father.setForeground(new java.awt.Color(0, 0, 0));
        lbl_father.setText("Father Name");
        getContentPane().add(lbl_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 187, -1, -1));

        lbl_mother.setBackground(new java.awt.Color(204, 255, 204));
        lbl_mother.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_mother.setForeground(new java.awt.Color(0, 0, 0));
        lbl_mother.setText("Mother Name");
        getContentPane().add(lbl_mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 230, -1, -1));

        lbl_collage.setBackground(new java.awt.Color(204, 255, 204));
        lbl_collage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_collage.setForeground(new java.awt.Color(0, 0, 0));
        lbl_collage.setText("Collage Name");
        getContentPane().add(lbl_collage, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 273, -1, -1));

        lbl_address.setBackground(new java.awt.Color(204, 255, 204));
        lbl_address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(0, 0, 0));
        lbl_address.setText("Address");
        getContentPane().add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 316, -1, -1));

        lbl_nic.setBackground(new java.awt.Color(204, 255, 204));
        lbl_nic.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_nic.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nic.setText("NIC Number");
        getContentPane().add(lbl_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 359, -1, -1));

        lbl_roomNo.setBackground(new java.awt.Color(204, 255, 204));
        lbl_roomNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_roomNo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_roomNo.setText("Room Number");
        getContentPane().add(lbl_roomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 402, -1, -1));

        text_name.setBackground(new java.awt.Color(204, 255, 204));
        text_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_name.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 56, 450, -1));

        text_mob_no.setBackground(new java.awt.Color(204, 255, 204));
        text_mob_no.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_mob_no.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_mob_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 99, 450, -1));

        text_email.setBackground(new java.awt.Color(204, 255, 204));
        text_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_email.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 142, 450, -1));

        text_father_name.setBackground(new java.awt.Color(204, 255, 204));
        text_father_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_father_name.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_father_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 185, 450, -1));

        text_mother_name.setBackground(new java.awt.Color(204, 255, 204));
        text_mother_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_mother_name.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_mother_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 228, 450, -1));

        text_collage.setBackground(new java.awt.Color(204, 255, 204));
        text_collage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_collage.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_collage, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 271, 450, -1));

        text_address.setBackground(new java.awt.Color(204, 255, 204));
        text_address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_address.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 314, 450, -1));

        text_nic.setBackground(new java.awt.Color(204, 255, 204));
        text_nic.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_nic.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 357, 450, -1));

        combo_room.setBackground(new java.awt.Color(204, 255, 204));
        combo_room.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo_room.setForeground(new java.awt.Color(0, 0, 0));
        combo_room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(combo_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 400, 450, -1));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("New Students");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 12, -1, -1));

        btn_save.setBackground(new java.awt.Color(204, 255, 204));
        btn_save.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 0, 0));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 455, 113, -1));

        btn_clear.setBackground(new java.awt.Color(204, 255, 204));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(0, 0, 0));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 455, 113, -1));

        btn_close.setBackground(new java.awt.Color(255, 204, 204));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ClosNew.png"))); // NOI18N
        btn_close.setBorder(null);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 60, 40));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List of Paid & Dues Students.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       
        Connect();
        
        String Mobile_Number=text_name.getText();
        String Name=text_mob_no.getText();
        String Email=text_email.getText();
        String Father_Name=text_father_name.getText();
        String Mother_Name=text_mother_name.getText();
        String Collage_Name=text_collage.getText();
        String Address=text_address.getText();
        String NIC=text_nic.getText();
        String Room_No=(String)combo_room.getSelectedItem();
        String Room_Status="Living";
        try
        {
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, Mobile_Number);
            ps.setString(2, Name);
            ps.setString(3, Email);
            ps.setString(4, Father_Name);
            ps.setString(5, Mother_Name);
            ps.setString(6, Collage_Name);
            ps.setString(7, Address);
            ps.setString(8, NIC);
            ps.setString(9, Room_No);
            ps.setString(10, Room_Status);
            
            ps.execute();
            
            PreparedStatement ps1=con.prepareStatement("update room set Room_Status='Booked' where Room=?");
            ps1.setString(1,Room_No);
            ps1.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            clear();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> combo_room;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_collage;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_father;
    private javax.swing.JLabel lbl_mobno;
    private javax.swing.JLabel lbl_mother;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_nic;
    private javax.swing.JLabel lbl_roomNo;
    private javax.swing.JTextField text_address;
    private javax.swing.JTextField text_collage;
    private javax.swing.JTextField text_email;
    private javax.swing.JTextField text_father_name;
    private javax.swing.JTextField text_mob_no;
    private javax.swing.JTextField text_mother_name;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_nic;
    // End of variables declaration//GEN-END:variables
}
