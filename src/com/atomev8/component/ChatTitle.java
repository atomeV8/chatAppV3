package com.atomev8.component;

import java.awt.Color;

public class ChatTitle extends javax.swing.JPanel {

    public ChatTitle() {
        initComponents();
    }

    public void setUsername(String name) {
        lblName.setText(name);
    }

    public void setUserOnlineState() {
        lblStatus.setText("Online");
        lblStatus.setForeground(new Color(0, 153, 0));
    }
    
    public void setStatusText(String text){
        lblStatus.setText(text);
        lblStatus.setForeground(new Color(160,160,160));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 249, 249));

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1));

        lblName.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(57, 57, 57));
        lblName.setText("Name");
        jLayeredPane1.add(lblName);

        lblStatus.setForeground(new java.awt.Color(0, 153, 0));
        lblStatus.setText("Online");
        jLayeredPane1.add(lblStatus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
