public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		String line = s.nextLine();
		System.out.println(line);
		s.close();
	}

	public static void q2() {
		//Write question 2 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		int a = s.nextInt();
		System.out.print("In: ");
		int b = s.nextInt();
		System.out.println(a / b);
		System.out.println(a % b);
		s.close();
	}

	public static void q3() {
		//Write question 3 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		String line = s.nextLine();
		System.out.println(line + " was the text you wrote");
		s.close();
	} 

	public static void q4() {
		//Write question 4 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		int n = s.nextInt();
		System.out.println(n * n);
		s.close();
	}

	public static void q5() {
		//Write question 5 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		boolean b = s.nextBoolean();
		System.out.println(b + " is a boolean");
		s.close();
	}
	public static void q6() {
		//Write question 6 code here
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("In: ");
		double d = s.nextDouble();
		System.out.println(d - 3.2);
		s.close();
	}

}