
package pop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AlterConcerts extends javax.swing.JInternalFrame {

    
    public AlterConcerts() {
        initComponents();
        ShowDetails();
    }

    
    public void ShowDetails(){
        
        DefaultTableModel table = new DefaultTableModel();
    
   
    table.addColumn("Concert ID");
    table.addColumn("Concert Name");
    table.addColumn("Date Time");
    table.addColumn("Location");
    table.addColumn("Organizer");
    table.addColumn("No.Of Seats");
    table.addColumn("Ticket Price");
   
    try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Rhythm","root",""))
    {
        
       String sql = "SELECT * FROM concerts";
        
       PreparedStatement st = conn.prepareStatement(sql);
        
             ResultSet rs = (ResultSet) st.executeQuery();
             // rs =(OracleResultSet) pst.executeQuery();
        
        //ResultSet R = S.executeQuery(sql);
        
        while(rs.next()){
            table.addRow(new Object[]{
              rs.getString(1),
                rs.getString(2),
               rs.getString(3),
                rs.getString(4),
                rs.getString(5),
               rs.getString(6),
               rs.getString(7),
            });
        }
        ConcertTable.setModel(table);
        ConcertTable.setShowHorizontalLines(true); 
       
        
       
        
        
        
        
        
        
    }catch(Exception e){
        
    }
    
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNoOfSeats = new javax.swing.JTextField();
        txtTicketPrice = new javax.swing.JTextField();
        txtConcertOrganizer = new javax.swing.JTextField();
        txtConcertLocation = new javax.swing.JTextField();
        txtConcertDate = new javax.swing.JTextField();
        txtConcertName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ConcertID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConcertTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(863, 620));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Alter Concerts");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Concert Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Concert Date/Time:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Concert Location:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Concert Organizer:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("No of Seats:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Ticket Price:");

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Cancel Concert");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Edit Concert");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("ConcertID");

        ConcertTable.setBackground(new java.awt.Color(55, 38, 92));
        ConcertTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConcertTable.setForeground(new java.awt.Color(255, 255, 255));
        ConcertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ConcertID", "Concert Name", "Date Time", "Location", "Oragnizer", "No. of Seats", "Ticket Price"
            }
        ));
        ConcertTable.setRowHeight(50);
        ConcertTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConcertTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ConcertTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(79, 79, 79))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel6)))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTicketPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConcertOrganizer, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConcertLocation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConcertDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConcertName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConcertID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ConcertID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtConcertName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtConcertDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConcertLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtConcertOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(98, 98, 98))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           
         DefaultTableModel model = (DefaultTableModel)ConcertTable.getModel();

        int selectedRowIndex = ConcertTable.getSelectedRow();
        
        String ID=model.getValueAt(selectedRowIndex, 0).toString();
        
        
        try{

            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection(myUrl, "root", "");

            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Rhythm","root","");

           
            String query = "DELETE FROM Concerts WHERE ConcertID=?";

            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1,ID);

            
            
            st.execute();

            conn.close();

            JOptionPane.showMessageDialog(null,"Successfully Deleted Choosen Concert details From Concert Lists");
            ShowDetails();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConcertTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConcertTableMouseClicked

        DefaultTableModel model = (DefaultTableModel)ConcertTable.getModel();

        int selectedRowIndex = ConcertTable.getSelectedRow();
        
        ConcertID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtConcertName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtConcertDate.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtConcertLocation.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtConcertOrganizer.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtNoOfSeats.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtTicketPrice.setText(model.getValueAt(selectedRowIndex, 6).toString());
        //txtNoOfTickets.setText(model.getValueAt(selectedRowIndex, 5).toString());

        //txtOrganizer.setText(model.getValueAt(selectedRowIndex, 6).toString());

    }//GEN-LAST:event_ConcertTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel)ConcertTable.getModel();

        int selectedRowIndex = ConcertTable.getSelectedRow();
        
        String ID=model.getValueAt(selectedRowIndex, 0).toString();
        
        
        try{

            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection(myUrl, "root", "");

            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Rhythm","root","");

            //UPDATE `members` SET `contact_number` = '0759 253 542' WHERE `membership_number` = 1;
            //UPDATE `table_name` SET `column_name` = `new_value' [WHERE condition];
            String query = "UPDATE Concerts SET ConcertName=?,ConcertDateTime=?,ConcertLocation=?,ConcertOrganizer=?,NoOfSeats=?,TicketPrice=? WHERE ConcertID=?";

            PreparedStatement st = conn.prepareStatement(query);

            st.setString(1,txtConcertName.getText());

            st.setString(2,txtConcertDate.getText());

            st.setString(3,txtConcertLocation.getText());

            st.setString(4,txtConcertOrganizer.getText());

            st.setString(5,txtNoOfSeats.getText());

            st.setString(6,txtTicketPrice.getText());

           // st.setString(7,txtTicketPrice.getText());
            
            st.setString(7,ID);
            
            st.execute();

            conn.close();

            JOptionPane.showMessageDialog(null,"Successfully Updated in Concert Lists");
            ShowDetails();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ConcertID;
    private javax.swing.JTable ConcertTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtConcertDate;
    private javax.swing.JTextField txtConcertLocation;
    private javax.swing.JTextField txtConcertName;
    private javax.swing.JTextField txtConcertOrganizer;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtTicketPrice;
    // End of variables declaration//GEN-END:variables
}
