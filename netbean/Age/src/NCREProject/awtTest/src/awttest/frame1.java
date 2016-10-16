/*
 * frame1.java
 *
 * Created on 2016年3月26日, 下午6:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package awttest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author xubo
 */
public class frame1 {
    
    /** Creates a new instance of frame1 */
    public frame1() {
    }
    public static void main(String[] args){
        System.out.println("hello");
        Frame f1=new Frame();
        f1.setBounds(200,200,400,400);
        final TextField t1=new TextField(20);
        Button b1=new Button("转移");
        final TextArea t2=new TextArea(10,40);
        f1.setTitle("数据转移");
        f1.setLayout(new FlowLayout());
        f1.add(t1);
        f1.add(b1);
        f1.add(t2);
//        f1.addWindowListener(new WindowAdapter() {
//           public void windowClosing(){
//               System.exit(0); 
//           }
//        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              final  String s1=t1.getText().trim();
              t1.setText("");
              t1.requestFocus();
              final String s2;
              t2.append(s1+"\n");
//              t2.setText(t2.getText().trim()+s1+"\n");
            }
        });
        
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
        
//        f1.setBounds(200,200,200,100);
        f1.setVisible(true);
        
        
        
    }
    
}
