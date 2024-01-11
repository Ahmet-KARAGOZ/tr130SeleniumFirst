package day03_locaotrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get(" https://www.automationexercise.com/");
		List<WebElement> linkListesi = driver.findElements(By.tagName("a"));

		int linkSayisi = linkListesi.size();
		System.out.println("linkSayisi = " + linkSayisi);

		//driver.findElement(By.linkText(" Products")).click();
		driver.findElement(By.partialLinkText("Products")).click();
		WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));
		if (specialOfferElementi.isDisplayed()){
			System.out.println("Spesial offer PASSED");
		} else {
			System.out.println("FAILED");
		}


		Thread.sleep(5000);
		driver.quit();
	}
}
