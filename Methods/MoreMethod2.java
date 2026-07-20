public class MoreMethod2{
   public static void main ( String [] args){

	String message = WelcomeMessage();
	
	double mulResult = doubleIt(30);

	boolean negValue = isNegative(30);
	
	int multipResult = printTimesTable(5);

	double aveResult = average(8, 10, 12);
	
	boolean rangeResult = isRange(80, 40, 90);
	
	System.out.println(message);

	System.out.println(mulResult); 
	
	System.out.println(negValue);
	
	System.out.println(multipResult);
	
	System.out.println(aveResult);

	System.out.println(rangeResult);

}


//Question 1

public static String WelcomeMessage(){
       
	String message = " Welcome to Java";

		return message;
	

}

//Question 2.

public static int doubleIt(int n){

	int multiply = n * 2;
	
	return multiply;
}

//Question3

public static boolean isNegative(int n){

	 if( n < 0 ){
		
		return true;
	}
else{
		return false;

	}	
}

//Question 4

public static int printTimesTable(int x){

int multiple = 0;
for (int n = 1; n<= x; n++){

	 multiple = n * 5; 
	}
	return multiple;
    }





//Question 5

public static int average(int a, int b, int c){
	
	int ave = a + b + c / 3 ;
	
	return ave;
    }



//Question 6

public static boolean isRange(int n, int Low, int High){

int num = n;
if (num > Low && num< High){
}
return true;
}

}