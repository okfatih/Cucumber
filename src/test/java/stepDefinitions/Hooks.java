package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumberda extents test base dememize gerek kalmadan
    step definition package ı içersinde be4 after gibi
    notasyon varsa extends testbase demimize gerek kalmadan her scenariodan önce
    veya sonra bu methodlar çlışacaktır. Bu da bizim isteyeceğimiz
    durum değildir
    Cucumber da before after notasyonu kullanmamız ihtiyacı olursa bunu step defin altında
    hooks classına koyarız
    Her senaryodan sonra test sonucunu kontrol edip failed olan senaryolar için ss alması amacıyla
    after methodu kullanırız. Dolayısıyla be4 kullanmamız gerek yok
     */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot)
                Driver.getDriver()).getScreenshotAs(OutputType.BYTES);  if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        }
     //   Driver.closeDriver();
    }
}
