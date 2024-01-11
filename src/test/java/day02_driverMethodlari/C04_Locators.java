package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.testotomasyonu.com");
		WebElement aramaKutusu = driver.findElement(By.id("global-search"));

		aramaKutusu.sendKeys("phone");
		aramaKutusu.submit();

		WebElement aramaSonucElementi = driver.findElement(By.className("product-count-text"));
		System.out.println(aramaSonucElementi.getText());

		String sonucYazisi = aramaSonucElementi.getText();

		sonucYazisi = sonucYazisi.replaceAll("\\D","");
		System.out.println("sonucYazisi = " + sonucYazisi);

		int sonucSayisi = Integer.parseInt(sonucYazisi);
		if (sonucSayisi>0){
			System.out.println("Arama PASSED");
		} else {
			System.out.println("Arama FAILED");
		}

		Thread.sleep(2000);


		driver.quit();
	}
}
