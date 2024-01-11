package day03_locaotrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Xpath_textKullanimi {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://testotomasyonu.com/addremove/");

		//driver.findElement(By.id("sub-btn")).click();
		//driver.findElement(By.xpath("//*[@id = 'sub-btn']")).click();
		driver.findElement(By.xpath("//*[text() = 'Add']")).click();


		//WebElement removeButton = driver.findElement(By.className("remove-btn"));
		WebElement removeButton = driver.findElement(By.xpath("//*[@class = 'remove-btn']"));

		if (removeButton.isDisplayed()){
			System.out.println("Remove Button Teest - PASSED");
		} else {
			System.out.println("Test - FAILED");
		}

		removeButton.click();

		//WebElement addRemoveYazisi = driver.findElement(By.tagName("h2"));
		WebElement addRemoveYazisi = driver.findElement(By.xpath("//h2"));
		if (addRemoveYazisi.isDisplayed()){
			System.out.println("Add Remove Test - PASSED");
		} else {
			System.out.println("ADD REMOVE FAILED");
		}



		Thread.sleep(3000);
		driver.quit();
	}
}
