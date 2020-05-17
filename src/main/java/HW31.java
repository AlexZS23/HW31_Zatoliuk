import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW31 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Леша\\QA\\tools\\chromedriver\\chromedriver.exe");

        //  создание Webdriver
        WebDriver webDriver = new ChromeDriver();

        // открыть браузер во весь экран
        webDriver.manage().window().maximize();

        // открыть сайт, перейдя по URL
        webDriver.get("https://prom.ua/");

        // Сменить язык на UA
        webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div/a[1]/span")).click();

        Thread.sleep(6000);
        // Ввести в строку поиска название товара
        webDriver.findElement(By.name("search_term")).sendKeys("Ноутбуки");
        // Нажать "Поиск"
        webDriver.findElement(By.xpath("//*[@id=\"search_form\"]/div/div/div/button")).click();

        Thread.sleep(6000);
        // Фильтр по категории товара - "Зарядки для ноутбуков".
        webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div[3]/div[1]/div/div/div/div[3]/div[2]/ul/li[2]/span/span[1]")).click();

        Thread.sleep(8000);
        // Возврат на стартовую страницу
        webDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div/div/div/div[1]/div/div[1]/a")).click();

        //webDriver.quit();

    }
}
