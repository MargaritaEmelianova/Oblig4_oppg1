import java.util.Scanner;

public class SnuTekst {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
System.out.print("Enter a string: ");
String tekst = input.nextLine();
System.out.print("The reverse of " + tekst + " is as follows: ");
baklengs(tekst);
System.out.print("     Enter the character to count: ");
	char x = input.next().charAt(0);
	System.out.print("The character " + x + " appears " + count(tekst, x) + " time(s).");
	count(tekst, x);
	
	}


 public static int count(String tekst, char a) {
		
	 if (tekst.length() == 1)
			return(tekst.charAt(0) == a ? 1 : 0);
		return (tekst.charAt(0) == a ? 1 : 0) + count(tekst.substring(1, tekst.length()), a);
	
	
 }


public static void baklengs (String tekst){
	 if ( tekst.length() !=0){
		 System.out.print(tekst.charAt(tekst.length() - 1));
	 baklengs(tekst.substring(0, tekst.length() - 1));
	 }
	 
 }
 }