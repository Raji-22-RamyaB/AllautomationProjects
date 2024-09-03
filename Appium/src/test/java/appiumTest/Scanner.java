package appiumTest;
import java.io.InputStream;
import java.util.*;


public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.nextLine();
		System.out.println("Name is: " + name);
		in.close();
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private String nextLine() {
		// TODO Auto-generated method stub
		return null;
		
		
	}

}
