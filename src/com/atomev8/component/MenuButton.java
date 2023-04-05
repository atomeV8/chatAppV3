/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atomev8.component;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author CP-20MAB
 */
public class MenuButton extends JButton{
    public void setIconSimple(Icon iconSimple){
        this.iconSimple = iconSimple;
    }
    public Icon getIconSimple(){
        return iconSimple;
    }
    public void setIconSelected(Icon iconSelected){
        this.iconSelected = iconSelected;
    }
    public Icon getIconSelected(){
        return iconSelected;
    }
    private Icon iconSimple;
    private Icon iconSelected;
    
    public MenuButton(){
        setContentAreaFilled(false);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    @Override
    public void setSelected(boolean bln){
        super.setSelected(bln);
        if(bln){
            setIcon(iconSelected);
            
        }
        else{
            setIcon(iconSimple);
        }
    }
    
    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);
        if(isSelected()){
            grphcs.setColor(new Color(110,213,255));
            grphcs.fillRect(0, getHeight() - 3, getWidth(), getHeight());
        }
    }
}
