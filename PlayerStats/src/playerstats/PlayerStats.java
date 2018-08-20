/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnwashington
 */
public class PlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] scores = new int[80];
       String [] names = new String [80];
       readData(scores, names, args[0]);
       System.out.println(names[1] + " " + scores[1]);
    }
    
    public static void readData(int [] scores, String [] names, String file) {
        Scanner reader;
        
        try {
            reader = new Scanner(new File(file));
            int currentIndex =0;
           while(reader.hasNext()) {
               String [] line = reader.nextLine().split(" ");
               names[currentIndex] = line[0];
               scores[currentIndex] = Integer.parseInt(line[1]);
              currentIndex ++; 
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    } 
    
}
