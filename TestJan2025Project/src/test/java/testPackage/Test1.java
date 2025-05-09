package testPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	
	@Test
	public void a()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//System.out.println("Hello testNG");
		driver.get("https://mvnrepository.com/");
		System.out.println("hello varsha ");
		
		System.out.println("hello new branch");
		System.out.println("hey");
		
		System.out.println("kkkkkkkkkchild");
	}
}
