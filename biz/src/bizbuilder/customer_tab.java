
package bizbuilder;


import java.awt.Color;
// Customer Form
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
// Customer Details Form
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;


public class customer_tab extends javax.swing.JFrame {

    public customer_tab() {
        initComponents();
        
        // Customer Form
        //shop_ser_panel.setVisible(false);
        //order_panel.setVisible(false);
        //scrollpane2.setVisible(false);
        Detail_panel.setVisible(false);
        cf_txt_cid.enable(false); 
        cf_txt_dis.setText("0.00");
        cf_txt_price.enable(false);  
        
        // Customer Deails View
        cd_setCustomerDetails();
        //Detail_panel.setVisible(false);
        cd_lbl_shop_ser.setVisible(false);
        cd_lbl_order_ser_exp.setVisible(false);
        cd_lbl_order_ser.setVisible(false);
        Offered_table.setVisible(false);
        Order_table.setVisible(false);
        Order_exp_table.setVisible(false);
        tbl_customer.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tbl_customer.getSelectedRow();
                    if (selectedRow != -1) {
                        //scrollpane2.setVisible(true);
                        cd_populateDetailView(selectedRow);
                    }
                }
            }
        });
            
        // Combo Boxes
        populateComboBoxSS();
        populateComboBoxOS();
        populateComboBoxOSE();
        


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
        scrollpane1 = new bizbuilder.Scrollpane();
        jPanel6 = new javax.swing.JPanel();
        common_panel1 = new javax.swing.JPanel();
        lbl_br = new javax.swing.JLabel();
        lbl_cid = new javax.swing.JLabel();
        lbl_cname = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        cf_cmb_type = new rojerusan.RSComboMetro();
        cf_txt_phone = new javax.swing.JTextField();
        cf_txt_cname = new javax.swing.JTextField();
        cf_txt_cid = new javax.swing.JTextField();
        cf_txt_price = new javax.swing.JTextField();
        cf_cmb_br = new rojerusan.RSComboMetro();
        lbl_order_ser8 = new javax.swing.JLabel();
        cf_txt_date = new com.toedter.calendar.JDateChooser();
        shop_ser_panel = new javax.swing.JPanel();
        cf_txt_shop_ser_price = new javax.swing.JTextField();
        cf_lbl_shop_ser = new javax.swing.JLabel();
        cf_lbl_shop = new javax.swing.JLabel();
        cf_lbl_shop_price = new javax.swing.JLabel();
        cf_btn_dl_shop_ser = new javax.swing.JButton();
        cf_cmb_shop_ser = new javax.swing.JComboBox<>();
        scrollpane_shop_ser = new bizbuilder.Scrollpane();
        jScrollPane1 = new javax.swing.JScrollPane();
        cf_tbl_shop_ser = new javax.swing.JTable();
        cf_btn_add_shop_ser = new javax.swing.JButton();
        cf_lbl_dis = new javax.swing.JLabel();
        cf_txt_dis = new javax.swing.JTextField();
        order_panel = new javax.swing.JPanel();
        order_ser_panel = new javax.swing.JPanel();
        cf_txt_order_ser_price = new javax.swing.JTextField();
        cf_lbl_order_ser = new javax.swing.JLabel();
        cf_lbl_order = new javax.swing.JLabel();
        cf_lbl_order_price = new javax.swing.JLabel();
        cf_btn_add_order_ser = new javax.swing.JButton();
        cf_cmb_order_ser = new javax.swing.JComboBox<>();
        scrollpane_order_ser = new bizbuilder.Scrollpane();
        jScrollPane2 = new javax.swing.JScrollPane();
        cf_tbl_order_ser = new javax.swing.JTable();
        cf_btn_dl_order_ser = new javax.swing.JButton();
        order_ser_exp_panel = new javax.swing.JPanel();
        cf_txt_order_ser_exp_cost = new javax.swing.JTextField();
        cf_lbl_shop_ser_exp = new javax.swing.JLabel();
        cf_lbl_order_ser_exp = new javax.swing.JLabel();
        cf_lbl_order_ser_exp_cost = new javax.swing.JLabel();
        btn_add_order_ser_exp = new javax.swing.JButton();
        cf_cmb_order_ser_exp = new javax.swing.JComboBox<>();
        scrollpane_order_ser_exp = new bizbuilder.Scrollpane();
        jScrollPane3 = new javax.swing.JScrollPane();
        cf_tbl_order_ser_exp = new javax.swing.JTable();
        btn_dl_order_ser_exp = new javax.swing.JButton();
        cf_btn_save = new javax.swing.JButton();
        cf_btn_cancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        scrollpane4 = new bizbuilder.Scrollpane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_customer = new rojeru_san.complementos.RSTableMetro();
        scrollpane2 = new bizbuilder.Scrollpane();
        Detail_panel = new javax.swing.JPanel();
        cd_lbl_br = new javax.swing.JLabel();
        cd_txt_br = new javax.swing.JTextField();
        cd_lbl_cid = new javax.swing.JLabel();
        cd_txt_cid = new javax.swing.JTextField();
        cd_lbl_cname = new javax.swing.JLabel();
        cd_txt_cname = new javax.swing.JTextField();
        cd_lbl_phone = new javax.swing.JLabel();
        cd_txt_phone = new javax.swing.JTextField();
        cd_lbl_type = new javax.swing.JLabel();
        cd_lbl_date = new javax.swing.JLabel();
        cd_txt_date = new javax.swing.JTextField();
        cd_lbl_shop_ser = new javax.swing.JLabel();
        Offered_table = new bizbuilder.Scrollpane();
        jScrollPane9 = new javax.swing.JScrollPane();
        cd_tbl_shop_ser = new javax.swing.JTable();
        cd_lbl_order_ser_exp = new javax.swing.JLabel();
        cd_lbl_order_ser = new javax.swing.JLabel();
        Order_exp_table = new bizbuilder.Scrollpane();
        jScrollPane4 = new javax.swing.JScrollPane();
        cd_tbl_order_ser_exp = new javax.swing.JTable();
        cd_txt_price = new javax.swing.JTextField();
        cd_lbl_price = new javax.swing.JLabel();
        cd_txt_type = new javax.swing.JTextField();
        Order_table = new bizbuilder.Scrollpane();
        jScrollPane10 = new javax.swing.JScrollPane();
        cd_tbl_order_ser = new javax.swing.JTable();
        cd_btn_edit = new javax.swing.JButton();
        cd_txt_dis = new javax.swing.JTextField();
        cd_lbl_dis = new javax.swing.JLabel();
        cd_btn_dlt = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane1.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        common_panel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_br.setText("Branch");

        lbl_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cid.setText("Customer ID");

        lbl_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_cname.setText("Customer Name");

        lbl_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_phone.setText("Phone Number");

        lbl_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_type.setText("Service Type");

        lbl_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_date.setText("Service Date");

        cf_cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "Shop", "Ordering" }));
        cf_cmb_type.setColorArrow(new java.awt.Color(102, 102, 255));
        cf_cmb_type.setColorBorde(new java.awt.Color(102, 102, 255));
        cf_cmb_type.setColorFondo(new java.awt.Color(102, 102, 255));
        cf_cmb_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_cmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_cmb_typeActionPerformed(evt);
            }
        });

        cf_txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_txt_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_cname.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_cname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_txt_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_cid.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_cid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_txt_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_price.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_cmb_br.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "Branch1", "Branch2" }));
        cf_cmb_br.setColorArrow(new java.awt.Color(102, 102, 255));
        cf_cmb_br.setColorBorde(new java.awt.Color(102, 102, 255));
        cf_cmb_br.setColorFondo(new java.awt.Color(102, 102, 255));
        cf_cmb_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_cmb_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_cmb_brActionPerformed(evt);
            }
        });

        lbl_order_ser8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser8.setText("Price");

        cf_txt_date.setBackground(new java.awt.Color(255, 255, 255));
        cf_txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        cf_txt_date.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout common_panel1Layout = new javax.swing.GroupLayout(common_panel1);
        common_panel1.setLayout(common_panel1Layout);
        common_panel1Layout.setHorizontalGroup(
            common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(common_panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cid)
                    .addComponent(lbl_cname)
                    .addComponent(lbl_phone)
                    .addComponent(lbl_type)
                    .addComponent(lbl_date)
                    .addComponent(lbl_br)
                    .addComponent(lbl_order_ser8))
                .addGap(100, 100, 100)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cf_cmb_type, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cf_txt_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cf_txt_cname, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cf_txt_cid, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cf_cmb_br, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cf_txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cf_txt_price, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        common_panel1Layout.setVerticalGroup(
            common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(common_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_br)
                    .addComponent(cf_cmb_br, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cid)
                    .addComponent(cf_txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cname)
                    .addComponent(cf_txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(cf_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_type)
                    .addComponent(cf_cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_date)
                    .addComponent(cf_txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_order_ser8)
                    .addComponent(cf_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        shop_ser_panel.setBackground(new java.awt.Color(255, 255, 255));

        cf_txt_shop_ser_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_shop_ser_price.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_shop_ser_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_lbl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_shop_ser.setText("Shop Service");

        cf_lbl_shop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_shop.setText("Service");

        cf_lbl_shop_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_shop_price.setText("Price");

        cf_btn_dl_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        cf_btn_dl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_btn_dl_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        cf_btn_dl_shop_ser.setText("Delete");
        cf_btn_dl_shop_ser.setBorderPainted(false);
        cf_btn_dl_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_btn_dl_shop_serActionPerformed(evt);
            }
        });

        cf_cmb_shop_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cf_cmb_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_cmb_shop_serActionPerformed(evt);
            }
        });

        cf_tbl_shop_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        cf_tbl_shop_ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cf_tbl_shop_serMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cf_tbl_shop_ser);

        scrollpane_shop_ser.setViewportView(jScrollPane1);

        cf_btn_add_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        cf_btn_add_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_btn_add_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        cf_btn_add_shop_ser.setText("Add");
        cf_btn_add_shop_ser.setBorderPainted(false);
        cf_btn_add_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_btn_add_shop_serActionPerformed(evt);
            }
        });

        cf_lbl_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_dis.setText("Discount");

        cf_txt_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_dis.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_dis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        javax.swing.GroupLayout shop_ser_panelLayout = new javax.swing.GroupLayout(shop_ser_panel);
        shop_ser_panel.setLayout(shop_ser_panelLayout);
        shop_ser_panelLayout.setHorizontalGroup(
            shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shop_ser_panelLayout.createSequentialGroup()
                        .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cf_lbl_shop)
                            .addComponent(cf_cmb_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cf_txt_shop_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cf_lbl_shop_price))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(shop_ser_panelLayout.createSequentialGroup()
                        .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_shop_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                                .addComponent(cf_lbl_shop_ser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cf_btn_add_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cf_btn_dl_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cf_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cf_lbl_dis))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))))
        );
        shop_ser_panelLayout.setVerticalGroup(
            shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shop_ser_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_lbl_shop_ser)
                    .addComponent(cf_btn_dl_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_btn_add_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_lbl_shop)
                    .addComponent(cf_lbl_shop_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_cmb_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_txt_shop_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(scrollpane_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cf_lbl_dis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cf_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        order_panel.setBackground(new java.awt.Color(255, 255, 255));

        order_ser_panel.setBackground(new java.awt.Color(255, 255, 255));

        cf_txt_order_ser_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_order_ser_price.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_order_ser_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_lbl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_order_ser.setText("Order Service");

        cf_lbl_order.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_order.setText("Service");

        cf_lbl_order_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_order_price.setText("Price");

        cf_btn_add_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        cf_btn_add_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_btn_add_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        cf_btn_add_order_ser.setText("Add");
        cf_btn_add_order_ser.setBorderPainted(false);
        cf_btn_add_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_btn_add_order_serActionPerformed(evt);
            }
        });

        cf_cmb_order_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cf_cmb_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_cmb_order_serActionPerformed(evt);
            }
        });

        cf_tbl_order_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        jScrollPane2.setViewportView(cf_tbl_order_ser);

        scrollpane_order_ser.setViewportView(jScrollPane2);

        cf_btn_dl_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        cf_btn_dl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_btn_dl_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        cf_btn_dl_order_ser.setText("Delete");
        cf_btn_dl_order_ser.setBorderPainted(false);
        cf_btn_dl_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_btn_dl_order_serActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout order_ser_panelLayout = new javax.swing.GroupLayout(order_ser_panel);
        order_ser_panel.setLayout(order_ser_panelLayout);
        order_ser_panelLayout.setHorizontalGroup(
            order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(order_ser_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cf_lbl_order)
                            .addComponent(cf_cmb_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cf_lbl_order_price)
                            .addComponent(cf_txt_order_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(order_ser_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_order_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(order_ser_panelLayout.createSequentialGroup()
                                .addComponent(cf_lbl_order_ser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cf_btn_add_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cf_btn_dl_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        order_ser_panelLayout.setVerticalGroup(
            order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_lbl_order_ser)
                    .addComponent(cf_btn_add_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_btn_dl_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_lbl_order)
                    .addComponent(cf_lbl_order_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cf_txt_order_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_cmb_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        order_ser_exp_panel.setBackground(new java.awt.Color(255, 255, 255));

        cf_txt_order_ser_exp_cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_txt_order_ser_exp_cost.setForeground(new java.awt.Color(102, 102, 255));
        cf_txt_order_ser_exp_cost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cf_lbl_shop_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_shop_ser_exp.setText("Order Service Expense");

        cf_lbl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_order_ser_exp.setText("Expense");

        cf_lbl_order_ser_exp_cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_lbl_order_ser_exp_cost.setText("Price");

        btn_add_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        btn_add_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_add_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_order_ser_exp.setText("Add");
        btn_add_order_ser_exp.setBorderPainted(false);
        btn_add_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_order_ser_expActionPerformed(evt);
            }
        });

        cf_cmb_order_ser_exp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cf_cmb_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_cmb_order_ser_expActionPerformed(evt);
            }
        });

        cf_tbl_order_ser_exp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense", "Cost"
            }
        ));
        jScrollPane3.setViewportView(cf_tbl_order_ser_exp);

        scrollpane_order_ser_exp.setViewportView(jScrollPane3);

        btn_dl_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        btn_dl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_dl_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        btn_dl_order_ser_exp.setText("Delete");
        btn_dl_order_ser_exp.setBorderPainted(false);
        btn_dl_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dl_order_ser_expActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout order_ser_exp_panelLayout = new javax.swing.GroupLayout(order_ser_exp_panel);
        order_ser_exp_panel.setLayout(order_ser_exp_panelLayout);
        order_ser_exp_panelLayout.setHorizontalGroup(
            order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cf_lbl_order_ser_exp)
                            .addComponent(cf_cmb_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cf_lbl_order_ser_exp_cost)
                            .addComponent(cf_txt_order_ser_exp_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_order_ser_exp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                                .addComponent(cf_lbl_shop_ser_exp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_add_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_dl_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        order_ser_exp_panelLayout.setVerticalGroup(
            order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_lbl_shop_ser_exp)
                    .addComponent(btn_add_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dl_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_lbl_order_ser_exp)
                    .addComponent(cf_lbl_order_ser_exp_cost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cf_txt_order_ser_exp_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_cmb_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout order_panelLayout = new javax.swing.GroupLayout(order_panel);
        order_panel.setLayout(order_panelLayout);
        order_panelLayout.setHorizontalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(order_ser_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(order_ser_exp_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        order_panelLayout.setVerticalGroup(
            order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(order_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order_ser_exp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cf_btn_save.setBackground(new java.awt.Color(102, 102, 255));
        cf_btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_btn_save.setForeground(new java.awt.Color(255, 255, 255));
        cf_btn_save.setText("Save");
        cf_btn_save.setBorderPainted(false);
        cf_btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_btn_saveActionPerformed(evt);
            }
        });

        cf_btn_cancel.setBackground(new java.awt.Color(102, 102, 255));
        cf_btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cf_btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        cf_btn_cancel.setText("Cancel");
        cf_btn_cancel.setBorderPainted(false);
        cf_btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cf_btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(order_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shop_ser_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cf_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cf_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(shop_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        scrollpane1.setViewportView(jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        tabpane1.addTab("Customer Form", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tbl_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Id", "Customer Name", "Phone", "Service Type", "Serviced Date", "Branch", "Discount", "Total Price"
            }
        ));
        tbl_customer.setColorBackgoundHead(new java.awt.Color(102, 102, 255));
        tbl_customer.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbl_customer.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tbl_customer.setColorFilasForeground1(new java.awt.Color(102, 102, 255));
        tbl_customer.setColorFilasForeground2(new java.awt.Color(102, 102, 255));
        tbl_customer.setRowHeight(25);
        tbl_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_customerMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_customer);
        if (tbl_customer.getColumnModel().getColumnCount() > 0) {
            tbl_customer.getColumnModel().getColumn(0).setMinWidth(150);
            tbl_customer.getColumnModel().getColumn(1).setMinWidth(250);
        }

        scrollpane4.setViewportView(jScrollPane8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        scrollpane2.setBorder(null);

        Detail_panel.setBackground(new java.awt.Color(255, 255, 255));

        cd_lbl_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_br.setText("Branch");

        cd_txt_br.setEditable(false);
        cd_txt_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_br.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_br.setToolTipText("");
        cd_txt_br.setBorder(null);

        cd_lbl_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_cid.setText("Customer ID");

        cd_txt_cid.setEditable(false);
        cd_txt_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_cid.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_cid.setToolTipText("");
        cd_txt_cid.setBorder(null);

        cd_lbl_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_cname.setText("Customer Name");

        cd_txt_cname.setEditable(false);
        cd_txt_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_cname.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_cname.setToolTipText("");
        cd_txt_cname.setBorder(null);

        cd_lbl_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_phone.setText("Phone Number");

        cd_txt_phone.setEditable(false);
        cd_txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_phone.setToolTipText("");
        cd_txt_phone.setBorder(null);

        cd_lbl_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_type.setText("Service Type");

        cd_lbl_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_date.setText("Service Date");

        cd_txt_date.setEditable(false);
        cd_txt_date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_date.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_date.setToolTipText("");
        cd_txt_date.setBorder(null);

        cd_lbl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_shop_ser.setText("Shop service");

        cd_tbl_shop_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "service", "price"
            }
        ));
        jScrollPane9.setViewportView(cd_tbl_shop_ser);

        Offered_table.setViewportView(jScrollPane9);

        cd_lbl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_order_ser_exp.setText("Ordering Service Expense");

        cd_lbl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_order_ser.setText("Ordering Service");

        cd_tbl_order_ser_exp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense", "Cost"
            }
        ));
        jScrollPane4.setViewportView(cd_tbl_order_ser_exp);

        Order_exp_table.setViewportView(jScrollPane4);

        cd_txt_price.setEditable(false);
        cd_txt_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_price.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_price.setBorder(null);

        cd_lbl_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_price.setText("Price");

        cd_txt_type.setEditable(false);
        cd_txt_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_type.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_type.setToolTipText("");
        cd_txt_type.setBorder(null);

        cd_tbl_order_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        jScrollPane10.setViewportView(cd_tbl_order_ser);

        Order_table.setViewportView(jScrollPane10);

        cd_btn_edit.setBackground(new java.awt.Color(102, 102, 255));
        cd_btn_edit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        cd_btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit 16px.png"))); // NOI18N
        cd_btn_edit.setText("Edit");
        cd_btn_edit.setBorderPainted(false);
        cd_btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cd_btn_editActionPerformed(evt);
            }
        });

        cd_txt_dis.setEditable(false);
        cd_txt_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_dis.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_dis.setBorder(null);

        cd_lbl_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_dis.setText("Discount");

        cd_btn_dlt.setBackground(new java.awt.Color(102, 102, 255));
        cd_btn_dlt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_btn_dlt.setForeground(new java.awt.Color(255, 255, 255));
        cd_btn_dlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bin.png"))); // NOI18N
        cd_btn_dlt.setText("Delete");
        cd_btn_dlt.setBorderPainted(false);
        cd_btn_dlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cd_btn_dltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Detail_panelLayout = new javax.swing.GroupLayout(Detail_panel);
        Detail_panel.setLayout(Detail_panelLayout);
        Detail_panelLayout.setHorizontalGroup(
            Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Detail_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Detail_panelLayout.createSequentialGroup()
                        .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cd_lbl_shop_ser)
                            .addComponent(cd_lbl_br)
                            .addComponent(cd_lbl_cid)
                            .addComponent(cd_lbl_cname)
                            .addComponent(cd_lbl_phone)
                            .addComponent(cd_lbl_type)
                            .addComponent(cd_lbl_date)
                            .addComponent(cd_lbl_order_ser_exp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cd_txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cd_txt_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Order_table, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Offered_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Detail_panelLayout.createSequentialGroup()
                        .addComponent(cd_lbl_order_ser)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Order_exp_table, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Detail_panelLayout.createSequentialGroup()
                        .addComponent(cd_lbl_price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cd_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Detail_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cd_btn_dlt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cd_btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Detail_panelLayout.createSequentialGroup()
                        .addComponent(cd_lbl_dis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cd_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Detail_panelLayout.setVerticalGroup(
            Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Detail_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_btn_edit)
                    .addComponent(cd_btn_dlt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_lbl_br)
                    .addComponent(cd_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_lbl_cid)
                    .addComponent(cd_txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_lbl_cname)
                    .addComponent(cd_txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_lbl_phone)
                    .addComponent(cd_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_lbl_type)
                    .addComponent(cd_txt_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_lbl_date)
                    .addComponent(cd_txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cd_lbl_shop_ser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Offered_table, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cd_lbl_order_ser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Order_table, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(cd_lbl_order_ser_exp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Order_exp_table, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cd_lbl_dis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cd_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cd_lbl_price))
                .addContainerGap())
        );

        scrollpane2.setViewportView(Detail_panel);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrollpane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        tabpane1.addTab("Customer Details", jPanel4);

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

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
        employee_tab o = new employee_tab();
        o.setVisible(true);
        this.dispose();
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

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_customerMouseClicked

    private void cf_cmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_typeActionPerformed
        if(cf_cmb_type.getSelectedIndex()==1)
        {
            shop_ser_panel.setVisible(true);
            order_panel.setVisible(false);
        }
        else if(cf_cmb_type.getSelectedIndex()==2)
        {
            shop_ser_panel.setVisible(false);
            order_panel.setVisible(true);
        }
        else
        {
            shop_ser_panel.setVisible(false);
            order_panel.setVisible(false);
        }   
    }//GEN-LAST:event_cf_cmb_typeActionPerformed

    private void cf_cmb_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_brActionPerformed
        int cid_int = cf_tblRowCount()+1;
        String cid_string = String.valueOf(cid_int);
        cf_txt_cid.setText(cid_string);
    }//GEN-LAST:event_cf_cmb_brActionPerformed

    private void cf_btn_dl_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_dl_shop_serActionPerformed

        int rowNo = cf_tbl_shop_ser.getSelectedRow();
        
        if(rowNo>=0)
        {
            cf_deleteShopSerTable(rowNo);
        }
    }//GEN-LAST:event_cf_btn_dl_shop_serActionPerformed

    private void cf_cmb_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_shop_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf_cmb_shop_serActionPerformed

    private void cf_tbl_shop_serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cf_tbl_shop_serMouseClicked

    }//GEN-LAST:event_cf_tbl_shop_serMouseClicked

    private void cf_btn_add_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_add_shop_serActionPerformed

        cf_addShopSerTable();

    }//GEN-LAST:event_cf_btn_add_shop_serActionPerformed

    private void cf_btn_add_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_add_order_serActionPerformed

        cf_addOrderSerTable();
    }//GEN-LAST:event_cf_btn_add_order_serActionPerformed

    private void cf_cmb_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_order_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf_cmb_order_serActionPerformed

    private void cf_btn_dl_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_dl_order_serActionPerformed
        int rowNo = cf_tbl_order_ser.getSelectedRow();

        if(rowNo>=0)
        {
            cf_deleteOrderSerTable(rowNo);
        }
    }//GEN-LAST:event_cf_btn_dl_order_serActionPerformed

    private void btn_add_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_order_ser_expActionPerformed

        cf_addOrderSerExpTable();
    }//GEN-LAST:event_btn_add_order_ser_expActionPerformed

    private void cf_cmb_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_order_ser_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf_cmb_order_ser_expActionPerformed

    private void btn_dl_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dl_order_ser_expActionPerformed
        int rowNo = cf_tbl_order_ser_exp.getSelectedRow();
        
        if(rowNo>=0)
        {
            cf_deleteOrderSerExpTable(rowNo);
        } 
    }//GEN-LAST:event_btn_dl_order_ser_expActionPerformed

    private void cf_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_saveActionPerformed

        try
        {
            if(cf_validation()==true)
            {                                                
                if(cf_cmb_type.getSelectedIndex()==1)
                {
                    cf_insertShopSertoDb();
                }
                else if(cf_cmb_type.getSelectedIndex()==2)
                {
                    cf_insertOrderSertoDb();                    
                }
                else if(cf_cmb_type.getSelectedIndex()==0)
                {
                    JOptionPane.showMessageDialog(this, "Select your Service Type [Shop / Order]");                
                }  
                cf_txt_dis.setText("0.00");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
    }//GEN-LAST:event_cf_btn_saveActionPerformed

    private void cf_btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_cancelActionPerformed

        cf_deleteCommonRecords();
        cf_deleteAllShopSerRecords();
        cf_deleteAllOrderSerRecords();
        cf_deleteAllOrderSerExpRecords();  

    }//GEN-LAST:event_cf_btn_cancelActionPerformed

    private void cd_btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cd_btn_editActionPerformed
        // TODO add your handling code here:
        initcustomer_edit_form();
         
    }//GEN-LAST:event_cd_btn_editActionPerformed

    private void cd_btn_dltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cd_btn_dltActionPerformed
        // TODO add your handling code here:
        
        deleteDataFromDatabase();
        scrollpane2.setVisible(false);
    }//GEN-LAST:event_cd_btn_dltActionPerformed
     
    
    
    
