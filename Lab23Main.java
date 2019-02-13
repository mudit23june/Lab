package smartbatch;

import java.util.Scanner;

public class Lab23Main {
	
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
		Lab23 ob = new Lab23(firstname, lastname, gender);
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Gender: " + gender);
//		ob.addDetails(phone);
		//sc.close();
	}
//	public void addDetails(int phone)
//	{
//		ob.setFirstname();
//	}
	

}
