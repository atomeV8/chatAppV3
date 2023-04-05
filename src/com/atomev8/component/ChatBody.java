package com.atomev8.component;
import com.atomev8.swing.ScrollBar;
import net.miginfocom.swing.MigLayout;

public class ChatBody extends javax.swing.JPanel {

    public ChatBody() {
        initComponents();
        init();
        addItemRight("ghuoeahguioe agie gaeub");
        addItemLeft("gwr gegeg3 g4rgt 45 hz4ew4hj4rhj4 r", "Frank");
    }

    private void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        scrollPane.setVerticalScrollBar(new ScrollBar());
    }
    
    public void addItemLeft(String text, String user){
        ChatLeftWithPFP item = new ChatLeftWithPFP();
        item.setText(text);
        item.setUserProfile(user);
        body.add(item, "wrap, w ::75%");
        body.repaint();
        body.revalidate();
    }
    
    public void addItemRight(String text){
        ChatRight item = new ChatRight();
        item.setText(text);
        body.add(item, "wrap, al right, w :: 75%");
        body.repaint();
        body.revalidate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        body = new javax.swing.JPanel();

        scrollPane.setBorder(null);
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        scrollPane.setViewportView(body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
