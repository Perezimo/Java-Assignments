//QUESTION45.

import java.util.Scanner;
public class MonthSelection{
public static void main(String [] agrs){
     Scanner input = new Scanner(System.in);

	System.out.print("Select Month:  ");
	int months = input.nextInt();
	int day1 = 31;
	int day2 = 30;
	int day3 = 28;	
	if(months == 1 && day1==31){
		System.out.println("January:" + day1 +"days");
		}
	else if(months == 2&&day3==28){
		System.out.println("February:" + day3 +"days");
		}
	else if(months==3&&day1==31){
		System.out.println("The month is March: " +day1+"days");
			}
	else if(months==4&&day2==30){
		System.out.println("The month is APRIL:" + day2+"days");
			}
	else if(months==5&&day1==31){
		System.out.println("The month is MAY:" + day1+"days");
			}
	else if(months==6&&day2==30){
		System.out.println("The month is JUNE:" +day2+"days");
			}
	else if(months==7&&day1==31){
		System.out.println("The month is JULY:" + day1+"days");
			}
	else if(months==8&&day1==31){
		System.out.println("The month is AUGUST: " + day1+"days");
			}
	else if(months==9&&day2==30){
		System.out.println("The month is SEPTEMBER:" + day2+"days");
			}
	else if(months==10&&day1==31){
		System.out.println("The month is OCTOBER:" + day1+"days");
			}
	else if(months==11&&day2==30){
		System.out.println("The month is NOVEMBER" + day2+"days");
			}
	else if(months==12&&day1==31){
		System.out.println("The month is DECEMBER:" + day1+"days");
			}
	   else   {
			System.out.print("Wrong Month selected");
		}
	
   }
}

