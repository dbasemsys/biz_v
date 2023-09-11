
package bizbuilder;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class employee_edit_form extends javax.swing.JFrame {


    public String employee_id="",work_status="",employee_left_date="",epf_settled_or_not="",total_epf="",settled_date="";
    public boolean left_to_working = false;
    
    String ef_path2 = "";

    public employee_edit_form() 
    {
        initComponents();

        eef_txt_eid.setEditable(false);
        eef_txt_jdate.setEditable(false);
        eef_txt_ldate.setEditable(false);
        eef_txt_sdate.setEditable(false);
    }

    public employee_edit_form(String x)
    {
        initComponents();
        eef_txt_eid.setText(x);
        
        eef_txt_eid.setEditable(false);
        eef_txt_jdate.setEditable(false);
        eef_txt_ldate.setEditable(false);
        eef_txt_tot_epf.setEditable(false);
        eef_txt_sdate.setEditable(false);
        
        eef_displayEmployeeDetails();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ed_txt_status = new javax.swing.JTextField();
        ed_txt_epf = new javax.swing.JTextField();
        scrollpane2 = new bizbuilder.Scrollpane();
        jPanel13 = new javax.swing.JPanel();
        eef_lbl_image = new javax.swing.JLabel();
        eef_txt_eid = new javax.swing.JTextField();
        eef_lbl_name = new javax.swing.JLabel();
        eef_txt_name = new javax.swing.JTextField();
        eef_lbl_role = new javax.swing.JLabel();
        eef_lbl_nic = new javax.swing.JLabel();
        eef_lbl_addr = new javax.swing.JLabel();
        eef_txt_addr = new javax.swing.JTextField();
        eef_lbl_br = new javax.swing.JLabel();
        eef_lbl_acc_no = new javax.swing.JLabel();
        eef_lbl_phone = new javax.swing.JLabel();
        eef_txt_br = new javax.swing.JTextField();
        eef_txt_acc_no = new javax.swing.JTextField();
        eef_txt_phone = new javax.swing.JTextField();
        eef_lbl_jdate = new javax.swing.JLabel();
        eef_lbl_status = new javax.swing.JLabel();
        eef_lbl_ldate = new javax.swing.JLabel();
        eef_lbl_epf = new javax.swing.JLabel();
        eef_txt_jdate = new javax.swing.JTextField();
        eef_txt_ldate = new javax.swing.JTextField();
        eef_txt_sdate = new javax.swing.JTextField();
        eef_txt_nic = new javax.swing.JTextField();
        eef_lbl_eid = new javax.swing.JLabel();
        eef_lbl_epf_info = new javax.swing.JLabel();
        eef_lbl_sdate = new javax.swing.JLabel();
        eef_cmb_role = new rojerusan.RSComboMetro();
        eef_cmb_status = new rojerusan.RSComboMetro();
        eef_cmb_epf = new rojerusan.RSComboMetro();
        eef_btn_cancel = new javax.swing.JButton();
        eef_btn_save = new javax.swing.JButton();
        eef_btn_clear = new javax.swing.JButton();
        eef_txt_tot_epf = new javax.swing.JTextField();
        eef_lbl_tot_epf = new javax.swing.JLabel();

        ed_txt_status.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_status.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        ed_txt_epf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ed_txt_epf.setForeground(new java.awt.Color(102, 102, 255));
        ed_txt_epf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        scrollpane2.setBorder(null);
        scrollpane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        eef_lbl_image.setBackground(new java.awt.Color(255, 255, 255));
        eef_lbl_image.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_image.setForeground(new java.awt.Color(102, 102, 255));
        eef_lbl_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eef_lbl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user (2).png"))); // NOI18N
        eef_lbl_image.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        eef_lbl_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eef_lbl_imageMouseClicked(evt);
            }
        });

        eef_txt_eid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_eid.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_eid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_lbl_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_name.setText("Name");

        eef_txt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_name.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_lbl_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_role.setText("Work Role");

        eef_lbl_nic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_nic.setText("NIC");

        eef_lbl_addr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_addr.setText("Address");

        eef_txt_addr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_addr.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_addr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_lbl_br.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_br.setText("Bank Name, Branch");

        eef_lbl_acc_no.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_acc_no.setText("Account Nubmer");

        eef_lbl_phone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_phone.setText("Contact");

        eef_txt_br.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_br.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_br.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_txt_acc_no.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_acc_no.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_acc_no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_txt_phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_phone.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_lbl_jdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_jdate.setText("Join Date");

        eef_lbl_status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_status.setText("Work Status");

        eef_lbl_ldate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_ldate.setText("Left Date");

        eef_lbl_epf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_epf.setText("EPF Pending");

        eef_txt_jdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_jdate.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_jdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_txt_ldate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_ldate.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_ldate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_txt_sdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_sdate.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_sdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_txt_nic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_nic.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_nic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_lbl_eid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_eid.setText("Employee Id");

        eef_lbl_epf_info.setBackground(new java.awt.Color(0, 204, 51));
        eef_lbl_epf_info.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_epf_info.setText("Message");

        eef_lbl_sdate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_sdate.setText("Settled date");

        eef_cmb_role.setBorder(null);
        eef_cmb_role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ...", "Staff" }));

        eef_cmb_status.setBorder(null);
        eef_cmb_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Still Working", "Left" }));
        eef_cmb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eef_cmb_statusActionPerformed(evt);
            }
        });

        eef_cmb_epf.setBorder(null);
        eef_cmb_epf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        eef_cmb_epf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eef_cmb_epfActionPerformed(evt);
            }
        });

        eef_btn_cancel.setBackground(new java.awt.Color(102, 102, 255));
        eef_btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        eef_btn_cancel.setText("Cancel");
        eef_btn_cancel.setBorderPainted(false);
        eef_btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eef_btn_cancelActionPerformed(evt);
            }
        });

        eef_btn_save.setBackground(new java.awt.Color(102, 102, 255));
        eef_btn_save.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_btn_save.setForeground(new java.awt.Color(255, 255, 255));
        eef_btn_save.setText("Save");
        eef_btn_save.setBorderPainted(false);
        eef_btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eef_btn_saveActionPerformed(evt);
            }
        });

        eef_btn_clear.setBackground(new java.awt.Color(102, 102, 255));
        eef_btn_clear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        eef_btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bin.png"))); // NOI18N
        eef_btn_clear.setToolTipText("Remove Profile");
        eef_btn_clear.setBorderPainted(false);
        eef_btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eef_btn_clearActionPerformed(evt);
            }
        });

        eef_txt_tot_epf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eef_txt_tot_epf.setForeground(new java.awt.Color(102, 102, 255));
        eef_txt_tot_epf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true));

        eef_lbl_tot_epf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eef_lbl_tot_epf.setText("Epf Amount");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eef_lbl_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addComponent(eef_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eef_btn_clear)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                            .addComponent(eef_btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eef_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eef_lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_br, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eef_lbl_epf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eef_lbl_ldate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eef_lbl_epf_info, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eef_txt_br, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_acc_no, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_jdate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_phone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_name, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_eid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_nic, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_addr, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_txt_ldate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eef_cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eef_cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eef_cmb_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eef_lbl_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eef_lbl_tot_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(100, 100, 100)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eef_txt_tot_epf, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(eef_txt_sdate)))))
                .addGap(36, 36, 36))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eef_lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_eid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eef_lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_cmb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_addr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_acc_no, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_cmb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_txt_ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_lbl_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_cmb_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eef_lbl_epf_info)
                .addGap(9, 9, 9)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_txt_tot_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_lbl_tot_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_txt_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eef_lbl_sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eef_btn_cancel)
                    .addComponent(eef_btn_save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollpane2.setViewportView(jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scrollpane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eef_btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eef_btn_cancelActionPerformed
       eef_displayEmployeeDetails();
    }//GEN-LAST:event_eef_btn_cancelActionPerformed

    private void eef_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eef_btn_saveActionPerformed
       

    }//GEN-LAST:event_eef_btn_saveActionPerformed

    private void eef_btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eef_btn_clearActionPerformed
        eef_lbl_image.setIcon(null);
        ef_path2="";
    }//GEN-LAST:event_eef_btn_clearActionPerformed

    private void eef_cmb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eef_cmb_statusActionPerformed
        try
        {                 
            // Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date today = new Date();  
            String formattedDate = dateFormat.format(today);            
            
            if(eef_cmb_status.getSelectedIndex() == 0)
            {          
                int eid = Integer.parseInt(eef_txt_eid.getText());

                Connection con = DBConnection.getConnection();
                String sql = "select * from employee where employee_id = ?";            

                PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1,eid);                   
                ResultSet rs = pst.executeQuery();

                while(rs.next())
                {                
                    employee_id = rs.getString("employee_id");
                    work_status  = rs.getString("work_status");
                    employee_left_date  = rs.getString("employee_left_date");
                    epf_settled_or_not  = rs.getString("epf_settled_or_not");
                    total_epf  = rs.getString("total_epf");
                    settled_date  = rs.getString("settled_date");
                }

                    if(epf_settled_or_not.equalsIgnoreCase("Yes"))
                    {
                        left_to_working = true;
                        JOptionPane.showMessageDialog(this, "You can't join this employee againunder the same Employee ID. Please create new Employee ID", "Information", JOptionPane.INFORMATION_MESSAGE);
                        
                        eef_cmb_status.setSelectedItem(work_status);                        
                    }
                    else
                    {
                        eef_lbl_ldate.setVisible(false);
                        eef_txt_ldate.setText("");
                        eef_txt_ldate.setVisible(false);

                        eef_lbl_epf.setVisible(false);
                        eef_cmb_epf.setVisible(false);
                        eef_cmb_epf.setSelectedIndex(1);

                        eef_lbl_epf_info.setText("");
                        eef_lbl_epf_info.setVisible(false);

                        eef_lbl_tot_epf.setVisible(false);
                        eef_txt_tot_epf.setVisible(false);

                        eef_lbl_sdate.setVisible(false);
                        eef_txt_sdate.setText("");
                        eef_txt_sdate.setVisible(false);
                    }

                /*JOptionPane.showMessageDialog(this,"eef_txt_ldate : " + eef_txt_ldate.getText().toString());
                JOptionPane.showMessageDialog(this,"eef_cmb_epf : " + eef_cmb_epf.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this,"eef_lbl_epf_info : " + eef_lbl_epf_info.getText().toString());
                JOptionPane.showMessageDialog(this,"eef_txt_tot_epf : " + eef_txt_tot_epf.getText().toString());
                JOptionPane.showMessageDialog(this,"eef_txt_sdate : " + eef_txt_sdate.getText().toString());*/
            }

            if(eef_cmb_status.getSelectedIndex() == 1)
            {
                if(left_to_working == true)
                {
                    eef_lbl_ldate.setVisible(true);
                    eef_txt_ldate.setText(employee_left_date);
                    eef_txt_ldate.setVisible(true);

                    eef_lbl_epf.setVisible(true);
                    eef_cmb_epf.setVisible(true);
                    eef_cmb_epf.setSelectedIndex(0);                                       
                }
                else
                {
                    eef_lbl_ldate.setVisible(true);
                    eef_txt_ldate.setText(formattedDate);
                    eef_txt_ldate.setVisible(true);

                    eef_lbl_epf.setVisible(true);
                    eef_cmb_epf.setVisible(true);
                    eef_cmb_epf.setSelectedIndex(1);
                }
                    
                /*JOptionPane.showMessageDialog(this,"eef_txt_ldate : " + eef_txt_ldate.getText().toString());
                JOptionPane.showMessageDialog(this,"eef_cmb_epf : " + eef_cmb_epf.getSelectedItem().toString());
                JOptionPane.showMessageDialog(this,"eef_lbl_epf_info : " + eef_lbl_epf_info.getText().toString());
                JOptionPane.showMessageDialog(this,"eef_txt_tot_epf : " + eef_txt_tot_epf.getText().toString());
                JOptionPane.showMessageDialog(this,"eef_txt_sdate : " + eef_txt_sdate.getText().toString());*/
            }                   
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eef_cmb_statusActionPerformed

    private void eef_cmb_epfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eef_cmb_epfActionPerformed
        try
        {
            // Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date today = new Date();  
            String formattedDate = dateFormat.format(today);

            if(eef_cmb_epf.getSelectedIndex() == 0)
            {
                if(left_to_working == true)
                {
                    eef_lbl_epf_info.setText("Epf is settled");
                    eef_lbl_epf_info.setVisible(true);
                    Color foregroundColor = Color.decode("#107361");
                    eef_lbl_epf_info.setForeground(foregroundColor);

                    eef_lbl_tot_epf.setVisible(true);
                    eef_txt_tot_epf.setVisible(true);

                    eef_lbl_sdate.setVisible(true);
                    eef_txt_sdate.setText(settled_date);
                    eef_txt_sdate.setVisible(true);
                }
                else
                {
                    eef_lbl_epf_info.setText("Epf is settled");
                    eef_lbl_epf_info.setVisible(true);
                    Color foregroundColor = Color.decode("#107361");
                    eef_lbl_epf_info.setForeground(foregroundColor);

                    eef_lbl_tot_epf.setVisible(true);
                    eef_txt_tot_epf.setVisible(true);

                    eef_lbl_sdate.setVisible(true);
                    eef_txt_sdate.setText(formattedDate);
                    eef_txt_sdate.setVisible(true);
                } 
                left_to_working = false;
            }

            if(eef_cmb_epf.getSelectedIndex() == 1)
            {
                eef_lbl_epf_info.setText("Epf is pending");
                eef_lbl_epf_info.setVisible(true);
                Color foregroundColor = Color.decode("#D92525");
                eef_lbl_epf_info.setForeground(foregroundColor);

                eef_lbl_tot_epf.setVisible(true);
                eef_txt_tot_epf.setVisible(true);

                eef_lbl_sdate.setVisible(false);
                eef_txt_sdate.setText("");
                eef_txt_sdate.setVisible(false);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eef_cmb_epfActionPerformed

    private void eef_lbl_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eef_lbl_imageMouseClicked
         eef_selectImage();
    }//GEN-LAST:event_eef_lbl_imageMouseClicked

    
    
    // Methods ------------------------------------------------------
    
    //Display Employee Details 
    public void eef_displayEmployeeDetails()
    {     
        
        int eid = Integer.parseInt(eef_txt_eid.getText());
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
                eef_txt_name.setText(name);
                eef_cmb_role.setSelectedItem(role);
                eef_txt_nic.setText(nic);
                eef_txt_addr.setText(address);
                eef_txt_br.setText(account_branch);
                eef_txt_acc_no.setText(account_number);
                eef_txt_phone.setText(contact);
                eef_txt_jdate.setText(join_date);
                eef_cmb_status.setSelectedItem(work_status);
                eef_cmb_epf.setSelectedItem(epf_settled_or_not);
                eef_txt_tot_epf.setText(total_epf);
                
                if(work_status.equalsIgnoreCase("Still Working"))
                {
                    eef_txt_ldate.setText("");
                    eef_lbl_ldate.setVisible(false);                    
                    eef_txt_ldate.setVisible(false);                    
                    
                    eef_lbl_epf.setVisible(false);
                    eef_cmb_epf.setVisible(false);
                    
                    eef_lbl_epf_info.setText("");
                    eef_lbl_epf_info.setVisible(false);                                        
                    
                    eef_txt_sdate.setText("");
                    eef_lbl_sdate.setVisible(false);
                    eef_txt_sdate.setVisible(false);                    
                }
                else if(work_status.equalsIgnoreCase("Left"))
                {
                    eef_lbl_ldate.setVisible(true);                    
                    eef_txt_ldate.setVisible(true);
                    eef_txt_ldate.setText(employee_left_date);
                    
                    eef_lbl_epf.setVisible(true);
                    eef_cmb_epf.setVisible(true);
                    
                    if(epf_settled_or_not.equalsIgnoreCase("Yes"))
                    {
                        eef_lbl_epf_info.setText("EPF is Settled");
                        eef_lbl_epf_info.setVisible(true);
                        Color foregroundColor = Color.decode("#107361");
                        eef_lbl_epf_info.setForeground(foregroundColor);
                    
                        eef_txt_tot_epf.setVisible(true);
                        eef_txt_tot_epf.setText(total_epf);
                        
                        eef_txt_sdate.setVisible(true);
                        eef_txt_sdate.setText(settled_date);
                    }
                    else if(epf_settled_or_not.equalsIgnoreCase("No"))
                    {
                        eef_lbl_epf_info.setText("EPF is pending");
                        eef_lbl_epf_info.setVisible(true);
                        Color foregroundColor = Color.decode("#D92525");
                        eef_lbl_epf_info.setForeground(foregroundColor);
                    
                        eef_txt_tot_epf.setVisible(true);
                        eef_txt_tot_epf.setText(total_epf);
                        
                        eef_txt_sdate.setText("");
                        eef_txt_sdate.setVisible(false);                        
                    }
                }

                // Image                
                Blob imageBlob = profile;
                byte[] imageData = imageBlob.getBytes(1, (int) imageBlob.length());

                Image loadedImage = Toolkit.getDefaultToolkit().createImage(imageData);
                Image resizedImage = loadedImage.getScaledInstance(134, 172, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(resizedImage);
                eef_lbl_image.setIcon(resizedIcon);
                                
                                   
        }
        catch(Exception e)
        {
           e.printStackTrace();
           JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }   
    
    //Validation
    public boolean eef_validation()
    {               
        if(eef_txt_name.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Enter Employee Name");
            return false;
        }
        if(eef_cmb_role.getSelectedIndex() == 0)
        {
            JOptionPane.showMessageDialog(this, "Select the Role");
            return false;
        }
        // NIC
        if(eef_txt_nic.getText().equals("") || eef_txt_nic.getText().length() < 10)
        {
            JOptionPane.showMessageDialog(this, "Enter ValidNational Identity Card Number");
            return false;
        }
        else if(eef_txt_nic.getText().length() == 10)
        {
            //JOptionPane.showMessageDialog(this, "Enter Valid National Identity Card Number");
            //return false;
        }
        else if(eef_txt_nic.getText().length() > 10 && eef_txt_nic.getText().length() != 12)
        {
            JOptionPane.showMessageDialog(this, "Enter Valid National Identity Card Number");
            return false;
        }

        if(eef_txt_addr.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Address");
            return false;
        }
        if(eef_txt_br.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Branch");
            return false;
        }
        if(eef_txt_acc_no.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Account Number");
            return false;
        }
        if(eef_txt_phone.getText().equals("") || eef_txt_phone.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(this, "Enter Contact Number");
            return false;
        }
                      
        return true;
    }
    
    // Select Image in Label
    public void eef_selectImage()
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
            eef_lbl_image.setIcon(icon);
            ef_path2 = path;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting records: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    //Insert records to customer Table
    public void eef_updateCustomerDetailstoDb()
    {        
        int eid = Integer.parseInt(eef_txt_eid.getText());
        String name = eef_txt_name.getText();    
        String role = eef_cmb_role.getSelectedItem().toString();
        String nic = eef_txt_nic.getText();
        String addr = eef_txt_addr.getText();
        String br = eef_txt_br.getText();
        String acc_no = eef_txt_acc_no.getText();
        String contact = eef_txt_phone.getText();
        String jdate = eef_txt_jdate.getText();        
        String status = eef_cmb_status.getSelectedItem().toString();
        String ldate = eef_txt_ldate.getText();
        String epf = eef_cmb_epf.getSelectedItem().toString();
        String sdate = eef_txt_sdate.getText();
        
        //Write Code to Serviced_date ..................................... 
        /*Date s_date = ef_jdate.getDate();
        long l =  s_date.getTime();
        java.sql.Date jdate = new java.sql.Date(l);
        String work_status = "Still Working"; */              
        
        try
        {
            Blob profile = null;
            Connection con = DBConnection.getConnection();
            
            String sql = "update employee set name = ? ,role = ? ,nic = ? ,account_number = ? ,account_branch = ? ,address = ? ,contact = ? , join_date = ?, work_status = ?, employee_left_date = ?, epf_settled_or_not = ?, settled_date = ?, profile = ? where employee_id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1,name);
            pst.setString(2,role);  
            pst.setString(3,nic); 
            pst.setString(4,acc_no);              
            pst.setString(5,br); 
            pst.setString(6,addr);
            pst.setString(7,contact); 
            pst.setString(8,jdate); 
            pst.setString(9,status); 
            
            if(status.equalsIgnoreCase("Still Working"))
            {
                pst.setString(10,"0001-01-01"); 
                pst.setString(11,"No"); 
                pst.setString(12,"0001-01-01"); 
            }
            else
            {
                pst.setString(10,ldate);
                pst.setString(11,epf); 
                
                if(epf.equalsIgnoreCase("Yes"))
                {
                    pst.setString(12,sdate); 
                }
                else
                {
                    pst.setString(12,"0001-01-01"); 
                }
            }
            
            // Image
            if(ef_path2 == "")
            {
                if(eef_lbl_image.getIcon() == null)
                {
                    // Method 1 - Get image from Database
                    //InputStream is;
                    //is = new FileInputStream(new File("icon/user.jpeg"));
                    //pst.setBlob(13, is);
                    
                    
                    // Method 2 - Get image from Database
                    Statement st = con.createStatement();
                    String sql2 = "select * from default_img ";            
                    ResultSet rs2 = st.executeQuery(sql2);
                    Blob profile2 = null;
                    while(rs2.next())
                    {                    
                        profile2 = rs2.getBlob("img");
                    }
                    pst.setBlob(13, profile2);  // Set the image data                         //Image 
                    //JOptionPane.showMessageDialog(this,"Profile is empty");
                }
                else
                {
                    Blob profile2 = null;
                    String sql2 = "select * from employee where employee_id = ? ";   
                    PreparedStatement pst2 = con.prepareStatement(sql2);
                    pst2.setInt(1,eid);
                    ResultSet rs2 = pst2.executeQuery();

                    while(rs2.next())
                    {
                        profile2 = rs2.getBlob("profile");
                    }
                    pst.setBlob(13, profile2);
                    //JOptionPane.showMessageDialog(this,"Profile not changed");
                }                    
            }
            else
            {
                InputStream is;
                is = new FileInputStream(new File(ef_path2));
                pst.setBlob(13, is);
                //JOptionPane.showMessageDialog(this,"Profile is changed");
            }
            
            pst.setInt(14,eid);
            
            int updateRowCount = pst.executeUpdate();
            if(updateRowCount>0)
            {
                JOptionPane.showMessageDialog(this, "Employee Details Saved ");
            }
            ef_path2 = "";
            

            
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
            java.util.logging.Logger.getLogger(employee_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee_edit_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee_edit_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ed_txt_epf;
    private javax.swing.JTextField ed_txt_status;
    private javax.swing.JButton eef_btn_cancel;
    private javax.swing.JButton eef_btn_clear;
    public javax.swing.JButton eef_btn_save;
    private rojerusan.RSComboMetro eef_cmb_epf;
    private rojerusan.RSComboMetro eef_cmb_role;
    private rojerusan.RSComboMetro eef_cmb_status;
    private javax.swing.JLabel eef_lbl_acc_no;
    private javax.swing.JLabel eef_lbl_addr;
    private javax.swing.JLabel eef_lbl_br;
    private javax.swing.JLabel eef_lbl_eid;
    private javax.swing.JLabel eef_lbl_epf;
    private javax.swing.JLabel eef_lbl_epf_info;
    private javax.swing.JLabel eef_lbl_image;
    private javax.swing.JLabel eef_lbl_jdate;
    private javax.swing.JLabel eef_lbl_ldate;
    private javax.swing.JLabel eef_lbl_name;
    private javax.swing.JLabel eef_lbl_nic;
    private javax.swing.JLabel eef_lbl_phone;
    private javax.swing.JLabel eef_lbl_role;
    private javax.swing.JLabel eef_lbl_sdate;
    private javax.swing.JLabel eef_lbl_status;
    private javax.swing.JLabel eef_lbl_tot_epf;
    private javax.swing.JTextField eef_txt_acc_no;
    private javax.swing.JTextField eef_txt_addr;
    private javax.swing.JTextField eef_txt_br;
    private javax.swing.JTextField eef_txt_eid;
    private javax.swing.JTextField eef_txt_jdate;
    private javax.swing.JTextField eef_txt_ldate;
    private javax.swing.JTextField eef_txt_name;
    private javax.swing.JTextField eef_txt_nic;
    private javax.swing.JTextField eef_txt_phone;
    private javax.swing.JTextField eef_txt_sdate;
    private javax.swing.JTextField eef_txt_tot_epf;
    private javax.swing.JPanel jPanel13;
    private bizbuilder.Scrollpane scrollpane2;
    // End of variables declaration//GEN-END:variables
}
