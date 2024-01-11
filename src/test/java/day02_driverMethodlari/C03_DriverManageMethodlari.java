package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdirver.chrome.driver", "src/kurulumDosyalari/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		System.out.println(driver.manage().window().getSize());
		System.out.println("Position : " + driver.manage().window().getPosition());

		driver.manage().window().fullscreen();
		System.out.println("----------------------------------------------------");
		System.out.println(driver.manage().window().getSize());
		System.out.println("Position : " + driver.manage().window().getPosition());

		Thread.sleep(1500);

		driver.manage().window().setPosition(new Point(300,300));
		driver.manage().window().setSize(new Dimension(500,500));

		Thread.sleep(1500);

		System.out.println("Özel boyutlar");
		System.out.println(driver.manage().window().getSize());
		System.out.println("Position : " + driver.manage().window().getPosition());

		driver.quit();
	}
}
