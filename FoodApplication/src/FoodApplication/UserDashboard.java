package FoodApplication;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class UserDashboard extends javax.swing.JFrame {
    public UserDashboard() {
        initComponents();
        Color col =new Color(242,242,242);
        getContentPane().setBackground(col);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("FoodIcon.jpg")).getImage());
        Connect();
        LoadData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cartbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addtocartbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOOD ORDERING APPLICATION");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER DASHBOARD");

        cartbtn.setBackground(new java.awt.Color(204, 204, 204));
        cartbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        cartbtn.setText("CART");
        cartbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                .addComponent(cartbtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cartbtn))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setText("MENU:");

        addtocartbtn.setBackground(new java.awt.Color(0, 102, 102));
        addtocartbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        addtocartbtn.setForeground(new java.awt.Color(255, 255, 255));
        addtocartbtn.setText("Add to Cart");
        addtocartbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addtocartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(0, 102, 102));
        backbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addtocartbtn)
                                .addGap(17, 17, 17))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtocartbtn)
                    .addComponent(backbtn))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private static final String username = "root";
    private static final String password = "pass123";
    private static final String dataConnection = "jdbc:mysql://localhost:3306/item";
        
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        MainPage mp = new MainPage();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void cartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbtnActionPerformed
        Cart cart = new Cart();
        cart.setVisible(true);
        dispose();
    }//GEN-LAST:event_cartbtnActionPerformed

    private void addtocartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbtnActionPerformed
      try {
        // Step 1: Get selected row from foodItemsTable (should be from the main dashboard, not from Cart)
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an item to add to the cart.");
            return;
        }

        // Step 2: Extract item data from the selected row
        String itemName = jTable1.getValueAt(selectedRow, 1).toString();
        String itemPrice = jTable1.getValueAt(selectedRow, 2).toString();
        double price = Double.parseDouble(itemPrice);

        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/item", "root", "pass123");
        pst = con.prepareStatement("SELECT * FROM cart WHERE itemname = ?");
        pst.setString(1, itemName);
        rs = pst.executeQuery();

        if (rs.next()) {
            // Item already exists in cart, increment quantity
            PreparedStatement updateStmt = con.prepareStatement("UPDATE cart SET quantity = quantity + 1 WHERE itemname = ?");
            updateStmt.setString(1, itemName);
            updateStmt.executeUpdate();
            updateStmt.close();
        } else {
            // Get next available ID starting from 1
            int nextId = 1;
            Statement idStmt = con.createStatement();
            ResultSet idRs = idStmt.executeQuery("SELECT MAX(id) FROM cart");
            if (idRs.next() && idRs.getInt(1) > 0) {
                nextId = idRs.getInt(1) + 1;
            }
            idRs.close();
            idStmt.close();

            // Insert new item with manually managed id
            PreparedStatement insertStmt = con.prepareStatement("INSERT INTO cart (id, itemname, prize, quantity) VALUES (?, ?, ?, ?)");
            insertStmt.setInt(1, nextId);
            insertStmt.setString(2, itemName);
            insertStmt.setDouble(3, price);
            insertStmt.setInt(4, 1);
            insertStmt.executeUpdate();
            insertStmt.close();
        }

        rs.close();
        pst.close();
        con.close();

        // Step 4: Add to Cart JFrame view
        Cart cartFrame = Cart.getInstance();
        JTable cartTable = cartFrame.getCartTable();
        DefaultTableModel cartModel = (DefaultTableModel) cartTable.getModel();
        cartModel.addRow(new Object[]{itemName, itemPrice});

        JOptionPane.showMessageDialog(this, "Item added to cart.");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error adding item to cart: " + e.getMessage());
    }
    }//GEN-LAST:event_addtocartbtnActionPerformed
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
            pst = con.prepareStatement("SELECT * FROM fooditems");
            rs = pst.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Item Name", "Price", "Description"}, 0);
            while (rs.next()) {
                int id = rs.getInt("id");
                String itemname = rs.getString("itemname");
                double prize = rs.getDouble("prize");
                String description = rs.getString("description");
                model.addRow(new Object[]{id, itemname, prize, description});
            }
            jTable1.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data Load Failed: " + ex);
        }
    }
     @Override
    public void setVisible(boolean visible) {
    super.setVisible(visible);
    jTable1.setDefaultEditor(Object.class, null); // disables editing
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocartbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cartbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
