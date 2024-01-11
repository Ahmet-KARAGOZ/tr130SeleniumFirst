package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_ByClassName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.testotomasyonu.com");
		WebElement aramaKutusu = driver.findElement(By.id("global-search"));

		aramaKutusu.sendKeys("phone" + Keys.ENTER); // phone yazıp ENTER tuşuna basar
		//aramaKutusu.submit();

		//List<WebElement>  bulunanUrunElementleri = driver.findElements(By.className("prod-title mb-3 "));
		// className de space varsa By.className çalışmayabilir.

		List<WebElement> bulunanUrunElementleriList= driver.findElements(By.xpath("//a[@class='prod-title mb-3 ']"));

		//System.out.println("bulunanUrunElementleri = " + bulunanUrunElementleriList);
		// liste WebElement'lerden olustugu icin,
		// listeyi direk yazdirirsak, elementlerin referanslarini yazdirir




		for (WebElement each : bulunanUrunElementleriList
		) {

			System.out.println(each.getText());
		}


		// arama sonucunda 4 urun bulunabildigini test edin
		int expectedUrunSayisi = 4;
		int actualUrunSayisi = bulunanUrunElementleriList.size();

		if (expectedUrunSayisi == actualUrunSayisi){
			System.out.println("Phone arama urun sayi testi PASSED");
		}else {
			System.out.println("Phone arama urun sayi testi FAILED");
		}


		// ilk urun isminde case sensitive olmadan phone gectigini test edin

		String actualIlkUrunIsmi = bulunanUrunElementleriList.get(0).getText().toLowerCase();
		String expectedUrunIcerik = "phone";

		if (actualIlkUrunIsmi.contains(expectedUrunIcerik)){
			System.out.println("Ilk urun isim testi PASSED");
		}else {
			System.out.println("Ilk urun isim testi FAILED");
		}

		// sayfayi kapatin
		Thread.sleep(3000);
		driver.quit();
	}
}
