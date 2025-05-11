package com.suryasenthilvel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex01_seleniumBasics {
    @Test
            public void open(){
        ChromeDriver driver = new ChromeDriver();
        driver.quit();
    }


}
