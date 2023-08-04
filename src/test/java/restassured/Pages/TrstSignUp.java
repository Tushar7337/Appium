package restassured.Pages;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;

@Test
public class TrstSignUp {


    public static long getUniqueNumber(){
        return new Date().getTime();
    }


    public static void main(String[] args) throws MalformedURLException, InterruptedException, AWTException {

        String uniqueStr = "" + getUniqueNumber();
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("automationName", "Appium");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13.0");
        cap.setCapability("deviceName", "Pixel 6 Pro API 33");
        cap.setCapability("app", "D:\\TRST\\TRSTQA95.apk");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, cap);

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        MobileElement element = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")));
//        element.click();
//        element.sendKeys("BARB");

        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        firstName.clear();
        firstName.sendKeys("Raw");

        WebElement lastName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        lastName.clear();
        lastName.sendKeys("App");

//          driver.hideKeyboard();

        WebElement continueButton1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View"));
        continueButton1.click();

        WebElement continueButton2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View"));
        continueButton2.click();

        Thread.sleep(2000);   // First value Prop Swipe

        new TouchAction(driver)
                .press(PointOption.point(1047, 1813))
                .moveTo(PointOption.point(272, 1833))
                .release()
                .perform();

        Thread.sleep(2000);   // Second value Prop Swipe

        new TouchAction(driver)
                .press(PointOption.point(1047, 1813))
                .moveTo(PointOption.point(272, 1833))
                .release()
                .perform();

        Thread.sleep(2000);   // For "Continue Button"

        new TouchAction(driver)
                .press(PointOption.point(1108, 2734))
                .moveTo(PointOption.point(503, 2709))
                .release()
                .perform();

        Thread.sleep(6000);   // For "Sunrise Screen"

        WebElement careProgram = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]"));
        careProgram.click();

        Thread.sleep(4000);   // For "Alrighty Screen"

        WebElement dateOfBirth = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]"));
        dateOfBirth.click();

        WebElement date = driver.findElement(By.xpath("//android.view.View[@content-desc=\"01 August 2005\"]"));
        date.click();

        WebElement dateOk = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
        dateOk.click();

        WebElement dobContinue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]"));
        dobContinue.click();

        Thread.sleep(2000);   // For "Gender"

        WebElement gender = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]"));
        gender.click();

        Thread.sleep(2000);   // For "Thank You Screen"

        WebElement continueThankYou = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View"));
        continueThankYou.click();

        Thread.sleep(2000);   // For "Basic Stuff Screen"



        WebElement emailId = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));

        String email = "appium" + uniqueStr.substring(uniqueStr.length()-3) + "@gmail.com";       // Generate unique email

        emailId.sendKeys(email);
        System.out.println("Generated Email "+ email);

//        WebElement contryCode = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]/android.view.View/android.widget.EditText[2]"));
//        contryCode.click();

        String contactNumber = uniqueStr.substring(uniqueStr.length()-10);   // Generate 10 digit Phone Number

        System.out.println("Generated Phone Number "+contactNumber);

        WebElement phoneNumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        phoneNumber.sendKeys(contactNumber);

        WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
        password.sendKeys("Pass@1234");

        Thread.sleep(1000);
//          driver.hideKeyboard();

        new TouchAction(driver)
                .press(PointOption.point(1072, 2739))
                .moveTo(PointOption.point(282, 2729))
                .release()
                .perform();

//          WebElement firstDigit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[1]"));
//          firstDigit.click();
//          Thread.sleep(2000);
//          firstDigit.sendKeys("1");
//
//          WebElement secondDigit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[2]"));
//          secondDigit.click();
//          secondDigit.sendKeys("2");
//
//          WebElement thirdDigit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[3]"));
//          thirdDigit.click();
//          thirdDigit.sendKeys("3");
//
//          WebElement fourthDigit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[4]"));
//          fourthDigit.click();
//          fourthDigit.sendKeys("4");
//
//          WebElement fifthDigit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[5]"));
//          fifthDigit.click();
//          fifthDigit.sendKeys("5");
//
//          WebElement sixthDigit = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[6]"));
//          sixthDigit.click();
//          sixthDigit.sendKeys("6");
//
//          WebElement otpContinue = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View"));
//          otpContinue.click();
//

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//        WebElement abc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[1]")));
//                abc.click();


        Thread.sleep(3000);


        WebElement number = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.TextView[1]"));
        number.click();

      //  driver.hideKeyboard();
      //  Thread.sleep(2000);
        // abc.click();

        System.out.println("on otp");
        Thread.sleep(3000);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_1);
        robot.keyPress(KeyEvent.VK_2);
        robot.keyPress(KeyEvent.VK_3);
        robot.keyPress(KeyEvent.VK_4);
        robot.keyPress(KeyEvent.VK_5);
        robot.keyPress(KeyEvent.VK_6);

        //Thread.sleep(6000);
        driver.hideKeyboard();
        Thread.sleep(2000);

        System.out.println("on otp1");

        new TouchAction(driver)  // OTP Verify Button
                .press(PointOption.point(212, 2856))
                .moveTo(PointOption.point(1064, 2870))
                .release()
                .perform();
        Thread.sleep(2000);

        (new TouchAction(driver))   // Research Consent
                .press(PointOption.point(292, 2477))
            .moveTo(PointOption.point(1067, 2482))
        .release()
        .perform();

        Thread.sleep(4000);

        (new TouchAction(driver))    // Already Have TRST Box
        .press(PointOption.point(322, 2840))
        .moveTo(PointOption.point(1017, 2840))
        .release()
        .perform();

    }

}
