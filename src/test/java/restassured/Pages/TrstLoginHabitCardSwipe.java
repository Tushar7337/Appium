package restassured.Pages;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@Test
public class TrstLoginHabitCardSwipe {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13.0");
        cap.setCapability("deviceName", "Pixel 6 Pro API 33");
        cap.setCapability("app", "D:\\TRST\\TRSTQA100.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, cap);

        Thread.sleep(2000);

        WebElement loginLink = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView[3]"));
        loginLink.click();

        Thread.sleep(2000);

        WebElement loginEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        loginEmail.sendKeys("blackpearl@gmail.com");

        WebElement loginPassword = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        loginPassword.sendKeys("Pass@1234");

        /*Thread.sleep(2000);

        WebElement passwordEyeButton = driver.findElement(By.xpath("Password Visibility"));
        passwordEyeButton.click();*/


        WebElement loginButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View"));
        loginButton.click();

        Thread.sleep(4000);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement habitTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[6]/android.widget.TextView")));
        habitTab.click();

        Thread.sleep(4000);

        // To track habit cards

        (new TouchAction(driver))						//1st habit card
                .press(PointOption.point(242, 1747))
                .moveTo(PointOption.point(1088, 1732))
                .release()
                .perform();

        (new TouchAction(driver))        				//2nd habit card
                .press(PointOption.point(297, 1556))
                .moveTo(PointOption.point(1108, 1581))
                .release()
                .perform();

        (new TouchAction(driver))						//3rd habit card
                .press(PointOption.point(312, 1475))
                .moveTo(PointOption.point(1072, 1717))
                .release()
                .perform();

        (new TouchAction(driver))						//4th habit card
                .press(PointOption.point(322, 1541))
                .moveTo(PointOption.point(1088, 1636))
                .release()
                .perform();

        (new TouchAction(driver))						//5th habit card
                .press(PointOption.point(292, 1551))
                .moveTo(PointOption.point(1098, 1581))
                .release()
                .perform();

        Thread.sleep(4000);

        (new TouchAction(driver))						//6th habit card
                .press(PointOption.point(277, 1410))
                .moveTo(PointOption.point(1138, 1611))
                .release()
                .perform();

        Thread.sleep(4000);

        (new TouchAction(driver))
                .press(PointOption.point(277, 1410))
                .moveTo(PointOption.point(1138, 1611))
                .release()
                .perform();


        //driver.quit();
    }

}
