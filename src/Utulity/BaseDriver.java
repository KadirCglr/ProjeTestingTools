package Utulity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class BaseDriver {
        public static WebDriver driver;

        static {

            Logger logger= Logger.getLogger("");
            logger.setLevel(Level.SEVERE);

            // outputtaki gerekmeyen logları kaldıracağız
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

            driver = new ChromeDriver();

            Duration dr=Duration.ofSeconds(30);
            driver.manage().timeouts().pageLoadTimeout(dr);

            driver.manage().timeouts().implicitlyWait(dr);

        }

        public static void Bekleme(int sn)
        {
            try {
                Thread.sleep(1000*sn);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public static void Beklekapat(){
            Bekleme(4);
            driver.quit();
        }
    }

