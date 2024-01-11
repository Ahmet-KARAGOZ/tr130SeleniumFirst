package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethodlari {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver","src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.testotomasyonu.com");

		String actualTitle = driver.getTitle();
		String expectedTitle = "Otomasyon";

		if (actualTitle.contains(expectedTitle)){
			System.out.println("Title testi passed");
		} else {
			System.out.println("Title otomasyon içermiyor - Title testi FAILED");


		}

		//URL 'otomasyon içeriyor mu'

		String expectedURL = "otomasyon";
		String actualURL = driver.getCurrentUrl();

		if (actualURL.contains(expectedURL)){
			System.out.println("URL Test _ PASSED");
		} else {
			System.out.println("URL Test FAILED");
		}

		//driver.getPageSource();  Tüm sayfa kaynağını getirir.

		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());


		Thread.sleep(3000);
		driver.close();
	}
}
