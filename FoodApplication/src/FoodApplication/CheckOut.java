package FoodApplication;
import java.awt.Color;
import javax.swing.*;
import FoodClasses.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class CheckOut extends javax.swing.JFrame {
    public CheckOut(Customer customer) {
        initComponents();
        Color col1 =new Color(242,242,242);
        getContentPane().setBackground(col1);
        Color col =new Color(0,102,102);
        contacttxt.setBackground(col);
        customertxt.setBackground(col); 
        setLocationRelativeTo(null);
        Admin admin = new Admin();
        admin.setEmail("foodorderingcomplain@gmail.com");
        admin.setContact("3133389038");
        contacttxt.setText(admin.displayInfo());
        customertxt.setText(customer.displayInfo());
        setIconImage(new ImageIcon(getClass().getResource("FoodIcon.jpg")).getImage());
        Connect();
        LoadData();
    }
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gotomenubtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customertxt = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paymenttxt = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        contacttxt = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        ordereditemtable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOOD ORDERING APPLICATION");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Summary");

        gotomenubtn.setBackground(new java.awt.Color(204, 204, 204));
        gotomenubtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        gotomenubtn.setText("Go to Menu");
        gotomenubtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gotomenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotomenubtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gotomenubtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(gotomenubtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setText("Ordered Items:");

        jScrollPane2.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        customertxt.setColumns(20);
        customertxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        customertxt.setRows(5);
        customertxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        customertxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        customertxt.setEnabled(false);
        jScrollPane2.setViewportView(customertxt);

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel3.setText("Customer's Information:");

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("If you have any complaint, contact us:");

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 13)); // NOI18N
        jLabel5.setText("Payment Amount:");

        paymenttxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        paymenttxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paymenttxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        paymenttxt.setEnabled(false);
        paymenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymenttxtActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(0, 102, 102));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

        contacttxt.setColumns(20);
        contacttxt.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        contacttxt.setRows(5);
        contacttxt.setAutoscrolls(false);
        contacttxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contacttxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        contacttxt.setEnabled(false);
        jScrollPane3.setViewportView(contacttxt);

        ordereditemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(ordereditemtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(paymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel4)))))
                .addContainerGap(285, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final String username = "root";
    private static final String password = "pass123";
    private static final String dataConnection = "jdbc:mysql://localhost:3306/item";
    private void gotomenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotomenubtnActionPerformed
        UserDashboard ud = new UserDashboard();
        ud.setVisible(true);
        clearCartTable();
        clearOrderCheckoutTable();
        dispose();
        
    }//GEN-LAST:event_gotomenubtnActionPerformed

    private void paymenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymenttxtActionPerformed

    }//GEN-LAST:event_paymenttxtActionPerformed
 public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataConnection, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Connection Failed: " + ex);
        }
    }
   public void LoadData() {
   try {
    pst = con.prepareStatement("SELECT * FROM ordercheckout");
    rs = pst.executeQuery();
    DefaultTableModel model = new DefaultTableModel(new String[]{"Item Name", "Price", "Quantity", "Total Price"}, 0);
    while (rs.next()) {
        String itemname = rs.getString("itemname");
        double prize = rs.getDouble("prize");
        double quantity = rs.getDouble("quantity");
        double totalprice = rs.getDouble("totalprice");
        model.addRow(new Object[]{itemname, prize, quantity, totalprice});
    }
    ordereditemtable.setModel(model);
    pst.close();
        rs.close();

        String sumSql = "SELECT SUM(totalprice) AS total FROM ordercheckout";
        pst = con.prepareStatement(sumSql);
        rs = pst.executeQuery();

        double totalAmount = 0.0;
        if (rs.next()) {
            totalAmount = rs.getDouble("total");
        }

        // Assuming you have a JTextField named paymenttxt for showing total amount
        paymenttxt.setText(String.format("%.2f", totalAmount));
        }
        catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Data Load Failed: " + ex);
        }
    }
   public void clearOrderCheckoutTable() {
    Connection con = null;
    PreparedStatement pst = null;
    try {
        con = DriverManager.getConnection(dataConnection, username, password);
        String sql = "DELETE FROM ordercheckout";
        pst = con.prepareStatement(sql);
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error clearing order data: " + e.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

@Override
protected void processWindowEvent(java.awt.event.WindowEvent e) {
    if (e.getID() == java.awt.event.WindowEvent.WINDOW_CLOSING) {
        clearOrderCheckoutTable();
        clearCartTable();
    }
    super.processWindowEvent(e);
}
public void clearCartTable() {
    Connection con = null;
    PreparedStatement pst = null;
    try {
        con = DriverManager.getConnection(dataConnection, username, password);
        String sql = "DELETE FROM cart";
        pst = con.prepareStatement(sql);
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error clearing cart table: " + e.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
@Override
public void setVisible(boolean visible) {
    super.setVisible(visible);
    ordereditemtable.setDefaultEditor(Object.class, null); // disables editing
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contacttxt;
    private javax.swing.JTextArea customertxt;
    private javax.swing.JButton gotomenubtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable ordereditemtable;
    private javax.swing.JTextField paymenttxt;
    // End of variables declaration//GEN-END:variables
}
