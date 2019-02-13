package smartbatch;

import java.util.Scanner;

public class Lab21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstname;
		String lastname;
		char gender;
		int age;
		float weight;
		Scanner sc = new Scanner(System.in);
		firstname = sc.next();
		lastname = sc.next();
		gender = sc.next().charAt(0);
		age = sc.nextInt();
		weight = sc.nextFloat();
		System.out.println("First Name: " + firstname + "\n" + "Last Name: " + lastname + "\n" + "Gender: " + gender + "\n" + "Age: " + age + "\n" + "Weight: " + weight);
	}
}
