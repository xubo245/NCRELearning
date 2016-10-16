/*
 * FileTest.java
 *
 * Created on 2016年3月26日, 下午9:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package view;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 *
 * @author xubo
 */
public class FileTest_1 {
    
    /** Creates a new instance of FileTest */
    public FileTest_1() {
    }
    public static void main(String[] args){
       final Frame f1=new Frame("QQ");
        f1.setBounds(200,200,500,300);
        final String title1=f1.getTitle();
        MenuBar m1=new MenuBar();
        Menu m2=new Menu("文件");
        Menu m3=new Menu("更改名称");
//        MenuItem i1=new MenuItem("更改名称");
        MenuItem i2=new MenuItem("打开记事本");
        final MenuItem i3=new MenuItem("退出系统");
        final MenuItem i4=new MenuItem("打开文件");
        
        final MenuItem i11=new MenuItem("好好学习");
        final MenuItem i12=new MenuItem("天天向上");
        final MenuItem i13=new MenuItem("恢复标题");
        
        FileDialog d1;
//        d1=new FileDialog(null,"保存文件",FileDialog.SAVE);
        
        m2.add(m3);
        m3.add(i11);
        m3.add(i12);
        m3.add(i13);
        m2.add(i2);
        m2.add(i3);
        m1.add(m2);
//        f1.add(m1);
        f1.setMenuBar(m1);
        
        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            Runtime r1=Runtime.getRuntime();
                try {
                    r1.exec("notepad");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        i11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setTitle(i11.getLabel());
            }
        });
        
           i12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setTitle(i12.getLabel());
            }
        });
        
           i13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setTitle(title1);
            }
        });
        
        f1.setLayout(new FlowLayout());
        f1.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
         i3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                  System.exit(0);
             }
         });
        
        
        
        f1.setVisible(true);
    }
    
}
