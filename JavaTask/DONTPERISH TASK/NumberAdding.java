import java.util.Scanner;
public class NumberAdding{
public static void main(String [] agrs){

Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int number = input.nextInt();
    
    int addResult = AdditionOfTen(number);
    System.out.println(addResult);

}

public static int AdditionOfTen(int a){

        int add = a + 10;

        return add;
}

}
    
    
   

