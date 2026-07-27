public class ArrayKata{

public static int maxElement(int[] arr){
         
             int max = arr[0];
        
        for (int count = 1; count<arr.length; count ++){
                
                   if (arr[count]> max){
                    
                    max = arr[count];
}
 
}
                   return max;                
                    
   }
 

 public static int minElement(int[] arr){
             int min = arr[0];
        for (int count = 1; count < arr.length; count ++){
                
                   if (arr[count] < min)  
                    min = arr[count];
		}
                    return min;                
                    
   }

public static int minElement(int[] arr){
         
             int sum= 0;
        
        for (int count = 1; count < arr.length; count ++){
                
                   sum+=arr[count];
                    
	}
                    return sum;                
                    
 }

public static int sumEvenElement(int[] arr){
         
             int sumEven= 0;
        
        for (int count = 0; count < arr.length; count ++){
                if(count%2 == 0){

                   sumEven+=arr[count];
		}                  

	}
	                  return sumEven;   
                    
   }


 public static int sumOddElement(int[] arr){
         
             int sumOdd= 0;
        
        for (int count = 0; count < arr.length; count ++)
                if(count%2 != 0)

                   sumOdd+=arr[count];
                    

                    return sumOdd;   
         
                    
   }
    

public static int[] maxMin(int [] array){
		int[] newArr = new int[2];
		newArr[0] = array[0];
		newArr[1] = array[0];

		for(int count = 0; count<array.length; count++){
			if(array[count] < newArr[0]){
				newArr[0] =  array[count];
			}

			if(array[count] > newArr[1]){
				newArr[1] = array[count];
			}
		}

		return newArr;
	}



public static int noOfOddElement(int[] array){
		int oddCount = 0;
		for(int count =0; count<array.length; count++){
				if(array[count]%2 !=0){
				oddCount++;
				}
		}
		return oddCount;
	}
}


public static int[] arrayOfOddElement( int [] array){

		int oddNum = 0;
		for(int count = 0; count<array.length; count++){
			if (array[count] % 2 !=0)
				
				oddNum++;

				}
		int[] arrOdd = new int[oddNum];
			int index= 0;
		for(int count = 0; count< array.length; count ++){

			if(array[count]%2 !=0){
				arrOdd[index++] = array[count];
			}
		}
			return arrOdd;

}


public static int[] arrayOfEvenElement( int [] array){

		int evenNum = 0;
		for(int count = 0; count<array.length; count++){
			if (array[count] % 2 ==0)
				
				evenNum++;

				}
		int[] arrEven = new int[evenNum];
			int index= 0;
		for(int count = 0; count< array.length; count ++){

			if(array[count]%2 ==0){
				arrEven[index++] = array[count];
			}
		}
			return arrEven;



}