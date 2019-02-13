package smartbatch;

import java.util.Scanner;

public class Lab24Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname;
		String lastname;
		char gender;
		int phone;
		Scanner sc = new Scanner(System.in);
		firstname = sc.next();
		lastname = sc.next();
		gender = sc.next().charAt(0);
		phone = sc.nextInt();
		Lab24 ob = new Lab24(firstname, lastname, gender);
		ob.addDetails(phone);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Gender: " + gender);
		System.out.println("Phone: " + phone);
		
		}
		
	

}