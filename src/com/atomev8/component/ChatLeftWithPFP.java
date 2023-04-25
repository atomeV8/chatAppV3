package com.atomev8.component;

import java.awt.Color;
import javax.swing.Icon;

public class ChatLeftWithPFP extends javax.swing.JLayeredPane {

    public ChatLeftWithPFP() {
        initComponents();
        text.setBackground(new Color(219, 244, 255));
    }
    
    public void setText(String text){
        if(text.equals((""))){
            this.text.hideText();
        }else
            this.text.setText(text);
    }
    
    public void setImage(Icon ...image){
        text.setImage(false, image);
    }
    
    public void setTime(){
        text.setTime("10:30 PM");
    }
    
    public void setUserProfile(String user){
        this.text.setUserProfile(user);
    }
    
    public void setPFP(Icon image){
        pfp.setImage(image);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pfp = new com.atomev8.swing.ImageAvatar();
        text = new com.atomev8.component.ChatItem();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        pfp.setBorderSize(0);
        pfp.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/testing/ozzmwubudbg91.jpg"))); // NOI18N
        pfp.setMinimumSize(new java.awt.Dimension(40, 40));
        pfp.setPreferredSize(new java.awt.Dimension(40, 40));

        jLayeredPane1.setLayer(pfp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pfp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jLayeredPane1);

        text.setBackground(new java.awt.Color(255, 255, 255));
        add(text);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.atomev8.swing.ImageAvatar pfp;
    private com.atomev8.component.ChatItem text;
    // End of variables declaration//GEN-END:variables
}
