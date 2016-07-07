import java.io.*;
class Sample1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res==1)
			System.out.println("You input 1");

		System.out.println("Disconnected");
	}
	
}

class Sample2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res  = Integer.parseInt(str);

		if(res==1){
			System.out.println("You inputted 1");
			System.out.println("You selected 1");
		}
		System.out.println("Disconnected");	
	}

}

class Sample3{
	public static void main(String[] args) throws Exception {
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("You inputted 1");
		}
		else{
			System.out.println("You inputted integer is different from 1");
		}
			
			
	}
}

class Sample4 {
	public static void main(String[] args) throws Exception {
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		if(res == 1){
			System.out.println("You inputted 1");
		}
		else if (res == 2) {
			System.out.println("You inputted 2");
		}
		else{
			System.out.println("Please input 1 or 2");
		}
	}
}

class Sample5{
	public static void main(String[] args) throws Exception {
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		switch (res) {
		case 1:
			System.out.println("You inputted 1");
			break;
		case 2:
			System.out.println("You inputted 2");
			break;
		default:
			System.out.println("Please input 1 or 2");
			break;
		}

	}
	
}


class Sample6 {
	public static void main(String[] args) throws Exception {
		System.out.println("Please input a or b");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		switch (res) {
		case 'a':
			System.out.println("You inputted a");
			break;
		case 'b':
			System.out.println("You inputted b");
			break;
		default:
			System.out.println("Please input a or b");
			break;
		}

	}
	
}

class Sample7 {
	public static void main(String[] args) throws Exception {
		System.out.println("Are you a man?");
		System.out.println("Please input Y or N");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		char res = str.charAt(0);

		if (res == 'Y' || res == 'y')
			System.out.println("You are a man");
		else if(res == 'N'|| res == 'n')
			System.out.println("You are not a man");
		else
			System.out.println("Please Input Y or N");
	}
	
}

class Sample8 {
	public static void main(String[] args) throws Exception {
		System.out.println("Which course do you want to take");
		System.out.println("Please input integer");

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		char ans = (res ==1) ? 'A':'B';
		System.out.println(ans + " course is your choosen course");
	}
}

