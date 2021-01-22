/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsexample;

import java.util.Scanner;

public class LoopsExample {

    public static void main(String[] args) {
       
        int num=10;//fact=10*9*8*7*6*5*4*3*2*1
        int factorial=1;
        
        for (int i = num; i > 1; i--) {
            factorial=factorial*i;
            //factorial*=i;     
        }
        System.out.println("Factorial is "+factorial);
        
        for (int i = 1; i <= 10; i++) {
            
            if(i<5){
                System.out.println(i);
            }
            else{
                
            }
            
        }
        //break
        System.out.println("break");
        for (int i = 0; i < 10; i++) {
            
            if(i==5){
                break;
                 
            }
            System.out.println("value of i "+i);
            
        }
        
        System.out.println("Continue");
        //continue
        for (int i = 0; i < 10; i++) {
            if(i>=5){
               continue;
       
            }
            System.out.println("value of i "+i);
        }
        //increment greater than 1
        for (int i = 1; i <= 20; i+=3) {//i=i+3
            System.out.println("Numbers "+i);
            
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("ENter any 10 numbers ");
        int num1;
//        for (int i = 1; i <= 10; i++) {
//            num1= scan.nextInt();
//            if(num1%2 == 0){
//                System.out.println(num1++ +" is even");
//            }
//            else{
//                System.out.println(num1 +" is odd");
//            }
//        }
        int num2=5;
        int count=0;
        for (int i = 1; i <=10; i++) {
            num1= scan.nextInt();//6
            if(num1 == num2){
                count++;//1,2,3
            }
           
        }
       
        System.out.println("count "+count);
    }
    
}
