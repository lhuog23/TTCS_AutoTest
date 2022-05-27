package UCLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AutoTest\\Setup\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		WebElement username= driver.findElement(By.id("txtUsername"));
		//username.clear();
		username.sendKeys("Admin");
		WebElement password= driver.findElement(By.id("txtPassword"));
		//password.clear();
		password.sendKeys("admin123");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[5]/input[1]")).click();
//		WebElement forgotpw=driver.findElement(By.linkText("Forgot your password?"));
//		forgotpw. click(); 
		boolean displaydasboard= driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
		if(displaydasboard) System.out.println("Đăng nhập thành công");
		else System.out.println("Đăng nhập không thành công");
//		System.out.println(driver.getTitle());
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		boolean buttonEdit= driver.findElement(By.id("btnSave")).isEnabled();
		if(buttonEdit ) System.out.println("button Edit có click được");
		else System.out.println("button Edit không click được");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("LanHuong");
		Thread.sleep(3000);
		//quit browser
		driver.quit();
	}
}
