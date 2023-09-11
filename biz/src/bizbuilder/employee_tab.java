
package bizbuilder;

import java.awt.Color;
import static java.awt.Color.gray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

// Employee Form
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;

// Employee Details View
import java.awt.Color;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.sql.Blob;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.Dialog.ModalityType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRDataSource;

public class employee_tab extends javax.swing.JFrame {

    String ef_path2 = "";    

    public employee_tab() {
        initComponents();
        //populateComboBox();
        
        setSalaryDetails();
        setupComboBoxes();
        populatesd_year();
        
        // Employee Form
        ef_txt_eid.enable(false);
        ef_tblRowCount();    
        
        // Employe Details View
        ed_setAllCustomerDetails();
        
        // Hide Employee Details 
        //scrollpane2.setVisible(false);
        detail_panel.setVisible(false);
        
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

        jPanel1 = new javax.swing.JPanel();
        Profile = new rojerusan.RSFotoCircle();
        Employee = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Monthly_Expenses = new javax.swing.JLabel();
        Customer = new javax.swing.JLabel();
        Adding = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tabpane1 = new bizbuilder.Tabpane();
        jPanel2 = new javax.swing.JPanel();
        tabpane2 = new bizbuilder.Tabpane();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ef_txt_eid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ef_txt_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ef_txt_role = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ef_txt_addr = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ef_btn_cancel = new javax.swing.JButton();
        ef_btn_save = new javax.swing.JButton();
        ef_txt_br = new javax.swing.JTextField();
        ef_txt_acc_no = new javax.swing.JTextField();
        ef_txt_phone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ef_txt_nic = new javax.swing.JTextField();
        ef_jdate = new com.toedter.calendar.JDateChooser();
        ef_btn_clear = new javax.swing.JButton();
        ef_lbl_image = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        scrollpane2 = new bizbuilder.Scrollpane();
        detail_panel = new javax.swing.JPanel();
        ed_lbl_image = new javax.swing.JLabel();
        ed_txt_eid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ed_txt_name = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ed_txt_role = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ed_txt_addr = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ed_txt_br = new javax.swing.JTextField();
        ed_txt_acc_no = new javax.swing.JTextField();
        ed_txt_phone = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ed_lbl_ldate = new javax.swing.JLabel();
        ed_lbl_epf = new javax.swing.JLabel();
        ed_txt_jdate = new javax.swing.JTextField();
        ed_txt_ldate = new javax.swing.JTextField();
        ed_txt_epf = new javax.swing.JTextField();
        ed_txt_sdate = new javax.swing.JTextField();
        ed_txt_nic = new javax.swing.JTextField();
        ed_txt_status = new javax.swing.JTextField();
        ed_btn_edit = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        scrollpane3 = new bizbuilder.Scrollpane();
        jScrollPane3 = new javax.swing.JScrollPane();
        ed_tbl_salary = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        ed_lbl_epf_info = new javax.swing.JLabel();
        ed_lbl_sdate = new javax.swing.JLabel();
        ed_btn_dlt = new javax.swing.JButton();
        ed_btn_gen = new javax.swing.JButton();
        ed_cmb_filter = new rojerusan.RSComboMetro();
        scrollpane4 = new bizbuilder.Scrollpane();
        ed_tbl_emp = new rojeru_san.complementos.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
        tabpane3 = new bizbuilder.Tabpane();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        epf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monthly_salary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        payable_salary = new javax.swing.JTextField();
        sf_cancel_btn = new javax.swing.JButton();
        sf_save_btn = new javax.swing.JButton();
        emid = new rojerusan.RSComboMetro();
        salary_credit_date = new com.toedter.calendar.JDateChooser();
        salary_month = new rojerusan.RSComboMetro();
        jPanel8 = new javax.swing.JPanel();
        scrollpane1 = new bizbuilder.Scrollpane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sd_details_table1 = new javax.swing.JTable();
        sd_emid1 = new rojerusan.RSComboMetro();
        sd_month1 = new rojerusan.RSComboMetro();
        sd_clear_btn = new javax.swing.JButton();
        sd_year1 = new rojerusan.RSComboMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        Employee.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        Employee.setText("Employee");
        Employee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmployeeMouseExited(evt);
            }
        });

        Dashboard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(255, 255, 255));
        Dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dashboard.png"))); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashboardMouseExited(evt);
            }
        });

        Monthly_Expenses.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Monthly_Expenses.setForeground(new java.awt.Color(255, 255, 255));
        Monthly_Expenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/expense.png"))); // NOI18N
        Monthly_Expenses.setText("Monthly Expenses");
        Monthly_Expenses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Monthly_Expenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Monthly_ExpensesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Monthly_ExpensesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Monthly_ExpensesMouseExited(evt);
            }
        });

        Customer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Customer.setForeground(new java.awt.Color(255, 255, 255));
        Customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (1).png"))); // NOI18N
        Customer.setText("Customer");
        Customer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomerMouseExited(evt);
            }
        });

        Adding.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Adding.setForeground(new java.awt.Color(255, 255, 255));
        Adding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add.png"))); // NOI18N
        Adding.setText("Adding");
        Adding.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddingMouseExited(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(102, 102, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Adding, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Customer, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Employee, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(Monthly_Expenses, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Logout)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Customer)
                .addGap(18, 18, 18)
                .addComponent(Employee)
                .addGap(18, 18, 18)
                .addComponent(Dashboard)
                .addGap(18, 18, 18)
                .addComponent(Monthly_Expenses)
                .addGap(18, 18, 18)
                .addComponent(Adding)
                .addGap(64, 64, 64)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 900));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tabpane1.setForeground(new java.awt.Color(102, 102, 255));
        tabpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabpane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabpane2.setForeground(new java.awt.Color(102, 102, 255));
        tabpane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Employee Id");

        ef_txt_eid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_eid.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_eid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        ef_txt_eid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ef_txt_eidActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Name");

        ef_txt_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_name.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Work Role");

        ef_txt_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_role.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("NIC");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Address");

        ef_txt_addr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_addr.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_addr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Bank Name, Branch");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Account Nubmer");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Contact");

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Join Date");

        ef_txt_nic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_txt_nic.setForeground(new java.awt.Color(102, 102, 255));
        ef_txt_nic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        ef_jdate.setBackground(new java.awt.Color(255, 255, 255));
        ef_jdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        ef_btn_clear.setBackground(new java.awt.Color(102, 102, 255));
        ef_btn_clear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ef_btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        ef_btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bin.png"))); // NOI18N
        ef_btn_clear.setToolTipText("Remove Profile");
        ef_btn_clear.setBorderPainted(false);
        ef_btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ef_btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ef_btn_clearActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ef_txt_br, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_nic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ef_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(ef_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ef_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ef_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ef_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ef_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_role, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ef_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ef_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ef_btn_clear)
                .addGap(74, 74, 74))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ef_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ef_btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ef_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ef_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ef_txt_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ef_txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ef_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ef_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ef_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ef_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(ef_jdate, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ef_btn_cancel)
                    .addComponent(ef_btn_save))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabpane2.addTab("Employee Form", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane2.setBackground(new java.awt.Color(255, 255, 255));
        scrollpane2.setBorder(null);

        detail_panel.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Name");

        ed_txt_name.setEditable(false);
        ed_txt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_name.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_name.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Work Role");

        ed_txt_role.setEditable(false);
        ed_txt_role.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_role.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_role.setBorder(null);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("NIC");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Address");

        ed_txt_addr.setEditable(false);
        ed_txt_addr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_addr.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_addr.setBorder(null);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Bank Name, Branch");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Account Nubmer");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Contact");

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

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Join Date");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Work Status");

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
        ed_btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_btn_editActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Salary Details");

        ed_tbl_salary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salary Month", "Date", "Salary", "EPF", "Payable Salary"
            }
        ));
        jScrollPane3.setViewportView(ed_tbl_salary);

        scrollpane3.setViewportView(jScrollPane3);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Employee Id");

        ed_lbl_epf_info.setBackground(new java.awt.Color(0, 204, 51));
        ed_lbl_epf_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_epf_info.setText("Message");

        ed_lbl_sdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_lbl_sdate.setText("Settled date");

        ed_btn_dlt.setBackground(new java.awt.Color(102, 102, 255));
        ed_btn_dlt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_btn_dlt.setForeground(new java.awt.Color(255, 255, 255));
        ed_btn_dlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bin.png"))); // NOI18N
        ed_btn_dlt.setText("Delete");
        ed_btn_dlt.setBorderPainted(false);
        ed_btn_dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_btn_dltActionPerformed(evt);
            }
        });

        ed_btn_gen.setBackground(new java.awt.Color(102, 102, 255));
        ed_btn_gen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ed_btn_gen.setForeground(new java.awt.Color(255, 255, 255));
        ed_btn_gen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/id-card.png"))); // NOI18N
        ed_btn_gen.setText("Generate");
        ed_btn_gen.setBorderPainted(false);
        ed_btn_gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_btn_genActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detail_panelLayout = new javax.swing.GroupLayout(detail_panel);
        detail_panel.setLayout(detail_panelLayout);
        detail_panelLayout.setHorizontalGroup(
            detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detail_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detail_panelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(detail_panelLayout.createSequentialGroup()
                        .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(scrollpane3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addGroup(detail_panelLayout.createSequentialGroup()
                                    .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ed_lbl_epf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ed_lbl_ldate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ed_lbl_sdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(100, 100, 100)
                                    .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detail_panelLayout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(ed_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ed_btn_dlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ed_btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ed_btn_gen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detail_panelLayout.createSequentialGroup()
                                    .addGap(160, 160, 160)
                                    .addComponent(ed_lbl_epf_info, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))))
        );
        detail_panelLayout.setVerticalGroup(
            detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detail_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ed_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detail_panelLayout.createSequentialGroup()
                        .addComponent(ed_btn_edit)
                        .addGap(18, 18, 18)
                        .addComponent(ed_btn_dlt)
                        .addGap(18, 18, 18)
                        .addComponent(ed_btn_gen)))
                .addGap(18, 18, 18)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_lbl_ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ed_lbl_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(ed_lbl_epf_info, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ed_lbl_sdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ed_txt_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        scrollpane2.setViewportView(detail_panel);

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

        scrollpane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ed_tbl_emp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Role", "Profile", "NIC", "Account Number", "Account Branch", "Address", "Contact", "Join Date", "Work Status", "Employee Left date", "Epf Settled or not", "Total Epf", "Settled Date"
            }
        ));
        ed_tbl_emp.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        ed_tbl_emp.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        ed_tbl_emp.setColorBordeHead(new java.awt.Color(255, 255, 255));
        ed_tbl_emp.setColorFilasForeground1(new java.awt.Color(102, 102, 255));
        ed_tbl_emp.setColorFilasForeground2(new java.awt.Color(102, 102, 255));
        ed_tbl_emp.setRowHeight(25);
        ed_tbl_emp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ed_tbl_empMouseClicked(evt);
            }
        });
        scrollpane4.setViewportView(ed_tbl_emp);
        if (ed_tbl_emp.getColumnModel().getColumnCount() > 0) {
            ed_tbl_emp.getColumnModel().getColumn(0).setMinWidth(130);
            ed_tbl_emp.getColumnModel().getColumn(1).setMinWidth(220);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollpane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                    .addComponent(ed_cmb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(ed_cmb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(scrollpane4, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        tabpane2.addTab("Employee Details", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane1.addTab("Employee", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tabpane3.setForeground(new java.awt.Color(102, 102, 255));
        tabpane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabpane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabpane3MouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Employee ID");

        epf.setEditable(false);
        epf.setForeground(new java.awt.Color(102, 102, 255));
        epf.setText("RS.");
        epf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        epf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                epfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                epfFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Salary Month");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Salary Credit Date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Monthly Salary");

        monthly_salary.setForeground(new java.awt.Color(102, 102, 255));
        monthly_salary.setText("RS.");
        monthly_salary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        monthly_salary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                monthly_salaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                monthly_salaryFocusLost(evt);
            }
        });
        monthly_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthly_salaryActionPerformed(evt);
            }
        });
        monthly_salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                monthly_salaryKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("EPF");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Payable Salary");

        payable_salary.setEditable(false);
        payable_salary.setForeground(new java.awt.Color(102, 102, 255));
        payable_salary.setText("RS.");
        payable_salary.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        payable_salary.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                payable_salaryFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                payable_salaryFocusLost(evt);
            }
        });

        sf_cancel_btn.setBackground(new java.awt.Color(102, 102, 255));
        sf_cancel_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sf_cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        sf_cancel_btn.setText("Cancel");
        sf_cancel_btn.setFocusPainted(false);
        sf_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sf_cancel_btnActionPerformed(evt);
            }
        });

        sf_save_btn.setBackground(new java.awt.Color(102, 102, 255));
        sf_save_btn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sf_save_btn.setForeground(new java.awt.Color(255, 255, 255));
        sf_save_btn.setText("Save");
        sf_save_btn.setBorderPainted(false);
        sf_save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sf_save_btnActionPerformed(evt);
            }
        });

        emid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ..." }));
        emid.setColorArrow(new java.awt.Color(102, 102, 255));
        emid.setColorBorde(new java.awt.Color(102, 102, 255));
        emid.setColorFondo(new java.awt.Color(102, 102, 255));
        emid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emidActionPerformed(evt);
            }
        });

        salary_credit_date.setBackground(new java.awt.Color(255, 255, 255));
        salary_credit_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        salary_credit_date.setForeground(new java.awt.Color(102, 102, 255));
        salary_credit_date.setDateFormatString("dd-MM-yyyy");
        salary_credit_date.setDoubleBuffered(false);

        salary_month.setBorder(null);
        salary_month.setMaximumRowCount(5);
        salary_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(payable_salary)
                                .addComponent(monthly_salary)
                                .addComponent(epf)
                                .addComponent(emid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salary_credit_date, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(salary_month, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sf_cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(sf_save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(emid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salary_month, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salary_credit_date, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monthly_salary)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payable_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sf_cancel_btn)
                    .addComponent(sf_save_btn))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        tabpane3.addTab("Salary Form", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(102, 102, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        sd_details_table1.setAutoCreateRowSorter(true);
        sd_details_table1.setForeground(new java.awt.Color(102, 102, 255));
        sd_details_table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Salary Month", "Credited Date", "Monthly Salary", "EPF", "Payable Salary"
            }
        ));
        sd_details_table1.setGridColor(new java.awt.Color(102, 102, 255));
        jScrollPane2.setViewportView(sd_details_table1);

        sd_emid1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ..." }));
        sd_emid1.setColorBorde(new java.awt.Color(102, 102, 255));
        sd_emid1.setColorFondo(new java.awt.Color(102, 102, 255));
        sd_emid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sd_emid1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sd_emid1MouseEntered(evt);
            }
        });
        sd_emid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sd_emid1ActionPerformed(evt);
            }
        });

        sd_month1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        sd_month1.setColorBorde(new java.awt.Color(102, 102, 255));
        sd_month1.setColorFondo(new java.awt.Color(102, 102, 255));
        sd_month1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sd_month1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sd_month1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sd_month1MousePressed(evt);
            }
        });
        sd_month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sd_month1ActionPerformed(evt);
            }
        });

        sd_clear_btn.setBackground(new java.awt.Color(102, 102, 255));
        sd_clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        sd_clear_btn.setText("Clear Filter");
        sd_clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sd_clear_btnActionPerformed(evt);
            }
        });

        sd_year1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ..." }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(sd_emid1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sd_month1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sd_year1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sd_clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sd_month1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sd_clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sd_emid1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sd_year1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        scrollpane1.setViewportView(jPanel11);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        tabpane3.addTab("Salary Details", jPanel8);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane1.addTab("Salary", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1000, 650));

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseEntered
        // TODO add your handling code here:
        Customer.setBackground(new Color(204,204,255));
        Customer.setOpaque(true);
    }//GEN-LAST:event_CustomerMouseEntered

    private void CustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseExited
        // TODO add your handling code here:
        Customer.setBackground(new Color(102,102,255));
        
    }//GEN-LAST:event_CustomerMouseExited

    private void EmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseEntered
        // TODO add your handling code here:
        Employee.setBackground(new Color(204,204,255));
        Employee.setOpaque(true);
    }//GEN-LAST:event_EmployeeMouseEntered

    private void EmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseExited
        // TODO add your handling code here:
        Employee.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_EmployeeMouseExited

    private void DashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseEntered
        // TODO add your handling code here:
        Dashboard.setBackground(new Color(204,204,255));
        Dashboard.setOpaque(true);
    }//GEN-LAST:event_DashboardMouseEntered

    private void DashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseExited
        // TODO add your handling code here:
        Dashboard.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_DashboardMouseExited

    private void Monthly_ExpensesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Monthly_ExpensesMouseEntered
        // TODO add your handling code here:
        Monthly_Expenses.setBackground(new Color(204,204,255));
        Monthly_Expenses.setOpaque(true);
    }//GEN-LAST:event_Monthly_ExpensesMouseEntered

    private void Monthly_ExpensesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Monthly_ExpensesMouseExited
        // TODO add your handling code here:
        Monthly_Expenses.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_Monthly_ExpensesMouseExited

    private void AddingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingMouseEntered
        // TODO add your handling code here:
        Adding.setBackground(new Color(204,204,255));
        Adding.setOpaque(true);
    }//GEN-LAST:event_AddingMouseEntered

    private void AddingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingMouseExited
        // TODO add your handling code here:
        Adding.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_AddingMouseExited

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        // TODO add your handling code here:
        customer_tab o = new customer_tab();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CustomerMouseClicked

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        // TODO add your handling code here:
        dashboard o = new dashboard();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashboardMouseClicked

    private void Monthly_ExpensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Monthly_ExpensesMouseClicked
        // TODO add your handling code here:
        monthly_expenses_tab o = new monthly_expenses_tab();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Monthly_ExpensesMouseClicked

    private void AddingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingMouseClicked
        // TODO add your handling code here:
        adding_tab o = new adding_tab();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AddingMouseClicked

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        signin o = new signin();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    private void sd_clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sd_clear_btnActionPerformed

        sd_emid1.setSelectedIndex(0);
        sd_month1.setSelectedIndex(0); // Clears the selection
        sd_year1.setSelectedIndex(0);
    }//GEN-LAST:event_sd_clear_btnActionPerformed

    private void sd_month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sd_month1ActionPerformed

    }//GEN-LAST:event_sd_month1ActionPerformed

    private void sd_month1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sd_month1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sd_month1MousePressed

    private void sd_month1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sd_month1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sd_month1MouseEntered

    private void sd_month1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sd_month1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sd_month1MouseClicked

    private void sd_emid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sd_emid1ActionPerformed

    }//GEN-LAST:event_sd_emid1ActionPerformed

    private void sd_emid1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sd_emid1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sd_emid1MouseEntered

    private void sd_emid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sd_emid1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sd_emid1MouseClicked

    private void emidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emidActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_emidActionPerformed

    private void sf_save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sf_save_btnActionPerformed
        // TODO add your handling code here:
        
        try{
            if(validateInput()== true){
                insertEmployeeDetailstoDb();
                update_tot_epf();               // Update Total EPF in Employee Table
                clearfields();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        setSalaryDetails();
    }//GEN-LAST:event_sf_save_btnActionPerformed
    
    private void sf_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sf_cancel_btnActionPerformed
        // TODO add your handling code here:
        clearfields();
    }//GEN-LAST:event_sf_cancel_btnActionPerformed

    private void payable_salaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payable_salaryFocusLost
        // TODO add your handling code here:
        if(payable_salary.getText().equals("")){
            payable_salary.setText("RS.");
            payable_salary.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_payable_salaryFocusLost

    private void payable_salaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payable_salaryFocusGained
        // TODO add your handling code here:
        if(payable_salary.getText().equals("RS.")){
            payable_salary.setText("");
            payable_salary.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_payable_salaryFocusGained

    private void monthly_salaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthly_salaryKeyReleased
        // TODO add your handling code here:
        double ms = Double.parseDouble(monthly_salary.getText());
        double cEPF = (ms*10)/100;
        epf.setText(Double.toString(cEPF));

        double cps = (ms-cEPF);
        payable_salary.setText(Double.toString(cps));
    }//GEN-LAST:event_monthly_salaryKeyReleased

    private void monthly_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthly_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthly_salaryActionPerformed

    private void monthly_salaryFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthly_salaryFocusLost
        // TODO add your handling code here:
        if(monthly_salary.getText().equals("")){
            monthly_salary.setText("RS.");
            monthly_salary.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_monthly_salaryFocusLost

    private void monthly_salaryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_monthly_salaryFocusGained
        // TODO add your handling code here:
        if(monthly_salary.getText().equals("RS.")){
            monthly_salary.setText("");
            monthly_salary.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_monthly_salaryFocusGained

    private void epfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epfFocusLost
        // TODO add your handling code here:
        if(epf.getText().equals("")){
            epf.setText("RS.");
            epf.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_epfFocusLost

    private void epfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_epfFocusGained
        // TODO add your handling code here:
        if(epf.getText().equals("RS.")){
            epf.setText("");
            epf.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_epfFocusGained

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jPanel7MouseClicked

    private void tabpane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabpane3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabpane3MouseClicked

    private void ef_txt_eidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_txt_eidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ef_txt_eidActionPerformed

    private void ef_btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_btn_cancelActionPerformed
        ef_Clear();        
        
    }//GEN-LAST:event_ef_btn_cancelActionPerformed

    private void ef_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_btn_saveActionPerformed
        if(ef_validation() == true)
        {
            ef_insertCustomerDetailstoDb();
             
        } 
        
    }//GEN-LAST:event_ef_btn_saveActionPerformed

    private void ef_lbl_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ef_lbl_imageMouseClicked
        ef_selectImage();
    }//GEN-LAST:event_ef_lbl_imageMouseClicked

    private void ed_cmb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_cmb_filterActionPerformed
        if(ed_cmb_filter.getSelectedIndex() == 0)
        {
            ed_clear();
            ed_setAllCustomerDetails();
        }
        else if(ed_cmb_filter.getSelectedIndex() == 1)
        {
            ed_clear();
            ed_setSWCustomerDetails();
        }
        else if(ed_cmb_filter.getSelectedIndex() == 2)
        {
            ed_clear();
            ed_setLCustomerDetails();
        }

    }//GEN-LAST:event_ed_cmb_filterActionPerformed

    private void ed_tbl_empMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ed_tbl_empMouseClicked
        
        detail_panel.setVisible(true);
        scrollpane2.setVisible(true);
                    // Show Employee Details 
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
            ed_setSalaryDetails(eid);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ed_tbl_empMouseClicked

    private void tabpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabpane1MouseClicked
        // TODO add your handling code here:
        populateComboBox();
        setSalaryDetails();
      
    }//GEN-LAST:event_tabpane1MouseClicked

    private void ed_btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_btn_editActionPerformed
        // TODO add your handling code here:
        initemployee_edit_form();
    }//GEN-LAST:event_ed_btn_editActionPerformed

    private void ed_btn_dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_btn_dltActionPerformed
        // TODO add your handling code here:

        deleteDataFromDatabase();
        //scrollpane2.setVisible(false);
        detail_panel.setVisible(false);
    }//GEN-LAST:event_ed_btn_dltActionPerformed

    private void ed_btn_genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_btn_genActionPerformed
        // TODO add your handling code here:
        generateIDcard();
    }//GEN-LAST:event_ed_btn_genActionPerformed

    private void ef_btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ef_btn_clearActionPerformed
        ef_lbl_image.setIcon(null);
        ef_path2="";
    }//GEN-LAST:event_ef_btn_clearActionPerformed

    private void populatesd_year(){
    ArrayList<String> values = new ArrayList<>();
    for (int i = 2023; i <= 2123; i++) {
    values.add(""+i);
    }
    for (String value : values) {
    sd_year1.addItem(value);
    }

    }
    
    private void populateComboBox() {
    try {
        Connection con = DBConnection.getConnection();

        String sf_emid_combo = "SELECT * FROM employee where work_status = 'Still Working'";
        PreparedStatement sf_Statement = con.prepareStatement(sf_emid_combo);
        ResultSet sf_Result = sf_Statement.executeQuery();

        String sd_emid_combo = "SELECT * FROM employee";
        PreparedStatement sd_Statement = con.prepareStatement(sd_emid_combo);
        ResultSet sd_Result = sd_Statement.executeQuery();

        // Clear items from the second index (index 1) onwards in emid
        for (int i = emid.getItemCount() - 1; i > 0; i--) {
            emid.removeItemAt(i);
        }

        // Clear items from the second index (index 1) onwards in sd_emid1
        for (int i = sd_emid1.getItemCount() - 1; i > 0; i--) {
            sd_emid1.removeItemAt(i);
        }

        while (sf_Result.next()) {
            emid.addItem(sf_Result.getString("employee_id"));
        }
        while (sd_Result.next()) {
            sd_emid1.addItem(sd_Result.getString("employee_id"));
        }
    } catch (Exception e) {
        e.printStackTrace(); // Handle exceptions properly
    }
}


    
     public void insertEmployeeDetailstoDb()
    {
        int eid = Integer.parseInt(emid.getSelectedItem().toString());
        double ms = Double.parseDouble(monthly_salary.getText());
        double EPF = Double.parseDouble(epf.getText());
        double ps = Double.parseDouble(payable_salary.getText());
        String date = (salary_credit_date.getDate().toString());
        String sdate = salary_month.getSelectedItem().toString();
        
        try{
        Connection con = DBConnection.getConnection();
        String sql = "insert into salary (employee_id,salary_month,credited_date,salary,epf,payable_salary) values(?,?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,eid);
        pst.setString(2,sdate);
        pst.setString(3, date);
        pst.setDouble(4,ms);
        pst.setDouble(5,EPF);
        pst.setDouble(6,ps);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"insertion sucessful");
        
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
     public void clearfields(){
         monthly_salary.setText("RS.");
         epf.setText("RS.");
         payable_salary.setText("RS.");
         emid.setSelectedIndex(0);
         salary_month.setSelectedIndex(0);
         salary_credit_date.setDate(null); 
     } 
    
    public boolean validateInput() {
      
    if (emid.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Please select Employee ID.");
        return false; // Validation failed
    }

    if (salary_month.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(this, "Please select Salary Month.");
        return false; // Validation failed
    }
    
    Date scd = salary_credit_date.getDate();
    if (scd == null) {
        JOptionPane.showMessageDialog(this, "Please select a date from the calendar.");
        return false; // Validation failed
    }
    
    String ms_text = monthly_salary.getText();
    if (ms_text.equals("RS.")) {
        JOptionPane.showMessageDialog(this, "Please enter a value for Monthly Salary.");
        return false; // Validation failed
    }
    // All validation checks passed
    return true;
    }  
    
// Calculate & Update Total EPF Automatically    
    // Calculate Total EPF from Salary Table
    public double calculate_tot_epf()
    {
        int eid = Integer.parseInt(emid.getSelectedItem().toString());
        try
        { 
            Connection con = DBConnection.getConnection();

            String sql = "select SUM(epf) AS total_epf from salary where employee_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,eid);
            
            ResultSet rs = pst.executeQuery();

            double tot_epf = 0;
            if (rs.next()) {
                tot_epf = rs.getInt("total_epf");
            }
            return (tot_epf);
            //JOptionPane.showMessageDialog(this, tot_epf);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
        return -1;
    }       
    
    // Update Total EPF in Employee Table
     public void update_tot_epf()
    {
        int eid = Integer.parseInt(emid.getSelectedItem().toString());
        //double tot_epf = Double.parseDouble(epf.getText());
        double tot_epf = calculate_tot_epf();
        
        try{
            Connection con = DBConnection.getConnection();
            String sql = "UPDATE employee SET total_epf = ? WHERE employee_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(2,eid);
            pst.setDouble(1,tot_epf);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) 
            {
                JOptionPane.showMessageDialog(this, "Total EPF is updated successfully!");
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "Total EPF is updated Failed.");
            }        
        }catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }       
    
    //---------------------------------------------------------------------------------------------------
    
    public void setSalaryDetails() {
    DefaultTableModel model = (DefaultTableModel) sd_details_table1.getModel(); // Initialize the model outside the try-catch block
    model.setRowCount(0);
    try {
        
        Connection con = DBConnection.getConnection();
        
        // Use PreparedStatement to avoid SQL injection and bind the parameter
        String sql = "SELECT * FROM salary";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery(); // Use PreparedStatement's executeQuery method
                    
        while (rs.next()) {
            String employeeID, salaryMonth, salaryDate, monthlySalary, epf, payablesalary;

            employeeID = rs.getString("employee_id");
            salaryMonth = rs.getString("salary_month");
            salaryDate = rs.getString("credited_date");
            monthlySalary = rs.getString("salary");
            epf = rs.getString("epf");
            payablesalary = rs.getString("payable_salary");

            Object[] obj = { employeeID, salaryMonth, salaryDate, monthlySalary, epf, payablesalary };
            model.addRow(obj);
        }
        
        //con.close(); // Close the connection when done
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error retrieving records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}







private void applyFilters(String emidQuery, String monthQuery, String yearQuery) {
    DefaultTableModel model = (DefaultTableModel) sd_details_table1.getModel();
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
    sd_details_table1.setRowSorter(tr);

    RowFilter<DefaultTableModel, Object> emidFilter = null;
    RowFilter<DefaultTableModel, Object> monthFilter = null;
    RowFilter<DefaultTableModel, Object> yearFilter = null;
    
    if (!"Select ...".equals(emidQuery)) {
        emidFilter = new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String employeeID = entry.getStringValue(0); // Assuming Employee ID is in the first column
                try {
                    int id = Integer.parseInt(employeeID); // Convert to integer
                    int filterValue = Integer.parseInt(emidQuery);
                    return id == filterValue;
                } catch (NumberFormatException e) {
                    // Handle conversion errors here if necessary
                    return false;
                }
            }
        };
    }
    
    if (!"Select ...".equals(monthQuery)) {
        monthFilter = RowFilter.regexFilter(monthQuery);
    }

    if (!"Select ...".equals(yearQuery)) {
        yearFilter = new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String dateString = entry.getStringValue(2); // Assuming date is in the third column
                try {
                    // Parse the date using SimpleDateFormat
                    SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
                    Date date = dateFormat.parse(dateString);

                    // Extract the year from the parsed date
                    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
                    int year = Integer.parseInt(yearFormat.format(date)); // Convert to integer

                    int filterValue = Integer.parseInt(yearQuery);
                    return year == filterValue; // Compare the extracted year to the yearQuery
                } catch (ParseException | NumberFormatException e) {
                    // Handle parsing and conversion errors here if necessary
                    return false;
                }
            }
        };
    }

    if (emidFilter != null || monthFilter != null || yearFilter != null) {
        // Combine filters using RowFilter.andFilter
        List<RowFilter<DefaultTableModel, Object>> filters = new ArrayList<>();
        if (emidFilter != null) filters.add(emidFilter);
        if (monthFilter != null) filters.add(monthFilter);
        if (yearFilter != null) filters.add(yearFilter);
        
        tr.setRowFilter(RowFilter.andFilter(filters));
    } else {
        // If no filters are applied, show all rows
        tr.setRowFilter(null);
    }
}


