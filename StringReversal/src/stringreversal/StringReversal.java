/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreversal;

import java.util.Arrays;
/**
 *
 * @author John Ryan Prescott - johnryanprescott@gmail.com
 * 5 August 2019
 * StringReversal -> reverses words in string by " " delimiter
 */
public class StringReversal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String target = "hello this is a reversed string ";
        String[] words = target.split(" ");
        String output = "";
        for (int i = words.length - 1; i >= 0; i --) {
            output = output + words[i] + " ";
        }
        System.out.println(output);
    }
    
}
