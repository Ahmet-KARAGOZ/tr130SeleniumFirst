package day03_locaotrs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ByClassName {
	public static void main(String[] args) {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.testotomasyonu.com");
		//WebElement aramaKutusu = driver.findElement(By.id("global-search"));
		WebElement aramaKutusu = driver.findElement(By.name("search"));

		aramaKutusu.sendKeys("phone" + Keys.ENTER);

		List<WebElement> categoryElementList = driver.findElements(By.className("panel-list"));

		if (categoryElementList.size() == 8){
			System.out.println("Test PASSED");
		} else {
			System.out.println("FAILED");
		}

		for (WebElement each : categoryElementList){
			System.out.println(each.getText());
		}

		driver.quit();
	}
}
