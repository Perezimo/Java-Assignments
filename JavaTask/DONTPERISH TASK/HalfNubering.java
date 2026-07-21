import java.util.Scanner;
public class HalfNubering{
public static void main(String [] agrs){

Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int number = input.nextInt();

    double halfResult = halfNumber(number);
    System.out.println(halfResult);

}

public static double halfNumber(double a){

    double half = a * 0.5;

    return half;
}

}
