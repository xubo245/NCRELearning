/*
 * PanelTest.java
 *
 * Created on 2016年3月26日, 下午11:22
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author xubo
 */
public class PanelTest {
    
    /** Creates a new instance of PanelTest */
    public PanelTest() {
    }
    
    public static void main(String[] args) {
        Frame f1=new Frame();
        Panel p1=new Panel();
        f1.add(p1);
//        p1.setTT
        p1.setLocation(100,100);
        p1.setBackground(Color.red);
        f1.setBounds(200,200,300,300);
        p1.setSize(400,400);
        p1.setName("hello");
        f1.setLayout(new FlowLayout());
        f1.addWindowListener(new WindowListener() {
            public void windowActivated(WindowEvent e) {
            }
            public void windowClosed(WindowEvent e) {
            }
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
            public void windowDeactivated(WindowEvent e) {
            }
            public void windowDeiconified(WindowEvent e) {
            }
            public void windowIconified(WindowEvent e) {
            }
            public void windowOpened(WindowEvent e) {
            }
        });
        f1.setVisible(true);
    }
    
}
