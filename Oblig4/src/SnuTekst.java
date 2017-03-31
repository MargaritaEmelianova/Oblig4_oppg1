import java.util.Scanner;

public class SnuTekst {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
System.out.print("Enter a string: ");
String tekst = input.nextLine();
System.out.print("The reverse of " + tekst + " is as follows: ");
	baklengs(tekst);
	}


 public static void baklengs (String tekst){
	 if ( tekst.length() !=0){
		 System.out.print(tekst.charAt(tekst.length() - 1));
	 baklengs(tekst.substring(0, tekst.length() - 1));
	 }
 }
 }