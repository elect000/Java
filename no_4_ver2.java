import java.io.*;

class Sample4 {
	public static void main(String[] args) throws IOException {
		System.out.println("Please input height and under");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		int  num1 = Integer.parseInt(br.readLine());
		int  num2 = Integer.parseInt(br.readLine());

		System.out.println("japanese fast food is"+((num1*num2)/(double)2));
	}
	
}

class Sample3 {
	public static void main(String[] args) throws IOException {
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int num = Integer.parseInt(str);

		System.out.println("The square number is "+(num*num));
			
		
	}
}

class Sample5 {
	public static void main(String[] args) throws IOException {
		System.out.println("Please imput 5 scores");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int num3 = Integer.parseInt(str3);
		int num4 = Integer.parseInt(str4);
		int num5 = Integer.parseInt(str5);

		System.out.println("Your all score is " +(num1+num2+num3+num4+num5));
		System.out.println("Your avrage number is "+((num1+num2+num3+num4+num5)/(double)5));
	
	
	
	}
}

