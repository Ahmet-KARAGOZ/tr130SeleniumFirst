package practiceLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M03WP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://web.whatsapp.com/");
		WebElement isTelefonu = driver.findElement(By.xpath("//span[@title='CaAanNnnn']"));
		isTelefonu.click();

		WebElement mesajKutusu = driver.findElement(By.xpath("(//div[@role='textbox'])[2]"));
		mesajKutusu.sendKeys("Başlıyoruzz :)" + Keys.ENTER);
		for (int i = 0; i < 50; i++) {
			Thread.sleep(1500);
			mesajKutusu.sendKeys("Seni Seviyorum Aşkımmm" + Keys.ENTER);
		}

	}
}
