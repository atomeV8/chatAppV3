/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.atomev8.form;

import com.atomev8.component.Item_Person;
import com.atomev8.swing.ScrollBar;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author CP-20MAB
 */
public class Menu_Left extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Left
     */
    public Menu_Left() {
        initComponents();
        init();
    }

    private void init() {
        scrollPanel.setVerticalScrollBar(new ScrollBar());
        menuList.setLayout(new MigLayout("fillx", "0[]0", "0[]0"));
        showPrivateMessages();
    }

    private void showPrivateMessages() {
        menuList.removeAll();
        for (int i = 0; i < 20; i++) {
            menuList.add(new Item_Person("Person " + i), "wrap");
        }
        refreshList();
    }

    private void showGroupMessages() {
        menuList.removeAll();
        for (int i = 0; i < 10; i++) {
            menuList.add(new Item_Person("Group " + i), "wrap");
        }
        refreshList();
    }

    private void refreshList() {
        menuList.repaint();
        menuList.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JLayeredPane();
        privateMsgButton = new com.atomev8.component.MenuButton();
        groupMsgButton = new com.atomev8.component.MenuButton();
        scrollPanel = new javax.swing.JScrollPane();
        menuList = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(249, 249, 249));

        menu.setBackground(new java.awt.Color(229, 229, 229));
        menu.setOpaque(true);
        menu.setLayout(new java.awt.GridLayout(1, 2));

        privateMsgButton.setBackground(new java.awt.Color(229, 229, 229));
        privateMsgButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/message_selected.png"))); // NOI18N
        privateMsgButton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/message_selected.png"))); // NOI18N
        privateMsgButton.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/message.png"))); // NOI18N
        privateMsgButton.setSelected(true);
        privateMsgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privateMsgButtonActionPerformed(evt);
            }
        });
        menu.add(privateMsgButton);

        groupMsgButton.setBackground(new java.awt.Color(229, 229, 229));
        groupMsgButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/group.png"))); // NOI18N
        groupMsgButton.setIconSelected(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/group_selected.png"))); // NOI18N
        groupMsgButton.setIconSimple(new javax.swing.ImageIcon(getClass().getResource("/com/atomev8/icon/group.png"))); // NOI18N
        groupMsgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupMsgButtonActionPerformed(evt);
            }
        });
        menu.add(groupMsgButton);

        scrollPanel.setBackground(new java.awt.Color(249, 249, 249));
        scrollPanel.setBorder(null);
        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        menuList.setBackground(new java.awt.Color(249, 249, 249));

        javax.swing.GroupLayout menuListLayout = new javax.swing.GroupLayout(menuList);
        menuList.setLayout(menuListLayout);
        menuListLayout.setHorizontalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menuListLayout.setVerticalGroup(
            menuListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void privateMsgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privateMsgButtonActionPerformed
        if (!privateMsgButton.isSelected()) {
            privateMsgButton.setSelected(true);
            groupMsgButton.setSelected(false);
            showPrivateMessages();
        }
    }//GEN-LAST:event_privateMsgButtonActionPerformed

    private void groupMsgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupMsgButtonActionPerformed
        if (!groupMsgButton.isSelected()) {
            privateMsgButton.setSelected(false);
            groupMsgButton.setSelected(true);
            showGroupMessages();
        }
    }//GEN-LAST:event_groupMsgButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.atomev8.component.MenuButton groupMsgButton;
    private javax.swing.JLayeredPane menu;
    private javax.swing.JLayeredPane menuList;
    private com.atomev8.component.MenuButton privateMsgButton;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}
