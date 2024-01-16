package practiceLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M05_onParmak {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		

	}
}
