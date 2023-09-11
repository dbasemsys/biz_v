package bizbuilder;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class customer_details extends javax.swing.JFrame {

    // ... Other components ...

    public customer_details() {
        initComponents();
        setCustomerDetails();
        Detail_panel.setVisible(false);
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
                        populateDetailView(selectedRow);
                    }
                }
            }
        });
    }
    
    private void populateDetailView(int selectedRow) {
        // Retrieve data from the JTable model for the selected row
        
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
                cd_lbl_shop_ser.setVisible(true);
                cd_lbl_order_ser_exp.setVisible(false);
                cd_lbl_order_ser.setVisible(false);
                cd_lbl_dis.setVisible(true);
                cd_txt_dis.setVisible(true);
                Offered_table.setVisible(true);
                Order_table.setVisible(false);
                Order_exp_table.setVisible(false);
                Detail_panel.setVisible(true);
                setShopServiceDetails(c_id);            //  Calling Shop Service Deatils Method with Parameter
    
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
                setOrderServiceDetails(c_id);           //  Calling Ordering Service Details Method with Parameter
                setOrderServiceExpenseDetails(c_id);    //  Calling Ordering Service Expense Method with Parameter
            }
        }
    }

   //Set Customer Details into Table   
    public void setCustomerDetails()
    {     
        DefaultTableModel model;
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
    public void setShopServiceDetails(int x)
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
    public void setOrderServiceDetails(int x)
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
    public void setOrderServiceExpenseDetails(int x)
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane2 = new javax.swing.JScrollPane();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        cd_tbl_order_ser = new javax.swing.JTable();
        cd_btn_edit = new javax.swing.JButton();
        cd_txt_dis = new javax.swing.JTextField();
        cd_lbl_dis = new javax.swing.JLabel();
        scrollpane1 = new bizbuilder.Scrollpane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_customer = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane2.setViewportView(cd_tbl_shop_ser);
        if (cd_tbl_shop_ser.getColumnModel().getColumnCount() > 0) {
            cd_tbl_shop_ser.getColumnModel().getColumn(0).setMinWidth(200);
            cd_tbl_shop_ser.getColumnModel().getColumn(1).setMinWidth(80);
        }

        Offered_table.setViewportView(jScrollPane2);

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
        if (cd_tbl_order_ser_exp.getColumnModel().getColumnCount() > 0) {
            cd_tbl_order_ser_exp.getColumnModel().getColumn(0).setMinWidth(200);
            cd_tbl_order_ser_exp.getColumnModel().getColumn(1).setMinWidth(80);
        }

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
        jScrollPane3.setViewportView(cd_tbl_order_ser);
        if (cd_tbl_order_ser.getColumnModel().getColumnCount() > 0) {
            cd_tbl_order_ser.getColumnModel().getColumn(0).setMinWidth(200);
            cd_tbl_order_ser.getColumnModel().getColumn(1).setMinWidth(80);
        }

        Order_table.setViewportView(jScrollPane3);

        cd_btn_edit.setBackground(new java.awt.Color(102, 102, 255));
        cd_btn_edit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        cd_btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit 16px.png"))); // NOI18N
        cd_btn_edit.setText("Edit");
        cd_btn_edit.setBorderPainted(false);

        cd_txt_dis.setEditable(false);
        cd_txt_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_txt_dis.setForeground(new java.awt.Color(102, 102, 255));
        cd_txt_dis.setBorder(null);

        cd_lbl_dis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cd_lbl_dis.setText("Discount");

        javax.swing.GroupLayout Detail_panelLayout = new javax.swing.GroupLayout(Detail_panel);
        Detail_panel.setLayout(Detail_panelLayout);
        Detail_panelLayout.setHorizontalGroup(
            Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Detail_panelLayout.createSequentialGroup()
                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Detail_panelLayout.createSequentialGroup()
                        .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Detail_panelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cd_lbl_shop_ser)
                                    .addComponent(cd_lbl_br)
                                    .addComponent(cd_lbl_cid)
                                    .addComponent(cd_lbl_cname)
                                    .addComponent(cd_lbl_phone)
                                    .addComponent(cd_lbl_type)
                                    .addComponent(cd_lbl_date)))
                            .addGroup(Detail_panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cd_lbl_order_ser_exp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cd_txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_cname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cd_txt_br, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cd_txt_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Detail_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(cd_btn_edit))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Detail_panelLayout.createSequentialGroup()
                                .addComponent(cd_lbl_dis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cd_txt_dis, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        Detail_panelLayout.setVerticalGroup(
            Detail_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Detail_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cd_btn_edit)
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

        getContentPane().add(scrollpane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 500, 500));

        scrollpane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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
        jScrollPane1.setViewportView(tbl_customer);
        if (tbl_customer.getColumnModel().getColumnCount() > 0) {
            tbl_customer.getColumnModel().getColumn(0).setMinWidth(150);
            tbl_customer.getColumnModel().getColumn(1).setMinWidth(250);
        }

        scrollpane1.setViewportView(jScrollPane1);

        getContentPane().add(scrollpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_customerMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbl_customerMouseClicked

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
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Detail_panel;
    private bizbuilder.Scrollpane Offered_table;
    private bizbuilder.Scrollpane Order_exp_table;
    private bizbuilder.Scrollpane Order_table;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private bizbuilder.Scrollpane scrollpane1;
    private bizbuilder.Scrollpane scrollpane2;
    private rojeru_san.complementos.RSTableMetro tbl_customer;
    // End of variables declaration//GEN-END:variables
}
