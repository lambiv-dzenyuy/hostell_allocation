
package hostellallcation;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



public class Rooms extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pstatement = null;
    ResultSet results = null;
    Statement statement = null;
 
    public Rooms() {
        initComponents();
        showRooms();
    }

 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RoomsBtn = new javax.swing.JLabel();
        StudentsBtn = new javax.swing.JLabel();
        DashboardBtn = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        AllocationsBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RoomName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StatusComb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        RoomsList = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EdithBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TypeComb = new javax.swing.JComboBox<>();
        StatusCmb = new javax.swing.JComboBox<>();
        TypeCmb = new javax.swing.JComboBox<>();
        RefreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        RoomsBtn.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        RoomsBtn.setForeground(new java.awt.Color(255, 255, 255));
        RoomsBtn.setText("Rooms");
        RoomsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsBtnMouseClicked(evt);
            }
        });

        StudentsBtn.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        StudentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentsBtn.setText("Students");
        StudentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentsBtnMouseClicked(evt);
            }
        });

        DashboardBtn.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        DashboardBtn.setForeground(new java.awt.Color(255, 255, 255));
        DashboardBtn.setText("Dashboard");
        DashboardBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardBtnMouseClicked(evt);
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

        AllocationsBtn.setFont(new java.awt.Font("sansserif", 2, 22)); // NOI18N
        AllocationsBtn.setForeground(new java.awt.Color(255, 255, 255));
        AllocationsBtn.setText("Allocations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomsBtn)
                    .addComponent(StudentsBtn)
                    .addComponent(DashboardBtn)
                    .addComponent(logoutBtn)
                    .addComponent(AllocationsBtn))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(RoomsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(StudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(AllocationsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(DashboardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(13, 13, 13))
        );

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

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Mange Rooms");

        RoomName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Name");

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Status");

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Price");

        StatusComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Allocated" }));
        StatusComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusCombActionPerformed(evt);
            }
        });

        RoomsList.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        RoomsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Type", "Status"
            }
        ));
        RoomsList.setGridColor(new java.awt.Color(0, 51, 51));
        RoomsList.setRowHeight(30);
        RoomsList.setRowMargin(1);
        RoomsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RoomsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(RoomsList);

        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EdithBtn.setText("Edith");
        EdithBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdithBtnMouseClicked(evt);
            }
        });
        EdithBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdithBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Type");

        TypeComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        TypeComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeCombActionPerformed(evt);
            }
        });

        StatusCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Free", "Allocated" }));
        StatusCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusCmbActionPerformed(evt);
            }
        });

        TypeCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        TypeCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeCmbActionPerformed(evt);
            }
        });

        RefreshBtn.setText("Refresh");
        RefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AddBtn)
                                        .addGap(35, 35, 35)
                                        .addComponent(EdithBtn))
                                    .addComponent(StatusComb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(RoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(TypeComb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StatusCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(TypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(RefreshBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StatusComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TypeComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn)
                            .addComponent(EdithBtn))
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RoomNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNameActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void StatusCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusCombActionPerformed

    int key =0;
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
     if(key == 0)
       {
           JOptionPane.showMessageDialog(this,"Select a Room!!!!!");
       } else {
           try {
               CountRooms();
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               PreparedStatement save = connection.prepareStatement("delete from Rooms where RoomNumber = ?");
               save.setInt(1,key);
               int row = save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Deleted!!!!!");
               connection.close();
               showRooms();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
       }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

      private void FilterByType(){
        try {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               statement = connection.createStatement();
                if(StatusCmb.getSelectedIndex() == -1){
               results = statement.executeQuery("select * from Rooms where RoomType = '" + TypeCmb.getSelectedItem().toString()+"'");
                } else {
                    results = statement.executeQuery("select * from Rooms where RoomType = '" + TypeCmb.getSelectedItem().toString()+"' and RoomStatus = '"+ StatusCmb.getSelectedItem().toString() + "'" );
                }
               RoomsList.setModel(DbUtils.resultSetToTableModel(results));
              
               
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
    }
    
    private void FilterByStatus(){
        try {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               statement = connection.createStatement();
               if(TypeCmb.getSelectedIndex() == -1){
               results = statement.executeQuery("select * from Rooms where RoomStatus = '"+ StatusCmb.getSelectedItem().toString() + "'" );
               } else {
                results = statement.executeQuery("select * from Rooms where RoomStatus = '"+ StatusCmb.getSelectedItem().toString() + "' and RoomType = '" +TypeCmb.getSelectedItem().toString()+"'");
               }
               RoomsList.setModel(DbUtils.resultSetToTableModel(results));
              
               
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
    }
      
    private void showRooms(){
        try {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               statement = connection.createStatement();
               results = statement.executeQuery("select * from Rooms");
               RoomsList.setModel(DbUtils.resultSetToTableModel(results));
              
               
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
    }
    
    int roomId;
    private void CountRooms(){
            try {
                statement = connection.createStatement();
               results = statement.executeQuery("select Max(RoomNumber) from Rooms");
               results.next();
               roomId = results.getInt(1)+1;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,e);
            }
    }
    
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
       if(RoomName.getText().isEmpty() || StatusComb.getSelectedIndex() == -1 || TypeComb.getSelectedIndex() == -1  || Price.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing data!!!!!");
       } else {
           try {
               CountRooms();
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               PreparedStatement save = connection.prepareStatement("insert into Rooms values(?,?,?,?,?)");
               save.setInt(1,roomId);
               save.setString(2, RoomName.getText().toString());
               save.setString(3, TypeComb.getSelectedItem().toString());
               save.setString(4, StatusComb.getSelectedItem().toString());
               save.setString(5, Price.getText().toString());
               int row = save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Added!!!!!");
               connection.close();
               showRooms();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
       }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void TypeCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeCombActionPerformed

    private void RoomsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsListMouseClicked
        DefaultTableModel   model = (DefaultTableModel)RoomsList.getModel();
      int MyIndex = RoomsList.getSelectedRow();
      key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
      RoomName.setText(model.getValueAt(MyIndex, 1).toString());
      StatusComb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
      TypeComb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
      Price.setText(model.getValueAt(MyIndex,4 ).toString());
 
      
    }//GEN-LAST:event_RoomsListMouseClicked

    private void EdithBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdithBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdithBtnActionPerformed

    private void EdithBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdithBtnMouseClicked
       if(RoomName.getText().isEmpty() || StatusComb.getSelectedIndex() == -1 || TypeComb.getSelectedIndex() == -1  || Price.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Missing data!!!!!");
       } else {
           try {
               CountRooms();
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HostellDb", "root", "root");
               PreparedStatement save = connection.prepareStatement("update Rooms set RoomName=?, RoomType=?, RoomStatus = ?, Cost =? where RoomNumber = ?");
               save.setInt(5,key);
               save.setString(1, RoomName.getText().toString());
               save.setString(2, TypeComb.getSelectedItem().toString());
               save.setString(3, StatusComb.getSelectedItem().toString());
               save.setString(4, Price.getText().toString());
               int row = save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Room Updated!!!!!");
               connection.close();
               showRooms();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,ex);
           }
       }
    }//GEN-LAST:event_EdithBtnMouseClicked

    private void RoomsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RoomsBtnMouseClicked
        JOptionPane.showMessageDialog(this,"You are currently on Rooms View!!!!!!");
    }//GEN-LAST:event_RoomsBtnMouseClicked

    private void StudentsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentsBtnMouseClicked
       new Students().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StudentsBtnMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
          new Allocations().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void DashboardBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardBtnMouseClicked
         new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardBtnMouseClicked

    private void RefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RefreshBtnActionPerformed

    private void TypeCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeCmbActionPerformed
        FilterByType();
    }//GEN-LAST:event_TypeCmbActionPerformed

    private void StatusCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusCmbActionPerformed
        FilterByStatus();
    }//GEN-LAST:event_StatusCmbActionPerformed
    
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
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel AllocationsBtn;
    private javax.swing.JLabel DashboardBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EdithBtn;
    private javax.swing.JTextField Price;
    private javax.swing.JButton RefreshBtn;
    private javax.swing.JTextField RoomName;
    private javax.swing.JLabel RoomsBtn;
    private javax.swing.JTable RoomsList;
    private javax.swing.JComboBox<String> StatusCmb;
    private javax.swing.JComboBox<String> StatusComb;
    private javax.swing.JLabel StudentsBtn;
    private javax.swing.JComboBox<String> TypeCmb;
    private javax.swing.JComboBox<String> TypeComb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoutBtn;
    // End of variables declaration//GEN-END:variables

}
