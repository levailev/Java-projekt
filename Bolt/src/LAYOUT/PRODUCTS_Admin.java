package LAYOUT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;



public class PRODUCTS_Admin extends javax.swing.JFrame {
    public Integer productId;
  
    public PRODUCTS_Admin() {
        
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
        jTable_Products.setRowHeight(60);
        jTable_Products.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable_Products.getColumnModel().getColumn(4).setPreferredWidth(120);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_INSERT_PRODUCT_ = new javax.swing.JButton();
        jButton_UPDATE_PRODUCT_ = new javax.swing.JButton();
        jButton_DELETE_PRODUCT_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Products = new javax.swing.JTable();
        jTextField_VALUE_TO_SEARCH = new javax.swing.JTextField();
        jButton_SEARCH_ = new javax.swing.JButton();
        jButton_REFRESH_ = new javax.swing.JButton();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Form_Title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jButton_INSERT_PRODUCT_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_INSERT_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_PRODUCT_.setText("Új termék");
        jButton_INSERT_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_PRODUCT_ActionPerformed(evt);
            }
        });

        jButton_UPDATE_PRODUCT_.setBackground(new java.awt.Color(65, 131, 215));
        jButton_UPDATE_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_UPDATE_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UPDATE_PRODUCT_.setText("Kiválasztott termék módosítása");
        jButton_UPDATE_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_PRODUCT_ActionPerformed(evt);
            }
        });

        jButton_DELETE_PRODUCT_.setBackground(new java.awt.Color(246, 36, 89));
        jButton_DELETE_PRODUCT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_DELETE_PRODUCT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_PRODUCT_.setText("Kiválasztott termék törlése");
        jButton_DELETE_PRODUCT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_PRODUCT_ActionPerformed(evt);
            }
        });

        jTable_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
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

        jLabel_Form_Title.setBackground(new java.awt.Color(0, 51, 153));
        jLabel_Form_Title.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("kezelőfelület");
        jLabel_Form_Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setOpaque(true);

        jLabel_Form_Title1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel_Form_Title1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Form_Title1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title1.setText("Boltvezető");
        jLabel_Form_Title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DELETE_PRODUCT_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_INSERT_PRODUCT_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_UPDATE_PRODUCT_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Form_Title)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_VALUE_TO_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_SEARCH_, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_REFRESH_, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jLabel_Form_Title1)
                    .addContainerGap(960, Short.MAX_VALUE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel_Form_Title)
                        .addGap(102, 102, 102)
                        .addComponent(jButton_INSERT_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_UPDATE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton_DELETE_PRODUCT_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel_Form_Title1)
                    .addContainerGap(487, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton_INSERT_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_PRODUCT_ActionPerformed
              Product_Add addProductForm = new Product_Add();
                addProductForm.pack();
                addProductForm.setVisible(true);
                addProductForm.setLocationRelativeTo(null);
                addProductForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton_INSERT_PRODUCT_ActionPerformed

    
    private void jButton_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCH_ActionPerformed
   populateJtable(jTextField_VALUE_TO_SEARCH.getText());
    }//GEN-LAST:event_jButton_SEARCH_ActionPerformed

    
    
    private void jButton_UPDATE_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_PRODUCT_ActionPerformed
       try{

            
            Product_Edit editProductForm = new Product_Edit();

            Integer rowIndex = jTable_Products.getSelectedRow();

            editProductForm.productId = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 0).toString());
            editProductForm.jTextField_Name.setText(jTable_Products.getValueAt(rowIndex, 1).toString());
            editProductForm.jTextField_Price.setText(jTable_Products.getValueAt(rowIndex, 2).toString());
            editProductForm.jTextField_Quantity.setText(jTable_Products.getValueAt(rowIndex, 3).toString());
            editProductForm.jTextField_Place.setText(jTable_Products.getValueAt(rowIndex, 4).toString());

            editProductForm.jComboBox1.setSelectedItem(jTable_Products.getValueAt(rowIndex, 5));

          

            editProductForm.setVisible(true);
                    editProductForm.pack();
                    editProductForm.setLocationRelativeTo(null);
                    editProductForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }catch(Exception Ex){
            JOptionPane.showMessageDialog(null, "A tábláből kell terméket kiválasztania!", "Nincs kiválasztott termék!", 2);
        }
    }//GEN-LAST:event_jButton_UPDATE_PRODUCT_ActionPerformed

    
   
    private void jButton_DELETE_PRODUCT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_PRODUCT_ActionPerformed
     try{
            Integer rowIndex = jTable_Products.getSelectedRow();
            Integer id = Integer.valueOf(jTable_Products.getValueAt(rowIndex, 0).toString());
            CLASSES.Product.deleteProduct(id);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Válassz ki egy terméket a táblából!", "Nincs kiválasztott termék!", 2);
        }
    }//GEN-LAST:event_jButton_DELETE_PRODUCT_ActionPerformed

    
    
    private void jButton_REFRESH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_REFRESH_ActionPerformed
        populateJtable("");
    }//GEN-LAST:event_jButton_REFRESH_ActionPerformed

    
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
            java.util.logging.Logger.getLogger(PRODUCTS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRODUCTS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRODUCTS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRODUCTS_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRODUCTS_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DELETE_PRODUCT_;
    private javax.swing.JButton jButton_INSERT_PRODUCT_;
    private javax.swing.JButton jButton_REFRESH_;
    private javax.swing.JButton jButton_SEARCH_;
    private javax.swing.JButton jButton_UPDATE_PRODUCT_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Form_Title1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Products;
    private javax.swing.JTextField jTextField_VALUE_TO_SEARCH;
    // End of variables declaration//GEN-END:variables
}
