/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.util.Calendar;


/**
 *
 * @author xubo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     private int year,month,day,age;
    public Main(int y,int m,int d){
        // TODO code application logic here

//       private int year,month,day,age;
       year=y;
       month=(((m>=1)&(m<12))?m:1);
       day=(((d>=1)&(d<31))?d:1);
//       month=m;
//       day=d;
       age = Calendar.getInstance().get(Calendar.YEAR) - year;
    }
    public static void main(String[] args) { 
        Main main=new Main(1984,11,2);
//        main.year
        System.out.println("a" + main.year + "a" + main.month +"a"+ main.day + "a" + main.age + "a");
//        sout 
}
    
}
