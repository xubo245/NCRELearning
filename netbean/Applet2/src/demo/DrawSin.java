/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author xubo
 */
public class DrawSin extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
//    public void init() {
//        // TODO start asynchronous download of heavy resources
//    }
    
public void paint(Graphics g) {
        super.paint(g);
        double d, tx;
        int x, y, x0, y0;
        d = Math.PI / 100;
        x0 = y0 = 0;
        for (tx = 0, x = 20; tx <= 2 * Math.PI; tx += d,x++) {
        y = 120 - (int)(Math.sin(tx) * 50 + 60);
        if (x > 20)
                g.drawLine(x0, y0, x, y);
//                g.drawLine(x0, y0, x0, y0);
                x0 = x;
                y0 = y;
        g.drawString("y = sin (x)", 10, 70);
       }
}
    // TODO overwrite start(), stop() and destroy() methods
}
