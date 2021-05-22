package LAYOUT;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class Home extends javax.swing.JFrame {

    
    
    public Home() {
        initComponents();

        ImageIcon imgThisImg = new ImageIcon("src\\IDG\\Inventory.jpg");     

        jLabel_BackgroundImage.setIcon(imgThisImg);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_BackgroundImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5_USER_ = new javax.swing.JMenu();
        jMenu5_Category = new javax.swing.JMenu();
        jMenu5_Prod_a = new javax.swing.JMenu();
        jMenu5_Prod_u = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jMenu5_USER_.setBackground(new java.awt.Color(0, 51, 153));
        jMenu5_USER_.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5_USER_.setText("Felhasználók |");
        jMenu5_USER_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5_USER_.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu5_USER_.setOpaque(true);
        jMenu5_USER_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5_USER_MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5_USER_);

        jMenu5_Category.setBackground(new java.awt.Color(0, 51, 153));
        jMenu5_Category.setBorder(null);
        jMenu5_Category.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5_Category.setText("Kategóriák |");
        jMenu5_Category.setActionCommand("Kategóriák");
        jMenu5_Category.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5_Category.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu5_Category.setOpaque(true);
        jMenu5_Category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5_CategoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5_Category);

        jMenu5_Prod_a.setBackground(new java.awt.Color(0, 51, 153));
        jMenu5_Prod_a.setBorder(null);
        jMenu5_Prod_a.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5_Prod_a.setText("Termékek_Admin |");
        jMenu5_Prod_a.setActionCommand("Prod_a");
        jMenu5_Prod_a.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5_Prod_a.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu5_Prod_a.setOpaque(true);
        jMenu5_Prod_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5_Prod_a1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5_Prod_a);

        jMenu5_Prod_u.setBackground(new java.awt.Color(0, 51, 153));
        jMenu5_Prod_u.setBorder(null);
        jMenu5_Prod_u.setForeground(new java.awt.Color(255, 255, 255));
        jMenu5_Prod_u.setText("Termékek |");
        jMenu5_Prod_u.setActionCommand("Prod_u");
        jMenu5_Prod_u.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5_Prod_u.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu5_Prod_u.setOpaque(true);
        jMenu5_Prod_u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5_Prod_uMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5_Prod_u);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_BackgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_BackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5_USER_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5_USER_MouseClicked
        
         Users_L Userp = new Users_L();
                Userp.pack();
                Userp.setVisible(true);
                Userp.setLocationRelativeTo(null);
                Userp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu5_USER_MouseClicked

    private void jMenu5_CategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5_CategoryMouseClicked
        Category_L categoryForm = new Category_L();
                categoryForm.pack();
                categoryForm.setVisible(true);
                categoryForm.setLocationRelativeTo(null);
                categoryForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu5_CategoryMouseClicked

    private void jMenu5_Prod_a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5_Prod_a1MouseClicked
        // TODO add your handling code here:
        PRODUCTS_Admin productForm = new PRODUCTS_Admin();
                productForm.pack();
                productForm.setVisible(true);
                productForm.setLocationRelativeTo(null);
                productForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu5_Prod_a1MouseClicked

    private void jMenu5_Prod_uMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5_Prod_uMouseClicked
        // TODO add your handling code here:
        PRODUCTS_User productForm = new PRODUCTS_User();
                productForm.pack();
                productForm.setVisible(true);
                productForm.setLocationRelativeTo(null);
                productForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu5_Prod_uMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel_BackgroundImage;
    public javax.swing.JMenu jMenu5_Category;
    public javax.swing.JMenu jMenu5_Prod_a;
    public javax.swing.JMenu jMenu5_Prod_u;
    public javax.swing.JMenu jMenu5_USER_;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
