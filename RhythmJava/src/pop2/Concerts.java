/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Concerts extends javax.swing.JInternalFrame {

    /**
     * Creates new form Concerts
     */
    public Concerts() {
        initComponents();
        Concerts();
        //Validation();
    }
    public void Concerts(){
        
         DefaultTableModel table = new DefaultTableModel();
    
   
    
    table.addColumn("Concert Name");
    table.addColumn("Date Time");
    table.addColumn("Location");
    table.addColumn("Organizer");
    table.addColumn("No Of Seats");
    table.addColumn("Ticket Price");
    
   
    try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Rhythm","root",""))
    {
        
       String sql = "SELECT ConcertName,ConcertDateTime,ConcertLocation,ConcertOrganizer,NoOfSeats,TicketPrice FROM concerts";
        
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
               
               
               
            });
        }
        ConcertTable.setModel(table);
        ConcertTable.setShowHorizontalLines(true); 
       
        
       
        
        
        
        
        
        
    }catch(Exception e){
        
    } 
}

    public void fetch(){
        
        
        
    }
    
    
    public void Validation(){
        
        String TotalSeats = txtNoOfSeats.getText();
            int result = Integer.parseInt(TotalSeats);	
            
            String BookSeats =txtBookedSeats.getText();
            int result2 = Integer.parseInt(BookSeats);
            
            if(result2>result){
                Validation.setText("Invalid Book Seats For booking");
       JOptionPane.showMessageDialog(null,"Invalid no of seats .");
            }
    }
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ConcertTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtConcertName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtOrganizer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDateTime = new javax.swing.JTextField();
        txtNoOfSeats = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTicketPrice = new javax.swing.JTextField();
        txtBookedSeats = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Type = new javax.swing.JComboBox();
        Validation = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Concerts");

        ConcertTable.setBackground(new java.awt.Color(55, 38, 92));
        ConcertTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConcertTable.setForeground(new java.awt.Color(255, 255, 255));
        ConcertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Concert Name", "Date Time", "Location", "Oragnizer", "No Of Seats", "Ticket Price"
            }
        ));
        ConcertTable.setRowHeight(50);
        ConcertTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConcertTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ConcertTable);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Concert Details");

        txtConcertName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConcertNameActionPerformed(evt);
            }
        });

        txtOrganizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrganizerActionPerformed(evt);
            }
        });

        jLabel4.setText("Concert Name");

        jLabel5.setText("Date/Time");

        jLabel6.setText("Location");

        jLabel7.setText("Organizer");

        jLabel9.setText("No.of Seats");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Book Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ticket Price");

        txtTicketPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTicketPriceActionPerformed(evt);
            }
        });

        txtBookedSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookedSeatsActionPerformed(evt);
            }
        });
        txtBookedSeats.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBookedSeatsKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBookedSeatsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBookedSeatsKeyReleased(evt);
            }
        });

        jLabel11.setText("Booked Seats");

        jLabel12.setText("Ticket Type");

        Type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C" }));

        Validation.setBackground(new java.awt.Color(255, 0, 51));
        Validation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Validation.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(587, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtTicketPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(9, 9, 9)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtConcertName)
                                    .addComponent(txtLocation)
                                    .addComponent(txtOrganizer)
                                    .addComponent(txtDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBookedSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(Type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Validation, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(jLabel1)
                    .addContainerGap(400, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConcertName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrganizer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTicketPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBookedSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Validation, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTicketPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTicketPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTicketPriceActionPerformed

    private void txtConcertNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConcertNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConcertNameActionPerformed

    private void txtOrganizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrganizerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrganizerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String Username=UserPanel.txtU.getText();
        
        
            String TotalSeats = txtNoOfSeats.getText();
            int result = Integer.parseInt(TotalSeats);	
            
            String BookSeats =txtBookedSeats.getText();
            int result2 = Integer.parseInt(BookSeats);	
            
            
        try{

            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection(myUrl, "root", "");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Rhythm","root","")) {
                String query = "INSERT INTO Booking (User,ConcertName,ConcertDate,ConcertLocation,ConcertOrganizer,NoOfSeats,TicketPrice,BookedSeats)" + "values(?,?,?,?,?,?,?,?)";
                
                PreparedStatement st = conn.prepareStatement(query);
                
               
                st.setString(1,Username);
                
                st.setString(2,txtConcertName.getText());
                 
                st.setString(3,txtDateTime.getText());
                
                st.setString(4,txtLocation.getText());
                
                st.setString(5,txtOrganizer.getText());
                
                st.setString(6,txtNoOfSeats.getText());
                
                st.setString(7,txtTicketPrice.getText());
                
                st.setString(8,txtBookedSeats.getText());
                 
                
               if(result2<=result){
               st.execute();
              JOptionPane.showMessageDialog(null,"Booking Successful.Enjoy using Rhythm for more concerts.");

          // Concerts();
           
           InvoiceGen yu=new InvoiceGen();
           yu.setVisible(true);
                
            }
               else {
                   
                    JOptionPane.showMessageDialog(null,"Invalid no of seats .");
                   
            }
            }
            
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ConcertTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConcertTableMouseClicked
       
        
        DefaultTableModel model = (DefaultTableModel)ConcertTable.getModel();

        
        int selectedRowIndex = ConcertTable.getSelectedRow();

       
        txtConcertName.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtDateTime.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtLocation.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtOrganizer.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtNoOfSeats.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtTicketPrice.setText(model.getValueAt(selectedRowIndex, 5).toString());
        
        //txtOrganizer.setText(model.getValueAt(selectedRowIndex, 6).toString());
        
        
        
       
        
    }//GEN-LAST:event_ConcertTableMouseClicked

    private void txtBookedSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookedSeatsActionPerformed
        // TODO add your handling code here:
        
        
          String TotalSeats = txtNoOfSeats.getText();
            int result = Integer.parseInt(TotalSeats);	
            
            String BookSeats =txtBookedSeats.getText();
            int result2 = Integer.parseInt(BookSeats);
            
            if(result>=result2){
        JOptionPane.showMessageDialog(null,"Invalid no of seats .");
            }
            
           
            
            
    }//GEN-LAST:event_txtBookedSeatsActionPerformed

    private void txtBookedSeatsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookedSeatsKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBookedSeatsKeyTyped

    private void txtBookedSeatsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookedSeatsKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBookedSeatsKeyPressed

    private void txtBookedSeatsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookedSeatsKeyReleased
        // TODO add your handling code here:
        
        
        // Validation.setText("");
    }//GEN-LAST:event_txtBookedSeatsKeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ConcertTable;
    public static javax.swing.JComboBox Type;
    private javax.swing.JLabel Validation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtBookedSeats;
    public static javax.swing.JTextField txtConcertName;
    public static javax.swing.JTextField txtDateTime;
    public static javax.swing.JTextField txtLocation;
    public static javax.swing.JTextField txtNoOfSeats;
    public static javax.swing.JTextField txtOrganizer;
    public static javax.swing.JTextField txtTicketPrice;
    // End of variables declaration//GEN-END:variables
}