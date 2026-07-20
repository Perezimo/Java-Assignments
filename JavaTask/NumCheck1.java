import java.util.Scanner;
public class NumCheck1{
public static void main(String [ ] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number");
	int num1 =input.nextInt();
	System.out.println("Enter second number");
	int num2 =input.nextInt();
	System.out.println("Enter third number");
	int num3 =input.nextInt();
	System.out.println("Enter fouth number");
	int num4 =input.nextInt();
	System.out.println("Enter fifth number");
	int num5 =input.nextInt();
	
        if(num1<num2 && num1 <num3 && num1 <num4 && num1<num5){
	System.out.print("First number is the smallest:" + num1);
	}

	if(num1>num2 && num1 >num3 && num1 >num4 && num1>num5){
	System.out.print("First number is the largest:" + num1);
	}

	if(num2<num1 && num2 <num3 && num2 <num4 && num2<num5){
	System.out.print("Second number is the smallest:" + num2);
	}

	if(num2>num1 && num2 >num3 && num2 >num4 && num2>num5){
	System.out.print("Second number is the largest:" + num2);
	}

	if(num3<num1 && num3 <num2 && num3<num4 && num3<num5){
	System.out.print("Third number is the smallest" + num3);
	}

	if(num3>num1 && num3 >num2 && num3 >num4 && num3>num5){
	System.out.print("Third number is the largest" + num3);
	}

	if(num4<num1 && num4 <num2 && num4 <num3 && num4<num5){
	System.out.print("Fouth number is the smallest" + num4);
	}
	if(num4>num1 && num4 >num2 && num4 <num3 && num4<num5){
	System.out.print("Fouth number is the largest" + num4);
	}
	
	if(num5<num1 && num5 <num2 && num5 <num3 && num5<num4){
	System.out.print("Fifth number is the smallest:" +  num5);
	}

	if(num5>num1 && num5 >num2 && num5 >num3 && num5<num4){
	System.out.print("Fifth number is the largest" + num5);
	}
	
}
}

