package day04_locators_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_XPath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver" , "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.testotomasyonu.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		String expectedTitleIcerik = "Test Otomasyonu";
		String actualTitle = driver.getTitle();

		if (actualTitle.contains(expectedTitleIcerik)){
			System.out.println("İçerik Test PASSSED");
		} else {
			System.out.println("İçerik testi FAILED");
		}

		driver.findElement(By.xpath("(//li[@class='has-sub'])[5]")).click();
		WebElement minDegerKutusu= driver.findElement(By.xpath("//input[@name='min']"));
		minDegerKutusu.clear();
		minDegerKutusu.sendKeys("40");
		WebElement maxDegerKutusu= driver.findElement(By.xpath("//input[@name='max']"));
		maxDegerKutusu.clear();
		maxDegerKutusu.sendKeys("200");

		driver.findElement(By.xpath("//button[@name='button']")).click();

		List<WebElement> bulunanUrunlerListesi = driver.findElements(By.xpath("//*[@*='product-box mb-2 pb-1']"));
		int actualBulunanUrunSayisi = bulunanUrunlerListesi.size();

		if (actualBulunanUrunSayisi > 0){
			System.out.println("Bulunan urun testi PASSED");
		}else System.out.println("Bulunan urun testi FAILED");

		bulunanUrunlerListesi.get(0).click();

		WebElement urunFiyatElementi = driver.findElement(By.xpath("//span[@id='priceproduct']"));

		String urunFiyatiStr= urunFiyatElementi.getText().replaceAll("\\D","");
		int urunFiyatiInt = Integer.parseInt(urunFiyatiStr)/100;

		if (urunFiyatiInt>40 && urunFiyatiInt<200){
			System.out.println("Ilk urun fiyat testi PASSED");
		}else System.out.println("Ilk urun fiyat testi FAILED");






		Thread.sleep(13000);
		driver.quit();


	}
}
