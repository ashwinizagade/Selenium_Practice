import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstprogram {
    public static void main(String[] args) {

        String Expected_Title = "Google";
        // 1.Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\intellji\\Selenium_Practice\\Drivers\\Chromedriver.exe");
        WebDriver Chromedriver = new ChromeDriver();
        Chromedriver.get("https://www.google.com/");
        String Actual_Title = Chromedriver.getTitle();
        System.out.println(Actual_Title);
        if (Actual_Title.equalsIgnoreCase(Expected_Title)) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        Chromedriver.close();

        //2.Mozilla Firefox
//        System.setProperty("webdriver.gecko.driver", "C:\\intellji\\Selenium_Practice\\Drivers\\geckodriver.exe");
//        WebDriver geckodriver = new FirefoxDriver();
//        geckodriver.get("https://www.google.com/");
//        String Actual_Title1 = geckodriver.getTitle();
//        System.out.println(Actual_Title1);
//        if (Actual_Title1.equalsIgnoreCase(Expected_Title)) {
//            System.out.println("test passed");
//        } else {
//            System.out.println("test failed");
//        }
//        geckodriver.close();


//        3.Opera
//        System.setProperty("webdriver.opera.driver", "C:\\intellji\\Selenium_Practice\\Drivers\\operadriver.exe");
//        OperaOptions options = new OperaOptions();
//        options.setBinary("C:\\Users\\Ashwini\\AppData\\Local\\Programs\\Opera.exe");
//        WebDriver operadriver = new OperaDriver(options);

//        operadriver.get("https://www.google.com/");
//        String Actual_Title2 = operadriver.getTitle();
//        System.out.println(Actual_Title2);
//        if (Actual_Title2.equalsIgnoreCase(Expected_Title)) {
//            System.out.println("test passed");
//        }
//        else {
//            System.out.println("test failed");
//        }
//        operadriver.close();

        // 4.Microsoft Edge
//        System.setProperty("webdriver.edge.driver", "C:\\intellji\\Selenium_Practice\\Drivers\\msedgedriver.exe");
//        WebDriver Edgedriver = new EdgeDriver();
//        Edgedriver.get("https://www.google.com/");
//        String Actual_Title3 = Edgedriver.getTitle();
//        System.out.println(Actual_Title3);
//        if (Actual_Title3.equalsIgnoreCase(Expected_Title)) {
//            System.out.println("test passed");
//        } else {
//            System.out.println("test failed");
//        }
//        Edgedriver.quit();


    }
}
