/*
 * appletTest1.java
 *
 * Created on 2016年3月27日, 上午12:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package applettest;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author xubo
 */
public class appletTest1 extends Applet {
    int x=0,y=0;
    public void init(){
       String s1=getParameter("girl");
       String s2=getParameter("boy");
       x=Integer.parseInt(s1);
       y=Integer.parseInt(s2);
    }
    public void paint(Graphics g){
    g.drawString("x="+x+"y="+y,90,20);
    }
    /** Creates a new instance of appletTest1 */
//    public appletTest1() {
//    }
    
    
    
}
