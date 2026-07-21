import java.util.Scanner;
public class DivOfNumbers{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumb= input.nextInt();
    System.out.print("Enter the first integer: ");
    int secondNumb = input.nextInt();

    int divResult = divOfNumbers(firstNumb, secondNumb);
    System.out.println(divResult);


}

public static int divOfNumbers(int number1 , int number2){
        
        int divNum = number1 / number2;
        
        return divNum;

    }
}
