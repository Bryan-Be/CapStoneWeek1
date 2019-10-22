package co.grandcircus;

import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		char firstChar;
        String userOutput;
       
        
       

        //Take out from the main
        System.out.println("Please Enter word or sentence: ");
        String userInput = scan.nextLine();
        
        userInput = userInput.toLowerCase();

        firstChar = userInput.charAt(0);
        if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' ||
                firstChar == 'u'){
        	userOutput = userInput + "way";
        }
        else{
        	userOutput = userInput.substring(1) + userInput.charAt(0) + "ay";
        } 
        scan.close();
        System.out.println(userOutput);
        return; 
     
} 

}
	
	
			




/*Scanner scan = new Scanner(System.in);
//convert everything to lower case
//if the word starts with a vowel
//
String userInput;
char firstChar;


//Take out from the main
String word;
word = word.toLowerCase();

firstChar = word.charAt(0);
if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' ||
        firstChar == 'u'){
	userInput = word + "way";
}
else{
	userInput = word.substring(1) + word.charAt(0) + "ay";
}
System.out.println(userInput);
return;*/
