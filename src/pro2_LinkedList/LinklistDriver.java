/**
 * Agaby Azer
 * 10/4/16
 */
package pro2_LinkedList;
import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class LinklistDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		LinkList myList = new LinkList();
		boolean quit=false;
		
		System.out.println("how many words do you want to see? choose between 15-240");
		int num=input.nextInt();
		while(num<15 || num>240)
		{
			System.out.println("choose a number between 15 and 240");
			System.out.println("how many words do you want to see? choose between 15-240");
			num=input.nextInt();
		}
		for(int k=0;k<num;k++)
		{
			randWord();
			myList.addInOrder(randWord());
		}
			myList.Dislplay();
			System.out.println();
	
			
		do{
		System.out.println();
		System.out.println("Welcom to LinkList \n choose one of the following options. A for adding words, D for deleting words, Q for Quit");
		char ans=input.next().charAt(0);
		switch(ans)
		{
			case 'a': 
				randWord();
				myList.addInOrder(randWord());
				myList.newList();
				//myList.Dislplay();
			break;
			case 'd': 
				System.out.println("What word do you want to delete?");
				String delete=input.next();
				myList.erase(delete);
				myList.Dislplay();
			break;
			case 'q': System.out.println("Thank you");
			quit=true;
			System.exit(0);
			
				break;
		}
		

		}
		while(quit==false);
		myList.Dislplay();

		}
	


	public static String randWord() {
		Scanner input= new Scanner(System.in);
		LinkList myList = new LinkList();
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 5;
		StringBuilder buffer = new StringBuilder(targetStringLength);
		String generatedString = "";
//		System.out.println("how many words do you want to see? choose between 15-240");
//		int num=input.nextInt();
//		while(num<15 || num>240)
//		{
//			System.out.println("choose a number between 15 and 240");
//			System.out.println("how many words do you want to see? choose between 15-240");
//			num=input.nextInt();
//			
//		}
//		for(int k=0;k<num;k++)
//		{
			
		for (int i = 0; i < targetStringLength; i++) {
				
				int randomLimitedInt = leftLimit + (int) (new Random().nextFloat() * (rightLimit - leftLimit));
				buffer.append((char) randomLimitedInt);	
			}
		
			generatedString = buffer.toString();
			myList.addInOrder(generatedString);
			buffer=new StringBuilder(targetStringLength);
		//}
			
				return 	generatedString;
	}
	

	

}
