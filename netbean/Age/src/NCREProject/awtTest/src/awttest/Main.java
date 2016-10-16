/*
 * Main.java
 *
 * Created on 2016年3月26日, 下午4:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package awttest;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//import java.awt.Button;
//import java.awt.Frame;

/**
 *
 * @author xubo
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello NCRE");
        Button b1=new Button();
        Button b2=new Button();
        Frame f1=new Frame("hello frame");
        f1.setTitle("hello Frame");
        b1.setSize(20,20);
        b1.setLabel("按钮");
        b2.setLabel("exit");
        f1.add(b1);
        f1.add(b2);
        f1.setLayout(new FlowLayout());
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
        f1.setBounds(200,300,100,200);
        f1.setVisible(true);
        
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        
        f1.addWindowListener(new WindowAdapter() {
//            @Override 
           public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
//        f1.addWindowListener(new WindowListener() {
//            public void windowActivated(WindowEvent e) {
//            }
//            public void windowClosed(WindowEvent e) {
//                
//            }
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//            public void windowDeactivated(WindowEvent e) {
//            }
//            public void windowDeiconified(WindowEvent e) {
//            }
//            public void windowIconified(WindowEvent e) {
//            }
//            public void windowOpened(WindowEvent e) {
//            }
//        });
        
    }
    
}
