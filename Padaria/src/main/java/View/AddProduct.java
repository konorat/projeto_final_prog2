/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import model.Product;
import model.dao.ProductDAO;

/**
 *
 * @author Levy
 */
public class AddProduct extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddAluno
     */
    public AddProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameFIeld = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        nameFIeld.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nameFIeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFIeldActionPerformed(evt);
            }
        });

        priceField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceLabel.setText("Preço");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Nome");

        insertBtn.setText("Cadastrar");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Sair");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(priceLabel)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertBtn)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn)
                    .addComponent(exitBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFIeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFIeldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFIeldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        Product p = new Product();
        ProductDAO dao = new ProductDAO();
        
        p.setName(nameFIeld.getText());
        p.setPrice(priceField.getText());
        
        dao.create(p);
        
    }//GEN-LAST:event_insertBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JTextField nameFIeld;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}