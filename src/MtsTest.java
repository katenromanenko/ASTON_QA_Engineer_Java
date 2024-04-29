package src;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MtsTests {
    public static void main(String[] args) {
        // Указать путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Создание экземпляра WebDriver
        WebDriver driver = new ChromeDriver();

        // Открытие страницы mts.by
        driver.get("https://www.mts.by/");

        // Проверка наличия блока "Онлайн пополнение без комиссии"
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение без комиссии')]"));
        if (blockTitle.isDisplayed()) {
            System.out.println("Название блока найдено: " + blockTitle.getText());
        } else {
            System.out.println("Название блока не найдено.");
        }

        // Закрытие браузера
        driver.quit();
    }
}