package hooks;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by juan.hernandez on 7/17/17.
 */

@Component
public class WebDriverHooks {

    private EventFiringWebDriver webDriver;

    public EventFiringWebDriver getWebDriver() {
        if(null == webDriver){
            System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver");
            webDriver = new EventFiringWebDriver(new FirefoxDriver());
        }
        return webDriver;
    }
}
