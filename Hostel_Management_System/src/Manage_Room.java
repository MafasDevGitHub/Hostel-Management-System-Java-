import java.awt.Color;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Manage_Room extends javax.swing.JFrame {

    public void clear()
    {
        text_room_no.setText("");
        text_room_no2.setText("");
        
        check_yes.setSelected(false);
        check_yes2.setSelected(false);
        
        text_room_no2.setBackground(new JButton().getBackground());
        text_room_no2.setForeground(new JButton().getForeground());
        
        text_room_no2.setEditable(true);
    }
    
    public void table_details()
    {
        Connect();
        DefaultTableModel dtm=(DefaultTableModel) table_detailRoom.getModel();
        dtm.setRowCount(0);
        
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from room");
            
            while(rs.next())
            {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e); 
        }
    }
   
    public Manage_Room() {
        initComponents();
        table_details();
        setLocationRelativeTo(null);
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
            System.out.println("Error in Connection");
        }
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        lbl_room_no1 = new javax.swing.JLabel();
        text_room_no1 = new javax.swing.JTextField();
        lbl_ac_dac1 = new javax.swing.JLabel();
        check_yes1 = new javax.swing.JCheckBox();
        btn_save1 = new javax.swing.JButton();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        lbl_add_rooms = new javax.swing.JLabel();
        lbl_room_no = new javax.swing.JLabel();
        text_room_no = new javax.swing.JTextField();
        lbl_ac_dac = new javax.swing.JLabel();
        check_yes = new javax.swing.JCheckBox();
        btn_save = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_room_no2 = new javax.swing.JLabel();
        text_room_no2 = new javax.swing.JTextField();
        lbl_ac_Deac2 = new javax.swing.JLabel();
        check_yes2 = new javax.swing.JCheckBox();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_detailRoom = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_all_rooms = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        lbl_room_no1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_room_no1.setText("Room No");

        text_room_no1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        lbl_ac_dac1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_ac_dac1.setText("Activate or Deactivate");

        check_yes1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        check_yes1.setText("Yes");

        btn_save1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_save1.setText("Save");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_add_rooms.setFont(new java.awt.Font("Algerian", 1, 28)); // NOI18N
        lbl_add_rooms.setForeground(new java.awt.Color(0, 0, 0));
        lbl_add_rooms.setText("Add Rooms");
        getContentPane().add(lbl_add_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 12, -1, -1));

        lbl_room_no.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_room_no.setForeground(new java.awt.Color(0, 0, 0));
        lbl_room_no.setText("Room No");
        getContentPane().add(lbl_room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 94, -1, -1));

        text_room_no.setBackground(new java.awt.Color(204, 255, 204));
        text_room_no.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_room_no.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(text_room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 92, 156, -1));

        lbl_ac_dac.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_ac_dac.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ac_dac.setText("Activate or Deactivate");
        getContentPane().add(lbl_ac_dac, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 94, -1, -1));

        check_yes.setBackground(new java.awt.Color(204, 255, 204));
        check_yes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        check_yes.setForeground(new java.awt.Color(0, 0, 0));
        check_yes.setText("Yes");
        getContentPane().add(check_yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 90, -1, -1));

        btn_save.setBackground(new java.awt.Color(204, 255, 204));
        btn_save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_save.setForeground(new java.awt.Color(0, 0, 0));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 89, 120, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 700, 10));

        lbl_room_no2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_room_no2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_room_no2.setText("Room No");
        getContentPane().add(lbl_room_no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 210, -1, -1));

        text_room_no2.setBackground(new java.awt.Color(204, 255, 204));
        text_room_no2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(text_room_no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 208, 156, -1));

        lbl_ac_Deac2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_ac_Deac2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ac_Deac2.setText("Activate or Deactivate");
        getContentPane().add(lbl_ac_Deac2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 210, -1, -1));

        check_yes2.setBackground(new java.awt.Color(204, 255, 204));
        check_yes2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        check_yes2.setForeground(new java.awt.Color(0, 0, 0));
        check_yes2.setText("Yes");
        getContentPane().add(check_yes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 206, -1, -1));

        btn_update.setBackground(new java.awt.Color(204, 255, 204));
        btn_update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(0, 0, 0));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 205, 123, -1));

        btn_delete.setBackground(new java.awt.Color(204, 255, 204));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(0, 0, 0));
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 247, 123, -1));

        table_detailRoom.setBackground(new java.awt.Color(204, 255, 204));
        table_detailRoom.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table_detailRoom.setForeground(new java.awt.Color(0, 0, 0));
        table_detailRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room No", "Activate", "Room Status"
            }
        ));
        jScrollPane1.setViewportView(table_detailRoom);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 346, 676, 142));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Update & Delete Rooms");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 154, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 700, 10));

        lbl_all_rooms.setFont(new java.awt.Font("Algerian", 1, 28)); // NOI18N
        lbl_all_rooms.setForeground(new java.awt.Color(0, 0, 0));
        lbl_all_rooms.setText("All Rooms");
        getContentPane().add(lbl_all_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 305, 162, 29));

        btn_search.setBackground(new java.awt.Color(204, 255, 204));
        btn_search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(0, 0, 0));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 247, 156, -1));

        btn_close.setBackground(new java.awt.Color(255, 204, 204));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ClosNew.png"))); // NOI18N
        btn_close.setBorder(null);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        Connect(); // Ensure the connection is established before performing operations
        String Room = text_room_no.getText();
        String Activate;
        String Room_Status = "Not Booked";

        if (check_yes.isSelected()) {
            Activate = "Yes";
        } else {
            Activate = "No";
        }

        try {
            PreparedStatement ps = con.prepareStatement("insert into room values(?,?,?)");
            ps.setString(1, Room);
            ps.setString(2, Activate);
            ps.setString(3, Room_Status);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            table_details();
            clear();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        Connect();
        String Room=text_room_no2.getText();
        int i=0;
        try
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from room where Room='"+Room+"'");
            while(rs.next())
            {
                i=1;
                if(rs.getString(3).equals("Booked"))
                {
                    JOptionPane.showMessageDialog(null,"This Room is booked");
                    clear();
                }
                else
                {
                    text_room_no2.setEditable(false);
                    text_room_no2.setForeground(Color.red);
                    text_room_no2.setBackground(Color.PINK);
                    
                    if (rs.getString(2).equals("Yes")) 
                        check_yes2.setSelected(true); 
                    
                    else 
                    
                        check_yes2.setSelected(false); 
                }
            }
            if(i==0)
            {
                JOptionPane.showMessageDialog(null,"Room Number Does nor Exist");
                clear();
            }
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        Connect();
        String Room=text_room_no2.getText();
        String Activate;
        if(check_yes2.isSelected())
            Activate="Yes";
        else
            Activate="No";
        
        try
        {
            Statement st=con.createStatement();
            st.executeUpdate("UPDATE room SET Activate = '" + Activate + "' WHERE Room = '" + Room + "'");
            JOptionPane.showMessageDialog(null,"Successsfully Updated");
            table_details();
            clear();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       
        Connect();
        String Room=text_room_no2.getText();
        
        
        try
        {
            Statement st=con.createStatement();
            st.executeUpdate("delete from room where Room='"+Room+"'");
            JOptionPane.showMessageDialog(null,"Successsfully Deleted");
            table_details();
            clear();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btn_closeActionPerformed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Manage_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Room().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JCheckBox check_yes;
    private javax.swing.JCheckBox check_yes1;
    private javax.swing.JCheckBox check_yes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_ac_Deac2;
    private javax.swing.JLabel lbl_ac_dac;
    private javax.swing.JLabel lbl_ac_dac1;
    private javax.swing.JLabel lbl_add_rooms;
    private javax.swing.JLabel lbl_all_rooms;
    private javax.swing.JLabel lbl_room_no;
    private javax.swing.JLabel lbl_room_no1;
    private javax.swing.JLabel lbl_room_no2;
    private javax.swing.JTable table_detailRoom;
    private javax.swing.JTextField text_room_no;
    private javax.swing.JTextField text_room_no1;
    private javax.swing.JTextField text_room_no2;
    // End of variables declaration//GEN-END:variables
}
