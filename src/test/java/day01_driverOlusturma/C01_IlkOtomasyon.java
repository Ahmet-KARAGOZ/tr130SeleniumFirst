package day01_driverOlusturma;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*


		driver.get("https://www.testotomasyonu.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close(); */

		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());

		driver.manage().window().setPosition(new Point(100,50));
		driver.manage().window().setSize(new Dimension(500,500));

		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
	}
}
