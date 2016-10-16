/*
 * Main.java
 *
 * Created on 2016年3月19日, 下午8:54
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package test;

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
          int x=10;
          test(x);
          System.out.print(x);
    }
    public static void test(int x){
        x=x*3;
    }
}
