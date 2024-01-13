package practiceLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class M02 {
	/*
	1- www.google.com adresine gidilir
	2- Sayfanın title ve Url değerleri yazdırılır
	3- Yeni bir sekme açılarak www.wisequarter.com adresine gidilir ve
	4- Gidilen sayfanın title ve url değerleri yazdırılır ve
	   title'in wisequarter içerip içermediği kontrol edilir ve bilgi verilir
	5- Ilk sekmeye geçilip, burada www.testotomasyonu.com adresine gidilir
	6- Gidilen sayfanın title ve url değerleri yazdırılır ve
	   title'in testotomasyonu içerip içermediği kontrol edilir ve bilgi verilir
	7- Açılan pencere kapatılır.
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String handleOne = driver.getWindowHandle();

		System.out.println("İlk site window handle" + driver.getWindowHandle());

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.wisequarter.com");
		System.out.println("-----------------İkinci TAB değerleri-----------------");

		String actualURL = driver.getTitle();
		String expectedWord = "wisequarter";
		System.out.println(actualURL);
		System.out.println(driver.getCurrentUrl());

		System.out.println("İlk site window handle" + driver.getWindowHandle());

		if (actualURL.contains(expectedWord)){
			System.out.println("Wise Test PASSED");
		}else System.out.println("Wise Test FAILED");

		driver.switchTo().window(handleOne);
		driver.get("https://www.testotomasyonu.com/");
		System.out.println(driver.getWindowHandle());







		Thread.sleep(3000);
		driver.quit();


	}
}
