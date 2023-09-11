
package bizbuilder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class customer_edit_form extends javax.swing.JFrame {


    String cid = "";
    
    public customer_edit_form() {
        initComponents();
 
        cef_txt_cid.disable();
        cef_txt_price.disable();
        
        populateComboBoxSS();
        populateComboBoxOS();
        populateComboBoxOSE();
        
        cef_shop_ser_panel.setVisible(false);
        cef_order_panel.setVisible(false);                
    }

    // Get customer_id from Customer Tab
    public customer_edit_form(String x) 
    {
        initComponents();
        
        cef_txt_cid.disable();
        cef_txt_price.disable();
        
        populateComboBoxSS();
        populateComboBoxOS();
        populateComboBoxOSE();
        
        cef_shop_ser_panel.setVisible(false);
        cef_order_panel.setVisible(false);

        cef_txt_cid.setText(x);
        displayCustomerRecords();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane1 = new bizbuilder.Scrollpane();
        jPanel6 = new javax.swing.JPanel();
        cef_common_panel1 = new javax.swing.JPanel();
        lbl_br = new javax.swing.JLabel();
        lbl_cid = new javax.swing.JLabel();
        lbl_cname = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        cef_cmb_type = new rojerusan.RSComboMetro();
        cef_txt_phone = new javax.swing.JTextField();
        cef_txt_cname = new javax.swing.JTextField();
        cef_txt_cid = new javax.swing.JTextField();
        cef_txt_price = new javax.swing.JTextField();
        cef_cmb_br = new rojerusan.RSComboMetro();
        lbl_order_ser8 = new javax.swing.JLabel();
        cef_txt_date = new com.toedter.calendar.JDateChooser();
        cef_shop_ser_panel = new javax.swing.JPanel();
        cef_txt_shop_ser_price = new javax.swing.JTextField();
        cef_lbl_shop_ser = new javax.swing.JLabel();
        cef_lbl_shop = new javax.swing.JLabel();
        cef_lbl_shop_price = new javax.swing.JLabel();
        cef_btn_dl_shop_ser = new javax.swing.JButton();
        cef_cmb_shop_ser = new javax.swing.JComboBox<>();
        scrollpane_shop_ser = new bizbuilder.Scrollpane();
        jScrollPane1 = new javax.swing.JScrollPane();
        cef_tbl_shop_ser = new javax.swing.JTable();
        cef_btn_add_shop_ser = new javax.swing.JButton();
        cef_lbl_dis = new javax.swing.JLabel();
        cef_txt_dis = new javax.swing.JTextField();
        cef_order_panel = new javax.swing.JPanel();
        order_ser_panel = new javax.swing.JPanel();
        cef_txt_order_ser_price = new javax.swing.JTextField();
        cef_lbl_order_ser = new javax.swing.JLabel();
        cef_lbl_order = new javax.swing.JLabel();
        cef_lbl_order_price = new javax.swing.JLabel();
        cef_btn_add_order_ser = new javax.swing.JButton();
        cef_cmb_order_ser = new javax.swing.JComboBox<>();
        scrollpane_order_ser = new bizbuilder.Scrollpane();
        jScrollPane2 = new javax.swing.JScrollPane();
        cef_tbl_order_ser = new javax.swing.JTable();
        cef_btn_dl_order_ser = new javax.swing.JButton();
        order_ser_exp_panel = new javax.swing.JPanel();
        cef_txt_order_ser_exp_cost = new javax.swing.JTextField();
        cef_lbl_shop_ser_exp = new javax.swing.JLabel();
        cef_lbl_order_ser_exp = new javax.swing.JLabel();
        cef_lbl_order_ser_exp_cost = new javax.swing.JLabel();
        cef_btn_add_order_ser_exp = new javax.swing.JButton();
        cef_cmb_order_ser_exp = new javax.swing.JComboBox<>();
        scrollpane_order_ser_exp = new bizbuilder.Scrollpane();
        jScrollPane3 = new javax.swing.JScrollPane();
        cef_tbl_order_ser_exp = new javax.swing.JTable();
        cef_btn_dl_order_ser_exp = new javax.swing.JButton();
        cef_btn_save = new javax.swing.JButton();
        cef_btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        scrollpane1.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        cef_common_panel1.setBackground(new java.awt.Color(255, 255, 255));

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

        cef_cmb_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "Shop", "Order" }));
        cef_cmb_type.setColorArrow(new java.awt.Color(102, 102, 255));
        cef_cmb_type.setColorBorde(new java.awt.Color(102, 102, 255));
        cef_cmb_type.setColorFondo(new java.awt.Color(102, 102, 255));
        cef_cmb_type.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_cmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_cmb_typeActionPerformed(evt);
            }
        });

        cef_txt_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_txt_cname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_cname.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_cname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_txt_cid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_cid.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_cid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_txt_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_price.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_cmb_br.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "Branch1", "Branch2" }));
        cef_cmb_br.setColorArrow(new java.awt.Color(102, 102, 255));
        cef_cmb_br.setColorBorde(new java.awt.Color(102, 102, 255));
        cef_cmb_br.setColorFondo(new java.awt.Color(102, 102, 255));
        cef_cmb_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_cmb_br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_cmb_brActionPerformed(evt);
            }
        });

        lbl_order_ser8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_order_ser8.setText("Price");

        cef_txt_date.setBackground(new java.awt.Color(255, 255, 255));
        cef_txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));
        cef_txt_date.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout cef_common_panel1Layout = new javax.swing.GroupLayout(cef_common_panel1);
        cef_common_panel1.setLayout(cef_common_panel1Layout);
        cef_common_panel1Layout.setHorizontalGroup(
            cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cef_common_panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cid)
                    .addComponent(lbl_cname)
                    .addComponent(lbl_phone)
                    .addComponent(lbl_type)
                    .addComponent(lbl_date)
                    .addComponent(lbl_br)
                    .addComponent(lbl_order_ser8))
                .addGap(100, 100, 100)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cef_cmb_type, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cef_txt_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cef_txt_cname, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cef_txt_cid, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cef_cmb_br, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cef_txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cef_txt_price, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        cef_common_panel1Layout.setVerticalGroup(
            cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cef_common_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_br)
                    .addComponent(cef_cmb_br, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cid)
                    .addComponent(cef_txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cname)
                    .addComponent(cef_txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(cef_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_type)
                    .addComponent(cef_cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_date)
                    .addComponent(cef_txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_order_ser8)
                    .addComponent(cef_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cef_shop_ser_panel.setBackground(new java.awt.Color(255, 255, 255));

        cef_txt_shop_ser_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_shop_ser_price.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_shop_ser_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_lbl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_shop_ser.setText("Shop Service");

        cef_lbl_shop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_shop.setText("Service");

        cef_lbl_shop_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_shop_price.setText("Price");

        cef_btn_dl_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_dl_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_dl_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_dl_shop_ser.setText("Delete");
        cef_btn_dl_shop_ser.setBorderPainted(false);
        cef_btn_dl_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_dl_shop_serActionPerformed(evt);
            }
        });

        cef_cmb_shop_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cef_cmb_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_cmb_shop_serActionPerformed(evt);
            }
        });

        cef_tbl_shop_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        cef_tbl_shop_ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cef_tbl_shop_serMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cef_tbl_shop_ser);

        scrollpane_shop_ser.setViewportView(jScrollPane1);

        cef_btn_add_shop_ser.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_add_shop_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_add_shop_ser.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_add_shop_ser.setText("Add");
        cef_btn_add_shop_ser.setBorderPainted(false);
        cef_btn_add_shop_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_add_shop_serActionPerformed(evt);
            }
        });

        cef_lbl_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_dis.setText("Discount");

        cef_txt_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_dis.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_dis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));
        cef_txt_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cef_txt_disKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout cef_shop_ser_panelLayout = new javax.swing.GroupLayout(cef_shop_ser_panel);
        cef_shop_ser_panel.setLayout(cef_shop_ser_panelLayout);
        cef_shop_ser_panelLayout.setHorizontalGroup(
            cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cef_shop_ser_panelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cef_shop_ser_panelLayout.createSequentialGroup()
                        .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cef_lbl_shop)
                            .addComponent(cef_cmb_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cef_txt_shop_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cef_lbl_shop_price))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(cef_shop_ser_panelLayout.createSequentialGroup()
                        .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_shop_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(cef_shop_ser_panelLayout.createSequentialGroup()
                                .addComponent(cef_lbl_shop_ser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cef_btn_add_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cef_btn_dl_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cef_shop_ser_panelLayout.createSequentialGroup()
                                .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cef_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cef_lbl_dis))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))))
        );
        cef_shop_ser_panelLayout.setVerticalGroup(
            cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cef_shop_ser_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_lbl_shop_ser)
                    .addComponent(cef_btn_dl_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_btn_add_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_lbl_shop)
                    .addComponent(cef_lbl_shop_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cef_shop_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_cmb_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_txt_shop_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(scrollpane_shop_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cef_lbl_dis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cef_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        cef_order_panel.setBackground(new java.awt.Color(255, 255, 255));

        order_ser_panel.setBackground(new java.awt.Color(255, 255, 255));

        cef_txt_order_ser_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_order_ser_price.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_order_ser_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_lbl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_order_ser.setText("Order Service");

        cef_lbl_order.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_order.setText("Service");

        cef_lbl_order_price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_order_price.setText("Price");

        cef_btn_add_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_add_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_add_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_add_order_ser.setText("Add");
        cef_btn_add_order_ser.setBorderPainted(false);
        cef_btn_add_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_add_order_serActionPerformed(evt);
            }
        });

        cef_cmb_order_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cef_cmb_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_cmb_order_serActionPerformed(evt);
            }
        });

        cef_tbl_order_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Price"
            }
        ));
        jScrollPane2.setViewportView(cef_tbl_order_ser);

        scrollpane_order_ser.setViewportView(jScrollPane2);

        cef_btn_dl_order_ser.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_dl_order_ser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_dl_order_ser.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_dl_order_ser.setText("Delete");
        cef_btn_dl_order_ser.setBorderPainted(false);
        cef_btn_dl_order_ser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_dl_order_serActionPerformed(evt);
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
                            .addComponent(cef_lbl_order)
                            .addComponent(cef_cmb_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cef_lbl_order_price)
                            .addComponent(cef_txt_order_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(order_ser_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_order_ser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(order_ser_panelLayout.createSequentialGroup()
                                .addComponent(cef_lbl_order_ser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cef_btn_add_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cef_btn_dl_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        order_ser_panelLayout.setVerticalGroup(
            order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_panelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_lbl_order_ser)
                    .addComponent(cef_btn_add_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_btn_dl_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_lbl_order)
                    .addComponent(cef_lbl_order_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(order_ser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cef_txt_order_ser_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_cmb_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_order_ser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        order_ser_exp_panel.setBackground(new java.awt.Color(255, 255, 255));

        cef_txt_order_ser_exp_cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_txt_order_ser_exp_cost.setForeground(new java.awt.Color(102, 102, 255));
        cef_txt_order_ser_exp_cost.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        cef_lbl_shop_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_shop_ser_exp.setText("Order Service Expense");

        cef_lbl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_order_ser_exp.setText("Expense");

        cef_lbl_order_ser_exp_cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_lbl_order_ser_exp_cost.setText("Price");

        cef_btn_add_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_add_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_add_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_add_order_ser_exp.setText("Add");
        cef_btn_add_order_ser_exp.setBorderPainted(false);
        cef_btn_add_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_add_order_ser_expActionPerformed(evt);
            }
        });

        cef_cmb_order_ser_exp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select..." }));
        cef_cmb_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_cmb_order_ser_expActionPerformed(evt);
            }
        });

        cef_tbl_order_ser_exp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Expense", "Cost"
            }
        ));
        jScrollPane3.setViewportView(cef_tbl_order_ser_exp);

        scrollpane_order_ser_exp.setViewportView(jScrollPane3);

        cef_btn_dl_order_ser_exp.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_dl_order_ser_exp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_dl_order_ser_exp.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_dl_order_ser_exp.setText("Delete");
        cef_btn_dl_order_ser_exp.setBorderPainted(false);
        cef_btn_dl_order_ser_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_dl_order_ser_expActionPerformed(evt);
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
                            .addComponent(cef_lbl_order_ser_exp)
                            .addComponent(cef_cmb_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cef_lbl_order_ser_exp_cost)
                            .addComponent(cef_txt_order_ser_exp_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                        .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpane_order_ser_exp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                                .addComponent(cef_lbl_shop_ser_exp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cef_btn_add_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cef_btn_dl_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))))
        );
        order_ser_exp_panelLayout.setVerticalGroup(
            order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_ser_exp_panelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_lbl_shop_ser_exp)
                    .addComponent(cef_btn_add_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_btn_dl_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_lbl_order_ser_exp)
                    .addComponent(cef_lbl_order_ser_exp_cost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(order_ser_exp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cef_txt_order_ser_exp_cost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_cmb_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane_order_ser_exp, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout cef_order_panelLayout = new javax.swing.GroupLayout(cef_order_panel);
        cef_order_panel.setLayout(cef_order_panelLayout);
        cef_order_panelLayout.setHorizontalGroup(
            cef_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(order_ser_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(order_ser_exp_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cef_order_panelLayout.setVerticalGroup(
            cef_order_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cef_order_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(order_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order_ser_exp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cef_btn_save.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_save.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_save.setText("Save");
        cef_btn_save.setBorderPainted(false);
        cef_btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_saveActionPerformed(evt);
            }
        });

        cef_btn_cancel.setBackground(new java.awt.Color(102, 102, 255));
        cef_btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cef_btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        cef_btn_cancel.setText("Cancel");
        cef_btn_cancel.setBorderPainted(false);
        cef_btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cef_btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cef_order_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cef_shop_ser_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cef_common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cef_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cef_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(15, 15, 15))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cef_common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(cef_shop_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cef_order_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cef_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cef_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        scrollpane1.setViewportView(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cef_cmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_cmb_typeActionPerformed
        DefaultTableModel model;
        if(cef_cmb_type.getSelectedIndex()==1)
        {            
            model = (DefaultTableModel) cef_tbl_order_ser.getModel();
            model.setRowCount(0);
            model = (DefaultTableModel) cef_tbl_order_ser_exp.getModel();
            model.setRowCount(0);
            
            cef_shop_ser_panel.setVisible(true);
            cef_order_panel.setVisible(false);
            cef_txt_price.setText("0");
        }
        else if(cef_cmb_type.getSelectedIndex()==2)
        {
            model = (DefaultTableModel) cef_tbl_shop_ser.getModel();
            model.setRowCount(0);
            
            cef_shop_ser_panel.setVisible(false);
            cef_order_panel.setVisible(true);
            cef_txt_dis.setText("0");
            cef_txt_price.setText("0");
        }
        else
        {
            cef_shop_ser_panel.setVisible(false);
            cef_order_panel.setVisible(false);
        }
    }//GEN-LAST:event_cef_cmb_typeActionPerformed

    private void cef_cmb_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_cmb_brActionPerformed

    }//GEN-LAST:event_cef_cmb_brActionPerformed

    private void cef_btn_dl_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_dl_shop_serActionPerformed
        int rowNo = cef_tbl_shop_ser.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteShopSerTable(rowNo);
        }          
        
        DefaultTableModel model;
        model = (DefaultTableModel) cef_tbl_shop_ser.getModel();
        if(model.getRowCount() == 0)
        {
            cef_txt_dis.setText("");
        }
        
        // Calculate Price
        double tot_price = 0;
        double dis = 0;
        if(!cef_txt_dis.getText().equals(""))
        {
            dis = Double.parseDouble(cef_txt_dis.getText());
        }
        else
        {
            dis = 0;
        }
        
        tot_price = cef_returnShopSerTotPrice() - dis;
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_btn_dl_shop_serActionPerformed

    private void cef_cmb_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_cmb_shop_serActionPerformed
       
    }//GEN-LAST:event_cef_cmb_shop_serActionPerformed

    private void cef_tbl_shop_serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cef_tbl_shop_serMouseClicked

    }//GEN-LAST:event_cef_tbl_shop_serMouseClicked

    private void cef_btn_add_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_add_shop_serActionPerformed
        addShopSerTable();  
        
        // Calculate Price 
        double tot_price = 0;
        double dis = 0;
        if(cef_txt_dis.getText().equals(""))
        {
            dis = 0;
        }
        else
        {
            dis = Double.parseDouble(cef_txt_dis.getText());
        }
        
        tot_price = cef_returnShopSerTotPrice() - dis;
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_btn_add_shop_serActionPerformed

    private void cef_btn_add_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_add_order_serActionPerformed
        addOrderSerTable();   
        
        // Calculate Price
        double tot_price = 0;
        tot_price = cef_returnOrderSerTotPrice() - cef_returnOrderSerExpTotPrice();
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_btn_add_order_serActionPerformed

    private void cef_cmb_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_cmb_order_serActionPerformed

    }//GEN-LAST:event_cef_cmb_order_serActionPerformed

    private void cef_btn_dl_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_dl_order_serActionPerformed
        int rowNo = cef_tbl_order_ser.getSelectedRow();

        if(rowNo>=0)
        {
            deleteOrderSerTable(rowNo);
        }
        
        // Calculate Price
        double tot_price = 0;
        tot_price = cef_returnOrderSerTotPrice() - cef_returnOrderSerExpTotPrice();
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_btn_dl_order_serActionPerformed

    private void cef_btn_add_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_add_order_ser_expActionPerformed
        addOrderSerExpTable();
       
        // Calculate Price
        double tot_price = 0;
        tot_price = cef_returnOrderSerTotPrice() - cef_returnOrderSerExpTotPrice();
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_btn_add_order_ser_expActionPerformed

    private void cef_cmb_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_cmb_order_ser_expActionPerformed
  
    }//GEN-LAST:event_cef_cmb_order_ser_expActionPerformed

    private void cef_btn_dl_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_dl_order_ser_expActionPerformed
        int rowNo = cef_tbl_order_ser_exp.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteOrderSerExpTable(rowNo);
        } 
        
        // Calculate Price
        double tot_price = 0;
        tot_price = cef_returnOrderSerTotPrice() - cef_returnOrderSerExpTotPrice();
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_btn_dl_order_ser_expActionPerformed

    private void cef_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_saveActionPerformed

    }//GEN-LAST:event_cef_btn_saveActionPerformed

    private void cef_btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cef_btn_cancelActionPerformed
        displayCustomerRecords();
    }//GEN-LAST:event_cef_btn_cancelActionPerformed

    private void cef_txt_disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cef_txt_disKeyReleased
        // Calculate Price 
        double tot_price = 0;
        double dis = 0;
        if(cef_txt_dis.getText().equals(""))
        {
            dis = 0;
        }
        else
        {
            dis = Double.parseDouble(cef_txt_dis.getText());
        }
        
        tot_price = cef_returnShopSerTotPrice() - dis;
        String sTot_price = String.valueOf(tot_price);
        cef_txt_price.setText(sTot_price);
    }//GEN-LAST:event_cef_txt_disKeyReleased
    
    
