public class ReversedString{
public static void main (String [] agrs){
	
	
	int count;


	String greetings = "Happy New Year";
  	
	String reversed = " ";	

	for ( count = greetings.length() -1; count >=0; count--) {

	 reversed += greetings.charAt(count);
  }
	System.out.println("reversed string: " + reversed);



	}	
}