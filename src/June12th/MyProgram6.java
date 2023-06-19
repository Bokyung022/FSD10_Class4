package June12th;

import java.util.Scanner;

public class MyProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me positive num?");
		int num = kb.nextInt();
		
		int sum = 0;
		while( num >= 0 ) {
			sum = sum + num;
			System.out.println("Please give me positive num?");
			num = kb.nextInt();
		}
		System.out.println("The sum of positive num is " + sum);
		kb.close();

	}

}
