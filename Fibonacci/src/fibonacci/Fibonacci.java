/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author ryanprescott
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("How many numbers do you want to generate?");
        int n = scan.nextInt();
        scan.close();
        System.out.println("\nIterative Fibonacci");
        long start_iterative = System.nanoTime();
        fib_iterative(n);
        long finish_iterative = System.nanoTime();
        System.out.println("\nRecursive Fibonacci");
        long start_recursive = System.nanoTime();
        fib_recursive(0, 0, 1, n);
        long finish_recursive = System.nanoTime();
        System.out.println("Iterative time " + (finish_iterative - start_iterative) + " nanoseconds");
        System.out.println("Recursive time " + (finish_recursive - start_recursive) + " nanoseconds");
    }
    
    public static void fib_iterative(int n){
        int prev = 0;
        int curr = 0;
        int next = 0;
        int counter = 1;
        while(counter <= n){
            if(prev == 0){
                System.out.println(next);
                prev = 1;
                //next = 1;
            }
            else {
                next = prev + curr;
                prev = curr;
                curr = next;
                System.out.println(next);
            }
            counter ++;
        }
    }
    
    public static void fib_recursive(int prev, int next, int counter, int n){
        System.out.println(next);
        if(next == 0){
            counter ++;
            fib_recursive(next, 1, counter, n);
        }
        else if (counter < n){
            counter ++;
            fib_recursive(next, next + prev, counter, n);
        }
             
    }
    
}
