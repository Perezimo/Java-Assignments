public class Kata{

public static boolean  evenAndoddNumber (int number){

	if(number % 2 ==0){
		return true;
		}
	else{

		return false;
	}
    }

public static boolean  primeNumber (int number){

	if(number <=1 ){
		return false;
		}
	if(number ==2){
		return true;
		}
	if (number % 2 ==0){
		return false;
		}
		
	for (int count = 3; count * count <= number; count +=2) {

		if (number % count == 0){
			return false;
		}
	}

		return true;
	}

public static int  subNumbers (int number1, int number2){
	
		int subtractNumbers = Math.abs(number1 - number2);

		return subtractNumbers;
	
    }

public static float  divideNumbers (int number1, int number2){
		float dividerNumbers = (float)number1/number2;

		return dividerNumbers;
    }

public static int factorNumbers (int number){
		
		int count=0;
		for (count =1; count*count<=number; count++){
			if(number % count ==0) {
				if (count * count == number) {
				count ++;
			}
		}
	}		
	
			return count++;	
    }

public static int squareNumbers (int number){
		
	int squarerNum = number * number;
		return squarerNum;

}

public static int factorialNumbers (int number){
		
		int factorial = 1;
		for(int count = 1; count<=number; count++){
			factorial *=count;			
}
			return factorial;
}

public static int squareNumbers (int number){
		
	int squarerNum = number * number;

	
		return squarerNum;

}


}













