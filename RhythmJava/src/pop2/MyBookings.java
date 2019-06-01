 
package pop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class MyBookings extends javax.swing.JInternalFrame {

   
    public MyBookings() {
        initComponents();
       
    }
    
    
    
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConcertTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("MyBookings");

        ConcertTable.setBackground(new java.awt.Color(55, 38, 92));
        ConcertTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConcertTable.setForeground(new java.awt.Color(255, 255, 255));
        ConcertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BookID", "UserName", "Concert Name", "Date Time", "Location", "Oragnizer", "NoOfSeats", "TicketPrice", "BookedTicket"
            }
        ));
        ConcertTable.setRowHeight(50);
        ConcertTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConcertTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ConcertTable);

        jButton1.setText("View Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
        );

        setBounds(0, 0, 863, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void ConcertTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConcertTableMouseClicked

       

    }//GEN-LAST:event_ConcertTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel table = new DefaultTableModel();
         
         String Username=LoginForm.txtUsername.getText();
   
    table.addColumn("BookID");
    table.addColumn("ConcertName");
    table.addColumn("UserName");
    table.addColumn("DateTime");
    table.addColumn("Location");
    table.addColumn("Organizer");
    table.addColumn("No.OfSeats");
    table.addColumn("TicektPrice");
    table.addColumn("BookedTicket");
   
   
   
    try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Rhythm","root",""))
    {
        
       String sql = "SELECT * FROM booking";
        
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
                rs.getString(8),
                rs.getString(9),
               
            });
        }
        ConcertTable.setModel(table);
        ConcertTable.setShowHorizontalLines(true); 
       
        
       
        
        
        
        
        
        
    }catch(Exception e){
        
    }
    
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ConcertTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
