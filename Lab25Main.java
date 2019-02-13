package smartbatch;

import java.util.Scanner;

public class Lab25Main {
	
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
		if(gender == 'M' || gender == 'F')
		{
		phone = sc.nextInt();
		Lab25 ob = new Lab25(firstname, lastname, gender);
		ob.addDetails(phone);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Gender: " + gender);
		System.out.println("Phone: " + phone);
		}
		else
			System.out.println("Gender Invalid");
		
		}
		
	

}