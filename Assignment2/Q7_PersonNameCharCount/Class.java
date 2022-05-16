package Q7_PersonNameCharCount;

import java.util.Scanner;

public class Class implements Interface {
	private static int maxcount;
	private String name;
	public void display() {
		System.out.println("Name: "+name);
	}
	public void count() {
		for(int i = 0;i < name.length(); i++ )
			if(name.charAt(i)!=' ')
				maxcount++;
		System.out.println("Number of characters in the name: "+maxcount);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		Class obj = new Class();
		obj.name = sc.nextLine();
		obj.display();
		obj.count();
		sc.close();
	}
}
