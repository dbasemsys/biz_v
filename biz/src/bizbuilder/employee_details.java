
package bizbuilder;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class employee_details extends javax.swing.JFrame {


    public employee_details() {
        initComponents();        
        
        setAllCustomerDetails();
        
        jPanel2.setVisible(false);
        // Hide Left Employee Datails 
        ed_lbl_ldate.setVisible(false);
        ed_txt_ldate.setVisible(false);
        ed_lbl_epf.setVisible(false);
        ed_txt_epf.setVisible(false);
        ed_lbl_sdate.setVisible(false);
        ed_txt_sdate.setVisible(false);
        ed_lbl_epf_info.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        scrollpane2 = new bizbuilder.Scrollpane();
        jPanel3 = new javax.swing.JPanel();
        ed_lbl_image = new javax.swing.JLabel();
        ed_txt_eid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ed_txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ed_txt_role = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ed_txt_addr = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ed_txt_br = new javax.swing.JTextField();
        ed_txt_acc_no = new javax.swing.JTextField();
        ed_txt_phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ed_lbl_ldate = new javax.swing.JLabel();
        ed_lbl_epf = new javax.swing.JLabel();
        ed_txt_jdate = new javax.swing.JTextField();
        ed_txt_ldate = new javax.swing.JTextField();
        ed_txt_epf = new javax.swing.JTextField();
        ed_txt_sdate = new javax.swing.JTextField();
        ed_txt_nic = new javax.swing.JTextField();
        ed_txt_status = new javax.swing.JTextField();
        ed_btn_edit = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        scrollpane1 = new bizbuilder.Scrollpane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ed_tbl_salary = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        ed_lbl_epf_info = new javax.swing.JLabel();
        ed_lbl_sdate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        scrollpane3 = new bizbuilder.Scrollpane();
        jScrollPane4 = new javax.swing.JScrollPane();
        ed_tbl_emp = new javax.swing.JTable();
        ed_cmb_filter = new rojerusan.RSComboMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane2.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ed_lbl_image.setBackground(new java.awt.Color(255, 255, 255));
        ed_lbl_image.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_image.setForeground(new java.awt.Color(102, 102, 255));
        ed_lbl_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ed_lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (2).png"))); // NOI18N
        ed_lbl_image.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ed_txt_eid.setEditable(false);
        ed_txt_eid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_eid.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_eid.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name");

        ed_txt_name.setEditable(false);
        ed_txt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_name.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_name.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Work Role");

        ed_txt_role.setEditable(false);
        ed_txt_role.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_role.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_role.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NIC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Address");

        ed_txt_addr.setEditable(false);
        ed_txt_addr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_addr.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_addr.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Bank Name, Branch");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Account Nubmer");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Contact");

        ed_txt_br.setEditable(false);
        ed_txt_br.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_br.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_br.setBorder(null);

        ed_txt_acc_no.setEditable(false);
        ed_txt_acc_no.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_acc_no.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_acc_no.setBorder(null);

        ed_txt_phone.setEditable(false);
        ed_txt_phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_phone.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Join Date");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Work Status");

        ed_lbl_ldate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_ldate.setText("Left Date");

        ed_lbl_epf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_epf.setText("EPF Pending");

        ed_txt_jdate.setEditable(false);
        ed_txt_jdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_jdate.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_jdate.setBorder(null);

        ed_txt_ldate.setEditable(false);
        ed_txt_ldate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_ldate.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_ldate.setBorder(null);

        ed_txt_epf.setEditable(false);
        ed_txt_epf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_epf.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_epf.setBorder(null);

        ed_txt_sdate.setEditable(false);
        ed_txt_sdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_sdate.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_sdate.setBorder(null);

        ed_txt_nic.setEditable(false);
        ed_txt_nic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_nic.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_nic.setBorder(null);

        ed_txt_status.setEditable(false);
        ed_txt_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_status.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_status.setBorder(null);

        ed_btn_edit.setBackground(new java.awt.Color(102, 102, 255));
        ed_btn_edit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        ed_btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit 16px.png"))); // NOI18N
        ed_btn_edit.setText("Edit");
        ed_btn_edit.setFocusPainted(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Salary Details");

        ed_tbl_salary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salary Month", "Date", "Salary", "EPF", "Payable Salary"
            }
        ));
        jScrollPane2.setViewportView(ed_tbl_salary);

        scrollpane1.setViewportView(jScrollPane2);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Employee Id");

        ed_lbl_epf_info.setBackground(new java.awt.Color(0, 204, 51));
        ed_lbl_epf_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_epf_info.setText("Message");

        ed_lbl_sdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_sdate.setText("Settled date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(scrollpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ed_lbl_epf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ed_lbl_ldate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ed_lbl_sdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(100, 100, 100)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ed_txt_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(ed_txt_br, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_acc_no, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_jdate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_phone, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_name, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_role, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_eid, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_nic, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_addr, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_epf, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_ldate, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ed_txt_sdate, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(ed_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ed_btn_edit)
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addComponent(ed_lbl_epf_info, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ed_lbl_epf, ed_lbl_ldate, jLabel10, jLabel11, jLabel12, jLabel2, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ed_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_btn_edit))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_lbl_ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_lbl_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(ed_lbl_epf_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ed_lbl_sdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        scrollpane2.setViewportView(jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane3.setBorder(null);
        scrollpane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ed_tbl_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Role", "Profile", "NIC", "Account Number", "Account Branch", "Address", "Contact", "Join Date", "Work Status", "Employee Left Date", "Epf Settled or Not", "Total Epf", "Setteled Date"
            }
        ));
        ed_tbl_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ed_tbl_empMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ed_tbl_emp);
        if (ed_tbl_emp.getColumnModel().getColumnCount() > 0) {
            ed_tbl_emp.getColumnModel().getColumn(0).setMinWidth(80);
            ed_tbl_emp.getColumnModel().getColumn(1).setMinWidth(180);
            ed_tbl_emp.getColumnModel().getColumn(2).setMinWidth(100);
        }

        scrollpane3.setViewportView(jScrollPane4);

        ed_cmb_filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Still Working", "Left" }));
        ed_cmb_filter.setColorArrow(new java.awt.Color(102, 102, 255));
        ed_cmb_filter.setColorBorde(new java.awt.Color(102, 102, 255));
        ed_cmb_filter.setColorFondo(new java.awt.Color(102, 102, 255));
        ed_cmb_filter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_cmb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_cmb_filterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ed_cmb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(ed_cmb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(scrollpane3, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ed_tbl_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ed_tbl_empMouseClicked
        
        jPanel2.setVisible(true);
        int rowNo = ed_tbl_emp.getSelectedRow();
        TableModel model = ed_tbl_emp.getModel();
        
        try
        {        
            ed_txt_eid.setText(model.getValueAt(rowNo,0).toString());
            ed_txt_name.setText(model.getValueAt(rowNo,1).toString());
            ed_txt_role.setText(model.getValueAt(rowNo,2).toString());
            ed_txt_nic.setText(model.getValueAt(rowNo,4).toString());  
            ed_txt_acc_no.setText(model.getValueAt(rowNo,5).toString());            
            ed_txt_br.setText(model.getValueAt(rowNo,6).toString());
            ed_txt_addr.setText(model.getValueAt(rowNo,7).toString());
            ed_txt_phone.setText(model.getValueAt(rowNo,8).toString());
            ed_txt_jdate.setText(model.getValueAt(rowNo,9).toString());
            ed_txt_status.setText(model.getValueAt(rowNo,10).toString());
            ed_txt_ldate.setText(model.getValueAt(rowNo,11).toString());    
            ed_txt_epf.setText(model.getValueAt(rowNo,13).toString());
            ed_txt_sdate.setText(model.getValueAt(rowNo,14).toString());
            
        //Image            
        ////////////////////
        //Method 1
            Blob imageBlob = (Blob) model.getValueAt(rowNo, 3);
            byte[] imageData = imageBlob.getBytes(1, (int) imageBlob.length());

            Image loadedImage = Toolkit.getDefaultToolkit().createImage(imageData);
            Image resizedImage = loadedImage.getScaledInstance(134, 172, Image.SCALE_SMOOTH);
            ImageIcon resizedIcon = new ImageIcon(resizedImage);
            ed_lbl_image.setIcon(resizedIcon);
        
        //Method 2    
            /*Blob image = (Blob) model.getValueAt(rowNo, 3);
            //String path = "C:\\Users\\YINESH\\Documents\\NetBeansProjects\\PROJECT WITH BRANCHES\\6 EMPLOYEE DETAILS VIEW\\biz\\src\\image\\img.jpg";
            //String path = "'..' + '\' + 'image' + '\' + 'img.jpg'";
            String path = "..\\..\\image\\img.jpg";
            //String path = "'..' + '\' + '..' + '\' + 'image' + '\' + 'img2.jpg'";
            JOptionPane.showMessageDialog(this,path);
            byte[] bytea = image.getBytes(1, (int) image.length());

            // Load the image from the byte array
            Image loadedImage = Toolkit.getDefaultToolkit().createImage(bytea);

            // Stretch the image to the desired size
            Image resizedImage = loadedImage.getScaledInstance(134, 172, Image.SCALE_SMOOTH);

            // Convert the resized image to an ImageIcon
            ImageIcon resizedIcon = new ImageIcon(resizedImage);

            // Set the resized ImageIcon to the label
            ed_lbl_image.setIcon(resizedIcon);

            // Save the resized image to a file
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(bytea);*/           
        /////////////

            String epf_settled_or_not = model.getValueAt(rowNo,12).toString();
            String status = ed_txt_status.getText();
            
            if(status.equalsIgnoreCase("Left"))
            {                
                ed_lbl_ldate.setVisible(true);
                ed_txt_ldate.setVisible(true);
                ed_lbl_epf.setVisible(true);
                ed_txt_epf.setVisible(true);
                ed_lbl_sdate.setVisible(true);
                ed_txt_sdate.setVisible(true);
                ed_lbl_epf_info.setVisible(true);
                                               
                if(epf_settled_or_not.equalsIgnoreCase("yes"))
                {
                    ed_lbl_epf_info.setText("EPF is settled");
                    Color foregroundColor = Color.decode("#107361");
                    ed_lbl_epf_info.setForeground(foregroundColor);
                    ed_lbl_sdate.setVisible(true);
                    ed_txt_sdate.setVisible(true);
                }
                if(epf_settled_or_not.equalsIgnoreCase("no"))
                {
                    ed_lbl_epf_info.setText("EPF is pending");
                    Color foregroundColor = Color.decode("#D92525");
                    ed_lbl_epf_info.setForeground(foregroundColor);
                    ed_lbl_sdate.setVisible(false);
                    ed_txt_sdate.setVisible(false);
                }
            } 
            if(status.equalsIgnoreCase("Still Working"))
            {
                ed_lbl_ldate.setVisible(false);
                ed_txt_ldate.setVisible(false);
                ed_lbl_epf.setVisible(false);
                ed_txt_epf.setVisible(false);
                ed_lbl_sdate.setVisible(false);
                ed_txt_sdate.setVisible(false);
                ed_lbl_epf_info.setVisible(false);
            }
            
            int eid = Integer.parseInt(ed_txt_eid.getText());
            setSalaryDetails(eid);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ed_tbl_empMouseClicked

    private void ed_cmb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_cmb_filterActionPerformed
        if(ed_cmb_filter.getSelectedIndex() == 0)
        {
            clear();
            setAllCustomerDetails();
        }
        else if(ed_cmb_filter.getSelectedIndex() == 1)
        {
            clear();
            setSWCustomerDetails();
        }
        else if(ed_cmb_filter.getSelectedIndex() == 2)
        {
            clear();
            setLCustomerDetails();
        }
            
    }//GEN-LAST:event_ed_cmb_filterActionPerformed

    //Set All Employee Details into Table   
    public void setAllCustomerDetails()
    {     
        DefaultTableModel model;
        model = (DefaultTableModel) ed_tbl_emp.getModel();
        model.setRowCount(0);
        try
        {         
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from employee ";            
            ResultSet rs = st.executeQuery(sql);
                        
            while(rs.next())
            {
                String employee_id,name,role,profile2,nic,account_number,account_branch,address,contact,join_date,work_status,employee_left_date,epf_settled_or_not,total_epf,settled_date;
                Blob profile;
                
                employee_id = rs.getString("employee_id");
                name = rs.getString("name");
                role = rs.getString("role");
                //profile is not shown in the Table.
                profile = rs.getBlob("profile");
                nic = rs.getString("nic");
                account_number = rs.getString("account_number");                        
                account_branch = rs.getString("account_branch");
                address  = rs.getString("address");
                contact  = rs.getString("contact");
                join_date  = rs.getString("join_date");
                work_status  = rs.getString("work_status");
                employee_left_date  = rs.getString("employee_left_date");
                epf_settled_or_not  = rs.getString("epf_settled_or_not");
                total_epf  = rs.getString("total_epf");
                settled_date  = rs.getString("settled_date");

                Object[] obj = {employee_id,name,role,profile,nic,account_number,account_branch,address,contact,join_date,work_status,employee_left_date,epf_settled_or_not,total_epf,settled_date};
                model = (DefaultTableModel) ed_tbl_emp.getModel();
                model.addRow(obj);
            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    //Set Still-Working Employee Details into Table   
    public void setSWCustomerDetails()
    {             
        DefaultTableModel model;
        model = (DefaultTableModel) ed_tbl_emp.getModel();
        model.setRowCount(0);
        try
        {         
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from employee where work_status = 'Still Working'";            
            ResultSet rs = st.executeQuery(sql);
                        
            while(rs.next())
            {
                String employee_id,name,role,profile2,nic,account_number,account_branch,address,contact,join_date,work_status,employee_left_date,epf_settled_or_not,total_epf,settled_date;
                Blob profile;
                
                employee_id = rs.getString("employee_id");
                name = rs.getString("name");
                role = rs.getString("role");
                //profile is not shown in the Table.
                profile = rs.getBlob("profile");
                nic = rs.getString("nic");
                account_number = rs.getString("account_number");                        
                account_branch = rs.getString("account_branch");
                address  = rs.getString("address");
                contact  = rs.getString("contact");
                join_date  = rs.getString("join_date");
                work_status  = rs.getString("work_status");
                employee_left_date  = rs.getString("employee_left_date");
                epf_settled_or_not  = rs.getString("epf_settled_or_not");
                total_epf  = rs.getString("total_epf");
                settled_date  = rs.getString("settled_date");

                Object[] obj = {employee_id,name,role,profile,nic,account_number,account_branch,address,contact,join_date,work_status,employee_left_date,epf_settled_or_not,total_epf,settled_date};
                model = (DefaultTableModel) ed_tbl_emp.getModel();
                model.addRow(obj);
            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    //Set Still-Working Employee Details into Table   
    public void setLCustomerDetails()
    {             
        DefaultTableModel model;
        model = (DefaultTableModel) ed_tbl_emp.getModel();
        model.setRowCount(0);
        try
        {         
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from employee where work_status = 'Left'";            
            ResultSet rs = st.executeQuery(sql);
                        
            while(rs.next())
            {
                String employee_id,name,role,profile2,nic,account_number,account_branch,address,contact,join_date,work_status,employee_left_date,epf_settled_or_not,total_epf,settled_date;
                Blob profile;
                
                employee_id = rs.getString("employee_id");
                name = rs.getString("name");
                role = rs.getString("role");
                //profile is not shown in the Table.
                profile = rs.getBlob("profile");
                nic = rs.getString("nic");
                account_number = rs.getString("account_number");                        
                account_branch = rs.getString("account_branch");
                address  = rs.getString("address");
                contact  = rs.getString("contact");
                join_date  = rs.getString("join_date");
                work_status  = rs.getString("work_status");
                employee_left_date  = rs.getString("employee_left_date");
                epf_settled_or_not  = rs.getString("epf_settled_or_not");
                total_epf  = rs.getString("total_epf");
                settled_date  = rs.getString("settled_date");

                Object[] obj = {employee_id,name,role,profile,nic,account_number,account_branch,address,contact,join_date,work_status,employee_left_date,epf_settled_or_not,total_epf,settled_date};
                model = (DefaultTableModel) ed_tbl_emp.getModel();
                model.addRow(obj);
            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    //Set Salary Details Salary into Table
    public void setSalaryDetails(int x)
    {
        DefaultTableModel model;
        model = (DefaultTableModel) ed_tbl_salary.getModel();
        model.setRowCount(0);
        
        
        //JOptionPane.showMessageDialog(this, eid);
        try
        {         
            int e_id = x;
            Connection con = DBConnection.getConnection();            
            //String sql = "select * from salary where employee_id = '" + e_id + "' "; 
            String sql = "select * from salary where employee_id=?"; 
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,e_id);
            
            ResultSet rs = pst.executeQuery();
                        
            while(rs.next())
            {
                String salary_month,credited_date,salary,epf,payable_salary;
                
                salary_month = rs.getString("salary_month");
                credited_date = rs.getString("credited_date");
                salary = rs.getString("salary");
                epf = rs.getString("epf");                        
                payable_salary = rs.getString("payable_salary");
                

                Object[] obj2 = {salary_month,credited_date,salary,epf,payable_salary};
                model = (DefaultTableModel) ed_tbl_salary.getModel();
                model.addRow(obj2);
            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Clear
    public void clear()
    {
        jPanel2.setVisible(false);
        ed_txt_eid.setText("");        
        ed_txt_name.setText("");   
        ed_txt_role.setText("");   
        ed_txt_nic.setText("");   
        ed_txt_acc_no.setText("");   
        ed_txt_br.setText("");   
        ed_txt_addr.setText("");   
        ed_txt_phone.setText("");   
        ed_txt_jdate.setText("");   
        ed_txt_status.setText("");   
        ed_txt_ldate.setText("");   
        ed_txt_epf.setText("");   
        ed_txt_sdate.setText("");   
        ed_lbl_epf_info.setText("");   
        ed_lbl_image.setIcon(null);        
        
        DefaultTableModel model;
        model = (DefaultTableModel) ed_tbl_salary.getModel();
        model.setRowCount(0);
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
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ed_btn_edit;
    private rojerusan.RSComboMetro ed_cmb_filter;
    private javax.swing.JLabel ed_lbl_epf;
    private javax.swing.JLabel ed_lbl_epf_info;
    private javax.swing.JLabel ed_lbl_image;
    private javax.swing.JLabel ed_lbl_ldate;
    private javax.swing.JLabel ed_lbl_sdate;
    private javax.swing.JTable ed_tbl_emp;
    private javax.swing.JTable ed_tbl_salary;
    private javax.swing.JTextField ed_txt_acc_no;
    private javax.swing.JTextField ed_txt_addr;
    private javax.swing.JTextField ed_txt_br;
    private javax.swing.JTextField ed_txt_eid;
    private javax.swing.JTextField ed_txt_epf;
    private javax.swing.JTextField ed_txt_jdate;
    private javax.swing.JTextField ed_txt_ldate;
    private javax.swing.JTextField ed_txt_name;
    private javax.swing.JTextField ed_txt_nic;
    private javax.swing.JTextField ed_txt_phone;
    private javax.swing.JTextField ed_txt_role;
    private javax.swing.JTextField ed_txt_sdate;
    private javax.swing.JTextField ed_txt_status;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane2;
    private bizbuilder.Scrollpane scrollpane3;
    // End of variables declaration//GEN-END:variables
}
