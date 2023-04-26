package com.atomev8.swing;

import javax.print.CancelablePrintJob;
import javax.swing.Icon;
import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;

public class Progress extends JProgressBar{

    private ProgressType type = ProgressType.NONE;
    
    public Progress(){
        setOpaque(false);
        setUI(new ProgressCircleUI(this));
    }
    
    public static enum ProgressType{
        NONE,
        DOWNLOAD,
        CANCEL,
        FILE
    }

    public ProgressType getType() {
        return type;
    }

    public void setType(ProgressType type) {
        this.type = type;
        repaint();
    }
}
