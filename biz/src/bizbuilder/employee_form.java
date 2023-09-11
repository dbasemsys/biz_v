
package bizbuilder;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class employee_form extends javax.swing.JFrame {
    

    String path2 = null;
    
    public employee_form() {
        initComponents();
        
        
        ef_txt_eid.enable(false);
        tblRowCount();        
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ef_txt_eid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ef_txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ef_txt_role = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ef_txt_addr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ef_btn_cancel = new javax.swing.JButton();
        ef_btn_save = new javax.swing.JButton();
        ef_txt_br = new javax.swing.JTextField();
        ef_txt_acc_no = new javax.swing.JTextField();
        ef_txt_phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ef_txt_nic = new javax.swing.JTextField();
        ef_jdate = new com.toedter.calendar.JDateChooser();
        ef_lbl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Employee Id");

        ef_txt_eid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_eid.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_eid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        ef_txt_eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ef_txt_eidActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        ef_txt_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_name.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Work Role");

        ef_txt_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_role.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NIC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Address");

        ef_txt_addr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_addr.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_addr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Bank Name, Branch");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Account Nubmer");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Contact");

        ef_btn_cancel.setBackground(new java.awt.Color(102, 102, 255));
        ef_btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        ef_btn_cancel.setText("Cancel");
        ef_btn_cancel.setBorderPainted(false);
        ef_btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ef_btn_cancelActionPerformed(evt);
            }
        });

        ef_btn_save.setBackground(new java.awt.Color(102, 102, 255));
        ef_btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_btn_save.setForeground(new java.awt.Color(255, 255, 255));
        ef_btn_save.setText("Save");
        ef_btn_save.setBorderPainted(false);
        ef_btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ef_btn_saveActionPerformed(evt);
            }
        });

        ef_txt_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_br.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_br.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        ef_txt_acc_no.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_acc_no.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_acc_no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        ef_txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Join Date");

        ef_txt_nic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_nic.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_nic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        ef_jdate.setBackground(new java.awt.Color(255, 255, 255));
        ef_jdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        ef_lbl_image.setBackground(new java.awt.Color(102, 102, 255));
        ef_lbl_image.setForeground(new java.awt.Color(102, 102, 255));
        ef_lbl_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ef_lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/log-out.png"))); // NOI18N
        ef_lbl_image.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255))); // NOI18N
        ef_lbl_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ef_lbl_imageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ef_txt_br, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_nic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ef_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(ef_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ef_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ef_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ef_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ef_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_role, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ef_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel2, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ef_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ef_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ef_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ef_txt_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ef_txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ef_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ef_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ef_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ef_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(ef_jdate, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ef_btn_cancel)
                    .addComponent(ef_btn_save))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ef_txt_eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_txt_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ef_txt_eidActionPerformed

    private void ef_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_btn_saveActionPerformed
        if(validation() == true)
        {
            insertCustomerDetailstoDb();
        }        
    }//GEN-LAST:event_ef_btn_saveActionPerformed

    private void ef_btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_btn_cancelActionPerformed
        Clear();
    }//GEN-LAST:event_ef_btn_cancelActionPerformed

    private void ef_lbl_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ef_lbl_imageMouseClicked
        selectImage();
    }//GEN-LAST:event_ef_lbl_imageMouseClicked


    //Validation
    public boolean validation()
    {               
        if(ef_txt_name.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Employee Name");
            return false;
        }
        if(ef_txt_role.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter the Role");
            return false;
        }
        if(ef_txt_nic.getText().equals("") || ef_txt_nic.getText().length()!=12)
        {
            JOptionPane.showMessageDialog(this, "Enter National Identity Card Number");
            return false;
        }
        if(ef_txt_addr.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Address");
            return false;
        }
        if(ef_txt_br.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Branch");
            return false;
        }
        if(ef_txt_acc_no.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Account Number");
            return false;
        }
        if(ef_txt_phone.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Contact Number");
            return false;
        }
        if(ef_txt_phone.getText().equals("") || ef_txt_phone.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Enter Phone Valid No");
            return false;
        }
        //Write Validation Code to Joined_date ..................................... 
        Date s_date = ef_jdate.getDate();
        if(s_date == null)
        {
            JOptionPane.showMessageDialog(this,"Select the Date");
            return false;
        }                        
        return true;
    }
    
    ///Find Table Row Count
    public void tblRowCount()
    {                
        try
        { 
            Connection con = DBConnection.getConnection();

            String sql = "select MAX(employee_id) AS maxEmployeeId from employee ";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            int maxEmpId = 0;
            if (rs.next()) {
                maxEmpId = rs.getInt("maxEmployeeId");
            }
            int eid_int = maxEmpId+1;
            String eid_string = String.valueOf(eid_int);
            ef_txt_eid.setText(eid_string);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
        
    }    
    
    //Insert records to customer Table
    public void insertCustomerDetailstoDb()
    {        
        int eid = Integer.parseInt(ef_txt_eid.getText());
        String name = ef_txt_name.getText();    
        String role = ef_txt_role.getText();
        String nic = ef_txt_nic.getText();
        String addr = ef_txt_addr.getText();
        String br = ef_txt_br.getText();
        String acc_no = ef_txt_acc_no.getText();
        String contact = ef_txt_phone.getText();
        //Write Code to Serviced_date ..................................... 
        Date s_date = ef_jdate.getDate();
        long l =  s_date.getTime();
        java.sql.Date jdate = new java.sql.Date(l);
        String work_status = "Still Working";               
        
        try
        {
            Connection con = DBConnection.getConnection();
            
            String sql = "insert into employee (employee_id ,name,role,nic,account_number,account_branch,address,contact,join_date,work_status,profile) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setInt(1,eid);
            pst.setString(2,name);
            pst.setString(3,role);  
            pst.setString(4,nic); 
            pst.setString(7,addr); 
            pst.setString(6,br); 
            pst.setString(5,acc_no); 
            pst.setString(8,contact); 
            pst.setDate(9,jdate); 
            pst.setString(10,work_status); 
            
            InputStream is = new FileInputStream(new File(path2));  //Image 
            pst.setBlob(11,is) ;                                    //Image 
            
            int updateRowCount = pst.executeUpdate();
            
            if(updateRowCount>0)
            {
                JOptionPane.showMessageDialog(this, "Employee Details Saved ");
                Clear();
                tblRowCount();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Delete Records 
    public void Clear()
    {        
        ef_txt_name.setText("");
        ef_txt_role.setText("");
        ef_txt_nic.setText("");
        ef_txt_addr.setText("");
        ef_txt_br.setText("");
        ef_txt_acc_no.setText("");
        ef_txt_phone.setText("");
        
        //Clear Joined Date
        //Date j_date = ef_jdate.getDate();
        ef_jdate.setDate(null);    
        
        //Clear Image 
        ef_lbl_image.setIcon(null);
    }
    
    public void selectImage()
    {
        JFileChooser chooser  = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        
        
        try
        {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(134,172,Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            ef_lbl_image.setIcon(icon);
            path2 = path;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            
    }
    
    
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
            java.util.logging.Logger.getLogger(employee_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_form().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ef_btn_cancel;
    private javax.swing.JButton ef_btn_save;
    private com.toedter.calendar.JDateChooser ef_jdate;
    private javax.swing.JLabel ef_lbl_image;
    private javax.swing.JTextField ef_txt_acc_no;
    private javax.swing.JTextField ef_txt_addr;
    private javax.swing.JTextField ef_txt_br;
    private javax.swing.JTextField ef_txt_eid;
    private javax.swing.JTextField ef_txt_name;
    private javax.swing.JTextField ef_txt_nic;
    private javax.swing.JTextField ef_txt_phone;
    private javax.swing.JTextField ef_txt_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
