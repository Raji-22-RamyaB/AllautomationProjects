package automationFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testjen {

	
	
	//public class CricketScorer {
		// Instance Variables - constitute the state of an object
		private int score;

		// Behavior - all the methods that are part of the class
		// An object of this type has behavior based on the
		// methods four, six and getScore
		public void four() {
			score = score + 4;
		}

		public void six() {
			score = score + 6;
		}

		public int getScore() {
			return score;
		}

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			
			Testjen scorer = new Testjen();
			scorer.six();
			// State of scorer is (score => 6)
			scorer.four();
			// State of scorer is (score => 10)
			System.out.println(scorer.getScore());
		}
	}
	

