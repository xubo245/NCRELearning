/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
import java.io.*;
/**
 *
 * @author xubo
 */
public class floder {
    public static void main(String[] args) {
    File myDir = new File("C:\\Program Files");
    System.out.print(myDir+(myDir.isDirectory()?"是":"不是")+"一个目录");
 }
}



