/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet1;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author xubo
 */
//public class sum {
//    
//}

public class sum extends java.applet.Applet implements ActionListener{
    Label label1 = new Label("+");
    Label label2 = new Label("=");
    TextField field1 = new TextField(6);
    TextField field2 = new TextField(6);
    TextField field3 = new TextField(6);
//    TextField field4= new TextField(5);

    Button button1 = new Button("相加");

    public void init() {
      add(field1);
      add(label1);
      add(field2);
      add(label2);
      add(field3); 
      add(button1);
      button1.addActionListener(this);
      }

    public void actionPerformed(ActionEvent e) {
      // 请在此补充代码，实现求和计算功能
//      int x1=filed1.text;
//      e.
      System.out.print(field1.getText());
      int x = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
      field3.setText(Integer.toString(x));
      }
}