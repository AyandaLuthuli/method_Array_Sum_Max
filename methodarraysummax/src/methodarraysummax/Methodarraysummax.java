/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodarraysummax;
import  java.util.Scanner;
/**
 *
 * @author ayand
 */
public class Methodarraysummax {
 static Scanner scanner=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] array=new int[10];

        fill(array);
        print(array);
       
        System.out.println();
        System.out.println("The sum is "+sum(array));
      
         System.out.println("Max number is "+max(array));
        
          double total=sum(array);
          System.out.println("average is  "+ average(total));
         
         
    }
    public static  void fill(int []x){
        for (int i = 0; i < 10; i++) {
            System.out.println("enter mark "+ i);   
           x[i]=scanner.nextInt();
          
    }
        }

     public  static void print(int []x){
 
  for (int i = 0; i < 10; i++) {
            System.out.print(x[i] + " ");   
         
        }
 
 }
    
    public static int sum(int [] x){
    int sum=0;
        for (int i = 0; i < 10; i++) {
            sum+=x[i];
        }
    return sum;
    }
    
    
    public  static  double  average(double  t ){
    double av=0;
        
     av=t/10;
    
       return av;
    }
  
    public static int max(int[]x){
    int big=x[0];
    
        for (int i = 0; i < 10; i++) {
            if (x[i]>big) {
              big=x[i];
            }
        }
    
    
    return big;
    }
    
    }
    
    
    
    