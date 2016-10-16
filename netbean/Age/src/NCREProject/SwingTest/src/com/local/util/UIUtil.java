/*
 * UIUtil.java
 *
 * Created on 2016年3月26日, 下午10:18
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.local.util;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author xubo
 */
public class UIUtil {
    
    /** Creates a new instance of UIUtil */
    public UIUtil() {
    }
    
    public static  void setCenter(JFrame f){
        Toolkit tk=Toolkit.getDefaultToolkit();
        int widthF=f.getWidth();
        int higthF=f.getHeight();
        double widthWindow=tk.getScreenSize().getWidth();
        double higthWindow=tk.getScreenSize().getHeight();
//        System.out.println(widthF+"--"+higthF);
        int width=(int)(widthWindow - widthF)/2;
        int higth=(int)(higthWindow - higthF)/2;
        f.setLocation(width,higth);
    }
    
}
