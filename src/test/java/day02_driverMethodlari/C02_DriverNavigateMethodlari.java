package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverNavigateMethodlari {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://testotomasyonu.com");

		// youtube anasayfaya gidin

		driver.navigate().to("https://www.youtube.com");

		// title'in "YouTube" icerdigini test edin

		String expectedTitle = "YouTube";
		String actualTitle = driver.getTitle();

		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Title youtube içeriyor - PASSED");
		} else {
			System.out.println("Title Youtube içermiyor - FAILED");
		}


		// tekrar test otomasyonu ana sayfaya donun

		driver.navigate().back();

		// sayfa kaynaginin "Test Otomasyonu" icerdigini test edin

		String expectedSource = "Test Otomasyonu";
		String actualSource = driver.getPageSource();

		if (actualSource.contains(expectedSource)) {
			System.out.println("Source Test - PASSED");
		} else {
			System.out.println("Source Test - FAILED");
		}

		// bir daha youtube anasayfaya gidin

		driver.navigate().forward();

		// url'in https://www.youtube.com/ oldugunu test edin

		String expURL = "https://www.youtube.com/";
		String actURL = driver.getCurrentUrl();

		if (actURL.equals(expURL)) {
			System.out.println("URL test PASSED");
		} else {
			System.out.println("URL Test FAILED");
		}


		Thread.sleep(1500);
		driver.close();
	}
}
