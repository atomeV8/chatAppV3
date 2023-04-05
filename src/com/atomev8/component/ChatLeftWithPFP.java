package com.atomev8.component;

import java.awt.Color;

public class ChatLeftWithPFP extends javax.swing.JLayeredPane {

    public ChatLeftWithPFP() {
        initComponents();
        text.setBackground(new Color(219, 244, 255));
    }
    
    public void setText(String text){
        this.text.setText(text);
        this.text.setTime("10:31 PM");
    }
    
    public void setUserProfile(String user){
        this.text.setUserProfile(user);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new com.atomev8.component.ChatItem();

        text.setBackground(new java.awt.Color(255, 255, 255));

        setLayer(text, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.atomev8.component.ChatItem text;
    // End of variables declaration//GEN-END:variables
}
