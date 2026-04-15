package FoodApplication;
import java.awt.Color;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class Cart extends javax.swing.JFrame {
    private static Cart instance;
    private JTable cartTable;
    public Cart() {
        initComponents();
        Color col =new Color(242,242,242);
        getContentPane().setBackground(col);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("FoodIcon.jpg")).getImage());        
        cartTable = new JTable(new DefaultTableModel(new Object[]{"Item ID", "Name", "Price"}, 0));
        add(new JScrollPane(cartTable));
        Connect();
        LoadData();
    }
    private static final String username = "root";
    private static final String password = "pass123";
    private static final String dataConnection = "jdbc:mysql://localhost:3306/item";
    Connection con = null; 
    PreparedStatement pst = null;
    ResultSet rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paybtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodItemsTable = new javax.swing.JTable();
        addquantitybtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        subtractquantitybtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FOOD ORDERING APPLICATION");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cart");

        paybtn.setBackground(new java.awt.Color(204, 204, 204));
        paybtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        paybtn.setText("Proceed to Payment");
        paybtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                .addComponent(paybtn)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(paybtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deletebtn.setBackground(new java.awt.Color(0, 102, 102));
        deletebtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("REMOVE FROM CART");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(0, 102, 102));
        addbtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD MORE ITEMS");
        addbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        foodItemsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(foodItemsTable);

        addquantitybtn.setBackground(new java.awt.Color(0, 102, 102));
        addquantitybtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        addquantitybtn.setForeground(new java.awt.Color(255, 255, 255));
        addquantitybtn.setText("+");
        addquantitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addquantitybtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");

        subtractquantitybtn.setBackground(new java.awt.Color(0, 102, 102));
        subtractquantitybtn.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        subtractquantitybtn.setForeground(new java.awt.Color(255, 255, 255));
        subtractquantitybtn.setText("-");
        subtractquantitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractquantitybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(addbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtractquantitybtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addquantitybtn)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(deletebtn)
                    .addComponent(addquantitybtn)
                    .addComponent(jLabel2)
                    .addComponent(subtractquantitybtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        UserDashboard ud = new UserDashboard();
        ud.setVisible(true);
        dispose();
    }//GEN-LAST:event_addbtnActionPerformed
  public static Cart getInstance() {
        if (instance == null) {
            instance = new Cart();
        }
         instance.LoadData();
        return instance;
    }

    public JTable getCartTable() {
        return cartTable;
    }
    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
             int selectedRow = foodItemsTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRow != -1) {
        // Assuming the first column contains the ID
        int itemId = (int) foodItemsTable.getValueAt(selectedRow, 0);


        try {
            // Connect to the database
            con = DriverManager.getConnection(dataConnection, username, password);

            // SQL query to delete the item from the cart table
            String sql = "DELETE FROM cart WHERE id = ?";

            pst = con.prepareStatement(sql);
            pst.setInt(1, itemId);

            // Execute the delete
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                // Remove the row from the table model
                DefaultTableModel model = (DefaultTableModel) foodItemsTable.getModel();
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Item deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "No item found with that ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting item: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select an item to delete.");
    }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed
        Payment pay = new Payment();
        pay.setVisible(true);
       try {
        con = DriverManager.getConnection(dataConnection, username, password);

        // Step 1: Select all items from cart
        String selectSQL = "SELECT itemname, prize, quantity FROM cart";
        pst = con.prepareStatement(selectSQL);
        rs = pst.executeQuery();

        // Step 2: Insert each item into ordercheckout with total price
        String insertSQL = "INSERT INTO ordercheckout (itemname, prize, quantity, totalprice) VALUES (?, ?, ?, ?)";
        PreparedStatement insertStmt = con.prepareStatement(insertSQL);

        while (rs.next()) {
            String itemname = rs.getString("itemname");
            double prize = rs.getDouble("prize");
            double quantity = rs.getDouble("quantity");
            double totalprice = prize * quantity;

            insertStmt.setString(1, itemname);
            insertStmt.setDouble(2, prize);
            insertStmt.setDouble(3, quantity);
            insertStmt.setDouble(4, totalprice);
            insertStmt.addBatch();
        }

        insertStmt.executeBatch();
        insertStmt.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error during checkout: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        dispose();
    }//GEN-LAST:event_paybtnActionPerformed

    private void addquantitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addquantitybtnActionPerformed
       int selectedRow = foodItemsTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRow != -1) {
        
        int itemId = (int) foodItemsTable.getValueAt(selectedRow, 0);
        double currentQuantity = (double) foodItemsTable.getValueAt(selectedRow, 3);

        double newQuantity = currentQuantity + 1.0;


        try {
            // Connect to the database using predefined connection variables
            con = DriverManager.getConnection(dataConnection, username, password);

            // SQL query to update the quantity
            String sql = "UPDATE cart SET quantity = ? WHERE id = ?";

            pst = con.prepareStatement(sql);
            pst.setDouble(1, newQuantity);
            pst.setInt(2, itemId);

            // Execute the update
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                LoadData(); 
            for (int i = 0; i < foodItemsTable.getRowCount(); i++) {
            if ((int) foodItemsTable.getValueAt(i, 0) == itemId) {
            foodItemsTable.setRowSelectionInterval(i, i);
        break;
    }
}

            } else {
                JOptionPane.showMessageDialog(null, "Failed to update quantity.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating quantity: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select an item to increase quantity.");
    }
    }//GEN-LAST:event_addquantitybtnActionPerformed

    private void subtractquantitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractquantitybtnActionPerformed
        int selectedRow = foodItemsTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRow != -1) {
        // Assuming the first column is 'id' and the fourth column is 'quantity'
        int itemId = (int) foodItemsTable.getValueAt(selectedRow, 0);
        double currentQuantity = (double) foodItemsTable.getValueAt(selectedRow, 3);

        // Prevent quantity from going below 1
        if (currentQuantity <= 1.0) {
            JOptionPane.showMessageDialog(null, "Quantity cannot be less than 1.");
            return;
        }

        double newQuantity = currentQuantity - 1.0;

        try {
            // Connect to the database using predefined connection variables
            con = DriverManager.getConnection(dataConnection, username, password);

            // SQL query to update the quantity
            String sql = "UPDATE cart SET quantity = ? WHERE id = ?";

            pst = con.prepareStatement(sql);
            pst.setDouble(1, newQuantity);
            pst.setInt(2, itemId);

            // Execute the update
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                LoadData(); // Reload table data from the database
                 for (int i = 0; i < foodItemsTable.getRowCount(); i++) {
            if ((int) foodItemsTable.getValueAt(i, 0) == itemId) {
            foodItemsTable.setRowSelectionInterval(i, i);
        break;
    }
                 }
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update quantity.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating quantity: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select an item to decrease quantity.");
    }
    }//GEN-LAST:event_subtractquantitybtnActionPerformed
    public javax.swing.JTable getTable() {
        return foodItemsTable;
    }
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
            pst = con.prepareStatement("SELECT * FROM cart");
            rs = pst.executeQuery();
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Item Name", "Price","Quantity"}, 0);
            while (rs.next()) {
                int id = rs.getInt("id");
                String itemname = rs.getString("itemname");
                double prize = rs.getDouble("prize");
                double quantity = rs.getDouble("quantity");
                model.addRow(new Object[]{id, itemname, prize,quantity});
            }
            foodItemsTable.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data Load Failed: " + ex);
        }
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton addquantitybtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTable foodItemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton paybtn;
    private javax.swing.JButton subtractquantitybtn;
    // End of variables declaration//GEN-END:variables
}
