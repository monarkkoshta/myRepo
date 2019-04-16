import java.util.Scanner;


public class Palindrome {

	public static int totalPal=0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//input String 
		String palindrome = scan.next();
		//int length = palindrome.length()-1;
		int k=0;
		for(int i=2;i<=palindrome.length();i++){
			for(int j=0;j<palindrome.length();j++){
				
				if(j+i<=palindrome.length()){	
					String palinStr = palindrome.substring(j, j+i);
					checkPalindrome(palinStr);
				}
				else{
					break;
				}
			}
		}	

		System.out.println(totalPal+palindrome.length());
	}

	private static void checkPalindrome(String palinStr) {
		// TODO Auto-generated method stub
		int j=palinStr.length()-1;
		boolean isPal = true;
		for(int i=0;i<palinStr.length();i++){
			if(palinStr.charAt(i)!=palinStr.charAt(j--)){
				isPal = false;
				break;
			}
		}
		if(isPal){
			totalPal++;
		}

	}

}
