
package bizbuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class customer_form extends javax.swing.JFrame {


    public customer_form() {
        initComponents();
        shop_ser_panel.setVisible(false);
        order_panel.setVisible(false);
        
        cf_txt_cid.enable(false); 
        cf_txt_dis.setText("0.00");
        cf_txt_price.enable(false);                
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollpane1 = new bizbuilder.Scrollpane();
        jPanel1 = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        cf_txt_date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

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
                    .addComponent(cf_cmb_type, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(cf_txt_phone)
                    .addComponent(cf_txt_cname)
                    .addComponent(cf_txt_cid)
                    .addComponent(cf_cmb_br, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cf_txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cf_txt_price))
                .addGap(15, 15, 15))
        );

        common_panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_br, lbl_cid, lbl_cname, lbl_date, lbl_order_ser8, lbl_phone, lbl_type});

        common_panel1Layout.setVerticalGroup(
            common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(common_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_br)
                    .addComponent(cf_cmb_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cid)
                    .addComponent(cf_txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cname)
                    .addComponent(cf_txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(cf_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_type)
                    .addComponent(cf_cmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_date)
                    .addComponent(cf_txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(common_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_order_ser8)
                    .addComponent(cf_txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        cf_cmb_shop_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Eyebrow Threading", "Facial threading", "Normal Facial", "Gold facial", "Silver Facial", "Manicure", "Pedicure", "Haor Cut", "Layer Hair Cut", "Hair Starightning" }));
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
        if (cf_tbl_shop_ser.getColumnModel().getColumnCount() > 0) {
            cf_tbl_shop_ser.getColumnModel().getColumn(0).setMinWidth(150);
            cf_tbl_shop_ser.getColumnModel().getColumn(1).setMinWidth(80);
        }

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

        cf_cmb_order_ser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Bridal Makeup", "Reception Makeup", "Muslim Bridal Makeup", "Muslim Reception Makeup", "Party Makeup" }));
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
        if (cf_tbl_order_ser.getColumnModel().getColumnCount() > 0) {
            cf_tbl_order_ser.getColumnModel().getColumn(0).setMinWidth(150);
            cf_tbl_order_ser.getColumnModel().getColumn(1).setMinWidth(80);
        }

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

        cf_cmb_order_ser_exp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Jewells", "Boquet", "Head Dress", "Travel", "Beverage" }));
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
        if (cf_tbl_order_ser_exp.getColumnModel().getColumnCount() > 0) {
            cf_tbl_order_ser_exp.getColumnModel().getColumn(0).setMinWidth(150);
            cf_tbl_order_ser_exp.getColumnModel().getColumn(1).setMinWidth(80);
        }

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(order_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shop_ser_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cf_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cf_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(common_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(shop_ser_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(order_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cf_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cf_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        scrollpane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1039, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Shop Service Delete Button
    private void cf_btn_dl_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_dl_shop_serActionPerformed
        
        int rowNo = cf_tbl_shop_ser.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteShopSerTable(rowNo);
        }        
    }//GEN-LAST:event_cf_btn_dl_shop_serActionPerformed

    
    private void cf_cmb_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_shop_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf_cmb_shop_serActionPerformed
    
    
    //Order Service Expense Add Button
    private void btn_add_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_order_ser_expActionPerformed
        
        addOrderSerExpTable();
    }//GEN-LAST:event_btn_add_order_ser_expActionPerformed

    
    private void cf_cmb_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_order_ser_expActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf_cmb_order_ser_expActionPerformed
    
    //Order Service Expense Delete Button
    private void btn_dl_order_ser_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dl_order_ser_expActionPerformed
        int rowNo = cf_tbl_order_ser_exp.getSelectedRow();
        
        if(rowNo>=0)
        {
            deleteOrderSerExpTable(rowNo);
        } 
    }//GEN-LAST:event_btn_dl_order_ser_expActionPerformed

    //Shop Service Add Button
    private void cf_btn_add_shop_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_add_shop_serActionPerformed
        
        addShopSerTable();
        
    }//GEN-LAST:event_cf_btn_add_shop_serActionPerformed

    // Service Type Combo Box (Show, Hide Shop & Order Panel )
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

    
    private void cf_tbl_shop_serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cf_tbl_shop_serMouseClicked
        
    }//GEN-LAST:event_cf_tbl_shop_serMouseClicked

    private void cf_cmb_brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_brActionPerformed
        int cid_int = tblRowCount()+1;
        String cid_string = String.valueOf(cid_int);
        cf_txt_cid.setText(cid_string);
    }//GEN-LAST:event_cf_cmb_brActionPerformed

    //Order Service Delete Button
    private void cf_btn_dl_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_dl_order_serActionPerformed
        int rowNo = cf_tbl_order_ser.getSelectedRow();

        if(rowNo>=0)
        {
            deleteOrderSerTable(rowNo);
        }
    }//GEN-LAST:event_cf_btn_dl_order_serActionPerformed

    private void cf_cmb_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_cmb_order_serActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cf_cmb_order_serActionPerformed

    //Order Service Add Button
    private void cf_btn_add_order_serActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_add_order_serActionPerformed
        
        addOrderSerTable();
    }//GEN-LAST:event_cf_btn_add_order_serActionPerformed

    //Save Button
    private void cf_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cf_btn_saveActionPerformed

        try
        {
            if(validation()==true)
            {                                                
                if(cf_cmb_type.getSelectedIndex()==1)
                {
                    insertShopSertoDb();
                }
                else if(cf_cmb_type.getSelectedIndex()==2)
                {
                    insertOrderSertoDb();                    
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
        
        deleteCommonRecords();
        deleteAllShopSerRecords();
        deleteAllOrderSerRecords();
        deleteAllOrderSerExpRecords();  
        
    }//GEN-LAST:event_cf_btn_cancelActionPerformed

    //Validation
    public boolean validation()
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
    public void addShopSerTable()
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
    public void deleteShopSerTable(int x)
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
    public void addOrderSerTable()
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
    public void deleteOrderSerTable(int x)
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
    public void addOrderSerExpTable()
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
    public void deleteOrderSerExpTable(int x)
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
    public int tblRowCount()
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
    public void insertCustomerDetailstoDb()
    {
        double totPrice = setTotPrice();
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
                JOptionPane.showMessageDialog(this, "Customer Details Saved in Customer Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Insert records to shop_services Table
    public void insertShopSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cf_txt_cid.getText());

            model = (DefaultTableModel) cf_tbl_shop_ser.getModel();

            if(model.getRowCount()>0)
            {      
                insertCustomerDetailstoDb();
                
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
                JOptionPane.showMessageDialog(this, "Records Are Saved in Shop Services table");
                
                deleteCommonRecords();
                deleteAllShopSerRecords();
                deleteAllOrderSerRecords();
                deleteAllOrderSerExpRecords();
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "Please Add Shop Services to the Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Insert records to ordering_services Table
    public void insertOrderSertoDb()
    {
        DefaultTableModel model;
        
        try
        {
            int cid = Integer.parseInt(cf_txt_cid.getText());

            model = (DefaultTableModel) cf_tbl_order_ser.getModel();

            if(model.getRowCount()>0)
            {        
                insertCustomerDetailstoDb();
                
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
                JOptionPane.showMessageDialog(this, "Records Are Saved");
                insertOrderSerExptoDb();
                
                deleteCommonRecords();
                deleteAllShopSerRecords();
                deleteAllOrderSerRecords();
                deleteAllOrderSerExpRecords();
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "Please Add Order Services to the Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Insert records to ordering_services_expenses Table
    public void insertOrderSerExptoDb()
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
                JOptionPane.showMessageDialog(this, "Records Are Saved");
            }     
            else
            {
                JOptionPane.showMessageDialog(this, "No records to Save in Order Expense Table");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    //Delete Records from Common Panel
    public void deleteCommonRecords()
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
    public void deleteAllShopSerRecords() 
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
    public void deleteAllOrderSerRecords() 
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
    public void deleteAllOrderSerExpRecords() 
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
    public double returnShopSerTotPrice()
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
    public double returnOrderSerTotPrice()
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
    public double returnOrderSerExpTotPrice()
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
    
    public double setTotPrice()
    {
        //double price = Double.parseDouble(txt_price.getText().toString());
        double totPrice = 0;
        
        
        if(cf_cmb_type.getSelectedIndex()==1)
        {
            double dis = Double.parseDouble(cf_txt_dis.getText().toString());
            double shopPrice = returnShopSerTotPrice();
            
            totPrice = shopPrice - dis;
        }
        else if(cf_cmb_type.getSelectedIndex()==2)
        {
            double orderSerPrice = returnOrderSerTotPrice();
            double orderExpPrice = returnOrderSerExpTotPrice();
            totPrice = orderSerPrice - orderExpPrice;
        }
        else if(cf_cmb_type.getSelectedIndex()==0)
        {
            cf_txt_price.setText("0.00");
        }
        return totPrice;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_order_ser_exp;
    private javax.swing.JButton btn_dl_order_ser_exp;
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
    private javax.swing.JPanel order_panel;
    private javax.swing.JPanel order_ser_exp_panel;
    private javax.swing.JPanel order_ser_panel;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane_order_ser;
    private bizbuilder.Scrollpane scrollpane_order_ser_exp;
    private bizbuilder.Scrollpane scrollpane_shop_ser;
    private javax.swing.JPanel shop_ser_panel;
    // End of variables declaration//GEN-END:variables
}
