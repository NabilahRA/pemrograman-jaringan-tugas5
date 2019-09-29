/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linenumber;

import com.sun.istack.internal.logging.Logger;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;
import java.util.logging.Level;

/**
 *
 * @author asus
 */
public class ReadFileReader {
    public static void main(String args[]){
        
        Scanner br = new Scanner (System.in);
        try {
            int desimal;
            char ascii;
            
            String line = null;
            int wordCount = 0;
            int characterCount = 0;
            
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("coba.txt"));
            
            Scanner br2 = new Scanner(System.in);
            System.out.print("Masukkan kata :");
            String input = br2.next();
            
//            while ((desimal = lineNumberReader.read()) != -1) {
//                ascii = (char) desimal;
//                System.out.println("" + ascii + " at line " + lineNumberReader.getLineNumber());
//            }
            while((line = lineNumberReader.readLine()) != null){
                String[] wordList = line.split("\\s+");
                characterCount += line.length();
                wordCount += wordList.length;
                
                for(int i=0; i<wordList.length; i++){
                    String word = wordList[i];
                    if (input.equals(word)){
                        System.out.println("" + word + "at Line " +(lineNumberReader.getLineNumber() -1));
                    }
                }
            }
            lineNumberReader.close();
            System.out.println("");
            System.out.println("Jumlah Kata     : " +wordCount);
            System.out.println("Jumlah Karakter : "+characterCount);
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReadFileReader.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(ReadFileReader.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}