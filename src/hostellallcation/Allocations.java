package hostellallcation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Allocations extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pstatement = null;
    ResultSet results = null;
    Statement statement = null;
    
    
    public Allocations() {
        initComponents();
        showAllocations();
        getRooms();
        getStudents();
    }

    private void getRooms(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               statement = connection.createStatement();
               results = statement.executeQuery("select * from Rooms where RoomStatus='Free'");
               while(results.next()){
                   int roomId = results.getInt("RoomNumber");
                   RoomsComb.addItem(""+roomId);
                   
               }
        } catch (Exception e) {
        }
        
    }
     private void getStudents(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               statement = connection.createStatement();
               results = statement.executeQuery("select * from Student");
               while(results.next()){
                   String studentId = results.getString("studentMatricule");
                   StudentComb.addItem(studentId);
                   
               }
        } catch (Exception e) {
        }
        
    }
 
  private void showAllocations(){
        try {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               statement = connection.createStatement();
               results = statement.executeQuery("select * from Allocation");
               AllocationsTable.setModel(DbUtils.resultSetToTableModel(results));
              
               
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
    }
    int allocationId;
    private void CountAllocations(){
            try {
                statement = connection.createStatement();
               results = statement.executeQuery("select Max(allocationId) from Allocation");
               results.next();
               allocationId = results.getInt(1)+1;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
    }
    
    private void updateRoom(String status){
      try {
         
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               PreparedStatement save = connection.prepareStatement("update Rooms set RoomStatus=?  where RoomNumber= " +RoomsComb.getSelectedItem().toString());
               save.setString(1, status);
         
               int row = save.executeUpdate();
               
      } catch(Exception e){
                          JOptionPane.showMessageDialog(this,e);
      }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EntryDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StudentComb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllocationsTable = new javax.swing.JTable();
        AllocateBtn = new javax.swing.JButton();
        CancelBtn = new javax.swing.JButton();
        RoomsComb = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        DepatureTime = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Allocate Rooms");

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Room");

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Student");

        EntryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntryDateActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Entry Date");

        StudentComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentCombActionPerformed(evt);
            }
        });

        AllocationsTable.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        AllocationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Room", "Student", "Allocation Date", "Depature Date"
            }
        ));
        AllocationsTable.setGridColor(new java.awt.Color(51, 51, 51));
        AllocationsTable.setRowHeight(25);
        AllocationsTable.setRowMargin(1);
        AllocationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllocationsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AllocationsTable);

        AllocateBtn.setText("Add");
        AllocateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllocateBtnActionPerformed(evt);
            }
        });

        CancelBtn.setForeground(new java.awt.Color(255, 0, 51));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        RoomsComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsCombActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Depature Date");

        DepatureTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepatureTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(StudentComb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(EntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(DepatureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AllocateBtn)
                        .addGap(35, 35, 35)
                        .addComponent(CancelBtn))
                    .addComponent(jLabel2)
                    .addComponent(RoomsComb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RoomsComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StudentComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EntryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DepatureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AllocateBtn)
                            .addComponent(CancelBtn))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        CancelBtn.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rooms");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("signout");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Allocations");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logoutBtn)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(logoutBtn)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntryDateActionPerformed

    private void StudentCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentCombActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void RoomsCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomsCombActionPerformed

    private void DepatureTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepatureTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepatureTimeActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Students().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Rooms().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JOptionPane.showMessageDialog(this,"You are currently Viewing Allocations!!!!!!");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void AllocateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllocateBtnActionPerformed
          if(EntryDate.getText().isEmpty() || DepatureTime.getText().isEmpty() || RoomsComb.getSelectedIndex() == -1 || StudentComb.getSelectedIndex() == -1)
       {
           JOptionPane.showMessageDialog(this,"Missing data!!!!!");
       } else {
           try {
                CountAllocations();
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               PreparedStatement save = connection.prepareStatement("insert into Allocation values(?,?,?,?,?)");
              
               save.setInt(1, allocationId);
               save.setString(2, RoomsComb.getSelectedItem().toString());
               save.setString(3, StudentComb.getSelectedItem().toString());
               save.setString(4, new Date().toString());
                save.setString(5, DepatureTime.getText());
               int row = save.executeUpdate();
               JOptionPane.showMessageDialog(this,"New Allocation Made!!!!!");
               connection.close();
               showAllocations();
               updateRoom("Allocated");
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
       }
        
    }//GEN-LAST:event_AllocateBtnActionPerformed

    int key = 0;
    private void AllocationsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllocationsTableMouseClicked
       
          DefaultTableModel   model = (DefaultTableModel)AllocationsTable.getModel();
      int MyIndex = AllocationsTable.getSelectedRow();
      key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
      RoomsComb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
      StudentComb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
     EntryDate.setText(model.getValueAt(MyIndex, 3).toString());
      DepatureTime.setText(model.getValueAt(MyIndex, 4).toString());
      
    }//GEN-LAST:event_AllocationsTableMouseClicked

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
         if(key == 0)
       {
           JOptionPane.showMessageDialog(this,"Select an Allocation!!!!!");
       } else {
           try {
            
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               PreparedStatement save = connection.prepareStatement("delete from Allocation where allocationId = ?");
               save.setInt(1,key);
               int row = save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Allocation Deleted!!!!!");
               updateRoom("Free");
               connection.close();
               showAllocations();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
       }
        
    }//GEN-LAST:event_CancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Allocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Allocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Allocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Allocations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Allocations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllocateBtn;
    private javax.swing.JTable AllocationsTable;
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextField DepatureTime;
    private javax.swing.JTextField EntryDate;
    private javax.swing.JComboBox<String> RoomsComb;
    private javax.swing.JComboBox<String> StudentComb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    // End of variables declaration//GEN-END:variables
}
