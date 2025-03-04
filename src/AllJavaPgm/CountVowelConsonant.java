package AllJavaPgm;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String str = "This is a really simple sentence";
	
	str.toLowerCase();
	
	int cCount = 0; int vCount =0;
	
	for (int i=0; i<str.length(); i++) {
		
		if (str.charAt(i)== 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') 
		{
			
			vCount++;
			
		}
		
		else if (str.charAt(i)>='a' && str.charAt(i)<='z'){
			
			cCount++;

		}
		
	}

	
    System.out.println("The total number of vowels in given string is :" +vCount);

	System.out.println("The total number of vowels in given string is :" +cCount);
	
	}

}
