package practiceLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M01 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		driver.navigate().refresh();


		driver.quit();
		System.out.println("All is Well");
	}
}
