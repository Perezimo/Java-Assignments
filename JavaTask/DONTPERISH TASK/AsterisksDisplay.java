import java.util.Scanner;
public class AsterisksDisplay{
public static void main(String [] agrs){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number of asterisks you want:");
    int asterisks = input.nextInt();

    String starPrint = asteriskStrings(asterisks);
    System.out.print(starPrint);
    

}

public static String asteriskStrings(String "*" ){

        String stars = "*";
        
        return stars;
    }
}