private void setupComboBoxes() {
    // Set up ActionListener for emidComboBox
    sd_emid1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected item from emidComboBox
            String emidQuery = sd_emid1.getSelectedItem().toString();
            
            // Get the selected item from monthComboBox
            String monthQuery = sd_month1.getSelectedItem().toString();
            
            String yearQuery = sd_year1.getSelectedItem().toString();
            
            // Apply the filters with the selected values from both combo boxes
            applyFilters(emidQuery, monthQuery,yearQuery);
        }
    });
    
    // Set up ActionListener for monthComboBox
    sd_month1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected item from emidComboBox
            String emidQuery = sd_emid1.getSelectedItem().toString();
            
            // Get the selected item from monthComboBox
            String monthQuery = sd_month1.getSelectedItem().toString();
            String yearQuery = sd_year1.getSelectedItem().toString();
            
            // Apply the filters with the selected values from both combo boxes
            applyFilters(emidQuery, monthQuery,yearQuery);
        }
    });
    
sd_year1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected item from emidComboBox
            String emidQuery = sd_emid1.getSelectedItem().toString();
            
            // Get the selected item from monthComboBox
            String monthQuery = sd_month1.getSelectedItem().toString();
            String yearQuery = sd_year1.getSelectedItem().toString();
            
            // Apply the filters with the selected values from both combo boxes
            applyFilters(emidQuery, monthQuery,yearQuery);
        }
    });

}



