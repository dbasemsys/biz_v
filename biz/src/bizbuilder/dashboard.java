
package bizbuilder;

import java.awt.BorderLayout;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.Color;
import static java.awt.Color.gray;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import java.util.Timer;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperReport;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;




public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        formWindowOpened();
        summaryview();
        Yearlyanalysisview();
        populatesd_year();
        selectyearComboBoxes();
        ma_com_month.setVisible(false);
        jLabel18.setVisible(false);
        
        // Chart Code Start
        lbl_cus_gbc.setVisible(false);
        panel1.setVisible(false);
        lbl_shop.setVisible(false);   
        panel2.setVisible(false);
        lbl_order.setVisible(false);  
        panel3.setVisible(false);
        // Chart Code End
       
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
        su_lbl_pennot = new javax.swing.JLabel();
        su_txt_pennot = new javax.swing.JTextField();
        su_lbl_totser = new javax.swing.JLabel();
        su_txt_totser = new javax.swing.JTextField();
        su_txt_totin = new javax.swing.JTextField();
        su_lbl_totin = new javax.swing.JLabel();
        su_lbl_totexp = new javax.swing.JLabel();
        su_txt_totexp = new javax.swing.JTextField();
        su_lbl_totepf = new javax.swing.JLabel();
        su_txt_totepf = new javax.swing.JTextField();
        su_lbl_totpft = new javax.swing.JLabel();
        su_txt_totpft = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ya_lbl_totser = new javax.swing.JLabel();
        ya_txt_totser = new javax.swing.JTextField();
        ys_lbl_totin = new javax.swing.JLabel();
        ya_txt_totin = new javax.swing.JTextField();
        ya_lbl_totexp = new javax.swing.JLabel();
        ya_txt_totexp = new javax.swing.JTextField();
        ya_lbl_totpft = new javax.swing.JLabel();
        ya_txt_totpft = new javax.swing.JTextField();
        ya_Current_date = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ma_txt_ser = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ma_txt_in = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ma_txt_exp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ma_txt_pft = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ma_com_year = new rojerusan.RSComboMetro();
        ma_com_month = new rojerusan.RSComboMetro();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        lbl_cus_gbc = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        lbl_shop = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        lbl_order = new javax.swing.JLabel();

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
        tabpane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabpane1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        su_lbl_pennot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_lbl_pennot.setForeground(new java.awt.Color(245, 2, 2));
        su_lbl_pennot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_lbl_pennot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/warning.png"))); // NOI18N
        su_lbl_pennot.setText("Pending Notification");

        su_txt_pennot.setEditable(false);
        su_txt_pennot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_txt_pennot.setForeground(new java.awt.Color(245, 2, 2));
        su_txt_pennot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_txt_pennot.setBorder(null);

        su_lbl_totser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_lbl_totser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_lbl_totser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/counter.png"))); // NOI18N
        su_lbl_totser.setText("Total Services");

        su_txt_totser.setEditable(false);
        su_txt_totser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_txt_totser.setForeground(new java.awt.Color(102, 102, 255));
        su_txt_totser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_txt_totser.setBorder(null);

        su_txt_totin.setEditable(false);
        su_txt_totin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_txt_totin.setForeground(new java.awt.Color(102, 102, 255));
        su_txt_totin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_txt_totin.setBorder(null);

        su_lbl_totin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_lbl_totin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_lbl_totin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        su_lbl_totin.setText("Total Income");

        su_lbl_totexp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_lbl_totexp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_lbl_totexp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        su_lbl_totexp.setText("Total Expenses");

        su_txt_totexp.setEditable(false);
        su_txt_totexp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_txt_totexp.setForeground(new java.awt.Color(102, 102, 255));
        su_txt_totexp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_txt_totexp.setBorder(null);

        su_lbl_totepf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_lbl_totepf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_lbl_totepf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        su_lbl_totepf.setText("Total EPF");

        su_txt_totepf.setEditable(false);
        su_txt_totepf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_txt_totepf.setForeground(new java.awt.Color(102, 102, 255));
        su_txt_totepf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_txt_totepf.setBorder(null);

        su_lbl_totpft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_lbl_totpft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        su_lbl_totpft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        su_lbl_totpft.setText("Total Profit");

        su_txt_totpft.setEditable(false);
        su_txt_totpft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        su_txt_totpft.setForeground(new java.awt.Color(102, 102, 255));
        su_txt_totpft.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_txt_totpft.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(su_lbl_pennot, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_txt_pennot, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_lbl_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_txt_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_lbl_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_lbl_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_txt_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_txt_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_lbl_totepf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_txt_totepf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_lbl_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_txt_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(su_lbl_pennot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_txt_pennot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_lbl_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_txt_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_lbl_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_txt_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_lbl_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_txt_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_lbl_totepf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_txt_totepf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_lbl_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(su_txt_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tabpane1.addTab("Summary", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        ya_lbl_totser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_lbl_totser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ya_lbl_totser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/counter.png"))); // NOI18N
        ya_lbl_totser.setText("Total Services/Year");

        ya_txt_totser.setEditable(false);
        ya_txt_totser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_txt_totser.setForeground(new java.awt.Color(102, 102, 255));
        ya_txt_totser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ya_txt_totser.setBorder(null);

        ys_lbl_totin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ys_lbl_totin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ys_lbl_totin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        ys_lbl_totin.setText("Total Income/Year");

        ya_txt_totin.setEditable(false);
        ya_txt_totin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_txt_totin.setForeground(new java.awt.Color(102, 102, 255));
        ya_txt_totin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ya_txt_totin.setBorder(null);

        ya_lbl_totexp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_lbl_totexp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ya_lbl_totexp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        ya_lbl_totexp.setText("Total Expenses/Year");

        ya_txt_totexp.setEditable(false);
        ya_txt_totexp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_txt_totexp.setForeground(new java.awt.Color(102, 102, 255));
        ya_txt_totexp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ya_txt_totexp.setBorder(null);

        ya_lbl_totpft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_lbl_totpft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ya_lbl_totpft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        ya_lbl_totpft.setText("Total Profit/Year");

        ya_txt_totpft.setEditable(false);
        ya_txt_totpft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_txt_totpft.setForeground(new java.awt.Color(102, 102, 255));
        ya_txt_totpft.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ya_txt_totpft.setBorder(null);

        ya_Current_date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ya_Current_date.setForeground(new java.awt.Color(102, 102, 255));
        ya_Current_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ya_Current_date.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/calendar.png"))); // NOI18N
        ya_Current_date.setText("Total Services/Year");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ya_Current_date, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ya_txt_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ya_lbl_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ya_txt_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ya_lbl_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ya_txt_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ys_lbl_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ya_txt_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ya_lbl_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(318, 318, 318))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(ya_Current_date)
                .addGap(54, 54, 54)
                .addComponent(ya_lbl_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ya_txt_totser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ys_lbl_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ya_txt_totin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ya_lbl_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ya_txt_totexp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ya_lbl_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ya_txt_totpft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        tabpane1.addTab("Yearly Analysis", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/counter.png"))); // NOI18N
        jLabel12.setText("Services");

        ma_txt_ser.setEditable(false);
        ma_txt_ser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ma_txt_ser.setForeground(new java.awt.Color(102, 102, 255));
        ma_txt_ser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ma_txt_ser.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        jLabel13.setText("Income");

        ma_txt_in.setEditable(false);
        ma_txt_in.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ma_txt_in.setForeground(new java.awt.Color(102, 102, 255));
        ma_txt_in.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ma_txt_in.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        jLabel14.setText("Expenses");

        ma_txt_exp.setEditable(false);
        ma_txt_exp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ma_txt_exp.setForeground(new java.awt.Color(102, 102, 255));
        ma_txt_exp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ma_txt_exp.setBorder(null);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rupee.png"))); // NOI18N
        jLabel15.setText("Profit");

        ma_txt_pft.setEditable(false);
        ma_txt_pft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ma_txt_pft.setForeground(new java.awt.Color(102, 102, 255));
        ma_txt_pft.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ma_txt_pft.setBorder(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/calendar.png"))); // NOI18N
        jLabel17.setText("Year");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/30-days.png"))); // NOI18N
        jLabel18.setText("Month");

        ma_com_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ..." }));

        ma_com_month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/report.png"))); // NOI18N
        jButton1.setText("Generate Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 319, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma_txt_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma_txt_in, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma_txt_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma_txt_pft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma_com_year, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma_com_month, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(318, 318, 318))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ma_com_year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ma_com_month, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ma_txt_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ma_txt_in, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ma_txt_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ma_txt_pft, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tabpane1.addTab("Monthly Analysis", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel1.setPreferredSize(new java.awt.Dimension(400, 300));
        panel1.setLayout(new java.awt.BorderLayout());

        lbl_cus_gbc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cus_gbc.setForeground(new java.awt.Color(153, 153, 153));
        lbl_cus_gbc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cus_gbc.setText("No Records ...");
        panel1.add(lbl_cus_gbc, java.awt.BorderLayout.CENTER);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel2.setPreferredSize(new java.awt.Dimension(400, 300));
        panel2.setLayout(new java.awt.BorderLayout());

        lbl_shop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_shop.setForeground(new java.awt.Color(153, 153, 153));
        lbl_shop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_shop.setText("No Records");
        panel2.add(lbl_shop, java.awt.BorderLayout.CENTER);

        panel3.setBackground(new java.awt.Color(255, 255, 255));
        panel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel3.setPreferredSize(new java.awt.Dimension(400, 300));
        panel3.setLayout(new java.awt.BorderLayout());

        lbl_order.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_order.setForeground(new java.awt.Color(153, 153, 153));
        lbl_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_order.setText("No Records");
        panel3.add(lbl_order, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabpane1.addTab("Chart Analysis", jPanel6);

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
        employee_tab o = new employee_tab();
        o.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        // TODO add your handling code here:
       
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

    private void tabpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabpane1MouseClicked
        // TODO add your handling code here:
        ma_com_year.setSelectedIndex(0);
        
        // Chart Code Start
        
        //Group Bar Chart
        panel1.setVisible(true);
        pc_customer_checkRecordIsExist();        
        showGroupedBarChart();
        
        // Shop Pie Chart 
        panel2.setVisible(true);
        pc_shop_checkRecordIsExist();
                        
        // Order Pie Chart
        panel3.setVisible(true);
        pc_order_checkRecordIsExist();
        
        // Chart Code End
        
    }//GEN-LAST:event_tabpane1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        generateReport();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void populatesd_year(){
    ArrayList<String> values = new ArrayList<>();
    for (int i = 2023; i <= 2123; i++) {
    values.add(""+i);
    }
    for (String value : values) {
    ma_com_year.addItem(value);
    }

    }
    
    private void formWindowOpened() {
    
    // Declare a SimpleDateFormat object
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    // Create a Timer object
    Timer timer = new Timer();

    // Create a TimerTask to update the label
    TimerTask task = new TimerTask() {
    @Override
    public void run() {
        // Get the current date and time
        Date currentDate = new Date();
        String formattedDateTime = sdf.format(currentDate);

        // Set the formatted date and time as the text of the JLabel
        ya_Current_date.setText(formattedDateTime);
    }
};

        // Schedule the TimerTask to run every second (1000 milliseconds)
        timer.scheduleAtFixedRate(task, 0, 1000);

}
    
     public void summaryview()
    {                
       
try {
    Connection con = DBConnection.getConnection();

    // Query to get total income
    String incomeQuery = "SELECT SUM(total_price) AS total_income FROM customer";
    PreparedStatement incomeStatement = con.prepareStatement(incomeQuery);
    ResultSet incomeResult = incomeStatement.executeQuery();

    // Query to get count of customers
    String customerQuery = "SELECT COUNT(*) AS customer_count FROM customer";
    PreparedStatement customerStatement = con.prepareStatement(customerQuery);
    ResultSet customerResult = customerStatement.executeQuery();
    
    // Query to get total_epf
    String su_total_epf_Query = "SELECT sum(total_epf) AS su_total_epf FROM employee";
    PreparedStatement su_total_epf_Statement = con.prepareStatement(su_total_epf_Query);
    ResultSet su_total_epf_Result = su_total_epf_Statement.executeQuery();
    
    // Query to get total_expenses
    String su_total_exp_Query = "SELECT sum(cost) AS su_total_exp FROM monthly_expenses";
    PreparedStatement su_total_exp_Statement = con.prepareStatement(su_total_exp_Query);
    ResultSet su_total_exp_Result = su_total_exp_Statement.executeQuery();
    
    // Query to get total_salary
    String su_total_salary_Query = "SELECT sum(salary) AS su_total_salary FROM salary";
    PreparedStatement su_total_salary_Statement = con.prepareStatement(su_total_salary_Query);
    ResultSet su_total_salary_Result = su_total_salary_Statement.executeQuery();
    
    String query = "SELECT COUNT(*) AS epf FROM employee WHERE epf_settled_or_not = 'no' && work_status!= 'Still Working'";
    PreparedStatement statement = con.prepareStatement(query);
    ResultSet epfpendingresultSet = statement.executeQuery();

    // Retrieve and display total income
    if (incomeResult.next()) {
        double totalIncome = incomeResult.getDouble("total_income");
        su_txt_totin.setText(String.format("Rs. %.2f",totalIncome));
    }

    // Retrieve and display customer count
    if (customerResult.next()) {
        int customerCount = customerResult.getInt("customer_count");
        su_txt_totser.setText(String.valueOf(customerCount));
    }
    
    if (su_total_epf_Result.next()) {
        double su_total_epf = su_total_epf_Result.getInt("su_total_epf");
        su_txt_totepf.setText(String.format("Rs. %.2f",su_total_epf));
    }
    
    
    if (su_total_salary_Result.next()&& su_total_exp_Result.next()) {
        double su_total_exp = su_total_exp_Result.getInt("su_total_exp");
        double su_total_salary = su_total_salary_Result.getInt("su_total_salary");
        double total_exp = su_total_exp + su_total_salary;
        su_txt_totexp.setText(String.format("Rs. %.2f",total_exp));
        
    }
    
    if (epfpendingresultSet.next()) {
        int epfStatus = epfpendingresultSet.getInt("epf");
        String epfstatus = String.valueOf(epfStatus);
        if(epfStatus !=0){
        su_txt_pennot.setVisible(true);
        su_lbl_pennot.setVisible(true);
        su_txt_pennot.setText("You want to settele EPF for "+epfstatus+" employee/s");}
        else{
        su_txt_pennot.setVisible(false);
        su_lbl_pennot.setVisible(false);
        }
    }
    
    //if (incomeResult.next()&& su_total_salary_Result.next()&& su_total_exp_Result.next()) {
        double totalIncome = incomeResult.getDouble("total_income");
        double su_total_exp = su_total_exp_Result.getDouble("su_total_exp");
        double su_total_salary = su_total_salary_Result.getDouble("su_total_salary");
        double total_exp = su_total_exp + su_total_salary;
        double profit = totalIncome - total_exp;
        su_txt_totpft.setText(String.format("Rs. %.2f", profit)); // Format as currency
    //}
} catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

}
public void Yearlyanalysisview(){
     try {
    Connection con = DBConnection.getConnection(); // Replace with your connection code

    // Get the current year
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    String scurrentYear =String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
    
    String customerQuery = "SELECT COUNT(*) AS customer_count FROM customer WHERE YEAR(serviced_date) = ?";
    PreparedStatement customerStatement = con.prepareStatement(customerQuery);
    customerStatement.setInt(1, currentYear);
    ResultSet customerResult = customerStatement.executeQuery();
    
    String incomeQuery = "SELECT SUM(total_price) AS total_income FROM customer WHERE YEAR(serviced_date) = ?";
    PreparedStatement incomeStatement = con.prepareStatement(incomeQuery);
    incomeStatement.setInt(1, currentYear);
    ResultSet incomeResult = incomeStatement.executeQuery();
    
    // Query to get total_expenses
    String su_total_exp_Query = "SELECT SUM(cost) AS su_total_exp FROM monthly_expenses WHERE SUBSTRING(month, 25, 4) = ?";
    PreparedStatement su_total_exp_Statement = con.prepareStatement(su_total_exp_Query);
    su_total_exp_Statement.setString(1, scurrentYear);
    ResultSet su_total_exp_Result = su_total_exp_Statement.executeQuery();

    
    // Query to get total_salary
    String su_total_salary_Query = "SELECT SUM(salary) AS su_total_salary FROM salary WHERE SUBSTRING(credited_date, 25, 4) = ?";
    PreparedStatement su_total_salary_Statement = con.prepareStatement(su_total_salary_Query);
    su_total_salary_Statement.setString(1, scurrentYear);
    ResultSet su_total_salary_Result = su_total_salary_Statement.executeQuery();

    
    if (customerResult.next()) {
        int customer_count = customerResult.getInt("customer_count");
        ya_txt_totser.setText(String.valueOf(customer_count));
    }
    
    if (incomeResult.next()) {
        double totalIncome = incomeResult.getDouble("total_income");
        ya_txt_totin.setText(String.format("Rs. %.2f",totalIncome));
    }
    if (su_total_salary_Result.next() && su_total_exp_Result.next()) {
        double su_total_exp = su_total_exp_Result.getDouble("su_total_exp");
        double su_total_salary = su_total_salary_Result.getDouble("su_total_salary");
        double total_exp = su_total_exp + su_total_salary;
        ya_txt_totexp.setText(String.format("Rs. %.2f", total_exp));}
    
    double totalIncome = incomeResult.getDouble("total_income");
        double su_total_exp = su_total_exp_Result.getDouble("su_total_exp");
        double su_total_salary = su_total_salary_Result.getDouble("su_total_salary");
        double total_exp = su_total_exp + su_total_salary;
        double profit = totalIncome - total_exp;
        ya_txt_totpft.setText(String.format("Rs. %.2f", profit));
    
} catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}

//---------------------------------monthly analysis----------------------------------------------
private Map<String, String> monthMap = new HashMap<String, String>() {
    {
        put("January", "01");
        put("February", "02");
        put("March", "03");
        put("April", "04");
        put("May", "05");
        put("June", "06");
        put("July", "07");
        put("August", "08");
        put("September", "09");
        put("October", "10");
        put("November", "11");
        put("December", "12");
    }
};

public void Monthyanalysisview(){
     try {
    Connection con = DBConnection.getConnection(); // Replace with your connection code

    // Get the current year
    String selectedYear = ma_com_year.getSelectedItem().toString();
        String selectedMonth = (String) ma_com_month.getSelectedItem();

        if (selectedYear == "Select ..." || selectedMonth == "Select ...") {
            // Handle the case where selectedYear or selectedMonth is null
            ma_txt_ser.setText("0");
            ma_txt_in.setText("Rs. 0.00");
            ma_txt_exp.setText("Rs. 0.00");
            ma_txt_pft.setText("Rs. 0.00");
            return;
        }

        String monthNumber = monthMap.get(selectedMonth).toString();
        String filterValue = selectedYear + "-" + monthNumber;

        String customerQuery = "SELECT COUNT(*) AS customer_count FROM customer WHERE DATE_FORMAT(serviced_date, '%Y-%m') = ?";
        PreparedStatement customerStatement = con.prepareStatement(customerQuery);
        customerStatement.setString(1, filterValue);
        ResultSet customerResult = customerStatement.executeQuery();
    
        String incomeQuery = "SELECT SUM(total_price) AS total_income FROM customer WHERE DATE_FORMAT(serviced_date, '%Y-%m') = ?";
        PreparedStatement incomeStatement = con.prepareStatement(incomeQuery);
        incomeStatement.setString(1, filterValue);
        ResultSet incomeResult = incomeStatement.executeQuery();
    
     //Query to get total_expenses
    String su_total_exp_Query = "SELECT SUM(cost) AS su_total_exp FROM monthly_expenses WHERE DATE_FORMAT(STR_TO_DATE(month, '%a %b %d %T IST %Y'), '%Y-%m') = ?";
        PreparedStatement su_total_exp_Statement = con.prepareStatement(su_total_exp_Query);
        su_total_exp_Statement.setString(1, filterValue);
        ResultSet su_total_exp_Result = su_total_exp_Statement.executeQuery();

    
    // Query to get total_salary
    String su_total_salary_Query = "SELECT SUM(salary) AS su_total_salary FROM salary WHERE DATE_FORMAT(STR_TO_DATE(credited_date, '%a %b %d %T IST %Y'), '%Y-%m') = ?";
    PreparedStatement su_total_salary_Statement = con.prepareStatement(su_total_salary_Query);
    su_total_salary_Statement.setString(1, filterValue);
    ResultSet su_total_salary_Result = su_total_salary_Statement.executeQuery();

    
    if (customerResult.next()) {
        int customer_count = customerResult.getInt("customer_count");
        ma_txt_ser.setText(String.valueOf(customer_count));
    }
    
    if (incomeResult.next()) {
        double totalIncome = incomeResult.getDouble("total_income");
        ma_txt_in.setText(String.format("Rs. %.2f",totalIncome));
    }
    if (su_total_salary_Result.next() && su_total_exp_Result.next()) {
        double su_total_exp = su_total_exp_Result.getDouble("su_total_exp");
        double su_total_salary = su_total_salary_Result.getDouble("su_total_salary");
        double total_exp = su_total_exp + su_total_salary;
        ma_txt_exp.setText(String.format("Rs. %.2f", total_exp));}
    
    double totalIncome = incomeResult.getDouble("total_income");
        double su_total_exp = su_total_exp_Result.getDouble("su_total_exp");
        double su_total_salary = su_total_salary_Result.getDouble("su_total_salary");
        double total_exp = su_total_exp + su_total_salary;
        double profit = totalIncome - total_exp;
        ma_txt_pft.setText(String.format("Rs. %.2f", profit));
    
} catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}


private void selectyearComboBoxes() {
    ma_com_year.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ma_com_month.setVisible(true);
            jLabel18.setVisible(true);
            if (ma_com_year.getSelectedItem().equals("Select ...")){
                ma_com_month.setSelectedIndex(0);
                ma_com_month.setVisible(false);
                jLabel18.setVisible(false);
            }
        }
    });

    ma_com_month.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Check if both year and month are selected
            if (ma_com_year.getSelectedItem() != null && ma_com_month.getSelectedItem() != null) {
                // Both year and month are selected, so call the Monthyanalysisview method
                Monthyanalysisview();
            }
        }
    });
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

 public void generateReport() {
    try {
        Connection con = DBConnection.getConnection(); // Replace with your database connection logic
        String selectedYear = ma_com_year.getSelectedItem().toString();
        String selectedMonth = (String) ma_com_month.getSelectedItem();
        
         if (selectedYear == "Select ..." || selectedMonth == "Select ...") {
            JOptionPane.showMessageDialog(this, "Please select both year and month.", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Stop execution if either year or month is not selected
        }
        
        //String reportPath = "src\\bizbuilder\\Monthlyreport.jrxml";
        InputStream reportStream = dashboard.class.getResourceAsStream("/bizbuilder/Monthlyreport.jrxml");
        String monthNumber = monthMap.get(selectedMonth).toString();
        
        String filterValue = selectedYear + "-" + monthNumber;
        // Query to get total_income
        String shopQuery = "SELECT SUM(total_price) AS total_income FROM customer WHERE DATE_FORMAT(serviced_date, '%Y-%m') = ? && service_type = 'Shop'";
        PreparedStatement shopStatement = con.prepareStatement(shopQuery);
        shopStatement.setString(1, filterValue);
        ResultSet shopResult = shopStatement.executeQuery();
        double shopIncome = 0.0; // Initialize shopIncome

        if (shopResult.next()) {
            shopIncome = shopResult.getDouble("total_income");
        }

// Query for 'Order' income
        String orderQuery = "SELECT SUM(total_price) AS total_income FROM customer WHERE DATE_FORMAT(serviced_date, '%Y-%m') = ? && service_type = 'Order'";
        PreparedStatement orderStatement = con.prepareStatement(orderQuery);
        orderStatement.setString(1, filterValue);
        ResultSet orderResult = orderStatement.executeQuery();
        double orderIncome = 0.0; // Initialize orderIncome

        if (orderResult.next()) {
            orderIncome = orderResult.getDouble("total_income");
        }


        // Query to get total_expenses
        String su_total_exp_Query = "SELECT SUM(cost) AS su_total_exp FROM monthly_expenses WHERE DATE_FORMAT(STR_TO_DATE(month, '%a %b %d %T IST %Y'), '%Y-%m') = ?";
        PreparedStatement su_total_exp_Statement = con.prepareStatement(su_total_exp_Query);
        su_total_exp_Statement.setString(1, filterValue);
        ResultSet su_total_exp_Result = su_total_exp_Statement.executeQuery();
        double su_total_exp = 0.0; // Initialize su_total_exp
        
        if (su_total_exp_Result.next()) {
            su_total_exp = su_total_exp_Result.getDouble("su_total_exp");
        }

        // Query to get total_salary
        String su_total_salary_Query = "SELECT SUM(salary) AS su_total_salary FROM salary WHERE DATE_FORMAT(STR_TO_DATE(credited_date, '%a %b %d %T IST %Y'), '%Y-%m') = ?";
        PreparedStatement su_total_salary_Statement = con.prepareStatement(su_total_salary_Query);
        su_total_salary_Statement.setString(1, filterValue);
        ResultSet su_total_salary_Result = su_total_salary_Statement.executeQuery();
        double su_total_salary = 0.0; // Initialize su_total_salary
        
        if (su_total_salary_Result.next()) {
            su_total_salary = su_total_salary_Result.getDouble("su_total_salary");
        }
        double totalIncome = shopIncome +orderIncome;
        double total_exp = su_total_exp + su_total_salary;
        double profit = totalIncome - total_exp;
        
        
        JasperReport jr = JasperCompileManager.compileReport(reportStream);
        
        Map<String, Object> para = new HashMap<String, Object>();
        para.put("Year_Parameter", filterValue); // Use parentheses, not angle brackets
        para.put("Profit_Parameter", profit);
        para.put("Salary_Parameter", su_total_salary);
        para.put("EXP_Parameter", su_total_exp);
        para.put("Order_Parameter", orderIncome);
        para.put("Shop_Parameter", shopIncome);
        para.put("TotalExp_Parameter", total_exp);
        para.put("TotalIncome_Parameter", totalIncome);
        JasperPrint jp = JasperFillManager.fillReport(jr, para, con);

            // Set custom position (x, y), size, and title for the JasperViewer window
            int customX = 600; // Set your custom x-coordinate
            int customY = 75; // Set your custom y-coordinate
            int customWidth = 700; // Set your custom width
            int customHeight = 600; // Set your custom height
            String customTitle = "Monthly Report"; // Set your custom title

            dashboard.CustomJasperViewer customViewer = new dashboard.CustomJasperViewer(jp, customX, customY, customWidth, customHeight, customTitle);
            customViewer.setVisible(true); // Fixed typo in JasperFillManager
        
    } catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}

 // -------------------------------------------------------------------------------------------------------------------------------------
// Chart Code Start

// Panel 1 
    // Group Bar Chart Start
    public void showGroupedBarChart(){
        
        //create dataset
        DefaultCategoryDataset barDataset = new DefaultCategoryDataset( );
        try
        {
            Connection con = DBConnection.getConnection();
            String sql = "select year, income , expense , profit from db_5_year_in_exp_pro";
            Statement st = con.createStatement() ;
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {                
                String year = rs.getString("year");                 
                barDataset.addValue(rs.getDouble("income"), "Income", year);
                barDataset.addValue(rs.getDouble("expense"), "Expense", year);
                barDataset.addValue(rs.getDouble("profit"), "Profit", year);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //create chart
        JFreeChart barChart = ChartFactory.createBarChart("5 Year Analysis", "Year", "Amount", barDataset, PlotOrientation.VERTICAL, true, true, false);
      
        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        BarRenderer barRenderer = (BarRenderer) categoryPlot.getRenderer();
        
        // Set custom colors for bars (if needed)
        barRenderer.setSeriesPaint(0, new Color(255, 0, 0));    // Income
        barRenderer.setSeriesPaint(1, new Color(0, 0, 255));    // Expense
        barRenderer.setSeriesPaint(2, new Color(0, 255, 0));    // Profit
      
        // Set background color
        categoryPlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(barChart);
        panel1.removeAll();
        panel1.add(barChartPanel, BorderLayout.CENTER);
        panel1.validate();
    }    
    
    public void gbc_insertIntoTable() 
    {
        //Calendar calendar = Calendar.getInstance();
        //int currentYear = calendar.get(Calendar.YEAR);
       // JOptionPane.showMessageDialog(this,currentYear);
        
        
        Year currentYear = Year.now();
        int year0 = currentYear.getValue();
        //JOptionPane.showMessageDialog(this,yearValue);
        
        //JOptionPane.showMessageDialog(this,getRecords(year0));
        
        double income=0, expense=0, profit=0;
        try
        {
            for(int i=0; i<5; i++)
            {
                // Get Values (yesr, income, expense, profit)
                income = gbc_getTotalIncome(year0);
                expense = gbc_getTotalExpense(year0);
                profit = income - expense;

                Connection con = DBConnection.getConnection();
                String sql = "insert into db_5_year_in_exp_pro (year,income,expense,profit) values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setDouble(1,year0);
                pst.setDouble(2,income);   
                pst.setDouble(3,expense);
                pst.setDouble(4,profit);

                pst.executeUpdate();                
                year0 = year0 - 1;
            }
            //JOptionPane.showMessageDialog(this, "Recors Inserted");             
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
        
    public double gbc_getTotalIncome(int y)
    {
        try
        {            
            int year_n = y;
            double tot_price = 0;
            Connection con = DBConnection.getConnection();
            String sql = "select SUM(total_price) as tot_price from customer where YEAR(serviced_date) = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,year_n);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                tot_price = rs.getDouble("tot_price");                                              
            }   
            return tot_price;
        }
        catch(Exception e)
        {
           e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
    
    public double gbc_getTotalExpense(int y)
    {
        try
        {                             
            int year_n = y;
            Connection con = DBConnection.getConnection();
                        
            // Get Total Expense amount from monthly Expense Table
            double tot_expense = 0;            
            double tot_expense1 = 0;            
            String sql1 = "select SUM(cost) as tot_cost from monthly_expenses WHERE YEAR(STR_TO_DATE(month, '%a %b %d %T IST %Y')) = ?";
            PreparedStatement pst1 = con.prepareStatement(sql1);

            pst1.setInt(1,year_n);                   
            ResultSet rs1 = pst1.executeQuery();
            
            while(rs1.next())
            {
                tot_expense1 = rs1.getDouble("tot_cost");                                              
            }  
            
            
            // Get Total Salary amount from Salary Table
            double tot_expense2 = 0;            
            String sql2 = "SELECT SUM(salary) as tot_salary FROM salary WHERE YEAR(STR_TO_DATE(credited_date, '%a %b %d %T IST %Y')) = ?";
            PreparedStatement pst2 = con.prepareStatement(sql2);
                       
            pst2.setInt(1,year_n);                   
            ResultSet rs2 = pst2.executeQuery();
            
            while(rs2.next())
            {
                tot_expense2 = rs2.getDouble("tot_salary");                                              
            }   
            
            tot_expense = tot_expense1 + tot_expense2;
            return tot_expense;
        }
        catch(Exception e)
        {
           e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }
       
    public void gbc_deleteRecords()
    {
        try
        {
            Connection con = DBConnection.getConnection();
            String sql = "delete from db_5_year_in_exp_pro ";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.executeUpdate();
            //JOptionPane.showMessageDialog(this, "Records Deleted");
            gbc_insertIntoTable();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void gbc_checkRecordIsExist()
    {
        try
        {            
            Connection con = DBConnection.getConnection();
            String sql = "select COUNT(*) from db_5_year_in_exp_pro ";
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            if(rs.next())
            {
                int count = rs.getInt(1);

                if (count > 0) {
                    //JOptionPane.showMessageDialog(this, "Records exist.");
                    gbc_deleteRecords();
                } 
                else 
                {
                    //JOptionPane.showMessageDialog(this, "No records.");
                    gbc_insertIntoTable();
                }                                        
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                
    }    
    
    public void pc_customer_checkRecordIsExist()
    {
        try
        {            
            Connection con = DBConnection.getConnection();
            String sql = "select COUNT(*) from customer";
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            if(rs.next())
            {
                int count = rs.getInt(1);

                if (count > 0) {
                    //JOptionPane.showMessageDialog(this, "Records exist.");
                    gbc_checkRecordIsExist();
                    lbl_cus_gbc.setVisible(false);
                } 
                else 
                {
                    //JOptionPane.showMessageDialog(this, "No records.");
                    lbl_cus_gbc.setVisible(true);
                    lbl_cus_gbc.setText("No Records..");
                }                                        
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                
    }   
    // Group Bar Chart End
    
// Panel 2
    // Pie Chart Shop    
    public void showPieChartShop(){
        
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset( );
        try
        {
            Connection con = DBConnection.getConnection();
            String sql = "select service,sum(price) as tot_price from shop_services group by service";
            Statement st = con.createStatement() ;
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                barDataset.setValue( rs.getString("service") , new Double(rs.getDouble("tot_price")) );  
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
      
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Shop Services",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panel2.removeAll();
        panel2.add(barChartPanel, BorderLayout.CENTER);
        panel2.validate();
    }
    
    public void pc_shop_checkRecordIsExist()
    {
        try
        {            
            Connection con = DBConnection.getConnection();
            String sql = "select COUNT(*) from shop_services";
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            if(rs.next())
            {
                int count = rs.getInt(1);

                if (count > 0) {
                    //JOptionPane.showMessageDialog(this, "Records exist.");
                    showPieChartShop();
                    lbl_shop.setVisible(false);                    
                } 
                else 
                {
                    //JOptionPane.showMessageDialog(this, "No records.");
                    lbl_shop.setVisible(true);
                    lbl_shop.setText("No Records..");
                }                                        
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                
    }       
    // Pie Chart End

// Panel 3    
    // Pie Chart Order Start    
    public void showPieChartOrder(){
        
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset( );
        try
        {
            Connection con = DBConnection.getConnection();
            String sql = "select service,sum(price) as tot_price from ordering_services group by service";
            Statement st = con.createStatement() ;
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                barDataset.setValue( rs.getString("service") , new Double(rs.getDouble("tot_price")) );  
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
      
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Ordering Services",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
        piePlot.setSectionPaint("IPhone 5s", new Color(255,255,102));
        piePlot.setSectionPaint("SamSung Grand", new Color(102,255,102));
        piePlot.setSectionPaint("MotoG", new Color(255,102,153));
        piePlot.setSectionPaint("Nokia Lumia", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panel3.removeAll();
        panel3.add(barChartPanel, BorderLayout.CENTER);
        panel3.validate();
    }    
    
    public void pc_order_checkRecordIsExist()
    {
        try
        {            
            Connection con = DBConnection.getConnection();
            String sql = "select COUNT(*) from ordering_services";
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();

            if(rs.next())
            {
                int count = rs.getInt(1);

                if (count > 0) {
                    //JOptionPane.showMessageDialog(this, "Records exist.");
                    showPieChartOrder();
                    lbl_order.setVisible(false);                    
                } 
                else 
                {
                    //JOptionPane.showMessageDialog(this, "No records.");
                    lbl_order.setVisible(true);
                    lbl_order.setText("No Records..");
                }                                        
            }   
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                
    }  
    // Pie Chart Order End
   
// Chart Code End
   
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_cus_gbc;
    private javax.swing.JLabel lbl_order;
    private javax.swing.JLabel lbl_shop;
    private rojerusan.RSComboMetro ma_com_month;
    private rojerusan.RSComboMetro ma_com_year;
    private javax.swing.JTextField ma_txt_exp;
    private javax.swing.JTextField ma_txt_in;
    private javax.swing.JTextField ma_txt_pft;
    private javax.swing.JTextField ma_txt_ser;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JLabel su_lbl_pennot;
    private javax.swing.JLabel su_lbl_totepf;
    private javax.swing.JLabel su_lbl_totexp;
    private javax.swing.JLabel su_lbl_totin;
    private javax.swing.JLabel su_lbl_totpft;
    private javax.swing.JLabel su_lbl_totser;
    private javax.swing.JTextField su_txt_pennot;
    private javax.swing.JTextField su_txt_totepf;
    private javax.swing.JTextField su_txt_totexp;
    private javax.swing.JTextField su_txt_totin;
    private javax.swing.JTextField su_txt_totpft;
    private javax.swing.JTextField su_txt_totser;
    private bizbuilder.Tabpane tabpane1;
    private javax.swing.JLabel ya_Current_date;
    private javax.swing.JLabel ya_lbl_totexp;
    private javax.swing.JLabel ya_lbl_totpft;
    private javax.swing.JLabel ya_lbl_totser;
    private javax.swing.JTextField ya_txt_totexp;
    private javax.swing.JTextField ya_txt_totin;
    private javax.swing.JTextField ya_txt_totpft;
    private javax.swing.JTextField ya_txt_totser;
    private javax.swing.JLabel ys_lbl_totin;
    // End of variables declaration//GEN-END:variables
}
