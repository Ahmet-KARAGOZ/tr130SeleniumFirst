package practiceLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M04Ins {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		//   (//div[@class='_aagv'])[1]

		driver.get("https://www.instagram.com/");
		String kullaniciMail = "cikote7420@talmetry.com";
		String sifre = "281926";

		WebElement mailBox = driver.findElement(By.xpath("//input[@name='username']"));
		mailBox.sendKeys(kullaniciMail);

		WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
		passwordBox.sendKeys(sifre);

		Thread.sleep(2000);

		WebElement girisButonu = driver.findElement(By.xpath("//button[@type='submit']"));
		girisButonu.click();

		WebElement kesfetButon = driver.findElement(By.xpath("//span[text()='Keşfet']"));
		kesfetButon.click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement ilkOnecikan = driver.findElement(By.xpath("(//a[@class='x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y xav7gou x9f619 x1ypdohk xt0psk2 xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1a2a7pz x4gyw5p _a6hd'])[1]"));
		ilkOnecikan.click();

		WebElement begenKalbi = driver.findElement(By.xpath("(//*[@aria-label='Beğen'])[1]"));
		begenKalbi.click();

		WebElement takipEtTusu = driver.findElement(By.xpath("//div[text()='Takip Et']"));
		takipEtTusu.click();

		WebElement ileriTusu = driver.findElement(By.xpath("(//*[@aria-label='İleri'])[1]"));
		//ileriTusu.click();

		//driver.findElement(By.xpath("(//*[@aria-label='Beğen'])[1]")).click();


		for (int i = 0; i < 20; i++) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			ileriTusu.click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(By.xpath("(//*[@aria-label='Beğen'])[1]")).click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(By.xpath("//div[text()='Takip Et']")).click();





		}



		//driver.quit();









		//Thread.sleep(3000);
		//driver.quit();
	}
}
