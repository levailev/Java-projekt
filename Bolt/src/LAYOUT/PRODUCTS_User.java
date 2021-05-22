package LAYOUT;

import CLASSES.Category;
import CLASSES.DB_INFO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



public class PRODUCTS_User extends javax.swing.JFrame {
    public Integer productId;
    Integer position = 0;
    public PRODUCTS_User() {
        
        initComponents();
       
        populateJtable("");
        
        jTable_Products.setShowGrid(true);
        
        jTable_Products.setGridColor(Color.YELLOW);
        
        
        jTable_Products.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_Products.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    public void populateJtable(String val){
        
        CLASSES.Product prd = new CLASSES.Product();
        ArrayList<CLASSES.Product> ProductList = prd.productsList(val);
        
        String[] colNames = {"Azonosító","Név","Ár","Mennyiség","Raktárhely","Kategória"};
        Object[][] rows = new Object[ProductList.size()][7];
        
        for(int i = 0; i < ProductList.size(); i++){
            rows[i][0] = ProductList.get(i).getId();
            rows[i][1] = ProductList.get(i).getName();
            rows[i][2] = ProductList.get(i).getPrice();
            rows[i][3] = ProductList.get(i).getQuantity();
            rows[i][4] = ProductList.get(i).getPlace();
            rows[i][5] = ProductList.get(i).getCategoryName(ProductList.get(i).getId());

        }
        
        DefaultTableModel mmodel = new DefaultTableModel(rows, colNames);
        jTable_Products.setModel(mmodel);
        jTable_Products.setRowHeight(80);
        jTable_Products.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable_Products.getColumnModel().getColumn(4).setPreferredWidth(120);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Products = new javax.swing.JTable();
        jTextField_VALUE_TO_SEARCH = new javax.swing.JTextField();
        jButton_SEARCH_ = new javax.swing.JButton();
        jButton_REFRESH_ = new javax.swing.JButton();
        jButton_ADD_PRODUCT = new javax.swing.JButton();
        jButton_NEG_PRODUCT1 = new javax.swing.JButton();
        jTextField_Quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Form_Title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Products);

        jTextField_VALUE_TO_SEARCH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_SEARCH_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SEARCH_.setText("Keresés");
        jButton_SEARCH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCH_ActionPerformed(evt);
            }
        });

        jButton_REFRESH_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_REFRESH_.setText("Frissítés");
        jButton_REFRESH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_REFRESH_ActionPerformed(evt);
            }
        });

        jButton_ADD_PRODUCT.setBackground(new java.awt.Color(0, 255, 0));
        jButton_ADD_PRODUCT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton_ADD_PRODUCT.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ADD_PRODUCT.setText("+");
        jButton_ADD_PRODUCT.setToolTipText("Valami");
        jButton_ADD_PRODUCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ADD_PRODUCTMouseClicked(evt);
            }
        });

        jButton_NEG_PRODUCT1.setBackground(new java.awt.Color(255, 0, 0));
        jButton_NEG_PRODUCT1.setFont(new java.awt.Font("Ebrima", 1, 48)); // NOI18N
        jButton_NEG_PRODUCT1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_NEG_PRODUCT1.setText("-");
        jButton_NEG_PRODUCT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_NEG_PRODUCT1MouseClicked(evt);
            }
        });

        jTextField_Quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_QuantityKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mennyiség:");

        jLabel_Form_Title.setBackground(new java.awt.Color(0, 51, 153));
        jLabel_Form_Title.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("kezelőfelület");
        jLabel_Form_Title.setToolTipText("");
        jLabel_Form_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setOpaque(true);

        jLabel_Form_Title1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel_Form_Title1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Form_Title1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title1.setText("Dolgozói");
        jLabel_Form_Title1.setToolTipText("");
        jLabel_Form_Title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Form_Title1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_ADD_PRODUCT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_NEG_PRODUCT1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_VALUE_TO_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_REFRESH_, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_SEARCH_)
                            .addComponent(jTextField_VALUE_TO_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_REFRESH_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Form_Title1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_ADD_PRODUCT)
                            .addComponent(jButton_NEG_PRODUCT1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCH_ActionPerformed
        populateJtable(jTextField_VALUE_TO_SEARCH.getText());
    }//GEN-LAST:event_jButton_SEARCH_ActionPerformed

    private void jButton_REFRESH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REFRESH_ActionPerformed
        populateJtable("");
    }//GEN-LAST:event_jButton_REFRESH_ActionPerformed

    private void jButton_ADD_PRODUCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ADD_PRODUCTMouseClicked
        CLASSES.Product Prod = new CLASSES.Product();
                CLASSES.Category category = new CLASSES.Category();
                
                Integer rowIndex = jTable_Products.getSelectedRow();
                
                HashMap<String, Integer> map = category.populateCombo();
                
                productId = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 0).toString());
                String name = jTable_Products.getValueAt(rowIndex, 1).toString();
                String price = jTable_Products.getValueAt(rowIndex, 2).toString();
                String place = jTable_Products.getValueAt(rowIndex, 4).toString();
                Integer quantity = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 3).toString())+Integer.valueOf(jTextField_Quantity.getText());
                Integer catId = map.get(jTable_Products.getValueAt(rowIndex, 5).toString());
                
                Prod = new CLASSES.Product(productId,name,catId,price,quantity,place,null);
                
                CLASSES.Product.updateProduct(Prod);
                populateJtable("");                
    }//GEN-LAST:event_jButton_ADD_PRODUCTMouseClicked

    private void jButton_NEG_PRODUCT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_NEG_PRODUCT1MouseClicked
        
        
                CLASSES.Product Prod = new CLASSES.Product();
                CLASSES.Category category = new CLASSES.Category();
                
                Integer rowIndex = jTable_Products.getSelectedRow();
                
                HashMap<String, Integer> map = category.populateCombo();
                
                
                
                if(Integer.valueOf(jTable_Products.getValueAt(rowIndex, 3).toString())-Integer.valueOf(jTextField_Quantity.getText()) < 0){
                    JOptionPane.showMessageDialog(null, "A mennyiség nem lehet kisebb mint 0!", "", 1);
                }
                else
                {
                productId = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 0).toString());
                String name = jTable_Products.getValueAt(rowIndex, 1).toString();
                String price = jTable_Products.getValueAt(rowIndex, 2).toString();
                String place = jTable_Products.getValueAt(rowIndex, 4).toString();
                Integer quantity = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 3).toString())-Integer.valueOf(jTextField_Quantity.getText());
                Integer catId = map.get(jTable_Products.getValueAt(rowIndex, 5).toString());
                
                Prod = new CLASSES.Product(productId,name,catId,price,quantity,place,null);
                
                CLASSES.Product.updateProduct(Prod);
                populateJtable(""); 
                }
                                                           
    }//GEN-LAST:event_jButton_NEG_PRODUCT1MouseClicked

    private void jTextField_QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuantityKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_QuantityKeyTyped

    private void jTable_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProductsMouseClicked
        //Integer rowIndex = jTable_CATEGORIES_.getSelectedRow();
        //jTextField_CATEGORY_ID.setText(jTable_CATEGORIES_.getValueAt(rowIndex, 0).toString());
        //jTextField_CATEGORY_NAME.setText(jTable_CATEGORIES_.getValueAt(rowIndex, 1).toString());
        
        
        //position = rowIndex;
    }//GEN-LAST:event_jTable_ProductsMouseClicked

    
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
            java.util.logging.Logger.getLogger(PRODUCTS_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCTS_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCTS_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCTS_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTS_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD_PRODUCT;
    private javax.swing.JButton jButton_NEG_PRODUCT1;
    private javax.swing.JButton jButton_REFRESH_;
    private javax.swing.JButton jButton_SEARCH_;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Form_Title1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Products;
    public javax.swing.JTextField jTextField_Quantity;
    private javax.swing.JTextField jTextField_VALUE_TO_SEARCH;
    // End of variables declaration//GEN-END:variables
}
