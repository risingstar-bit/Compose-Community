import java.util.Scanner;


//Check Leap Year Or Not

//Every year that is exactly divisible by four is a leap year, except for years
// that are exactly divisible by 100, but these centurial years are leap years
// if they are exactly divisible by 400. For example, the years 1700, 1800, and 1900 are
// not leap years, but the years 1600 and 2000 are.


public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();
        boolean leap;
        if(year%4==0){
            leap=true;
            if(year%100!=0)
                leap=true;
            else
                leap=false;
            if(year%400==0)
                leap=true;
            if(leap==true)
                System.out.println(year+" is a leap year");
            else
                System.out.println(year+" is not a leap year");
        }
        else
            System.out.println(year+" is not a leap year");

    }
}