// Customer Edit Form Code Start-----------------------------------------------

// Populate Combo Boxes
    // Shop Combo Box
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
                cef_cmb_shop_ser.addItem(rs.getString("service"));
            }                
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    // Order Combo Box
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
                cef_cmb_order_ser.addItem(rs.getString("service"));
            }                
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
        
    // Order Expense Combo Box
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
                cef_cmb_order_ser_exp.addItem(rs.getString("expense"));
            }                
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
    
    // Display Records
    public void displayCustomerRecords()
    {
        try
        {    
            String customer_name="",phone="",service_type="",branch="",discount="",total_price="";
            Date serviced_date = new Date();
            int c_id = Integer.parseInt(cef_txt_cid.getText());
            Connection con = DBConnection.getConnection();
            String sql = "select * from customer where customer_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1,c_id);                   
            ResultSet rs = pst.executeQuery();
            
            while(rs.next())
            {                                             
                customer_name = rs.getString("customer_name");
                phone = rs.getString("phone");
                service_type = rs.getString("service_type");
                serviced_date = rs.getDate("serviced_date");
                branch = rs.getString("branch");
                discount = rs.getString("discount");
                total_price = rs.getString("total_price");
                                                                
            }    
            cef_cmb_br.setSelectedItem(branch);            
            cef_txt_cname.setText(customer_name);
            cef_txt_phone.setText(phone);
            cef_cmb_type.setSelectedItem(service_type);  
            cef_txt_date.setDate(serviced_date);            
            cef_txt_price.setText(total_price);
            cef_txt_dis.setText(discount);
            //JOptionPane.showMessageDialog(this,branch );
            
            setShopServiceDetails(c_id);
            setOrderServiceDetails(c_id);
            setOrderServiceExpenseDetails(c_id);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }   
    }
   
    //Set Shop Service Details into Table    
    public void setShopServiceDetails(int x)
    {         
        DefaultTableModel model;
        model = (DefaultTableModel) cef_tbl_shop_ser.getModel();
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
    public void setOrderServiceDetails(int x)
    {  
        DefaultTableModel model;
        model = (DefaultTableModel) cef_tbl_order_ser.getModel();
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
    public void setOrderServiceExpenseDetails(int x)
    {  
        DefaultTableModel model;
        model = (DefaultTableModel) cef_tbl_order_ser_exp.getModel();
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
    
    //Add Records to Shop Service Table
    public void addShopSerTable()
    {
        DefaultTableModel model;
        
        if(cef_cmb_shop_ser.getSelectedIndex()>=1 && !cef_txt_shop_ser_price.getText().equals(""))
        {
            String shop_ser = cef_cmb_shop_ser.getSelectedItem().toString();           
            double price = Double.parseDouble(cef_txt_shop_ser_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) cef_tbl_shop_ser.getModel();
                model.addRow(obj);
                
                cef_cmb_shop_ser.setSelectedIndex(0);
                cef_txt_shop_ser_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        else
        {
            JOptionPane.showMessageDialog(this,"Select Service");
        }
    }
    
    //Delete Records from Shop Service Table
    public void deleteShopSerTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) cef_tbl_shop_ser.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Add Records to Order Service Table
    public void addOrderSerTable()
    {
        DefaultTableModel model;
        
        if(cef_cmb_order_ser.getSelectedIndex()>=1 && !cef_txt_order_ser_price.getText().equals(""))
        {
            String shop_ser = cef_cmb_order_ser.getSelectedItem().toString();
            double price = Double.parseDouble(cef_txt_order_ser_price.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) cef_tbl_order_ser.getModel();
                model.addRow(obj);
                
                cef_cmb_order_ser.setSelectedIndex(0);
                cef_txt_order_ser_price.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Order Service Table
    public void deleteOrderSerTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) cef_tbl_order_ser.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Add Records to Order Service Expense Table
    public void addOrderSerExpTable()
    {
        DefaultTableModel model;
        
        if(cef_cmb_order_ser_exp.getSelectedIndex()>=1 && !cef_txt_order_ser_exp_cost.getText().equals(""))
        {
            String shop_ser = cef_cmb_order_ser_exp.getSelectedItem().toString();
            double price = Double.parseDouble(cef_txt_order_ser_exp_cost.getText());

            try
            {
                Object[] obj = {shop_ser,price};
                model = (DefaultTableModel) cef_tbl_order_ser_exp.getModel();
                model.addRow(obj);
                
                cef_cmb_order_ser_exp.setSelectedIndex(0);
                cef_txt_order_ser_exp_cost.setText("");
            }
            catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }                
    }
    
    //Delete Records from Order Service Expense Table
    public void deleteOrderSerExpTable(int x)
    {
        DefaultTableModel model;        
        int rowNo =x;
        
        try
        {
            model = (DefaultTableModel) cef_tbl_order_ser_exp.getModel();
            model.removeRow(rowNo);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    } 
    
    //Return Total Shop Service Price
    public double cef_returnShopSerTotPrice()
    {
        double totPrice = 0;
        double price = 0;
        DefaultTableModel model1;
        
        try
        {    
            model1 = (DefaultTableModel) cef_tbl_shop_ser.getModel();

            if(model1.getRowCount()>0)
            {      
                for(int row=0; row<model1.getRowCount();row++)
                {
                    price = Double.parseDouble(model1.getValueAt(row, 1).toString());
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
    
    //Return Total Order Service Price
    public double cef_returnOrderSerTotPrice()
    {
        double totPrice = 0;
        double price = 0;
        DefaultTableModel model;
        
        try
        {    
            model = (DefaultTableModel) cef_tbl_order_ser.getModel();

            if(model.getRowCount()>0)
            {      
                for(int row=0; row<model.getRowCount();row++)
                {
                    price = Double.parseDouble(model.getValueAt(row, 1).toString());
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
    
    //Return Total Order Service Expense Amount
    public double cef_returnOrderSerExpTotPrice()
    {
        double totPrice = 0;
        double price = 0;
        DefaultTableModel model;
        
        try
        {    
            model = (DefaultTableModel) cef_tbl_order_ser_exp.getModel();

            if(model.getRowCount()>0)
            {      
                for(int row=0; row<model.getRowCount();row++)
                {
                    price = Double.parseDouble(model.getValueAt(row, 1).toString());
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
    
    //Validation
    public boolean validation()
    {        

        String br = cef_cmb_br.getSelectedItem().toString();
        if(cef_cmb_br.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Branch ");
            return false;
        }
        if(cef_txt_cname.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Customer Name");
            return false;
        }
        if(cef_txt_phone.getText().equals("") || cef_txt_phone.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Enter Phone Valid No");
            return false;
        }
        if(cef_cmb_type.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(this, "Select Service Type");
            return false;
        }
        Date s_date = cef_txt_date.getDate();
        if(s_date == null)
        {
            JOptionPane.showMessageDialog(this,"Select the Date");
            return false;
        }
         
        if(cef_txt_dis.getText().equals(""))
        {
            
            cef_txt_dis.setText("0");
        }
        
        //Validation Code to Serviced_date is here
        // No need to write Validation to Price Textfield. Because it is automated.        
        
        return true;
    }
    
    //Insert records to customer Table
    public void cef_insertCustomerDetailstoDb()
    { 
        int cid = Integer.parseInt(cef_txt_cid.getText());          // Customer ID
                        
        String br = cef_cmb_br.getSelectedItem().toString();        // Branch
        String cname = cef_txt_cname.getText();                     // Customer Name
        String phone = cef_txt_phone.getText();                     // phone
        // Service Type
        String type = "";                                           // Service Type
        if(cef_cmb_type.getSelectedIndex()==1)
        {
            type="Shop";
        }
        else if(cef_cmb_type.getSelectedIndex()==2)
        {
            type="Order";
        }
        //Serviced_date
        Date s_date = cef_txt_date.getDate();                       // Serviced Date
        long l =  s_date.getTime();
        java.sql.Date txt_date = new java.sql.Date(l);
                
        double price = Double.parseDouble(cef_txt_price.getText()); // Price
        double dis = Double.parseDouble(cef_txt_dis.getText());     // Discount
        
        
        
        try
        {
            Connection con = DBConnection.getConnection();
            
            String sql = "update customer set customer_name = ? ,phone = ? ,service_type = ? ,serviced_date = ? ,branch = ? ,discount = ? ,total_price = ? where customer_id  = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(1,cname);
            pst.setString(2,phone);  
            pst.setString(3,type); 
            pst.setDate(4,txt_date); 
            pst.setString(5,br); 
            pst.setDouble(6,dis); 
            pst.setDouble(7,price); 
            pst.setInt(8,cid);
                    
            int updateRowCount = pst.executeUpdate();
            
            if(updateRowCount>0)
            {
                JOptionPane.showMessageDialog(this, "Customer Detail Updated");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // insert service & expense into Database
    
    public void cef_deleteSerExpRecords(int cid, String tbl_name)
    {
        try
        {
            Connection con = DBConnection.getConnection();
            String sql = "select COUNT(*) from " + tbl_name + " where customer_id = ? ";
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,cid);
            
            ResultSet rs = pst.executeQuery();

            if(rs.next())
            {
                int count = rs.getInt(1);

                if (count > 0) {
                    //JOptionPane.showMessageDialog(this, "Records exist.");
                    
                    String sql1 = "delete from " + tbl_name + " where customer_id = ? ";

                    PreparedStatement pst1 = con.prepareStatement(sql1);
                    pst1.setInt(1,cid); 

                    pst1.executeUpdate();
                    //JOptionPane.showMessageDialog(this, "Records Deleted");
                } 
                else 
                {
                    //JOptionPane.showMessageDialog(this, "No records exist.");                    
                }                                        
            }            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Insert records to shop_services Table
    public void cef_insertShopSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cef_txt_cid.getText());

            model = (DefaultTableModel) cef_tbl_shop_ser.getModel();

            if(model.getRowCount()>0)
            { 
                cef_deleteSerExpRecords(cid,"shop_services");   // Delete Already Existing Records in Shop Table
                cef_insertCustomerDetailstoDb();        // Insert Customer Details
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into shop_services (customer_id,service,price) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = Double.parseDouble(model.getValueAt(row, 1).toString());
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                //JOptionPane.showMessageDialog(this, "Records Are Saved in Shop Services table");                
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
    public void cef_insertOrderSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cef_txt_cid.getText());

            model = (DefaultTableModel) cef_tbl_order_ser.getModel();

            if(model.getRowCount()>0)
            {        
                cef_deleteSerExpRecords(cid,"ordering_services");   // Delete Already Existing Records in Order Table
                cef_insertCustomerDetailstoDb();                    // Insert Customer Details
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into ordering_services (customer_id,service,price) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = Double.parseDouble(model.getValueAt(row, 1).toString());
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                //JOptionPane.showMessageDialog(this, "Records Are Saved in Ordering Services Table");
                cef_insertOrderSerExptoDb();                
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
    public void cef_insertOrderSerExptoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cef_txt_cid.getText());

            model = (DefaultTableModel) cef_tbl_order_ser_exp.getModel();

            if(model.getRowCount()>0)
            {             
                cef_deleteSerExpRecords(cid,"ordering_service_expenses");       // Delete Already Existing Records in Order Expense Table
                
                Connection con = DBConnection.getConnection();
                String sql = "insert into ordering_service_expenses (customer_id,expense,cost) values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                for(int row=0; row<model.getRowCount();row++)
                {
                    String service = (String) model.getValueAt(row, 0);
                    double price = Double.parseDouble(model.getValueAt(row, 1).toString());
                    
                    pst.setInt(1,cid);
                    pst.setString(2,service);   
                    pst.setDouble(3, price);

                    pst.executeUpdate();
                }
                //JOptionPane.showMessageDialog(this, "Records Are in Saved Ordering Service Expense Table");
            }     
            else
            {
                //JOptionPane.showMessageDialog(this, "No Expenses to Save");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public void cef_insertAllRecordstoDB()
    {
        int cid = Integer.parseInt(cef_txt_cid.getText());
        
        if (cef_cmb_type.getSelectedIndex() == 1)
        {
            cef_deleteSerExpRecords(cid,"ordering_services");
            cef_deleteSerExpRecords(cid,"ordering_service_expenses");
            cef_insertShopSertoDb();                                        // Insert Customer + Shop Records to DB
        }
        else if (cef_cmb_type.getSelectedIndex() == 2)
        {
            cef_deleteSerExpRecords(cid,"shop_services");
            cef_insertOrderSertoDb();
        }
    }
    
// Customer Edit Form Code End-----------------------------------------------     
 
    

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
            java.util.logging.Logger.getLogger(customer_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_edit_form().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cef_btn_add_order_ser;
    private javax.swing.JButton cef_btn_add_order_ser_exp;
    private javax.swing.JButton cef_btn_add_shop_ser;
    private javax.swing.JButton cef_btn_cancel;
    private javax.swing.JButton cef_btn_dl_order_ser;
    private javax.swing.JButton cef_btn_dl_order_ser_exp;
    private javax.swing.JButton cef_btn_dl_shop_ser;
    public javax.swing.JButton cef_btn_save;
    private rojerusan.RSComboMetro cef_cmb_br;
    private javax.swing.JComboBox<String> cef_cmb_order_ser;
    private javax.swing.JComboBox<String> cef_cmb_order_ser_exp;
    private javax.swing.JComboBox<String> cef_cmb_shop_ser;
    private rojerusan.RSComboMetro cef_cmb_type;
    private javax.swing.JPanel cef_common_panel1;
    private javax.swing.JLabel cef_lbl_dis;
    private javax.swing.JLabel cef_lbl_order;
    private javax.swing.JLabel cef_lbl_order_price;
    private javax.swing.JLabel cef_lbl_order_ser;
    private javax.swing.JLabel cef_lbl_order_ser_exp;
    private javax.swing.JLabel cef_lbl_order_ser_exp_cost;
    private javax.swing.JLabel cef_lbl_shop;
    private javax.swing.JLabel cef_lbl_shop_price;
    private javax.swing.JLabel cef_lbl_shop_ser;
    private javax.swing.JLabel cef_lbl_shop_ser_exp;
    private javax.swing.JPanel cef_order_panel;
    private javax.swing.JPanel cef_shop_ser_panel;
    private javax.swing.JTable cef_tbl_order_ser;
    private javax.swing.JTable cef_tbl_order_ser_exp;
    private javax.swing.JTable cef_tbl_shop_ser;
    private javax.swing.JTextField cef_txt_cid;
    private javax.swing.JTextField cef_txt_cname;
    private com.toedter.calendar.JDateChooser cef_txt_date;
    public javax.swing.JTextField cef_txt_dis;
    private javax.swing.JTextField cef_txt_order_ser_exp_cost;
    private javax.swing.JTextField cef_txt_order_ser_price;
    private javax.swing.JTextField cef_txt_phone;
    private javax.swing.JTextField cef_txt_price;
    private javax.swing.JTextField cef_txt_shop_ser_price;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_br;
    private javax.swing.JLabel lbl_cid;
    private javax.swing.JLabel lbl_cname;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_order_ser8;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JPanel order_ser_exp_panel;
    private javax.swing.JPanel order_ser_panel;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane_order_ser;
    private bizbuilder.Scrollpane scrollpane_order_ser_exp;
    private bizbuilder.Scrollpane scrollpane_shop_ser;
    // End of variables declaration//GEN-END:variables

    
}
