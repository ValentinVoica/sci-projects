package ro.sci.task1.dayofmonth;

import java.util.Scanner;

public class Dom {
    public void numardezile(){
        Scanner input = new Scanner(System.in);


        int number_Of_DaysInMonth = 0;
        String NameofMonth = "Days in a month";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                NameofMonth = "January";
                number_Of_DaysInMonth = 31;
                break;

            case 2:
                NameofMonth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            //above is the conditions for a leap year or a normal one//

            case 3:
                NameofMonth = "March";
                number_Of_DaysInMonth = 31;
                break;

            case 4:
                NameofMonth = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                NameofMonth = "May";
                number_Of_DaysInMonth = 31;
                break;

            case 6:
                NameofMonth = "June";
                number_Of_DaysInMonth = 30;
                break;

            case 7:
                NameofMonth = "July";
                number_Of_DaysInMonth = 31;
                break;

            case 8:
                NameofMonth = "August";
                number_Of_DaysInMonth = 31;
                break;

            case 9:
                NameofMonth= "September";
                number_Of_DaysInMonth = 30;
                break;

            case 10:
                NameofMonth = "October";
                number_Of_DaysInMonth = 31;
                break;

            case 11:
                NameofMonth = "November";
                number_Of_DaysInMonth = 30;
                break;

            case 12:
                NameofMonth = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(NameofMonth + " " + year + " has " + number_Of_DaysInMonth + " days");
    }
    }

