import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class Level2POM {

    public static void main(String[] args) {
        WebDriver driver = null;
        try{
            driver = new ChromeDriver();

            driver.get("D:\\Revature\\EricTrainingGithub\\Copy of Instructor Notes\\Week 3\\SeleniumActivity\\informed\\Important Resources\\InFormed\\level-2.html");

            List<WebElement> dd = driver.findElements(By.tagName("dd"));

            WebElement drop = dd.get(0);
            WebElement check = dd.get(1);
            WebElement radio = dd.get(2);
            WebElement date = dd.get(3);
            WebElement button = dd.get(4);

            WebElement ansDrop = driver.findElement(By.name("input1"));
            WebElement ansCheck1 = driver.findElement(By.name("checkbox1"));
            WebElement ansCheck2 = driver.findElement(By.name("checkbox2"));
            WebElement ansCheck3 = driver.findElement(By.name("checkbox3"));
            WebElement ansRadio = driver.findElement(By.xpath("//html/body/form/fieldset/input['" + (radio.getText()) + "']"));
            WebElement ansDate = driver.findElement(By.name("dateInput"));
            WebElement ansBtn = driver.findElement(By.xpath("//button[text()='" + button.getText() + "']"));



            // Drop down
            ansDrop.sendKeys(drop.toString());

            System.out.println(ansRadio.getText());


            ansCheck1.click();
            ansCheck2.click();
            ansCheck3.click();


            //date
            String[] sDate = date.getText().split("-");
            ansDate.sendKeys(sDate[1]);
            ansDate.sendKeys(sDate[2]);
            ansDate.sendKeys(sDate[0]);

            ansBtn.click();









        } finally{
//            try {
//                Thread.sleep(900);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if(driver != null)driver.quit();
        }

    }
}
