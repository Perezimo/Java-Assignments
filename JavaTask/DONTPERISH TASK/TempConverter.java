import java.util.Scanner;
public class TempConverter{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the degree in celsius:");
    int degree = input.nextInt();
    
    double celFarenheit = TempFarenheit(degree);
    System.out.printf("%.2f" , celFarenheit);
    System.out.println();
    
    
}

public static double TempFarenheit( int temp){
    
        double tempFahrenheit = temp * 1.8 + 32;

        return tempFahrenheit;

    }
} 
