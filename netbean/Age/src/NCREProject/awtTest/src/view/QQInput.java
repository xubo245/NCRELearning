/*
 * QQInput.java
 *
 * Created on 2016年3月26日, 下午9:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package view;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author xubo
 */
public class QQInput {
    
    /** Creates a new instance of QQInput */
    public QQInput() {
    }
    public static  void main(String args[]){
        Frame f1=new Frame("QQ");
        f1.setBounds(200,200,500,300);
        
        Label l1=new Label();
        l1.setText("input QQ");
        TextField t1=new TextField(60);
        
        f1.add(l1);
        f1.add(t1);
        f1.setLayout(new FlowLayout());
        
        f1.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(!(e.getKeyChar()<='9'&&e.getKeyChar()>='0')) e.consume();
            }
            
        });
        f1.setVisible(true);
    }
    
}
