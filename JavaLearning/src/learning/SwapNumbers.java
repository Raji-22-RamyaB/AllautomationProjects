package learning;

import java.util.Scanner;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;



	
	public class SwapNumbers { 
		 public static void main(String[] args) {
		  int x, y, z; 
		  Scanner sc = new Scanner(System.in);
		  x = sc.nextInt(); y = sc.nextInt(); 
		  System.out.println("Before swapping\n x = " + x + "\n y = " + y);
		  z = x; x = y; y = z; 
		  System.out.println("After swapping\n x = " + x + "\n y = " + y); 
		 } 
		
	}