// Employee Form Start
    
    //Validation
    public boolean ef_validation()
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
        
        // NIC
        if(ef_txt_nic.getText().equals("") || ef_txt_nic.getText().length() < 10)
        {
            JOptionPane.showMessageDialog(this, "Enter ValidNational Identity Card Number");
            return false;
        }
        else if(ef_txt_nic.getText().length() == 10)
        {
            //JOptionPane.showMessageDialog(this, "Enter Valid National Identity Card Number");
            //return false;
        }
        else if(ef_txt_nic.getText().length() > 10 && ef_txt_nic.getText().length() != 12)
        {
            JOptionPane.showMessageDialog(this, "Enter Valid National Identity Card Number");
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
    public void ef_tblRowCount()
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
    public void ef_insertCustomerDetailstoDb()
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
            

            //InputStream is = new FileInputStream(new File(ef_path2));         //Image 
            //pst.setBlob(11,is) ;                                              //Image 

            InputStream is1;

            if (ef_path2 != "") 
            {
                is1 = new FileInputStream(new File(ef_path2));  // Image data
                pst.setBlob(11, is1);  // Set the image data                         //Image 
            } 
            else
            {                
                //is1 = new FileInputStream(new File("user.jpeg"));    
                
                // Method 1 - Store image in app destination
                //is1 = new FileInputStream(new File("user.jpeg"));                
                //pst.setBlob(11, is1);  // Set the image data                         //Image 
                
                
                // Method 2 - Get image from Database
                Statement st = con.createStatement();
                String sql2 = "select * from default_img ";            
                ResultSet rs2 = st.executeQuery(sql2);
                Blob profile2 = null;
                while(rs2.next())
                {                    
                    
                    profile2 = rs2.getBlob("img");
                }
                pst.setBlob(11, profile2);  // Set the image data                         //Image 
            }

            //pst.setBlob(11, is2);  // Set the image data                         //Image 
            
            
            int updateRowCount = pst.executeUpdate();
            
            if(updateRowCount>0)
            {
                JOptionPane.showMessageDialog(this, "Employee Details Saved ");
                ef_Clear();
                ef_tblRowCount();
                ed_setAllCustomerDetails();
                
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Delete Records 
    public void ef_Clear()
    {        
        ef_txt_name.setText("");
        ef_txt_role.setText("");
        ef_txt_nic.setText("");
        ef_txt_addr.setText("");
        ef_txt_br.setText("");
        ef_txt_acc_no.setText("");
        ef_txt_phone.setText("");
        
        //ef_Clear Joined Date
        //Date j_date = ef_jdate.getDate();
        ef_jdate.setDate(null);    
        
        //ef_Clear Image 
        ef_lbl_image.setIcon(null);
        ef_path2 = "";
    }
    
    public void ef_selectImage()
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
            ef_path2 = path;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

// Employee Form End
    
    
// Employee Details View Start 
    
    //Set All Employee Details into Table   
    public void ed_setAllCustomerDetails()
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
    public void ed_setSWCustomerDetails()
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
    public void ed_setLCustomerDetails()
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
    public void ed_setSalaryDetails(int x)
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
    public void ed_clear()
    {
        scrollpane2.setVisible(false);
        //detail_panel.setVisible(false);
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
// Employee Details View End      

// ...

    private void deleteDataFromDatabase() {
    // Get the selected row index
    int selectedRow = ed_tbl_emp.getSelectedRow();

    if (selectedRow != -1) {
        // Get the employee ID from the selected row
        int employeeId = Integer.parseInt(ed_tbl_emp.getValueAt(selectedRow, 0).toString());

        try (Connection con = DBConnection.getConnection()) {
            // Delete from the "employee" and "salary" tables
            String[] tableNames = {"employee", "salary"};
            for (String tableName : tableNames) {
                String deleteQuery = "DELETE FROM " + tableName + " WHERE employee_id = ?";
                try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
                    pstmt.setInt(1, employeeId);
                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Data deleted from " + tableName + " successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No records were deleted from " + tableName + ".");
                    }
                }
            }

            // After the deletion is complete, remove the selected row from the JTable
            DefaultTableModel model = (DefaultTableModel) ed_tbl_emp.getModel();
            model.removeRow(selectedRow);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    
    public class CustomJasperViewer extends JasperViewer {
    public CustomJasperViewer(JasperPrint jasperPrint, int x, int y, int width, int height, String title) {
        super(jasperPrint, false); // Create the viewer without specifying a frame

        // Set the size of the JasperViewer window
        setSize(width, height);

        // Set the custom position (x, y) of the window
        setLocation(x, y);

        // Set the custom title
        setTitle(title);

        // You can also customize other properties of the viewer, such as icons, etc.
        // For example, setIconImage(yourCustomImage);
    }

    // You can add more customization methods here if needed
}
    
    public void generateIDcard() {
    try {
        Connection con = DBConnection.getConnection(); // Replace with your database connection logic

        int selectedRow = ed_tbl_emp.getSelectedRow();

        if (selectedRow != -1) {
            // Get the employee ID from the selected row
            int employeeId = Integer.parseInt(ed_tbl_emp.getValueAt(selectedRow, 0).toString());

            // Retrieve the image Blob from the database
            Blob imageBlob = (Blob) ed_tbl_emp.getValueAt(selectedRow, 3);

            // Convert the Blob to a byte array
            InputStream inputStream = imageBlob.getBinaryStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            byte[] imageData = byteArrayOutputStream.toByteArray();

            // Create a JasperReport
            //String reportPath = "C:\\Users\\THANATOS\\Documents\\Project Branch\\Full Project\\25-8-2023\\biz\\src\\bizbuilder\\EmployeeIDcard.jrxml";
           // String reportPath = "src\\bizbuilder\\EmployeeIDcard.jrxml";
           InputStream reportStream = employee_tab.class.getResourceAsStream("/bizbuilder/EmployeeIDcard.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(reportStream);

            // Convert the byte array to java.lang.Byte[]
            Byte[] boxedImageData = new Byte[imageData.length];
            for (int i = 0; i < imageData.length; i++) {
                boxedImageData[i] = imageData[i];
            }

            Map<String, Object> para = new HashMap<String, Object>();
            para.put("EMID", employeeId); // Employee ID parameter
            para.put("EMPLOYEE_PROFILE", boxedImageData); // Image data parameter as java.lang.Byte[]

            JasperPrint jp = JasperFillManager.fillReport(jr, para, con);

            // Set custom position (x, y), size, and title for the JasperViewer window
            int customX = 600; // Set your custom x-coordinate
            int customY = 75; // Set your custom y-coordinate
            int customWidth = 700; // Set your custom width
            int customHeight = 600; // Set your custom height
            String customTitle = "Employee ID Card"; // Set your custom title

            CustomJasperViewer customViewer = new CustomJasperViewer(jp, customX, customY, customWidth, customHeight, customTitle);
            customViewer.setVisible(true);
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error generating ID card: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


// Employee Edit Form Save Button - Table & Records Auto Refresh Code       
    private void initemployee_edit_form() 
    {
    
        employee_edit_form eef = new employee_edit_form(ed_txt_eid.getText());

        int x = this.getX() + 766; 
        int y = this.getY() + 48;  

        eef.setLocation(x, y);

        this.setEnabled(false);

        eef.setVisible(true);

        // Enable the main frame when the secondary frame is closed
        eef.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                employee_tab.this.setEnabled(true);
                employee_tab.this.requestFocus();
            }
        });
                
        // Auto Refresh Action for Save Button in Customer edit Form
        eef.eef_btn_save.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(eef.eef_validation() == true)
                {
                    eef.eef_updateCustomerDetailstoDb();
                    eef_refresh_window();
                }  
            }
        });
}
    
    //Display Employee Details 
    public void eef_refresh_window()
    {     
        //JOptionPane.showMessageDialog(this, "Back to Employee Tab");
        
        ed_setAllCustomerDetails();
        int eid = Integer.parseInt(ed_txt_eid.getText());
        try
        {       
            String employee_id = "",name = "",role = "",nic = "",account_number = "",account_branch = "",address = "",contact = "",join_date = "",work_status = "",employee_left_date = "",epf_settled_or_not = "",total_epf = "",settled_date = "";
            Blob profile = null;
                
            Connection con = DBConnection.getConnection();
            String sql = "select * from employee where employee_id = ?";            
                        
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,eid);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {                
                
                employee_id = rs.getString("employee_id");
                name = rs.getString("name");
                role = rs.getString("role");
                //Image
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
            }
                ed_txt_name.setText(name);
                ed_txt_role.setText(role);
                ed_txt_nic.setText(nic);
                ed_txt_addr.setText(address);
                ed_txt_br.setText(account_branch);
                ed_txt_acc_no.setText(account_number);
                ed_txt_phone.setText(contact);
                ed_txt_jdate.setText(join_date);
                ed_txt_status.setText(work_status);
                //ed_cmb_epf.setSelectedItem(epf_settled_or_not);
                ed_txt_ldate.setText(employee_left_date);
                ed_txt_epf.setText(total_epf);
                ed_txt_sdate.setText(settled_date);
                
                if(work_status.equalsIgnoreCase("Still Working"))
                {                    
                    ed_lbl_ldate.setVisible(false);                    
                    ed_txt_ldate.setVisible(false);                    
                    
                    ed_lbl_epf.setVisible(false);
                    ed_txt_epf.setVisible(false);
                                        
                    ed_lbl_epf_info.setVisible(false);                                        
                                        
                    ed_lbl_sdate.setVisible(false);
                    ed_txt_sdate.setVisible(false);                    
                }
                else if(work_status.equalsIgnoreCase("Left"))
                {
                    ed_lbl_ldate.setVisible(true);                    
                    ed_txt_ldate.setVisible(true);
                    //ed_txt_ldate.setText(employee_left_date);
                    
                    ed_lbl_epf.setVisible(true);
                    ed_txt_epf.setVisible(true);
                    
                    if(epf_settled_or_not.equalsIgnoreCase("Yes"))
                    {
                        ed_lbl_epf_info.setText("EPF is Settled");
                        ed_lbl_epf_info.setVisible(true);
                        Color foregroundColor = Color.decode("#107361");
                        ed_lbl_epf_info.setForeground(foregroundColor);
                    
                        //ed_txt_epf.setVisible(true);
                        //ed_txt_epf.setText(total_epf);
                        
                        ed_lbl_sdate.setVisible(true);
                        ed_txt_sdate.setVisible(true);
                        //ed_txt_sdate.setText(settled_date);
                    }
                    else if(epf_settled_or_not.equalsIgnoreCase("No"))
                    {
                        ed_lbl_epf_info.setText("EPF is pending");
                        ed_lbl_epf_info.setVisible(true);
                        Color foregroundColor = Color.decode("#D92525");
                        ed_lbl_epf_info.setForeground(foregroundColor);
                    
                        //ed_txt_epf.setVisible(true);
                        //ed_txt_epf.setText(total_epf);
                        
                        //ed_txt_sdate.setText("");
                        ed_lbl_sdate.setVisible(false);
                        ed_txt_sdate.setVisible(false);                        
                    }
                }

                // Image                
                Blob imageBlob = profile;
                byte[] imageData = imageBlob.getBytes(1, (int) imageBlob.length());

                Image loadedImage = Toolkit.getDefaultToolkit().createImage(imageData);
                Image resizedImage = loadedImage.getScaledInstance(134, 172, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                ed_lbl_image.setIcon(resizedIcon);
                                
                                   
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
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_tab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adding;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Employee;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Monthly_Expenses;
    private rojerusan.RSFotoCircle Profile;
    private javax.swing.JPanel detail_panel;
    private javax.swing.JButton ed_btn_dlt;
    private javax.swing.JButton ed_btn_edit;
    private javax.swing.JButton ed_btn_gen;
    private rojerusan.RSComboMetro ed_cmb_filter;
    private javax.swing.JLabel ed_lbl_epf;
    private javax.swing.JLabel ed_lbl_epf_info;
    private javax.swing.JLabel ed_lbl_image;
    private javax.swing.JLabel ed_lbl_ldate;
    private javax.swing.JLabel ed_lbl_sdate;
    private rojeru_san.complementos.RSTableMetro ed_tbl_emp;
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
    private javax.swing.JButton ef_btn_cancel;
    private javax.swing.JButton ef_btn_clear;
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
    private rojerusan.RSComboMetro emid;
    private javax.swing.JTextField epf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField monthly_salary;
    private javax.swing.JTextField payable_salary;
    private com.toedter.calendar.JDateChooser salary_credit_date;
    private rojerusan.RSComboMetro salary_month;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane2;
    private bizbuilder.Scrollpane scrollpane3;
    private bizbuilder.Scrollpane scrollpane4;
    private javax.swing.JButton sd_clear_btn;
    private javax.swing.JTable sd_details_table1;
    private rojerusan.RSComboMetro sd_emid1;
    private rojerusan.RSComboMetro sd_month1;
    private rojerusan.RSComboMetro sd_year1;
    private javax.swing.JButton sf_cancel_btn;
    private javax.swing.JButton sf_save_btn;
    private bizbuilder.Tabpane tabpane1;
    private bizbuilder.Tabpane tabpane2;
    private bizbuilder.Tabpane tabpane3;
    // End of variables declaration//GEN-END:variables
}
