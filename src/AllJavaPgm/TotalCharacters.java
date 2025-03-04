package AllJavaPgm;

public class TotalCharacters {

	public static void main(String[] args) {
		
		String string = "The best of both worlds";
		int count= 0;
		
	 for (int i=0; i< string.length(); i++) 
	 {

		 if (string.charAt(i)!= ' ') {
			 count++;
		 }
		 
	}
	 
	//Displays the total number of characters present in the given string    
	 
	 
	 System.out.println(" The total number of characters present in the given string :" + count);
	 

}

}