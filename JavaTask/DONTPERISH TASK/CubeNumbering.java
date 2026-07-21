import java.util.Scanner;
public class CubeNumbering{
public static void main(String [] agrs){

Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer:");
    int number = input.nextInt();

    double cubeResults = CubeNumbers(number);
    
    System.out.println(cubeResults);
}

    public static double CubeNumbers(double a){
        double cube = Math.pow(a, 3);

        return cube;
    }
}
