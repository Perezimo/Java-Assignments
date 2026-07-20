/*Question29.

*/

import java.util.Scanner;
public class AccessDenied{
public static void main(String [] agrs){
     Scanner input = new Scanner(System.in);

	System.out.print("Enter UserName:  ");
	String userName = input.nextLine();
	
	System.out.print("Enter the password:  ");
	int password= input.nextInt();
	
	if(userName.equalsIgnoreCase("admin")){
		if(password==1234)
		{
			System.out.println("Acess granted");
		
		}
	else{
		System.out.println("Access denied");
	}
	}
}
}
  
