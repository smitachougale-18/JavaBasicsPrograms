package AllJavaPgm;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String string = "big black bug bit a big black dog on his big black nose";
		int count;
		
		string =string.toLowerCase();
		
		//split the string into words using built-in function  
		
		String words[]= string.split(" ");
		//System.out.println("Word :"+words[0]);
		System.out.println(" The duplicate word in gievn string :");
		
		for(int i=0; i<words.length; i++) {
			count=1;
			
			for(int j=i+1; j<words.length; j++) {
				
				if(words[i].equals(words[j])) {
					
					count++;
					
					
					//Set words[j] to 0 to avoid printing visited word   
					
					words[j]="0";
				}
				
				
			}
			
			if(count>0 && words[i] !="0") {
				System.out.println(words[i]);
			}
			}
		
		
		
		
		}
	
	}
	



	
	
	
	


