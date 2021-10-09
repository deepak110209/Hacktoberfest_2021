package com.company;
import java.time.Year;
import  java.util.Scanner ;

public class LeapYear
{
 public static  void main(String [ ] args)
 {
     int year ;
     System.out.println("Enter the year");
     Scanner sc  = new Scanner(System.in);
     year = sc.nextInt();

     if (year%2!=0)
     {
         System.out.println(year + " is not a leap year ");
     }
     else
         System.out.println(year + " is  a leap year ");

 }
}
