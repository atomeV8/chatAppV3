package com.atomev8.component;
import com.atomev8.swing.ScrollBar;
import java.awt.Adjustable;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

public class ChatBody extends javax.swing.JPanel {

    public ChatBody() {
        initComponents();
        init();
//        addDateSeparation("2 avril 2023");
        addItemRight("ghuoeahguioe agie gaeub");
//        addItemLeft("gwr gegeg3 g4rgt 45 hz4ew4hj4rhj4 r", "Frank");
//        addDateSeparation("3 avril 2023");
//        addItemRight("ghuoeahguioe agie gaeub");
//        addItemLeft("gwr gegeg3 g4rgt 45 hz4ew4hj4rhj4 r", "Frank");
//        addDateSeparation("4 avril 2023");
//        addItemRight("ghuoeahguioe agie gaeub");
//        addItemLeft("gwr gegeg3 g4rgt 45 hz4ew4hj4rhj4 r", "Frank");
//        addDateSeparation("5 avril 2023");
//        addItemRight("ghuoeahguioe agie gaeub");
//        addItemLeft("gwr gegeg3 g4rgt 45 hz4ew4hj4rhj4 r", "Frank", new ImageIcon(getClass().getResource("/com/atomev8/icon/testing/ozzmwubudbg91.jpg")));
//        addDateSeparation("Today");
//        addItemRight("ghuoeahguioe agie gaeub", new ImageIcon(getClass().getResource("/com/atomev8/icon/testing/ozzmwubudbg91.jpg")));
//        String img[] = {"LIA]:Q9sR$fP~DI:WpaxISo#oga}", "L23vR4?wkDNLM{WFadjX008^aexZ"};
//        addItemLeft("", "Gaspard", img);
//        addItemRight("", new ImageIcon(getClass().getResource("/com/atomev8/icon/testing/testImage2.jpg")));
//        addItemRight("", new ImageIcon(getClass().getResource("/com/atomev8/icon/testing/testImage3.jpg")));
//        addFileItemLeft("", "Fredo", "trololol.exe", "32.6 MB");
//        addFileItemRight("", "trololol.exe", "32.6 MB");
    }

    private void init(){
        body.setLayout(new MigLayout("fillx", "", "5[]5"));
        scrollPane.setVerticalScrollBar(new ScrollBar());
    }
    
    public void addItemLeft(String text, String user, Icon... image){
        ChatLeftWithPFP item = new ChatLeftWithPFP();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        updateBody();
    }
    
    public void addItemLeft(String text, String user, String[] image){
        ChatLeftWithPFP item = new ChatLeftWithPFP();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        updateBody();
    }
    
    public void addFileItemLeft(String text, String user, String fileName, String fileSize){
        ChatLeftWithPFP item = new ChatLeftWithPFP();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        body.add(item, "wrap, w 100::80%");
        updateBody();
    }
    
    public void addFileItemRight(String text, String fileName, String fileSize){
        ChatRight item = new ChatRight();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        body.add(item, "wrap, al right, w 100:: 80%");
        updateBody();
        scrollToBottom();
    }
    
    public void addItemRight(String text, Icon ...image){
        ChatRight item = new ChatRight();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        body.add(item, "wrap, al right, w 100:: 80%");
        updateBody();
        scrollToBottom();
    }
    
    public void addItemRight(String text, String[] image){
        ChatRight item = new ChatRight();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        body.add(item, "wrap, al right, w 100:: 80%");
        updateBody();
        scrollToBottom();
    }
    
    public void addDateSeparation(String date){
        ChatDate d = new ChatDate();
        d.setDate(date);
        body.add(d, "wrap, al center");
        updateBody();
    }
    
    private void updateBody(){
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

    private void scrollToBottom(){
        JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener(){
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
