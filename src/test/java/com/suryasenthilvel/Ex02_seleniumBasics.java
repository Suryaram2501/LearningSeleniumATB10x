package com.suryasenthilvel;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex02_seleniumBasics {
    @Test
    public void openBrowser() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();

    }

}