// Customer Form Start
    
    //Validation
    public boolean cf_validation()
    {        

        String br = cf_cmb_br.getSelectedItem().toString();
        if(cf_cmb_br.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Branch ");
            return false;
        }
        if(cf_txt_cname.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Customer Name");
            return false;
        }
        if(cf_txt_phone.getText().equals("") || cf_txt_phone.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Enter Phone Valid No");
            return false;
        }
        if(cf_cmb_type.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Service Type");
            return false;
        }
        Date s_date = cf_txt_date.getDate();
        if(s_date == null)
        {
            JOptionPane.showMessageDialog(this,"Select the Date");
            return false;
        }
        if(cf_txt_dis.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Discount Price. If no Enter '0' ");
            return false;
        }
        
        //Write Validation Code to Serviced_date ..................................... Write Code to Serviced_date
        // No need to write Validation to Price Textfield. Because it is automated.        
        
        return true;
    }
    
    //Add Records to Shop Service Table
    public void cf_addShopSerTable()
    {
        DefaultTableModel model;
        
        if(cf_cmb_shop_ser.getSelectedIndex()>=1 && !cf_txt_shop_ser_price.getText().equals(""))
        {
            String shop_ser = cf_cmb_shop_ser.getSelectedItem().toString();           
            double price = Double.parseDouble(cf_txt_shop_ser_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) cf_tbl_shop_ser.getModel();
                model.addRow(obj);
                
                cf_cmb_shop_ser.setSelectedIndex(0);
                cf_txt_shop_ser_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Shop Service Table
    public void cf_deleteShopSerTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) cf_tbl_shop_ser.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
 
    //Add Records to Order Service Table
    public void cf_addOrderSerTable()
    {
        DefaultTableModel model;
        
        if(cf_cmb_order_ser.getSelectedIndex()>=1 && !cf_txt_order_ser_price.getText().equals(""))
        {
            String shop_ser = cf_cmb_order_ser.getSelectedItem().toString();
            double price = Double.parseDouble(cf_txt_order_ser_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) cf_tbl_order_ser.getModel();
                model.addRow(obj);
                
                cf_cmb_order_ser.setSelectedIndex(0);
                cf_txt_order_ser_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Order Service Table
    public void cf_deleteOrderSerTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) cf_tbl_order_ser.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Add Records to Order Service Expense Table
    public void cf_addOrderSerExpTable()
    {
        DefaultTableModel model;
        
        if(cf_cmb_order_ser_exp.getSelectedIndex()>=1 && !cf_txt_order_ser_exp_cost.getText().equals(""))
        {
            String shop_ser = cf_cmb_order_ser_exp.getSelectedItem().toString();
            double price = Double.parseDouble(cf_txt_order_ser_exp_cost.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) cf_tbl_order_ser_exp.getModel();
                model.addRow(obj);
                
                cf_cmb_order_ser_exp.setSelectedIndex(0);
                cf_txt_order_ser_exp_cost.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Order Service Expense Table
    public void cf_deleteOrderSerExpTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) cf_tbl_order_ser_exp.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }    
    
    //Find Table Row Count
    public int cf_tblRowCount()
    {                
        try
        { 
            Connection con = DBConnection.getConnection();

            String sql = "select MAX(customer_id) AS maxCustomerId from customer";
            PreparedStatement pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery();

            int maxCustomerId = 0;
            if (rs.next()) {
                maxCustomerId = rs.getInt("maxCustomerId");
            }
            return maxCustomerId;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }    
        return -1;
    }    
    
    //Insert records to customer Table
    public void cf_insertCustomerDetailstoDb()
    {
        double totPrice = cf_setTotPrice();
        String totalPrice = Double.toString(totPrice);
        cf_txt_price.setText(totalPrice);
                        
        String br = cf_cmb_br.getSelectedItem().toString();
        int cid = Integer.parseInt(cf_txt_cid.getText());
        String cname = cf_txt_cname.getText();        
        String phone = cf_txt_phone.getText();
        double dis = Double.parseDouble(cf_txt_dis.getText());
        double price = Double.parseDouble(cf_txt_price.getText());
        //Write Code to Serviced_date ..................................... Write Code to Serviced_date
        Date s_date = cf_txt_date.getDate();
        long l =  s_date.getTime();
        java.sql.Date txt_date = new java.sql.Date(l);
        
        String type = "";
        if(cf_cmb_type.getSelectedIndex()==1)
        {
            type="Shop";
        }
        else if(cf_cmb_type.getSelectedIndex()==2)
        {
            type="Order";
        }
        
        try
        {
            Connection con = DBConnection.getConnection();
            
            String sql = "insert into customer (customer_id ,customer_name,phone,service_type,serviced_date,branch,discount,total_price) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setInt(1,cid);
            pst.setString(2,cname);
            pst.setString(3,phone);  
            pst.setString(4,type); 
            pst.setDate(5,txt_date); 
            pst.setString(6,br); 
            pst.setDouble(7,dis); 
            pst.setDouble(8,price); 
                    
            int updateRowCount = pst.executeUpdate();
            
            if(updateRowCount>0)
            {
                cd_setCustomerDetails(); // Refresh Database
                JOptionPane.showMessageDialog(this, "Customer Details Saved");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Insert records to shop_services Table
    public void cf_insertShopSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cf_txt_cid.getText());

            model = (DefaultTableModel) cf_tbl_shop_ser.getModel();

            if(model.getRowCount()>0)
            {      
                cf_insertCustomerDetailstoDb();
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into shop_services (customer_id,service,price) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = (Double) model.getValueAt(row, 1);
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                //JOptionPane.showMessageDialog(this, "Records Are Saved in Shop Services table");
                
                cf_deleteCommonRecords();
                cf_deleteAllShopSerRecords();
                cf_deleteAllOrderSerRecords();
                cf_deleteAllOrderSerExpRecords();
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "Please Add Shop Services");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Insert records to ordering_services Table
    public void cf_insertOrderSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cf_txt_cid.getText());

            model = (DefaultTableModel) cf_tbl_order_ser.getModel();

            if(model.getRowCount()>0)
            {        
                cf_insertCustomerDetailstoDb();
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into ordering_services (customer_id,service,price) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = (Double) model.getValueAt(row, 1);
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                //JOptionPane.showMessageDialog(this, "Records Are Saved");
                cf_insertOrderSerExptoDb();
                
                cf_deleteCommonRecords();
                cf_deleteAllShopSerRecords();
                cf_deleteAllOrderSerRecords();
                cf_deleteAllOrderSerExpRecords();
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "Please Add Order Services");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Insert records to ordering_services_expenses Table
    public void cf_insertOrderSerExptoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cf_txt_cid.getText());

            model = (DefaultTableModel) cf_tbl_order_ser_exp.getModel();

            if(model.getRowCount()>0)
            {             
                Connection con = DBConnection.getConnection();
                String sql = "insert into ordering_service_expenses (customer_id,expense,cost) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = (Double) model.getValueAt(row, 1);
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                //JOptionPane.showMessageDialog(this, "Records Are Saved");
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "No Expenses to Save");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Delete Records from Common Panel
    public void cf_deleteCommonRecords()
    {
        cf_cmb_br.setSelectedIndex(0);
        cf_txt_cid.setText("");
        cf_txt_cname.setText("");
        cf_txt_phone.setText("");
        cf_cmb_type.setSelectedIndex(0);
        //ServiceDate clear code should be added
        Date s_date = cf_txt_date.getDate();
        cf_txt_date.setDate(null);
        cf_txt_dis.setText("0.00");
        cf_txt_price.setText("");       
    }
    
    // Delete All Records from Shop Service Table
    public void cf_deleteAllShopSerRecords() 
    {
        DefaultTableModel model;

        try {
            model = (DefaultTableModel) cf_tbl_shop_ser.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Delete All Records from Order Service Table
    public void cf_deleteAllOrderSerRecords() 
    {
        DefaultTableModel model;

        try {
            model = (DefaultTableModel) cf_tbl_order_ser.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Delete All Records from Order Service Table
    public void cf_deleteAllOrderSerExpRecords() 
    {
        DefaultTableModel model;

        try {
            model = (DefaultTableModel) cf_tbl_order_ser_exp.getModel();
            int rowCount = model.getRowCount();

            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Insert records to shop_services Table
    public double cf_returnShopSerTotPrice()
    {
        double totPrice = 0;
        double price = 0;
        DefaultTableModel model;
        
        try
        {    
            model = (DefaultTableModel) cf_tbl_shop_ser.getModel();

            if(model.getRowCount()>0)
            {      
                for(int row=0; row<model.getRowCount();row++)
                {
                    price = (Double) model.getValueAt(row, 1);
                    totPrice = totPrice+price;
                }
            }     
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }     
        return totPrice;
    }
    
    //Insert records to order_services Table
    public double cf_returnOrderSerTotPrice()
    {
        double totPrice = 0;
        double price = 0;
        DefaultTableModel model;
        
        try
        {    
            model = (DefaultTableModel) cf_tbl_order_ser.getModel();

            if(model.getRowCount()>0)
            {      
                for(int row=0; row<model.getRowCount();row++)
                {
                    price = (Double) model.getValueAt(row, 1);
                    totPrice = totPrice+price;
                }
            }  
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }     
        return totPrice;
    }
    
    //Insert records to order_services Table
    public double cf_returnOrderSerExpTotPrice()
    {
        double totPrice = 0;
        double price = 0;
        DefaultTableModel model;
        
        try
        {    
            model = (DefaultTableModel) cf_tbl_order_ser_exp.getModel();

            if(model.getRowCount()>0)
            {      
                for(int row=0; row<model.getRowCount();row++)
                {
                    price = (Double) model.getValueAt(row, 1);
                    totPrice = totPrice+price;
                }
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }     
        return totPrice;
    }
    
    public double cf_setTotPrice()
    {
        //double price = Double.parseDouble(txt_price.getText().toString());
        double totPrice = 0;
        
        
        if(cf_cmb_type.getSelectedIndex()==1)
        {
            double dis = Double.parseDouble(cf_txt_dis.getText().toString());
            double shopPrice = cf_returnShopSerTotPrice();
            
            totPrice = shopPrice - dis;
        }
        else if(cf_cmb_type.getSelectedIndex()==2)
        {
            double orderSerPrice = cf_returnOrderSerTotPrice();
            double orderExpPrice = cf_returnOrderSerExpTotPrice();
            totPrice = orderSerPrice - orderExpPrice;
        }
        else if(cf_cmb_type.getSelectedIndex()==0)
        {
            cf_txt_price.setText("0.00");
        }
        return totPrice;
    }    
    
// Customer Form end
    
    
// Customer Details View Start
    
    // Populate records into Feilds
    private void cd_populateDetailView(int selectedRow) {
        // Retrieve data from the JTable model for the selected row
        scrollpane2.setVisible(true);
        if (cd_txt_br != null && cd_txt_cid != null && cd_txt_cname != null && cd_txt_phone != null) {
            Object column0 = tbl_customer.getValueAt(selectedRow, 0);
            Object column1 = tbl_customer.getValueAt(selectedRow, 1);
            Object column2 = tbl_customer.getValueAt(selectedRow, 2);
            Object column3 = tbl_customer.getValueAt(selectedRow, 3);
            Object column4 = tbl_customer.getValueAt(selectedRow, 4);
            Object column5 = tbl_customer.getValueAt(selectedRow, 5);
            Object column6 = tbl_customer.getValueAt(selectedRow, 6);
            Object column7 = tbl_customer.getValueAt(selectedRow, 7);
            String Type = (String) tbl_customer.getValueAt(selectedRow, 3);
            cd_txt_br.setText(column5.toString());
            cd_txt_cid.setText(column0.toString());
            cd_txt_cname.setText(column1.toString());
            cd_txt_phone.setText(column2.toString());
            cd_txt_date.setText(column4.toString());
            cd_txt_price.setText(column7.toString()); 
            cd_txt_dis.setText(column6.toString()); 
            cd_txt_type.setText(column3.toString());
            
            int c_id =Integer.parseInt(cd_txt_cid.getText());      // Customer Id value to use as parameteers           
            
            if(cd_txt_type.getText().equalsIgnoreCase("Shop")){
                //scrollpane2.setVisible(true);
                cd_lbl_shop_ser.setVisible(true);
                cd_lbl_order_ser_exp.setVisible(false);
                cd_lbl_order_ser.setVisible(false);
                cd_lbl_dis.setVisible(true);
                cd_txt_dis.setVisible(true);
                Offered_table.setVisible(true);
                Order_table.setVisible(false);
                Order_exp_table.setVisible(false);
                Detail_panel.setVisible(true);
                cd_setShopServiceDetails(c_id);            //  Calling Shop Service Deatils Method with Parameter
                
            }else{
                cd_lbl_shop_ser.setVisible(false);
                cd_lbl_order_ser_exp.setVisible(true);
                cd_lbl_order_ser.setVisible(true);
                cd_lbl_dis.setVisible(false);
                cd_txt_dis.setVisible(false);
                Offered_table.setVisible(false);
                Order_table.setVisible(true);
                Order_exp_table.setVisible(true);
                Detail_panel.setVisible(true);
                cd_setOrderServiceDetails(c_id);           //  Calling Ordering Service Details Method with Parameter
                cd_setOrderServiceExpenseDetails(c_id);    //  Calling Ordering Service Expense Method with Parameter
            }
        }
    }

   //Set Customer Details into Table   
    public void cd_setCustomerDetails()
    {     
        DefaultTableModel model;
        model = (DefaultTableModel) tbl_customer.getModel();
        model.setRowCount(0);
        try
        {         

            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from customer ";            
            ResultSet rs = st.executeQuery(sql);
                        
            while(rs.next())
            {
                String customer_id,customer_name,phone,service_type,serviced_date,branch,discount,total_price;
                
                customer_id = rs.getString("customer_id");
                customer_name = rs.getString("customer_name");
                phone = rs.getString("phone");
                service_type = rs.getString("service_type");
                serviced_date = rs.getString("serviced_date");
                branch = rs.getString("branch"); 
                discount = rs.getString("discount");
                total_price = rs.getString("total_price");                 
                 
                Object[] obj = {customer_id,customer_name,phone,service_type,serviced_date,branch,discount,total_price};
                model = (DefaultTableModel) tbl_customer.getModel();
                model.addRow(obj);

            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }    
    
    //Set Shop Service Details into Table    
    public void cd_setShopServiceDetails(int x)
    {         
        DefaultTableModel model;
        model = (DefaultTableModel) cd_tbl_shop_ser.getModel();
        model.setRowCount(0);
        
        try
        {            
            int c_id = x;
            Connection con = DBConnection.getConnection();
            String sql = "select * from shop_services where customer_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String service,price;
                             
                service = rs.getString("service");
                price = rs.getString("price");
                                                
                Object[] obj2 = {service,price};                
                model.addRow(obj2);
            }               
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }        
    }
    
    //Set Order Service Details into Table
    public void cd_setOrderServiceDetails(int x)
    {  
        DefaultTableModel model;
        model = (DefaultTableModel) cd_tbl_order_ser.getModel();
        model.setRowCount(0);
        
        try
        {            
            int c_id = x;
            Connection con = DBConnection.getConnection();
            String sql = "select * from ordering_services where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String service,price;
                          
                service = rs.getString("service");
                price = rs.getString("price");
                                                
                Object[] obj3 = {service,price};                
                model.addRow(obj3);
            }            
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
    
    //Set Order Service Expenses Details into Table
    public void cd_setOrderServiceExpenseDetails(int x)
    {  
        DefaultTableModel model;
        model = (DefaultTableModel) cd_tbl_order_ser_exp.getModel();
        model.setRowCount(0);
        
        try
        {            
            int c_id = x;
            Connection con = DBConnection.getConnection();
            String sql = "select * from ordering_service_expenses where customer_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String expense,cost;
                             
                expense = rs.getString("expense");
                cost = rs.getString("cost");
                                                
                Object[] obj2 = {expense,cost};                
                model.addRow(obj2);
            }            
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
        
    
// Customer Details View End
    
    // Combo Box
    
    private void populateComboBoxSS() 
    {
        String sql = "SELECT * FROM shop_service_cat";
        try 
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) 
            {
                cf_cmb_shop_ser.addItem(rs.getString("service"));
            }                
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    private void populateComboBoxOS() 
    {
        String sql = "SELECT * FROM ordering_service_cat";
        try 
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) 
            {
                cf_cmb_order_ser.addItem(rs.getString("service"));
            }                
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    private void populateComboBoxOSE() 
    {
        String sql = "SELECT * FROM ordering_service_expense_cat";
        try 
        {
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) 
            {
                cf_cmb_order_ser_exp.addItem(rs.getString("expense"));
            }                
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}


// Delete Code     
    private void deleteDataFromDatabase() 
    {
        String type = cd_txt_type.getText();

        // Get the selected row index
        int selectedRow = tbl_customer.getSelectedRow();

        if (selectedRow != -1) {
            // Get the customer ID from the selected row
            int customerId = Integer.parseInt(tbl_customer.getValueAt(selectedRow, 0).toString());

            try {
                Connection con = DBConnection.getConnection();
                if ("Shop".equals(type)) {
                    // Delete from customer and shop_services tables
                    String[] tableNames = {"customer", "shop_services"};
                    for (String tableName : tableNames) {
                        String deleteQuery = "DELETE FROM " + tableName + " WHERE customer_id = ?";
                        try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
                            pstmt.setInt(1, customerId);
                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data deleted from " + tableName + " successfully.");
                            } else {
                                JOptionPane.showMessageDialog(null, "No records were deleted from " + tableName + ".");
                            }
                        }
                    }
                } else if ("Order".equals(type)) {
                    // Delete from customer, ordering_services, and ordering_service_expenses tables
                    String[] tableNames = {"customer", "ordering_services", "ordering_service_expenses"};
                    for (String tableName : tableNames) {
                        String deleteQuery = "DELETE FROM " + tableName + " WHERE customer_id = ?";
                        try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
                            pstmt.setInt(1, customerId);
                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data deleted from " + tableName + " successfully.");
                            } else {
                                JOptionPane.showMessageDialog(null, "No records were deleted from " + tableName + ".");
                            }
                        }
                    }
                }

                // After the deletion is complete, remove the selected row from the JTable
                DefaultTableModel model = (DefaultTableModel) tbl_customer.getModel();
                model.removeRow(selectedRow);

                // Close the database connection
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error deleting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


// Customer Edit Form Save Button - Table & Records Auto Refresh Code    
    private void initcustomer_edit_form() 
    {
    
        customer_edit_form cef = new customer_edit_form(cd_txt_cid.getText());

        int x = this.getX() + 766; // Set the X coordinate to 700
        int y = this.getY() + 48;  // Set the Y coordinate to 35    
        cef.setLocation(x, y);

        this.setEnabled(false);

        cef.setVisible(true);

        // Enable the main frame when the secondary frame is closed
        cef.addWindowListener(new java.awt.event.WindowAdapter() 
        {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) 
            {
                customer_tab.this.setEnabled(true);
                customer_tab.this.requestFocus();
            }
        });

        // Auto Refresh Action for Save Button in Customer edit Form
        cef.cef_btn_save.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                if(cef.cef_txt_dis.getText().equals(""))
                {
                    cef.cef_txt_dis.setText("0");
                }

                if(cef.validation() == true)
                {
                    cef.cef_insertAllRecordstoDB();
                    cef_refresh_window();
                }
            }
        });
}
    
    
    // Refresh Whole Window After click Save button in Customer Edit Form
    public void cef_refresh_window()
    {
        cd_setCustomerDetails();
        
        int cid = Integer.parseInt(cd_txt_cid.getText());
                
        try
        {         
            Connection con = DBConnection.getConnection();                    
            String sql = "select * from customer where customer_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,cid);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {
                String customer_name,phone,service_type,serviced_date,branch,discount,total_price;
                
                customer_name = rs.getString("customer_name");
                phone = rs.getString("phone");
                service_type = rs.getString("service_type");
                serviced_date = rs.getString("serviced_date");
                branch = rs.getString("branch"); 
                discount = rs.getString("discount");
                total_price = rs.getString("total_price");                 
                
                cd_txt_cname.setText(customer_name);
                cd_txt_phone.setText(phone);
                cd_txt_type.setText(service_type);
                cd_txt_date.setText(serviced_date);
                cd_txt_br.setText(branch);
                cd_txt_dis.setText(discount);
                cd_txt_price.setText(total_price);
                
                
                if(cd_txt_type.getText().equalsIgnoreCase("Shop"))
                {
                    cd_lbl_shop_ser.setVisible(true);
                    cd_lbl_order_ser_exp.setVisible(false);
                    cd_lbl_order_ser.setVisible(false);
                    cd_lbl_dis.setVisible(true);
                    cd_txt_dis.setVisible(true);
                    Offered_table.setVisible(true);
                    Order_table.setVisible(false);
                    Order_exp_table.setVisible(false);
                    Detail_panel.setVisible(true);
                    
                    cd_setShopServiceDetails(cid);
                    //JOptionPane.showMessageDialog(this,"Shop Services Details Refreshed");
                }
                else if(cd_txt_type.getText().equalsIgnoreCase("Order"))
                {
                    cd_lbl_shop_ser.setVisible(false);
                    cd_lbl_order_ser_exp.setVisible(true);
                    cd_lbl_order_ser.setVisible(true);
                    cd_lbl_dis.setVisible(false);
                    cd_txt_dis.setVisible(false);
                    Offered_table.setVisible(false);
                    Order_table.setVisible(true);
                    Order_exp_table.setVisible(true);
                    Detail_panel.setVisible(true);
                    
                    cd_setOrderServiceDetails(cid);
                    //JOptionPane.showMessageDialog(this,"Order Services Details Refreshed");
                    cd_setOrderServiceExpenseDetails(cid);
                    //JOptionPane.showMessageDialog(this,"Order Services Expense Details Refreshed");
                }
                
                //JOptionPane.showMessageDialog(this,"Customer Details Refreshed");
            }                       
        }
        catch(Exception e)
        {
           e.printStackTrace();
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
            java.util.logging.Logger.getLogger(customer_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_tab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_tab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adding;
    private javax.swing.JLabel Customer;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JPanel Detail_panel;
    private javax.swing.JLabel Employee;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Monthly_Expenses;
    private bizbuilder.Scrollpane Offered_table;
    private bizbuilder.Scrollpane Order_exp_table;
    private bizbuilder.Scrollpane Order_table;
    private rojerusan.RSFotoCircle Profile;
    private javax.swing.JButton btn_add_order_ser_exp;
    private javax.swing.JButton btn_dl_order_ser_exp;
    private javax.swing.JButton cd_btn_dlt;
    private javax.swing.JButton cd_btn_edit;
    private javax.swing.JLabel cd_lbl_br;
    private javax.swing.JLabel cd_lbl_cid;
    private javax.swing.JLabel cd_lbl_cname;
    private javax.swing.JLabel cd_lbl_date;
    private javax.swing.JLabel cd_lbl_dis;
    private javax.swing.JLabel cd_lbl_order_ser;
    private javax.swing.JLabel cd_lbl_order_ser_exp;
    private javax.swing.JLabel cd_lbl_phone;
    private javax.swing.JLabel cd_lbl_price;
    private javax.swing.JLabel cd_lbl_shop_ser;
    private javax.swing.JLabel cd_lbl_type;
    private javax.swing.JTable cd_tbl_order_ser;
    private javax.swing.JTable cd_tbl_order_ser_exp;
    private javax.swing.JTable cd_tbl_shop_ser;
    private javax.swing.JTextField cd_txt_br;
    private javax.swing.JTextField cd_txt_cid;
    private javax.swing.JTextField cd_txt_cname;
    private javax.swing.JTextField cd_txt_date;
    private javax.swing.JTextField cd_txt_dis;
    private javax.swing.JTextField cd_txt_phone;
    private javax.swing.JTextField cd_txt_price;
    private javax.swing.JTextField cd_txt_type;
    private javax.swing.JButton cf_btn_add_order_ser;
    private javax.swing.JButton cf_btn_add_shop_ser;
    private javax.swing.JButton cf_btn_cancel;
    private javax.swing.JButton cf_btn_dl_order_ser;
    private javax.swing.JButton cf_btn_dl_shop_ser;
    private javax.swing.JButton cf_btn_save;
    private rojerusan.RSComboMetro cf_cmb_br;
    private javax.swing.JComboBox<String> cf_cmb_order_ser;
    private javax.swing.JComboBox<String> cf_cmb_order_ser_exp;
    private javax.swing.JComboBox<String> cf_cmb_shop_ser;
    private rojerusan.RSComboMetro cf_cmb_type;
    private javax.swing.JLabel cf_lbl_dis;
    private javax.swing.JLabel cf_lbl_order;
    private javax.swing.JLabel cf_lbl_order_price;
    private javax.swing.JLabel cf_lbl_order_ser;
    private javax.swing.JLabel cf_lbl_order_ser_exp;
    private javax.swing.JLabel cf_lbl_order_ser_exp_cost;
    private javax.swing.JLabel cf_lbl_shop;
    private javax.swing.JLabel cf_lbl_shop_price;
    private javax.swing.JLabel cf_lbl_shop_ser;
    private javax.swing.JLabel cf_lbl_shop_ser_exp;
    private javax.swing.JTable cf_tbl_order_ser;
    private javax.swing.JTable cf_tbl_order_ser_exp;
    private javax.swing.JTable cf_tbl_shop_ser;
    private javax.swing.JTextField cf_txt_cid;
    private javax.swing.JTextField cf_txt_cname;
    private com.toedter.calendar.JDateChooser cf_txt_date;
    private javax.swing.JTextField cf_txt_dis;
    private javax.swing.JTextField cf_txt_order_ser_exp_cost;
    private javax.swing.JTextField cf_txt_order_ser_price;
    private javax.swing.JTextField cf_txt_phone;
    private javax.swing.JTextField cf_txt_price;
    private javax.swing.JTextField cf_txt_shop_ser_price;
    private javax.swing.JPanel common_panel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbl_br;
    private javax.swing.JLabel lbl_cid;
    private javax.swing.JLabel lbl_cname;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_order_ser8;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JPanel order_panel;
    private javax.swing.JPanel order_ser_exp_panel;
    private javax.swing.JPanel order_ser_panel;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane2;
    private bizbuilder.Scrollpane scrollpane4;
    private bizbuilder.Scrollpane scrollpane_order_ser;
    private bizbuilder.Scrollpane scrollpane_order_ser_exp;
    private bizbuilder.Scrollpane scrollpane_shop_ser;
    private javax.swing.JPanel shop_ser_panel;
    private bizbuilder.Tabpane tabpane1;
    private rojeru_san.complementos.RSTableMetro tbl_customer;
    // End of variables declaration//GEN-END:variables
}
