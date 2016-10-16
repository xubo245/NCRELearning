/*
 * buttonColor.java
 *
 * Created on 2016年3月26日, 下午8:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author xubo
 */
public class buttonColor {
    
    /** Creates a new instance of buttonColor */
    public buttonColor() {
    }
    public static void main(String args[]){
        System.out.println("helo");
        final Frame f1=new Frame();
        Button redButton=new Button();
        Button blueButton=new Button();
        Button greenButton=new Button();
        Button otherButton=new Button();
        f1.setLayout( new FlowLayout());
        f1.add(redButton);
        f1.add(blueButton);
        f1.add(greenButton);
        f1.add(otherButton);
        redButton.setLabel("红色");
        blueButton.setLabel("蓝色");
        greenButton.setLabel("绿色");
        otherButton.setLabel("复原");
        
        redButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
              f1.setBackground(Color.red);
            }
            public void mouseExited(MouseEvent e){
            f1.setBackground(Color.WHITE);
            }
        });
        
          blueButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
              f1.setBackground(Color.blue);
            }
            public void mouseExited(MouseEvent e){
            f1.setBackground(Color.WHITE);
            }
        });
        
          greenButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
              f1.setBackground(Color.green);
            }
            public void mouseExited(MouseEvent e){
            f1.setBackground(Color.WHITE);
            }
        });
        
         otherButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
              f1.setBackground(Color.white);
            }
            public void mouseExited(MouseEvent e){
            f1.setBackground(Color.WHITE);
            }
        });
//        redButton.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                    f1.setBackground(Color.RED);
//             }
//        });
//        
//         blueButton.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                    f1.setBackground(Color.blue);
//             }
//        });
//        
//         greenButton.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                    f1.setBackground(Color.green);
//             }
//        });
//        
//         otherButton.addMouseListener(new MouseAdapter() {
//             public void mouseClicked(MouseEvent e) {
//                    f1.setBackground(Color.WHITE);
//             }
//        });
        
        f1.setTitle("更改背景颜色");
        f1.setBounds(200,200,400,300);
        f1.addWindowListener(new WindowAdapter() {
            @Override
            final public void windowClosing( WindowEvent e) {
                System.exit(0);
            }
        });
        
        f1.setVisible(true);
        
    }
    
}
