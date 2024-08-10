package emailgenerator;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String First_name=sc.nextLine();
		System.out.println("Enter Last Name : ");
		String Last_name=sc.nextLine();
		EmailGenerator email = new EmailGenerator(First_name, Last_name);
		System.out.println(email.showInfo());
	}

}