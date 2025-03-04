package AllJavaPgm;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Dream big";
		
		String reversedStr = " ";
		
        //Iterate through the string from last and add each character to variable reversedStr    

		
		for (int i= string.length()-1; i>=0; i--) {
			
			
			reversedStr= reversedStr + string.charAt(i);
			
		}
		
		System.out.println(" The original string is:" + string );
		
		
        //Displays the reverse of given string    

		System.out.println("The reversed string is :" +reversedStr );
	}

}
