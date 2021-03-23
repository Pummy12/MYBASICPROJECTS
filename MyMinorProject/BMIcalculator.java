/*Author_PUMMYJHA
MY FIRST BASIC PROJECT
JAVA CODE TO MAKE A SUCCESSFUL BMI CALCULATOR WHERE WEIGHT IS IN POUNDS AND
 HEIGHT IS IN INCHES
 FORMULA USED:-
 BMI=WEIGHT * 703 / HEIGHT (SQUARED) */

import java.util.*;
class BMIcalculator
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        double weight;
        double height;
        double BMI;
        System.out.println("ENTER YOUR WEIGHT:");
        weight=sc.nextDouble();
        System.out.println("ENTER YOUR HEIGHT:");
        height=sc.nextDouble();
        BMI=(weight * 703) / (height * height);
        if(BMI < 18.5){
        System.out.println("YOU ARE UNDERWEIGHT !");
        }
        else if(BMI < 26)
        {
        System.out.println("YOU HAVE OPTIMAL WEIGHT !");  
        }
        else{
        System.out.println("YOU ARE OVERWEIGHT !");   
        }
    }
}