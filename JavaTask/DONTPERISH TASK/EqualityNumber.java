import java.util.Scanner;

public class EqualityNumber{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first integer: ");
    int firstNumb= input.nextInt();
    System.out.print("Enter the first integer: ");
    int secondNumb = input.nextInt();

    boolean compareNum = compareNumber(firstNumb, secondNumb);
    System.out.println(compareNum);
    


}


public static boolean compareNumber(int number1 , int number2){

       if(number1== number2){
            return true;
    }   

    else{
            return false;
            }
}
}
