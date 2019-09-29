/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linenumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class ReadFile {
    public static void main(String args[]){
        Scanner br = new Scanner(System.in);
        Scanner br2 = new Scanner(System.in);
        
        try{
            int desimal;
            char ascii;
            int decimal;
            char asdii;
            
            System.out.println("Masukkan lokasi file    :");
            String input = br.nextLine();
            
           // LineNumberInputStream inputStream = new LineNumberInputStream(new FileInputStream("coba.txt));
            LineNumberInputStream inputStream = new LineNumberInputStream(new FileInputStream(input));
            
            while ((desimal = inputStream.read()) != -1) {
            ascii = (char) desimal;
            System.out.println("" + ascii + " at line " + inputStream.getLineNumber());
        }
            System.out.println("=======================");
            System.out.println("Jumlah Baris    :"+ (inputStream.getLineNumber()+1));
            
            LineNumberInputStream inputStream2 = new LineNumberInputStream(new FileInputStream(input));
            System.out.println("Letak baris dari karakter    :");
            String karakter = br2.nextLine();
            
            while ((decimal = inputStream2.read()) != -1) {
                char c = karakter.charAt(0);
                asdii = (char) decimal;
                
                if(c == asdii){
                    System.out.println("" + asdii + " at line " + (inputStream2.getLineNumber()+1));
                }
            }
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
}
